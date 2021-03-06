package fossilsarcheology.server.item;


import fossilsarcheology.server.api.DefaultRenderedItem;
import fossilsarcheology.server.entity.prehistoric.EntityPrehistoric;
import fossilsarcheology.server.tab.FATabRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemCarrotOnAStick;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WhipItem extends ItemCarrotOnAStick implements DefaultRenderedItem {
    public WhipItem() {
        super();
        this.setMaxDamage(100);
        this.setMaxStackSize(1);
        this.setUnlocalizedName("whip");
        this.setCreativeTab(FATabRegistry.ITEMS);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering() {
        return true;
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemstack, World worldIn, EntityPlayer player, EnumHand hand){
        if (player.isRiding() && player.getRidingEntity() instanceof EntityPrehistoric) {
            EntityPrehistoric dinosaur = (EntityPrehistoric) player.getRidingEntity();
            // dinosaur.onWhipRightClick();
            itemstack.damageItem(1, player);
            player.swingArm(hand);
            //player.getRidingEntity().playSound("fossil:whip", 1.0F, 1.0F); TODO
        } else {
            /*
			 * if (!W.isRemote) { W.spawnEntityInWorld(new
			 * EntityWhipAttachment(W, P)); }
			 */
            player.swingArm(hand);
            //worldIn.playSoundAtEntity(player, "fossil:whip", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
        }

        return ActionResult.newResult(EnumActionResult.SUCCESS, itemstack);

    }

}