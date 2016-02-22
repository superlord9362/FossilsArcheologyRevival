package com.github.revival.client.model.prehistoric;

import com.github.revival.client.model.prehistoric.test.ModelNewPrehistoric;
import com.github.revival.server.entity.mob.EntityDeinonychus;
import com.github.revival.server.entity.mob.test.EntityNewPrehistoric;
import net.ilexiconn.llibrary.client.model.modelbase.MowzieModelRenderer;
import net.ilexiconn.llibrary.common.animation.Animator;
import net.ilexiconn.llibrary.common.animation.IAnimated;
import net.minecraft.entity.Entity;

public class ModelDeinonychus extends ModelNewPrehistoric {
    public MowzieModelRenderer lowerBody;
    public MowzieModelRenderer leftThigh;
    public MowzieModelRenderer rightThigh;
    public MowzieModelRenderer upperBody;
    public MowzieModelRenderer tail1;
    public MowzieModelRenderer neck;
    public MowzieModelRenderer leftUpperArm;
    public MowzieModelRenderer rightUpperArm;
    public MowzieModelRenderer head;
    public MowzieModelRenderer headPivot;
    public MowzieModelRenderer crest;
    public MowzieModelRenderer upperJaw;
    public MowzieModelRenderer lowerJaw;
    public MowzieModelRenderer crest2;
    public MowzieModelRenderer crest3;
    public MowzieModelRenderer leftLowerArm;
    public MowzieModelRenderer leftUpperArmWing;
    public MowzieModelRenderer leftLowerArmWing;
    public MowzieModelRenderer rightLowerArm;
    public MowzieModelRenderer rightUpperArmWing;
    public MowzieModelRenderer rightLowerArmWing;
    public MowzieModelRenderer tail2;
    public MowzieModelRenderer TailFeather4;
    public MowzieModelRenderer tail3;
    public MowzieModelRenderer TailFeather2;
    public MowzieModelRenderer TailFeather3;
    public MowzieModelRenderer TailFeather1;
    public MowzieModelRenderer leftLeg;
    public MowzieModelRenderer leftFoot;
    public MowzieModelRenderer leftToeClaw1;
    public MowzieModelRenderer leftToeClaw2;
    public MowzieModelRenderer rightLeg;
    public MowzieModelRenderer rightFoot;
    public MowzieModelRenderer rightToeClaw1;
    public MowzieModelRenderer rightToeClaw2;
    private Animator animator;

