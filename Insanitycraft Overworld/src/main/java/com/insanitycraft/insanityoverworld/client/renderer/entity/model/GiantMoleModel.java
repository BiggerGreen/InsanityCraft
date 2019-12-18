package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.GiantMoleEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class GiantMoleModel<T extends GiantMoleEntity> extends EntityModel<T> {
//	private final ModelRenderer body;
//	private final ModelRenderer tail;
//	private final ModelRenderer nose;
//	private final ModelRenderer bone8;
//	private final ModelRenderer bone9;
//	private final ModelRenderer bone10;
//	private final ModelRenderer foot1;
//	private final ModelRenderer foot2;
//	private final ModelRenderer foot3;
//	private final ModelRenderer foot4;
//
//	public GiantMoleModel () {
//		textureWidth = 64;
//		textureHeight = 64;
//
//		body = new ModelRenderer(this);
//		body.setRotationPoint(0.0F, 19.25F, 2.3333F);
//		body.cubeList.add(new ModelBox(body, 0, 44, -6.0F, -5.25F, -7.3333F, 12, 9, 11, 0.0F, false));
//		body.cubeList.add(new ModelBox(body, 0, 50, -5.0F, -4.25F, -13.3333F, 10, 8, 6, 0.0F, false));
//		body.cubeList.add(new ModelBox(body, 40, 24, -4.0F, -3.25F, -16.3333F, 8, 6, 3, 0.0F, false));
//		body.cubeList.add(new ModelBox(body, 0, 51, -5.0F, -4.25F, 3.6667F, 10, 8, 5, 0.0F, false));
//		body.cubeList.add(new ModelBox(body, 0, 55, -4.0F, -3.25F, 8.6667F, 8, 7, 2, 0.0F, false));
//		body.cubeList.add(new ModelBox(body, 0, 58, -3.0F, -1.25F, 10.6667F, 6, 5, 1, 0.0F, false));
//
//		tail = new ModelRenderer(this);
//		tail.setRotationPoint(-0.3333F, 21.5F, 14.1667F);
//		tail.cubeList.add(new ModelBox(tail, 50, 57, -0.6667F, -0.5F, -0.1667F, 1, 1, 6, 0.0F, false));
//		tail.cubeList.add(new ModelBox(tail, 52, 58, -1.6667F, -0.5F, 4.8333F, 1, 1, 5, 0.0F, false));
//		tail.cubeList.add(new ModelBox(tail, 54, 59, -0.6667F, -0.5F, 8.8333F, 1, 1, 4, 0.0F, false));
//
//		nose = new ModelRenderer(this);
//		nose.setRotationPoint(0.0F, 21.125F, -9.0625F);
//		nose.cubeList.add(new ModelBox(nose, 0, 23, -2.0F, -4.125F, -5.9375F, 4, 4, 1, 0.0F, false));
//		nose.cubeList.add(new ModelBox(nose, 0, 23, 2.0F, -1.125F, -5.9375F, 3, 1, 1, 0.0F, false));
//		nose.cubeList.add(new ModelBox(nose, 0, 23, 2.0F, -3.125F, -5.9375F, 3, 1, 1, 0.0F, false));
//		nose.cubeList.add(new ModelBox(nose, 0, 23, -5.0F, -3.125F, -5.9375F, 3, 1, 1, 0.0F, false));
//		nose.cubeList.add(new ModelBox(nose, 0, 23, -5.0F, -1.125F, -5.9375F, 3, 1, 1, 0.0F, false));
//
//		bone8 = new ModelRenderer(this);
//		bone8.setRotationPoint(4.0F, -3.625F, -5.4375F);
//		setRotationAngle(bone8, 0.0F, 0.0F, -0.6981F);
//		nose.addChild(bone8);
//		bone8.cubeList.add(new ModelBox(bone8, 0, 23, -2.0F, -2.0F, -0.5F, 3, 1, 1, 0.0F, false));
//		bone8.cubeList.add(new ModelBox(bone8, 0, 23, -9.0F, -2.0F, -0.5F, 3, 1, 1, 0.0F, false));
//
//		bone9 = new ModelRenderer(this);
//		bone9.setRotationPoint(-3.0F, -5.125F, -5.4375F);
//		setRotationAngle(bone9, 0.0F, 0.0F, -2.3562F);
//		nose.addChild(bone9);
//		bone9.cubeList.add(new ModelBox(bone9, 0, 23, -2.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
//		bone9.cubeList.add(new ModelBox(bone9, 0, 23, -9.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
//
//		bone10 = new ModelRenderer(this);
//		bone10.setRotationPoint(1.0F, -4.625F, -5.4375F);
//		setRotationAngle(bone10, 0.0F, 0.0F, 1.5708F);
//		nose.addChild(bone10);
//		bone10.cubeList.add(new ModelBox(bone10, 0, 23, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
//		bone10.cubeList.add(new ModelBox(bone10, 0, 23, 4.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
//		bone10.cubeList.add(new ModelBox(bone10, 0, 23, -2.5F, 2.0F, -0.5F, 3, 1, 1, 0.0F, false));
//		bone10.cubeList.add(new ModelBox(bone10, 0, 23, 4.5F, 2.0F, -0.5F, 3, 1, 1, 0.0F, false));
//
//		foot1 = new ModelRenderer(this);
//		foot1.setRotationPoint(5.5F, 23.5F, -6.1667F);
//		foot1.cubeList.add(new ModelBox(foot1, 0, 37, -1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F, false));
//		foot1.cubeList.add(new ModelBox(foot1, 16, 39, -1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
//		foot1.cubeList.add(new ModelBox(foot1, 16, 39, 0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
//
//		foot2 = new ModelRenderer(this);
//		foot2.setRotationPoint(-5.5F, 23.5F, -6.1667F);
//		foot2.cubeList.add(new ModelBox(foot2, 0, 37, -1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F, false));
//		foot2.cubeList.add(new ModelBox(foot2, 16, 39, -1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
//		foot2.cubeList.add(new ModelBox(foot2, 16, 39, 0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
//
//		foot3 = new ModelRenderer(this);
//		foot3.setRotationPoint(-5.5F, 23.5F, 5.8333F);
//		foot3.cubeList.add(new ModelBox(foot3, 0, 37, -1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F, false));
//		foot3.cubeList.add(new ModelBox(foot3, 16, 39, -1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
//		foot3.cubeList.add(new ModelBox(foot3, 16, 39, 0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
//
//		foot4 = new ModelRenderer(this);
//		foot4.setRotationPoint(5.5F, 23.5F, 5.8333F);
//		foot4.cubeList.add(new ModelBox(foot4, 0, 37, -1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F, false));
//		foot4.cubeList.add(new ModelBox(foot4, 16, 39, -1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
//		foot4.cubeList.add(new ModelBox(foot4, 16, 39, 0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
//	}
//
//	@Override
//	public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		GlStateManager.scalef(5, 5, 5);
//		GlStateManager.translatef(0, -1.2f, 0);
//		body.render(f5);
//		tail.render(f5);
//		nose.render(f5);
//		foot1.render(f5);
//		foot2.render(f5);
//		foot3.render(f5);
//		foot4.render(f5);
//	}

	@Override
	public void func_225597_a_(T t, float v, float v1, float v2, float v3, float v4) {

	}

//	@Override
//	public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
//
//		this.foot1.rotateAngleX = MathHelper.cos(limbSwing * 0.3324F) * 0.2F * limbSwingAmount;
//		this.foot2.rotateAngleX = MathHelper.cos(limbSwing * 0.3324F + (float) Math.PI) * 0.2F * limbSwingAmount;
//		this.foot3.rotateAngleX = MathHelper.cos(limbSwing * 0.3324F) * 0.2F * limbSwingAmount;
//		this.foot4.rotateAngleX = MathHelper.cos(limbSwing * 0.3324F + (float) Math.PI) * 0.2F * limbSwingAmount;
//
//		this.tail.rotateAngleY = MathHelper.cos(limbSwing * 1.2F) * 0.2F * limbSwingAmount;
//
//	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void func_225598_a_(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3) {

	}
}