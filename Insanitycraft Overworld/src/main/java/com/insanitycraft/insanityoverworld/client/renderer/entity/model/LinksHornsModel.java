package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.player.PlayerEntity;

public class LinksHornsModel<T extends PlayerEntity> extends EntityModel<T> {
    @Override
    public void func_225597_a_(T t, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void func_225598_a_(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3) {

    }
    //    public ModelRenderer head;
//    public ModelRenderer hornRight1;
//    public ModelRenderer hornLeft1;
//    public ModelRenderer hornRight2;
//    public ModelRenderer hornRight3;
//    public ModelRenderer hornLeft2;
//    public ModelRenderer hornLeft3;
//
//    public LinksHornsModel() {
//        this.textureWidth = 32;
//        this.textureHeight = 32;
//        this.head = new ModelRenderer(this, -8, 0);
//        this.head.setRotationPoint(0.0F, -4.0F, 0.0F);
//        this.head.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.5F);
//        this.hornRight2 = new ModelRenderer(this, 0, 2);
//        this.hornRight2.setRotationPoint(0.0F, 0.0F, 0.0F);
//        this.hornRight2.addBox(-3.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
//        this.setRotateAngle(hornRight2, 0.0F, 0.0F, 0.6981317007977318F);
//        this.hornLeft3 = new ModelRenderer(this, 0, 0);
//        this.hornLeft3.setRotationPoint(-2.0F, 0.3F, 0.0F);
//        this.hornLeft3.addBox(-4.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
//        this.setRotateAngle(hornLeft3, 0.0F, 0.0F, 0.3665191429188092F);
//        this.hornLeft1 = new ModelRenderer(this, 12, 0);
//        this.hornLeft1.setRotationPoint(6.2F, -3.0F, 1.0F);
//        this.hornLeft1.addBox(0.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
//        this.setRotateAngle(hornLeft1, 0.0F, 3.141592653589793F, -0.4363323129985824F);
//        this.hornLeft2 = new ModelRenderer(this, 0, 2);
//        this.hornLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
//        this.hornLeft2.addBox(-3.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
//        this.setRotateAngle(hornLeft2, 0.0F, 0.0F, 0.6981317007977318F);
//        this.hornRight1 = new ModelRenderer(this, 12, 0);
//        this.hornRight1.setRotationPoint(-6.2F, -3.0F, 1.0F);
//        this.hornRight1.addBox(0.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
//        this.setRotateAngle(hornRight1, 0.0F, 0.0F, 0.4363323129985824F);
//        this.hornRight3 = new ModelRenderer(this, 0, 0);
//        this.hornRight3.setRotationPoint(-2.0F, 0.3F, 0.0F);
//        this.hornRight3.addBox(-4.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F);
//        this.setRotateAngle(hornRight3, 0.0F, 0.0F, 0.3665191429188092F);
//        this.hornRight1.addChild(this.hornRight2);
//        this.hornLeft2.addChild(this.hornLeft3);
//        this.head.addChild(this.hornLeft1);
//        this.hornLeft1.addChild(this.hornLeft2);
//        this.head.addChild(this.hornRight1);
//        this.hornRight2.addChild(this.hornRight3);
//    }
//
//    @Override
//    public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
//        renderHorns(f5);
//    }
//
//    public void renderHorns(float f5) {
//        this.head.render(f5);
//    }
//
//    /**
//     * This is a helper function from Tabula to set the rotation of model parts
//     */
//    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
//        modelRenderer.rotateAngleX = x;
//        modelRenderer.rotateAngleY = y;
//        modelRenderer.rotateAngleZ = z;
//    }
}
