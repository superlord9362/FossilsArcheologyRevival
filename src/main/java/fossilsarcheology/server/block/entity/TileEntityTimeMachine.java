package fossilsarcheology.server.block.entity;

import fossilsarcheology.server.item.FAItemRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;

import javax.annotation.Nullable;

public class TileEntityTimeMachine extends TileEntity implements IInventory, ISidedInventory, ITickable  {

    public static ItemStack insideStack;
    private static final int[] slot = new int[]{0};// fuel
    public int clockCounter;
    public float clockTo;
    public float clockFrom;
    public float clockMulti;
    public float currectFacingAngle;
    public float sendingCurrentFacing;
    public float targetFacingAngle;
    public boolean playerClosing = false;
    private int chargeLevel = 0;
    private int restoringLayer = 0;

    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        return slot;
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return true;
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        return true;
    }

    @Override
    public int getSizeInventory() {
        return 64;
    }

    @Nullable
    @Override
    public ItemStack getStackInSlot(int index) {
        return insideStack;
    }

    @Nullable
    @Override
    public ItemStack decrStackSize(int index, int count) {
        if (this.insideStack != null) {
            ItemStack var3;

            if (this.insideStack.stackSize <= count) {
                var3 = this.insideStack;
                this.insideStack = null;
                return var3;
            } else {
                var3 = this.insideStack.splitStack(count);

                if (this.insideStack.stackSize == 0) {
                    this.insideStack = null;
                }

                return var3;
            }
        } else {
            return null;
        }
    }

    @Nullable
    @Override
    public ItemStack removeStackFromSlot(int index) {
        if (index == 0)
        {
            ItemStack itemstack = insideStack;
            insideStack = null;
            return itemstack;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int index, @Nullable ItemStack stack) {
        this.insideStack = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
            stack.stackSize = this.getInventoryStackLimit();
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound var1) {
        super.readFromNBT(var1);
        NBTTagList var2 = var1.getTagList("Items", 10);
        this.chargeLevel = var1.getShort("chargeLevel");

        for (int var3 = 0; var3 < var2.tagCount(); ++var3) {
            NBTTagCompound var4 = var2.getCompoundTagAt(var3);
            byte var5 = var4.getByte("Slot");
                this.insideStack = ItemStack.loadItemStackFromNBT(var4);
            }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound var1) {
        super.writeToNBT(var1);
        NBTTagList var2 = new NBTTagList();
        var1.setShort("chargeLevel", (short) this.chargeLevel);
        if (this.insideStack != null) {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte) 0);
                this.insideStack.writeToNBT(var4);
                var2.appendTag(var4);
         }
        var1.setTag("Items", var2);
        return var1;
    }


    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return stack.getItem() == FAItemRegistry.ANCIENT_CLOCK;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {}

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {
        insideStack = null;
    }

    @Override
    public void update() {
        this.sendingCurrentFacing = this.currectFacingAngle;
        EntityPlayer var1 = this.world.getClosestPlayer((double) ((float) this.pos.getX() + 0.5F), (double) ((float) this.pos.getY() + 0.5F), (double) ((float) this.pos.getZ() + 0.5F), 3.0D, false);

        if (var1 != null) {
            this.playerClosing = true;
            double var2 = var1.posX - (double) ((float) this.pos.getX() + 0.5F);
            double var4 = var1.posZ - (double) ((float) this.pos.getZ() + 0.5F);
            this.targetFacingAngle = (float) Math.atan2(var4, var2) + ((float) Math.PI / 2F);
        } else {
            this.playerClosing = false;
            this.targetFacingAngle += 0.02F;
        }

        while (this.currectFacingAngle >= (float) Math.PI) {
            this.currectFacingAngle -= ((float) Math.PI * 2F);
        }

        while (this.currectFacingAngle < -(float) Math.PI) {
            this.currectFacingAngle += ((float) Math.PI * 2F);
        }

        while (this.targetFacingAngle >= (float) Math.PI) {
            this.targetFacingAngle -= ((float) Math.PI * 2F);
        }

        while (this.targetFacingAngle < -(float) Math.PI) {
            this.targetFacingAngle += ((float) Math.PI * 2F);
        }

        float var6;

        for (var6 = this.targetFacingAngle - this.currectFacingAngle; var6 >= (float) Math.PI; var6 -= ((float) Math.PI * 2F)) {
        }

        while (var6 < -(float) Math.PI) {
            var6 += ((float) Math.PI * 2F);
        }

        this.currectFacingAngle += var6 * 0.4F;
        ++this.clockCounter;
        float var3 = (this.clockFrom - this.clockTo) * 0.4F;
        float var7 = 0.2F;

        if (var3 < -var7) {
            var3 = -var7;
        }

        if (var3 > var7) {
            var3 = var7;
        }

        this.clockMulti += (var3 - this.clockMulti) * 0.9F;
        this.clockTo += this.clockMulti;

        if (this.isClockInPlace() && chargeLevel < 1000) {
            charge();
        } else if (this.chargeLevel != 0) {
            this.chargeLevel = 0;
        }
    }

    private void charge() {
        if (!this.isCharged()) {
            ++this.chargeLevel;
        }
    }

    public int getChargeLevel() {
        return this.chargeLevel;
    }

    public boolean isCharged() {
        return this.chargeLevel == 1000;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    public boolean isClockInPlace() {
        if (this.insideStack != null) {
            if (this.insideStack.getItem() != null) {
                if (this.insideStack.getItem() == FAItemRegistry.ANCIENT_CLOCK) {
                    return true;
                }
            }
        }
        return false;
    }
}