    public ModelDeinonychus() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.leftThigh = new MowzieModelRenderer(this, 2, 36);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(3.5F, 13.0F, 4.5F);
        this.leftThigh.addBox(0.0F, -1.0F, -2.5F, 3, 6, 5, 0.0F);
        this.lowerBody = new MowzieModelRenderer(this, 80, 20);
        this.lowerBody.setRotationPoint(0.0F, 10.5F, -3.0F);
        this.lowerBody.addBox(-4.0F, -3.5F, 0.0F, 8, 7, 10, 0.0F);
        ModelUtils.setRotateAngle(lowerBody, -0.14189526818713902F, -0.0F, 0.0F);
        this.rightUpperArmWing = new MowzieModelRenderer(this, 38, 6);
        this.rightUpperArmWing.mirror = true;
        this.rightUpperArmWing.setRotationPoint(-1.8F, 2.8F, 1.0F);
        this.rightUpperArmWing.addBox(-0.5F, 0.0F, -3.5F, 1, 4, 7, 0.0F);
        ModelUtils.setRotateAngle(rightUpperArmWing, 1.5184364492350666F, -0.0F, 0.0F);
        this.leftLeg = new MowzieModelRenderer(this, 1, 25);
        this.leftLeg.mirror = true;
        this.leftLeg.setRotationPoint(1.5F, 3.0F, 2.5F);
        this.leftLeg.addBox(-1.0F, -1.0F, -8.0F, 2, 2, 8, 0.0F);
        ModelUtils.setRotateAngle(leftLeg, 1.1435397259066846F, -0.0F, 0.0F);
        this.tail2 = new MowzieModelRenderer(this, 50, 5);
        this.tail2.setRotationPoint(0.0F, 0.4F, 8.9F);
        this.tail2.addBox(-1.0F, -1.6F, 0.0F, 2, 3, 17, 0.0F);
        ModelUtils.setRotateAngle(tail2, 0.03630284844148206F, -0.0F, 0.0F);
        this.rightUpperArm = new MowzieModelRenderer(this, 19, 17);
        this.rightUpperArm.setRotationPoint(-3.0F, 1.3F, -5.5F);
        this.rightUpperArm.addBox(-2.0F, -1.0F, -1.0F, 2, 5, 3, 0.0F);
        ModelUtils.setRotateAngle(rightUpperArm, 0.006806784082777885F, -0.0F, 0.0F);
        this.leftLowerArmWing = new MowzieModelRenderer(this, 37, 4);
        this.leftLowerArmWing.setRotationPoint(0.8F, 0.7F, 1.5F);
        this.leftLowerArmWing.addBox(-0.5F, 0.0F, -8.0F, 1, 5, 8, 0.0F);
        ModelUtils.setRotateAngle(leftLowerArmWing, 0.01361356816555577F, -0.0F, 0.0F);
        this.leftToeClaw2 = new MowzieModelRenderer(this, 5, 16);
        this.leftToeClaw2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.leftToeClaw2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        ModelUtils.setRotateAngle(leftToeClaw2, -1.7627825445142729F, -0.0F, 0.0F);
        this.tail1 = new MowzieModelRenderer(this, 86, 4);
        this.tail1.setRotationPoint(0.0F, -0.7F, 8.3F);
        this.tail1.addBox(-2.0F, -2.0F, 0.0F, 4, 5, 9, 0.0F);
        ModelUtils.setRotateAngle(tail1, 0.14901485447841145F, -0.0F, 0.0F);
        this.lowerJaw = new MowzieModelRenderer(this, 97, 54);
        this.lowerJaw.setRotationPoint(0.0F, 1.07F, -6.6F);
        this.lowerJaw.addBox(-1.5F, -1.0F, -6.6F, 3, 2, 7, 0.0F);
        ModelUtils.setRotateAngle(lowerJaw, -0.0622576080153868F, -0.0F, 0.0F);
        this.neck = new MowzieModelRenderer(this, 46, 52);
        this.neck.setRotationPoint(0.0F, 0.8F, -5.7F);
        this.neck.addBox(-2.0F, -2.0F, -7.0F, 4, 4, 7, 0.0F);
        ModelUtils.setRotateAngle(neck, -0.9773843811168246F, -0.0F, 0.0F);
        this.rightThigh = new MowzieModelRenderer(this, 2, 36);
        this.rightThigh.setRotationPoint(-3.5F, 13.0F, 4.5F);
        this.rightThigh.addBox(-3.0F, -1.0F, -2.5F, 3, 6, 5, 0.0F);
        this.TailFeather4 = new MowzieModelRenderer(this, 73, 37);
        this.TailFeather4.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.TailFeather4.addBox(-4.0F, 0.2F, 1.5F, 8, 1, 8, 0.0F);
        this.rightLeg = new MowzieModelRenderer(this, 1, 25);
        this.rightLeg.setRotationPoint(-1.5F, 3.0F, 2.5F);
        this.rightLeg.addBox(-1.0F, -1.0F, -8.0F, 2, 2, 8, 0.0F);
        ModelUtils.setRotateAngle(rightLeg, 1.1435397259066846F, -0.0F, 0.0F);
        this.leftUpperArm = new MowzieModelRenderer(this, 19, 17);
        this.leftUpperArm.mirror = true;
        this.leftUpperArm.setRotationPoint(3.0F, 1.3F, -5.5F);
        this.leftUpperArm.addBox(0.0F, -1.0F, -1.0F, 2, 5, 3, 0.0F);
        ModelUtils.setRotateAngle(leftUpperArm, 0.006806784082777885F, -0.0F, 0.0F);
        this.TailFeather3 = new MowzieModelRenderer(this, 53, 36);
        this.TailFeather3.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.TailFeather3.addBox(-3.5F, -0.3F, 0.0F, 7, 1, 8, 0.0F);
        this.rightFoot = new MowzieModelRenderer(this, 21, 34);
        this.rightFoot.setRotationPoint(0.0F, -0.9F, -7.0F);
        this.rightFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        ModelUtils.setRotateAngle(rightFoot, -1.1435397259066846F, -0.0F, 0.0F);
        this.leftToeClaw1 = new MowzieModelRenderer(this, 5, 20);
        this.leftToeClaw1.setRotationPoint(-1.1F, 1.0F, -1.0F);
        this.leftToeClaw1.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        ModelUtils.setRotateAngle(leftToeClaw1, -0.8726646259971648F, -0.0F, 0.0F);
        this.rightLowerArm = new MowzieModelRenderer(this, 15, 3);
        this.rightLowerArm.setRotationPoint(-0.9F, 3.0F, 0.0F);
        this.rightLowerArm.addBox(-0.9F, 0.0F, -6.0F, 2, 2, 6, 0.0F);
        ModelUtils.setRotateAngle(rightLowerArm, 0.704240353179712F, -0.0F, 0.0F);
        this.leftFoot = new MowzieModelRenderer(this, 21, 34);
        this.leftFoot.mirror = true;
        this.leftFoot.setRotationPoint(0.0F, -0.9F, -7.0F);
        this.leftFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        ModelUtils.setRotateAngle(leftFoot, -1.1435397259066846F, -0.0F, 0.0F);
        this.leftUpperArmWing = new MowzieModelRenderer(this, 38, 6);
        this.leftUpperArmWing.setRotationPoint(1.8F, 2.8F, 1.0F);
        this.leftUpperArmWing.addBox(-0.5F, 0.0F, -3.5F, 1, 4, 7, 0.0F);
        ModelUtils.setRotateAngle(leftUpperArmWing, 1.5184364492350666F, -0.0F, 0.0F);
        this.TailFeather2 = new MowzieModelRenderer(this, 53, 36);
        this.TailFeather2.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.TailFeather2.addBox(-3.5F, -0.3F, 7.9F, 7, 1, 8, 0.0F);
        this.crest = new MowzieModelRenderer(this, 30, 17);
        this.crest.setRotationPoint(0.0F, -2.0F, -3.5F);
        this.crest.addBox(-0.5F, -2.0F, 0.0F, 1, 5, 8, 0.0F);
        ModelUtils.setRotateAngle(crest, 0.367697721415797F, -0.0F, 0.0F);
        this.crest2 = new MowzieModelRenderer(this, 30, 17);
        this.crest2.setRotationPoint(1.1F, -1.4F, -2.2F);
        this.crest2.addBox(-0.5F, -2.0F, 0.0F, 1, 5, 8, 0.0F);
        ModelUtils.setRotateAngle(crest2, -0.3141592653589793F, 0.17453292519943295F, 0.08726646259971647F);
        this.rightLowerArmWing = new MowzieModelRenderer(this, 37, 4);
        this.rightLowerArmWing.mirror = true;
        this.rightLowerArmWing.setRotationPoint(-0.8F, 0.7F, 1.5F);
        this.rightLowerArmWing.addBox(-0.5F, 0.0F, -8.0F, 1, 5, 8, 0.0F);
        ModelUtils.setRotateAngle(rightLowerArmWing, 0.01361356816555577F, -0.0F, 0.0F);
        this.rightToeClaw1 = new MowzieModelRenderer(this, 5, 20);
        this.rightToeClaw1.setRotationPoint(1.1F, 1.0F, -1.0F);
        this.rightToeClaw1.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        ModelUtils.setRotateAngle(rightToeClaw1, -0.8726646259971648F, -0.0F, 0.0F);
        this.upperJaw = new MowzieModelRenderer(this, 97, 39);
        this.upperJaw.setRotationPoint(0.0F, -2.1F, -5.5F);
        this.upperJaw.addBox(-2.0F, -2.0F, -8.0F, 4, 4, 8, 0.0F);
        ModelUtils.setRotateAngle(upperJaw, 0.07661995416255106F, -0.0F, 0.0F);
        this.tail3 = new MowzieModelRenderer(this, 62, 28);
        this.tail3.setRotationPoint(0.0F, -0.4F, 17.0F);
        this.tail3.addBox(-0.5F, -0.9F, 0.0F, 1, 2, 6, 0.0F);
        ModelUtils.setRotateAngle(tail3, -0.08256616149996648F, -0.0F, 0.0F);
        this.leftLowerArm = new MowzieModelRenderer(this, 15, 3);
        this.leftLowerArm.mirror = true;
        this.leftLowerArm.setRotationPoint(0.9F, 3.0F, 0.0F);
        this.leftLowerArm.addBox(-1.0F, 0.0F, -6.0F, 2, 2, 6, 0.0F);
        ModelUtils.setRotateAngle(leftLowerArm, 0.704240353179712F, -0.0F, 0.0F);
        this.head = new MowzieModelRenderer(this, 68, 47);
        this.head.setRotationPoint(0.0F, 0F, 0F);
        this.head.addBox(-2.5F, -4.0F, -7.0F, 5, 6, 7, 0.0F);
        ModelUtils.setRotateAngle(head, 0F, -0.0F, 0.0F);
        this.headPivot = new MowzieModelRenderer(this, 0, 0);
        this.headPivot.setRotationPoint(0.0F, -1.5F, -7.0F);
        ModelUtils.setRotateAngle(headPivot, 1.1344640137963142F, -0.0F, 0.0F);
        this.rightToeClaw2 = new MowzieModelRenderer(this, 5, 16);
        this.rightToeClaw2.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.rightToeClaw2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        ModelUtils.setRotateAngle(rightToeClaw2, -1.7627825445142729F, -0.0F, 0.0F);
        this.crest3 = new MowzieModelRenderer(this, 30, 17);
        this.crest3.setRotationPoint(-1.1F, -1.4F, -2.2F);
        this.crest3.addBox(-0.5F, -2.0F, -0.2F, 1, 5, 8, 0.0F);
        ModelUtils.setRotateAngle(crest3, -0.3141592653589793F, -0.17453292519943295F, -0.08726646259971647F);
        this.TailFeather1 = new MowzieModelRenderer(this, 29, 33);
        this.TailFeather1.setRotationPoint(0.0F, -0.5F, 0.1F);
        this.TailFeather1.addBox(-3.0F, 0.0F, -1.2F, 6, 1, 12, 0.0F);
        this.upperBody = new MowzieModelRenderer(this, 13, 48);
        this.upperBody.setRotationPoint(0.0F, -1.5F, 1.0F);
        this.upperBody.addBox(-3.0F, -2.0F, -7.0F, 6, 6, 7, 0.0F);
        ModelUtils.setRotateAngle(upperBody, 0.22916173078685548F, -0.0F, 0.0F);
        this.rightUpperArm.addChild(this.rightUpperArmWing);
        this.leftThigh.addChild(this.leftLeg);
        this.tail1.addChild(this.tail2);
        this.upperBody.addChild(this.rightUpperArm);
        this.leftLowerArm.addChild(this.leftLowerArmWing);
        this.leftToeClaw1.addChild(this.leftToeClaw2);
        this.lowerBody.addChild(this.tail1);
        this.head.addChild(this.lowerJaw);
        this.upperBody.addChild(this.neck);
        this.tail1.addChild(this.TailFeather4);
        this.rightThigh.addChild(this.rightLeg);
        this.upperBody.addChild(this.leftUpperArm);
        this.tail2.addChild(this.TailFeather3);
        this.rightLeg.addChild(this.rightFoot);
        this.leftFoot.addChild(this.leftToeClaw1);
        this.rightUpperArm.addChild(this.rightLowerArm);
        this.leftLeg.addChild(this.leftFoot);
        this.leftUpperArm.addChild(this.leftUpperArmWing);
        this.tail2.addChild(this.TailFeather2);
        this.head.addChild(this.crest);
        this.head.addChild(this.crest2);
        this.rightLowerArm.addChild(this.rightLowerArmWing);
        this.rightFoot.addChild(this.rightToeClaw1);
        this.head.addChild(this.upperJaw);
        this.tail2.addChild(this.tail3);
        this.leftUpperArm.addChild(this.leftLowerArm);
        this.neck.addChild(this.headPivot);
        this.headPivot.addChild(this.head);
        this.rightToeClaw1.addChild(this.rightToeClaw2);
        this.head.addChild(this.crest3);
        this.tail3.addChild(this.TailFeather1);
        this.lowerBody.addChild(this.upperBody);
        this.setInitPose();
        animator = new Animator(this);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimated) entity, f, f1, f2, f3, f4, f5);
        this.rightThigh.render(f5);
        this.lowerBody.render(f5);
        this.leftThigh.render(f5);

    }

    public void animate(IAnimated entity, float f, float f1, float f2, float f3, float f4, float f5) {
        MowzieModelRenderer[] neckParts = {this.neck, this.head};
        animator.update(entity);
        this.setToInitPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        /*animator.setAnimationId(EntityDeinonychus.animation_attack.animationId);
        animator.startPhase(15);
		animator.move(leftThigh, 0, 3.2F, -0.5F);
		animator.move(rightThigh, 0, 3.2F, -0.5F);
		animator.move(lowerBody, 0, 3.2F, -0.5F);
		ModelUtils.rotate(animator, rightLeg, 30, 0, 0);
		ModelUtils.rotate(animator, leftLeg, 30, 0, 0);
		ModelUtils.rotate(animator, rightFoot, -30, 0, 0);
		ModelUtils.rotate(animator, leftFoot, -30, 0, 0);
		ModelUtils.rotate(animator, leftUpperArm, 0, 0, -50);
		ModelUtils.rotate(animator, rightUpperArm, 0, 0, 50);
		animator.endPhase();
		animator.startPhase(15);
		animator.move(leftThigh, 0,0F, 0F);
		animator.move(rightThigh, 0, 0F, 0F);
		animator.move(lowerBody, 0, 0F, 0F);
		ModelUtils.rotate(animator, lowerBody, -15, 0, 0);
		ModelUtils.rotate(animator, rightThigh, 39, 0, 0);
		ModelUtils.rotate(animator, leftThigh, 39, 0, 0);
		ModelUtils.rotate(animator, rightLeg, 60, 0, 0);
		ModelUtils.rotate(animator, leftLeg, 60, 0, 0);
		ModelUtils.rotate(animator, rightFoot, -70, 0, 0);
		ModelUtils.rotate(animator, leftFoot, -70, 0, 0);
		animator.endPhase();
		animator.resetPhase(15);*/

    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        MowzieModelRenderer[] tailParts = {this.tail1, this.tail2, this.tail3};
        MowzieModelRenderer[] neckParts = {this.neck, this.head};
        MowzieModelRenderer[] leftArmParts = {this.leftUpperArm, this.leftLowerArm};
        MowzieModelRenderer[] rightArmParts = {this.rightUpperArm, this.rightLowerArm};
        this.faceTarget(head, 1, f3, f4);

        float speed = 0.1F;
        float speed2 = 0.8F;
        float sitProgress = ((EntityNewPrehistoric) (entity)).sitProgress;
        sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(13.13D), 0, 0);
        sitAnimationRotation(rightFoot, sitProgress, ((float) Math.toRadians(26D)), 0, 0);
        sitAnimationRotation(leftLowerArm, sitProgress, -(float) Math.toRadians(10D), 0, 0);
        sitAnimationRotation(tail3, sitProgress, (float) Math.toRadians(5.22D), 0, 0);
        sitAnimationRotation(rightLowerArm, sitProgress, -(float) Math.toRadians(10D), 0, 0);
        sitAnimationRotation(leftFoot, sitProgress, ((float) Math.toRadians(26D)), 0, 0);
        sitAnimationRotation(rightUpperArm, sitProgress, (float) Math.toRadians(7D), -((float) Math.toRadians(13.04D)), (float) Math.toRadians(76.0D));
        sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(5.22D)), 0, 0);
        sitAnimationRotation(upperJaw, sitProgress, (float) Math.toRadians(4.39D), 0, 0);
        sitAnimationRotation(leftUpperArm, sitProgress, (float) Math.toRadians(7D), (float) Math.toRadians(13.0D), -((float) Math.toRadians(76.0D)));
        sitAnimationRotation(head, sitProgress, (float) Math.toRadians(40.13D), 0, 0);
        sitAnimationRotation(rightLeg, sitProgress, -(float) Math.toRadians(30.0D), 0, 0);
        sitAnimationRotation(tail1, sitProgress, -((float) Math.toRadians(2.61D)), 0, 0);
        sitAnimationRotation(neck, sitProgress, -((float) Math.toRadians(40.09D)), 0, 0);
        sitAnimationRotation(leftLeg, sitProgress, -(float) Math.toRadians(30.0D), 0, 0);
        sitAnimationRotation(lowerJaw, sitProgress, -((float) Math.toRadians(3.567098181861509D)), 0, 0);
        sitAnimationRotation(tail2, sitProgress, -((float) Math.toRadians(2.61D)), 0, 0);
        sitAnimationPos(lowerBody, sitProgress, 0F, 17.50F - lowerBody.initRotationPointY, 0F);
        sitAnimationPos(rightThigh, sitProgress, 0F, 16.20F - rightThigh.initRotationPointY, 0F);
        sitAnimationPos(leftThigh, sitProgress, 0F, 16.20F - leftThigh.initRotationPointY, 0F);
        this.walk(upperBody, speed, 0.1F, false, 1F, 0F, entity.ticksExisted, 1);
        this.bob(lowerBody, speed, 0.7F, false, entity.ticksExisted, 1);
        this.walk(leftThigh, speed2, 0.8F, false, 0F, 0.4F, f, f1);
        this.walk(leftLeg, speed2, 0.2F, false, 0F, -0.6F, f, f1);
        this.walk(leftFoot, speed2, -0.4F, false, 4.5F, 0.4F, f, f1);
        this.walk(rightThigh, speed2, 0.8F, true, 0F, 0.4F, f, f1);
        this.walk(rightLeg, speed2, 0.2F, true, 0F, -0.6F, f, f1);
        this.walk(rightFoot, speed2, -0.4F, true, 4.5F, 0.4F, f, f1);
        this.chainWave(tailParts, speed, 0.05F, -3, entity.ticksExisted, 1);
        this.chainWave(leftArmParts, speed, 0.15F, -3, entity.ticksExisted, 1);
        this.chainWave(rightArmParts, speed, 0.15F, -3, entity.ticksExisted, 1);
        this.chainSwing(tailParts, speed, 0.15F, -3, entity.ticksExisted, 1);
        this.chainSwing(tailParts, speed2, 0.25F, -3, f, f1);
        this.chainWave(neckParts, speed, 0.15F, 3, entity.ticksExisted, 1);
        if (((EntityDeinonychus) entity).getAnimation() != EntityDeinonychus.animation_attack && ((EntityDeinonychus) entity).ridingEntity != null) {
            ModelUtils.setRotateAngleAlt(lowerBody, -15, 0, 0);
            ModelUtils.setRotateAngleAlt(leftLeg, 20, 0, 0);
            ModelUtils.setRotateAngleAlt(leftFoot, -20, 0, 0);
            ModelUtils.setRotateAngleAlt(rightLeg, 20, 0, 0);
            ModelUtils.setRotateAngleAlt(rightFoot, -20, 0, 0);
            ModelUtils.setRotateAngleAlt(leftUpperArm, 0, 0, -40);
            ModelUtils.setRotateAngleAlt(rightUpperArm, 0, 0, 40);
            ModelUtils.setRotateAngleAlt(head, 40, 0, 0);
            EntityDeinonychus dino = (EntityDeinonychus) entity;
            float speed3 = 0.5F;
            this.walk(lowerJaw, speed3, -0.3F, true, 0.5F, 0.3F, entity.ticksExisted, 1);
            this.walk(neck, speed3, 0.4F, false, 0F, 0.4F, entity.ticksExisted, 1);
            this.walk(head, speed3, 0.4F, true, 0F, 0.2F, entity.ticksExisted, 1);
            this.flap(leftUpperArm, 0.8F, 0.4F, true, 0.3F, -0.1F, entity.ticksExisted, 1);
            this.flap(rightUpperArm, 0.8F, -0.4F, false, 0.3F, 0.1F, entity.ticksExisted, 1);

        }
        //((ChainBuffer)((EntityDeinonychus)entity).tailbuffer).applyChainSwingBuffer(tailParts);
    }

    //	@Override
    //	public void sitPose(boolean animate) {
    //		ModelUtils.animateOrSetRotation(animator, animate, leftUpperArmWing, 1.5184364492350666F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, upperJaw, 0.07661995416255106F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightLowerArmWing, 0.01361356816555577F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftLeg, 0.5235987755982988F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftUpperArm, 0.006806784082777885F, 0.22689280275926282F, -0.6981317007977318F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftLowerArm, 0.704240353179712F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, tail2, -0.045553093477052F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightLeg, 0.5235987755982988F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightFoot, -0.4553564018453205F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, tail1, -0.045553093477052F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, crest, 0.367697721415797F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, tail3, 0.091106186954104F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, lowerJaw, -0.0622576080153868F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightToeClaw1, -0.8726646259971648F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightUpperArm, 0.136659280431156F, -0.22759093446006054F, 0.6981317007977318F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftToeClaw2, -1.7627825445142729F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, lowerBody, -0.091106186954104F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, neck, -1.5025539530419183F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, upperBody, 0.22916173078685548F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, crest2, -0.3141592653589793F, 0.17453292519943295F, 0.08726646259971647F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightToeClaw2, -1.7627825445142729F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightUpperArmWing, 1.5184364492350666F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftLowerArmWing, 0.01361356816555577F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, crest3, -0.3141592653589793F, -0.17453292519943295F, -0.08726646259971647F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftToeClaw1, -0.8726646259971648F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightLowerArm, 0.704240353179712F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftFoot, -0.5009094953223726F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, headPivot, 1.730144887501979F, -0.0F, 0.0F, false);
    //		ModelUtils.animateToPos(animator, animate, lowerBody, 0F, 17.50F - lowerBody.initRotationPointY, 0F, true);
    //		ModelUtils.animateToPos(animator, animate, rightThigh, 0F, 16.20F - rightThigh.initRotationPointY, 0F, true);
    //		ModelUtils.animateToPos(animator, animate, leftThigh, 0F, 16.20F - leftThigh.initRotationPointY, 0F, true);
    //		ModelUtils.setPos(animator, animate, lowerBody, 0F, 17.50F, -3F, false);
    //		ModelUtils.setPos(animator, animate, rightThigh, -3.5F, 16.20F, 4.5F, false);
    //		ModelUtils.setPos(animator, animate, leftThigh, 3.5F, 16.20F, 4.5F, false);
    //	}

    //	@Override
    //	public void sitPose(boolean animate) {
    //		ModelUtils.animateOrSetRotation(animator, animate, leftUpperArmWing, 1.5184364492350666F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, upperJaw, 0.07661995416255106F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightLowerArmWing, 0.01361356816555577F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftLeg, 0.5235987755982988F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftUpperArm, 0.006806784082777885F, 0.22689280275926282F, -0.6981317007977318F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftLowerArm, 0.704240353179712F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, tail2, -0.045553093477052F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightLeg, 0.5235987755982988F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightFoot, -0.4553564018453205F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, tail1, -0.045553093477052F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, crest, 0.367697721415797F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, tail3, 0.091106186954104F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, lowerJaw, -0.0622576080153868F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightToeClaw1, -0.8726646259971648F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightUpperArm, 0.136659280431156F, -0.22759093446006054F, 0.6981317007977318F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftToeClaw2, -1.7627825445142729F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, lowerBody, -0.091106186954104F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, neck, -1.5025539530419183F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, upperBody, 0.22916173078685548F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, crest2, -0.3141592653589793F, 0.17453292519943295F, 0.08726646259971647F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightToeClaw2, -1.7627825445142729F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightUpperArmWing, 1.5184364492350666F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftLowerArmWing, 0.01361356816555577F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, crest3, -0.3141592653589793F, -0.17453292519943295F, -0.08726646259971647F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftToeClaw1, -0.8726646259971648F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, rightLowerArm, 0.704240353179712F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, leftFoot, -0.5009094953223726F, -0.0F, 0.0F, false);
    //		ModelUtils.animateOrSetRotation(animator, animate, headPivot, 1.730144887501979F, -0.0F, 0.0F, false);
    //		ModelUtils.animateToPos(animator, animate, lowerBody, 0F, 17.50F - lowerBody.initRotationPointY, 0F, true);
    //		ModelUtils.animateToPos(animator, animate, rightThigh, 0F, 16.20F - rightThigh.initRotationPointY, 0F, true);
    //		ModelUtils.animateToPos(animator, animate, leftThigh, 0F, 16.20F - leftThigh.initRotationPointY, 0F, true);
    //		ModelUtils.setPos(animator, animate, lowerBody, 0F, 17.50F, -3F, false);
    //		ModelUtils.setPos(animator, animate, rightThigh, -3.5F, 16.20F, 4.5F, false);
    //		ModelUtils.setPos(animator, animate, leftThigh, 3.5F, 16.20F, 4.5F, false);
    //	}


}
