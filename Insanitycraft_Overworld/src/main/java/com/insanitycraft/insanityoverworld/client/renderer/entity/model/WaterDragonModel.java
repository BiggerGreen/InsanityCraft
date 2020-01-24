package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.google.common.collect.ImmutableList;
import com.insanitycraft.insanityoverworld.entity.WaterDragonEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WaterDragonModel<T extends WaterDragonEntity> extends SegmentedModel<T> {
    public double[] modelScale = new double[] { 0.9D, 0.9D, 0.9D };
    public ModelRenderer TorsoP1;
    public ModelRenderer NeckP2;
    public ModelRenderer TorsoBottom;
    public ModelRenderer NeckP1;
    public ModelRenderer FinBody2;
    public ModelRenderer FinLeft;
    public ModelRenderer FinLeft_1;
    public ModelRenderer TailP1;
    public ModelRenderer FinBody;
    public ModelRenderer TailP2;
    public ModelRenderer TailP3;
    public ModelRenderer TailFin;
    public ModelRenderer HeadJoint;
    public ModelRenderer HeadJawP1;
    public ModelRenderer HeadTopP2;
    public ModelRenderer HeadP3;
    public ModelRenderer HeadP4;
    public ModelRenderer HeadP5;
    public ModelRenderer HeadDetail;
    public ModelRenderer HeadDetail2;
    public ModelRenderer HeadP6;

    public WaterDragonModel() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.HeadTopP2 = new ModelRenderer(this, 0, 60);
        this.HeadTopP2.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.HeadTopP2.addBox(-6.0F, 0.0F, 0.0F, 12, 26, 9, 0.0F);
        this.setRotateAngle(HeadTopP2, -0.2617993877991494F, 0.0F, 0.0F);
        this.HeadP6 = new ModelRenderer(this, 3, 125);
        this.HeadP6.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.HeadP6.addBox(-7.5F, -1.0F, -3.0F, 15, 16, 16, 0.0F);
        this.FinLeft_1 = new ModelRenderer(this, 150, 0);
        this.FinLeft_1.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.FinLeft_1.addBox(-4.0F, -1.0F, -9.0F, 30, 2, 19, 0.0F);
        this.setRotateAngle(FinLeft_1, 0.0F, -0.5235987755982988F, 0.0F);
        this.HeadP4 = new ModelRenderer(this, 0, 100);
        this.HeadP4.setRotationPoint(-6.5F, 4.5F, -2.0F);
        this.HeadP4.addBox(0.0F, 0.0F, 0.0F, 4, 16, 4, 0.0F);
        this.setRotateAngle(HeadP4, 0.0F, 0.0F, -0.2617993877991494F);
        this.TorsoP1 = new ModelRenderer(this, 100, 125);
        this.TorsoP1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.TorsoP1.addBox(-10.0F, -8.5F, -15.0F, 20, 17, 30, 0.0F);
        this.HeadP3 = new ModelRenderer(this, 0, 100);
        this.HeadP3.mirror = true;
        this.HeadP3.setRotationPoint(2.5F, 3.5F, -2.0F);
        this.HeadP3.addBox(0.0F, 0.0F, 0.0F, 4, 16, 4, 0.0F);
        this.setRotateAngle(HeadP3, 0.0F, 0.0F, 0.2617993877991494F);
        this.TailP1 = new ModelRenderer(this, 100, 40);
        this.TailP1.setRotationPoint(0.0F, 0.0F, 29.0F);
        this.TailP1.addBox(-8.5F, -7.5F, 0.0F, 17, 15, 12, 0.0F);
        this.TorsoBottom = new ModelRenderer(this, 100, 70);
        this.TorsoBottom.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.TorsoBottom.addBox(-9.0F, -8.0F, 0.0F, 18, 16, 30, 0.0F);
        this.FinBody = new ModelRenderer(this, 200, 200);
        this.FinBody.setRotationPoint(0.0F, -15.0F, 15.0F);
        this.FinBody.addBox(0.0F, 0.0F, -12.0F, 1, 8, 24, 0.0F);
        this.HeadDetail2 = new ModelRenderer(this, 0, 170);
        this.HeadDetail2.setRotationPoint(8.0F, 1.0F, 0.0F);
        this.HeadDetail2.addBox(-1.0F, 0.0F, -6.0F, 10, 0, 12, 0.0F);
        this.setRotateAngle(HeadDetail2, 0.0F, 0.08726646259971647F, -0.7853981633974483F);
        this.NeckP2 = new ModelRenderer(this, 100, 220);
        this.NeckP2.setRotationPoint(0.0F, -3.5F, -19.5F);
        this.NeckP2.addBox(-5.0F, -7.0F, -18.0F, 10, 14, 19, -0.1F);
        this.setRotateAngle(NeckP2, -0.8726646259971648F, 0.0F, 0.0F);
        this.NeckP1 = new ModelRenderer(this, 100, 180);
        this.NeckP1.setRotationPoint(0.0F, -2.0F, -12.5F);
        this.NeckP1.addBox(-7.5F, -8.0F, -12.0F, 15, 16, 14, 0.0F);
        this.setRotateAngle(NeckP1, -0.3490658503988659F, -0.012566370614359173F, 0.0F);
        this.HeadJoint = new ModelRenderer(this, 0, 0);
        this.HeadJoint.setRotationPoint(0.0F, 0.0F, -18.0F);
        this.HeadJoint.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.HeadJawP1 = new ModelRenderer(this, 50, 70);
        this.HeadJawP1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadJawP1.addBox(-6.0F, -5.5F, -2.0F, 12, 24, 4, 0.0F);
        this.setRotateAngle(HeadJawP1, -0.3490658503988659F, 0.0F, 0.0F);
        this.TailP2 = new ModelRenderer(this, 170, 50);
        this.TailP2.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.TailP2.addBox(-5.0F, -5.0F, 0.0F, 10, 10, 18, 0.0F);
        this.FinBody2 = new ModelRenderer(this, 200, 200);
        this.FinBody2.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.FinBody2.addBox(0.0F, -8.0F, -9.0F, 1, 8, 24, 0.0F);
        this.FinLeft = new ModelRenderer(this, 150, 0);
        this.FinLeft.mirror = true;
        this.FinLeft.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.FinLeft.addBox(-26.0F, -1.0F, -9.0F, 30, 2, 19, 0.0F);
        this.setRotateAngle(FinLeft, 0.0F, 0.5235987755982988F, 0.0F);
        this.TailFin = new ModelRenderer(this, 0, 0);
        this.TailFin.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.TailFin.addBox(-24.0F, -1.0F, 0.0F, 48, 2, 28, 0.0F);
        this.HeadP5 = new ModelRenderer(this, 3, 187);
        this.HeadP5.setRotationPoint(0.0F, 3.5F, -2.5F);
        this.HeadP5.addBox(-1.5F, 0.0F, 0.0F, 3, 20, 6, 0.0F);
        this.HeadDetail = new ModelRenderer(this, 0, 170);
        this.HeadDetail.mirror = true;
        this.HeadDetail.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.HeadDetail.addBox(-8.5F, 0.0F, -6.0F, 10, 0, 12, 0.0F);
        this.setRotateAngle(HeadDetail, 0.0F, -0.08726646259971647F, 0.7853981633974483F);
        this.TailP3 = new ModelRenderer(this, 200, 100);
        this.TailP3.setRotationPoint(0.0F, 0.0F, 18.0F);
        this.TailP3.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 15, 0.0F);
        this.HeadJawP1.addChild(this.HeadTopP2);
        this.HeadP5.addChild(this.HeadP6);
        this.TorsoP1.addChild(this.FinLeft_1);
        this.HeadTopP2.addChild(this.HeadP4);
        this.HeadTopP2.addChild(this.HeadP3);
        this.TorsoBottom.addChild(this.TailP1);
        this.TorsoP1.addChild(this.TorsoBottom);
        this.TorsoBottom.addChild(this.FinBody);
        this.HeadTopP2.addChild(this.HeadDetail2);
        this.TorsoP1.addChild(this.NeckP1);
        this.NeckP2.addChild(this.HeadJoint);
        this.HeadJoint.addChild(this.HeadJawP1);
        this.TailP1.addChild(this.TailP2);
        this.TorsoP1.addChild(this.FinBody2);
        this.TorsoP1.addChild(this.FinLeft);
        this.TailP3.addChild(this.TailFin);
        this.HeadTopP2.addChild(this.HeadP5);
        this.HeadTopP2.addChild(this.HeadDetail);
        this.TailP2.addChild(this.TailP3);
    }

    @Override
    public void render(T t, float v, float v1, float v2, float v3, float v4) {
        RenderSystem.pushMatrix();
        RenderSystem.scaled(1D / modelScale[0], 1D / modelScale[1], 1D / modelScale[2]);
        RenderSystem.popMatrix();
    }

    @Override
    public Iterable<ModelRenderer> getParts() {
        return ImmutableList.of(TorsoP1, NeckP2);
    }



    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
