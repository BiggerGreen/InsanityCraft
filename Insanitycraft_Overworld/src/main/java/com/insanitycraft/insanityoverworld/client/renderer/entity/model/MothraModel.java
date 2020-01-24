package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.google.common.collect.ImmutableList;
import com.insanitycraft.insanityoverworld.entity.MothraEntity;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class MothraModel<T extends MothraEntity> extends SegmentedModel<T> {
    public double[] modelScale = new double[] { 0.3D, 0.3D, 0.3D };
    public ModelRenderer torsoTop;
    public ModelRenderer torsoP2;
    public ModelRenderer Head;
    public ModelRenderer fluff;
    public ModelRenderer rightWingJoint1;
    public ModelRenderer legL1Top;
    public ModelRenderer leftWingJoint1;
    public ModelRenderer legL2Top;
    public ModelRenderer legL3Top;
    public ModelRenderer legR1Top;
    public ModelRenderer legR2Top;
    public ModelRenderer legR3Top;
    public ModelRenderer torsoBottom;
    public ModelRenderer torsoBottomer;
    public ModelRenderer antennaRight;
    public ModelRenderer antennaLeft;
    public ModelRenderer antennaRight2;
    public ModelRenderer antennaLeft2;
    public ModelRenderer wingPart1R;
    public ModelRenderer rightWingJoint3;
    public ModelRenderer rightWingJoint2;
    public ModelRenderer rightWingPart2;
    public ModelRenderer wingPart4R;
    public ModelRenderer rightWingJoint3_1;
    public ModelRenderer rightWingPart5;
    public ModelRenderer legL1Bottom;
    public ModelRenderer wingPart1L;
    public ModelRenderer leftWingJoint3;
    public ModelRenderer leftWingJoint2;
    public ModelRenderer leftWingPart2;
    public ModelRenderer wingPart4L;
    public ModelRenderer leftWingJoint3_1;
    public ModelRenderer rightWingPart5_1;
    public ModelRenderer legL2Bottom;
    public ModelRenderer legL3Bottom;
    public ModelRenderer legR1Bottom;
    public ModelRenderer legR2Bottom;
    public ModelRenderer legR3Bottom;

    public MothraModel() {
        this.textureWidth = 512;
        this.textureHeight = 512;
        this.fluff = new ModelRenderer(this, 200, 50);
        this.fluff.setRotationPoint(0.0F, 0.0F, -17.5F);
        this.fluff.addBox(-9.0F, -9.0F, 0.0F, 18, 18, 8, 0.0F);
        this.setRotateAngle(fluff, 0.17453292519943295F, 0.0F, 0.0F);
        this.legL1Bottom = new ModelRenderer(this, 50, 70);
        this.legL1Bottom.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.legL1Bottom.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(legL1Bottom, 0.0F, 0.0F, -0.5235987755982988F);
        this.wingPart4L = new ModelRenderer(this, 112, 112);
        this.wingPart4L.mirror = true;
        this.wingPart4L.setRotationPoint(2.8F, 0.0F, 2.0F);
        this.wingPart4L.addBox(0.0F, -0.5F, -16.0F, 37, 1, 32, 0.0F);
        this.leftWingJoint3 = new ModelRenderer(this, 0, 0);
        this.leftWingJoint3.setRotationPoint(2.5F, 1.0F, 0.0F);
        this.leftWingJoint3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(leftWingJoint3, 0.0F, -0.7853981633974483F, 0.0F);
        this.legL3Bottom = new ModelRenderer(this, 50, 70);
        this.legL3Bottom.mirror = true;
        this.legL3Bottom.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.legL3Bottom.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(legL3Bottom, 0.0F, 0.0F, -0.5235987755982988F);
        this.legR1Top = new ModelRenderer(this, 50, 50);
        this.legR1Top.setRotationPoint(10.0F, 11.0F, 0.0F);
        this.legR1Top.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(legR1Top, -0.5235987755982988F, -3.141592653589793F, 0.2617993877991494F);
        this.legR2Bottom = new ModelRenderer(this, 50, 70);
        this.legR2Bottom.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.legR2Bottom.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(legR2Bottom, 0.0F, 0.0F, -0.5235987755982988F);
        this.rightWingJoint3_1 = new ModelRenderer(this, 0, 0);
        this.rightWingJoint3_1.setRotationPoint(35.0F, 0.0F, 0.0F);
        this.rightWingJoint3_1.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.legR2Top = new ModelRenderer(this, 50, 50);
        this.legR2Top.setRotationPoint(10.0F, 11.0F, 8.0F);
        this.legR2Top.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(legR2Top, -0.5235987755982988F, -3.141592653589793F, 0.2617993877991494F);
        this.wingPart4R = new ModelRenderer(this, 112, 112);
        this.wingPart4R.setRotationPoint(2.8F, 0.0F, 2.0F);
        this.wingPart4R.addBox(0.0F, -0.5F, -16.0F, 37, 1, 32, 0.0F);
        this.torsoBottom = new ModelRenderer(this, 330, 135);
        this.torsoBottom.setRotationPoint(0.0F, 0.0F, 21.0F);
        this.torsoBottom.addBox(-9.0F, -9.0F, 0.0F, 18, 18, 16, 0.0F);
        this.setRotateAngle(torsoBottom, -0.2181661564992912F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 203, 7);
        this.Head.setRotationPoint(0.0F, 0.0F, -11.5F);
        this.Head.addBox(-8.0F, -8.0F, -18.0F, 16, 16, 18, 0.0F);
        this.antennaLeft = new ModelRenderer(this, 9, 200);
        this.antennaLeft.mirror = true;
        this.antennaLeft.setRotationPoint(-4.5F, -7.0F, -17.0F);
        this.antennaLeft.addBox(-0.5F, -12.0F, -0.5F, 1, 12, 1, 0.0F);
        this.setRotateAngle(antennaLeft, 0.2617993877991494F, 0.7853981633974483F, -0.2617993877991494F);
        this.antennaRight2 = new ModelRenderer(this, 30, 200);
        this.antennaRight2.setRotationPoint(0.0F, -12.5F, 0.0F);
        this.antennaRight2.addBox(-9.5F, -0.5F, -0.5F, 10, 1, 1, 0.0F);
        this.setRotateAngle(antennaRight2, 0.0F, -0.7853981633974483F, 0.2617993877991494F);
        this.legR1Bottom = new ModelRenderer(this, 50, 70);
        this.legR1Bottom.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.legR1Bottom.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(legR1Bottom, 0.0F, 0.0F, -0.5235987755982988F);
        this.leftWingJoint1 = new ModelRenderer(this, 0, 0);
        this.leftWingJoint1.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.leftWingJoint1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(leftWingJoint1, -3.141592653589793F, -0.3490658503988659F, -2.8797932657906435F);
        this.rightWingJoint1 = new ModelRenderer(this, 0, 0);
        this.rightWingJoint1.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.rightWingJoint1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rightWingJoint1, 0.0F, 0.2617993877991494F, -0.22759093446006054F);
        this.antennaRight = new ModelRenderer(this, 9, 200);
        this.antennaRight.setRotationPoint(4.5F, -7.0F, -17.0F);
        this.antennaRight.addBox(-0.5F, -12.0F, -0.5F, 1, 12, 1, 0.0F);
        this.setRotateAngle(antennaRight, 0.2617993877991494F, -0.7853981633974483F, 0.2617993877991494F);
        this.wingPart1L = new ModelRenderer(this, 112, 112);
        this.wingPart1L.mirror = true;
        this.wingPart1L.setRotationPoint(2.8F, 0.0F, 2.0F);
        this.wingPart1L.addBox(0.0F, 0.0F, -16.0F, 37, 1, 32, 0.0F);
        this.antennaLeft2 = new ModelRenderer(this, 30, 200);
        this.antennaLeft2.mirror = true;
        this.antennaLeft2.setRotationPoint(0.0F, -12.5F, 0.0F);
        this.antennaLeft2.addBox(0.0F, -0.5F, -0.5F, 10, 1, 1, 0.0F);
        this.setRotateAngle(antennaLeft2, 0.0F, 0.7853981633974483F, -0.2617993877991494F);
        this.leftWingJoint3_1 = new ModelRenderer(this, 0, 0);
        this.leftWingJoint3_1.setRotationPoint(35.0F, 0.0F, 0.0F);
        this.leftWingJoint3_1.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.legL2Top = new ModelRenderer(this, 50, 50);
        this.legL2Top.mirror = true;
        this.legL2Top.setRotationPoint(-10.0F, 11.0F, -8.0F);
        this.legL2Top.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(legL2Top, 0.5235987755982988F, 0.0F, -0.2617993877991494F);
        this.legL1Top = new ModelRenderer(this, 50, 50);
        this.legL1Top.mirror = true;
        this.legL1Top.setRotationPoint(-10.0F, 11.0F, 0.0F);
        this.legL1Top.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(legL1Top, 0.5235987755982988F, 0.0F, -0.2617993877991494F);
        this.rightWingJoint2 = new ModelRenderer(this, 0, 0);
        this.rightWingJoint2.setRotationPoint(35.0F, 0.0F, 0.0F);
        this.rightWingJoint2.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.legL3Top = new ModelRenderer(this, 50, 50);
        this.legL3Top.mirror = true;
        this.legL3Top.setRotationPoint(-10.0F, 11.0F, 8.0F);
        this.legL3Top.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(legL3Top, 0.5235987755982988F, 0.0F, -0.2617993877991494F);
        this.leftWingPart2 = new ModelRenderer(this, 108, 200);
        this.leftWingPart2.mirror = true;
        this.leftWingPart2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftWingPart2.addBox(2.0F, 0.0F, -16.1F, 40, 1, 32, 0.0F);
        this.legL2Bottom = new ModelRenderer(this, 50, 70);
        this.legL2Bottom.mirror = true;
        this.legL2Bottom.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.legL2Bottom.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(legL2Bottom, 0.0F, 0.0F, -0.5235987755982988F);
        this.leftWingJoint2 = new ModelRenderer(this, 0, 0);
        this.leftWingJoint2.setRotationPoint(35.0F, 0.0F, 0.0F);
        this.leftWingJoint2.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        this.torsoP2 = new ModelRenderer(this, 330, 80);
        this.torsoP2.setRotationPoint(0.0F, 0.0F, 15.0F);
        this.torsoP2.addBox(-10.0F, -10.0F, 0.0F, 20, 20, 24, 0.0F);
        this.setRotateAngle(torsoP2, 0.11344640137963141F, 0.0F, 0.0F);
        this.rightWingJoint3 = new ModelRenderer(this, 0, 0);
        this.rightWingJoint3.setRotationPoint(2.5F, -0.5F, 0.0F);
        this.rightWingJoint3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(rightWingJoint3, 0.0F, -0.7853981633974483F, 0.0F);
        this.wingPart1R = new ModelRenderer(this, 112, 112);
        this.wingPart1R.setRotationPoint(2.8F, 0.0F, 2.0F);
        this.wingPart1R.addBox(0.0F, -0.5F, -16.0F, 37, 1, 32, 0.0F);
        this.rightWingPart2 = new ModelRenderer(this, 108, 200);
        this.rightWingPart2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightWingPart2.addBox(2.0F, -0.5F, -16.1F, 40, 1, 32, 0.0F);
        this.torsoBottomer = new ModelRenderer(this, 0, 0);
        this.torsoBottomer.setRotationPoint(0.0F, 0.5F, 12.5F);
        this.torsoBottomer.addBox(-7.5F, -7.5F, 0.0F, 15, 15, 20, 0.0F);
        this.setRotateAngle(torsoBottomer, -0.2617993877991494F, 0.0F, 0.0F);
        this.rightWingPart5 = new ModelRenderer(this, 108, 200);
        this.rightWingPart5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightWingPart5.addBox(2.0F, -0.5F, -16.0F, 40, 1, 32, 0.0F);
        this.legR3Bottom = new ModelRenderer(this, 50, 70);
        this.legR3Bottom.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.legR3Bottom.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(legR3Bottom, 0.0F, 0.0F, -0.5235987755982988F);
        this.legR3Top = new ModelRenderer(this, 50, 50);
        this.legR3Top.setRotationPoint(10.0F, 11.0F, -8.0F);
        this.legR3Top.addBox(-1.5F, 0.0F, -1.5F, 3, 11, 3, 0.0F);
        this.setRotateAngle(legR3Top, -0.5235987755982988F, -3.141592653589793F, 0.2617993877991494F);
        this.rightWingPart5_1 = new ModelRenderer(this, 108, 200);
        this.rightWingPart5_1.mirror = true;
        this.rightWingPart5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightWingPart5_1.addBox(2.0F, -0.5F, -16.1F, 40, 1, 32, 0.0F);
        this.torsoTop = new ModelRenderer(this, 320, 3);
        this.torsoTop.setRotationPoint(0.0F, -30.0F, 0.0F);
        this.torsoTop.addBox(-12.0F, -12.0F, -13.0F, 24, 24, 30, 0.0F);
        this.setRotateAngle(torsoTop, -0.04363323129985824F, 0.0F, 0.0F);
        this.torsoTop.addChild(this.fluff);
        this.legL1Top.addChild(this.legL1Bottom);
        this.leftWingJoint3.addChild(this.wingPart4L);
        this.leftWingJoint1.addChild(this.leftWingJoint3);
        this.legL3Top.addChild(this.legL3Bottom);
        this.torsoTop.addChild(this.legR1Top);
        this.legR2Top.addChild(this.legR2Bottom);
        this.wingPart4R.addChild(this.rightWingJoint3_1);
        this.torsoTop.addChild(this.legR2Top);
        this.rightWingJoint3.addChild(this.wingPart4R);
        this.torsoP2.addChild(this.torsoBottom);
        this.torsoTop.addChild(this.Head);
        this.Head.addChild(this.antennaLeft);
        this.antennaRight.addChild(this.antennaRight2);
        this.legR1Top.addChild(this.legR1Bottom);
        this.torsoTop.addChild(this.leftWingJoint1);
        this.torsoTop.addChild(this.rightWingJoint1);
        this.Head.addChild(this.antennaRight);
        this.leftWingJoint1.addChild(this.wingPart1L);
        this.antennaLeft.addChild(this.antennaLeft2);
        this.wingPart4L.addChild(this.leftWingJoint3_1);
        this.torsoTop.addChild(this.legL2Top);
        this.torsoTop.addChild(this.legL1Top);
        this.wingPart1R.addChild(this.rightWingJoint2);
        this.torsoTop.addChild(this.legL3Top);
        this.leftWingJoint2.addChild(this.leftWingPart2);
        this.legL2Top.addChild(this.legL2Bottom);
        this.wingPart1L.addChild(this.leftWingJoint2);
        this.torsoTop.addChild(this.torsoP2);
        this.rightWingJoint1.addChild(this.rightWingJoint3);
        this.rightWingJoint1.addChild(this.wingPart1R);
        this.rightWingJoint2.addChild(this.rightWingPart2);
        this.torsoBottom.addChild(this.torsoBottomer);
        this.rightWingJoint3_1.addChild(this.rightWingPart5);
        this.legR3Top.addChild(this.legR3Bottom);
        this.torsoTop.addChild(this.legR3Top);
        this.leftWingJoint3_1.addChild(this.rightWingPart5_1);
    }

    @Override
    public void render(T t, float v, float v1, float v2, float v3, float v4) {
        RenderSystem.pushMatrix();
        RenderSystem.scaled(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        RenderSystem.popMatrix();
    }

    @Override
    public Iterable<ModelRenderer> getParts() {
        return ImmutableList.of(torsoTop);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
