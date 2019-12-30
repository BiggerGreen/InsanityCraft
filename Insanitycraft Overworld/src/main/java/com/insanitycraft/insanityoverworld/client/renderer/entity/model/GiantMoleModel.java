package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.google.common.collect.ImmutableList;
import com.insanitycraft.insanityoverworld.entity.GiantMoleEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.model.ModelRenderer.ModelBox;
import net.minecraft.util.math.MathHelper;

public class GiantMoleModel<T extends GiantMoleEntity> extends SegmentedModel<T> {
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer nose;
	private final ModelRenderer noseNipple;
//	private final ModelRenderer bone8;
//	private final ModelRenderer bone9;
//	private final ModelRenderer bone10;
	private final ModelRenderer foot1;
	private final ModelRenderer foot2;
	private final ModelRenderer foot3;
	private final ModelRenderer foot4;

	public GiantMoleModel () {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this, 0, 0);
		body.setRotationPoint(0.0F, 19.25F, 2.3333F);
		//body.func_228301_a_(	,	,	,	,	,	,size);
		body.setTextureOffset(0, 44);
		body.func_228301_a_(-6.0F, -5.25F, -7.3333F, 12, 9, 11, 0.0F);
		body.setTextureOffset(0, 50);
		body.func_228301_a_(-5.0F, -4.25F, -13.3333F, 10, 8, 6, 0.0F);
		body.setTextureOffset(40, 24);
		body.func_228301_a_(-4.0F, -3.25F, -16.3333F, 8, 6, 3, 0.0F);
		body.setTextureOffset(0, 51);
		body.func_228301_a_(-5.0F, -4.25F, -3.6667F, 10, 8, 5, 0.0F);
		body.setTextureOffset(0, 55);
		body.func_228301_a_(-4.0F, -3.25F, -8.6667F, 8, 7, 3, 0.0F);
		body.setTextureOffset(0, 58);
		body.func_228301_a_(-3.0F, -1.25F, -10.6667F, 6, 5, 1, 0.0F);

		tail = new ModelRenderer(this, 0, 0);
		tail.setRotationPoint(-0.3333F, 21.5F, 14.1667F);
		tail.setTextureOffset(50, 57);
		tail.func_228301_a_(-0.6667F, -0.5F, -0.1667F, 1, 1, 6, 0.0F);
		tail.setTextureOffset(52, 58);
		tail.func_228301_a_(-1.6667F, -0.5F, 4.8333F, 1, 1, 5, 0.0F);
		tail.setTextureOffset(54, 59);
		tail.func_228301_a_(-0.6667F, -0.5F, 8.8333F, 1, 1, 4, 0.0F);

		nose = new ModelRenderer(this, 0, 0);
		nose.setRotationPoint(0.0F, 21.125F, -9.0625F);
		nose.setTextureOffset(0, 23);
		nose.func_228301_a_(-2.0F, -4.125F, -5.9375F, 4, 4, 1, 0.0F);
		nose.func_228301_a_(2.0F, -3.125F, -5.9375F, 3, 1, 1, 0.0F);
		nose.func_228301_a_(2.0F, -1.125F, -5.9375F, 3, 1, 1, 0.0F);
		nose.func_228301_a_(-5.0F, -3.125F, -5.9375F, 3, 1, 1, 0.0F);
		nose.func_228301_a_(-5.0F, -1.125F, -5.9375F, 3, 1, 1, 0.0F);
		nose.func_228301_a_(-1.5F, -7.125F, -5.9375F, 1, 3, 1, 0.0F);
		nose.func_228301_a_(0.5F, -7.125F, -5.9375F, 1, 3, 1, 0.0F);
		nose.func_228301_a_(-1.5F, -0.125F, -5.9375F, 1, 3, 1, 0.0F);
		nose.func_228301_a_(0.5F, -0.125F, -5.9375F, 1, 3, 1, 0.0F);

		//		nose.func_228301_a_(4.5F, -0.5F, -0.5F, 1, 3, 1, 0.0F);
//
//		nose.func_228301_a_(-2.5F, 2.0F, -0.5F, 1, 3, 1, 0.0F);
//
//		nose.func_228301_a_(4.5F, 2.0F, -0.5F, 1, 3, 1, 0.0F);

		//		bone10.cubeList.add(new ModelBox(bone10, 0, 23, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		//		bone10.cubeList.add(new ModelBox(bone10, 0, 23, 4.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		//		bone10.cubeList.add(new ModelBox(bone10, 0, 23, -2.5F, 2.0F, -0.5F, 3, 1, 1, 0.0F, false));
		//		bone10.cubeList.add(new ModelBox(bone10, 0, 23, 4.5F, 2.0F, -0.5F, 3, 1, 1, 0.0F, false));

		noseNipple = new ModelRenderer(this);
		noseNipple.setRotationPoint(4.0F, -3.625F, -5.4375F);
		noseNipple.setTextureOffset(0, 23);
		noseNipple.rotateAngleZ = 1.0F;
		nose.addChild(noseNipple);

		noseNipple.func_228301_a_(-4.5F, 3.0F, -1.5F, 3, 1, 1, 0.0F);

		noseNipple.func_228301_a_(-9.0F, -2.0F, -0.5F, 3, 1, 1, 0.0F);

//		nose.cubeList.add(new ModelBox(nose, 0, 23, -2.0F, -4.125F, -5.9375F, 4, 4, 1, 0.0F, false));
//		nose.cubeList.add(new ModelBox(nose, 0, 23, 2.0F, -1.125F, -5.9375F, 3, 1, 1, 0.0F, false));
//		nose.cubeList.add(new ModelBox(nose, 0, 23, 2.0F, -1.125F, -5.9375F, 3, 1, 1, 0.0F, false));
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

		foot1 = new ModelRenderer(this, 0, 0);
		foot1.setRotationPoint(5.5F, 23.5F, -6.1667F);
		foot1.setTextureOffset(0, 37);
		foot1.func_228301_a_(-1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F);
		foot1.setTextureOffset(16, 39);
		foot1.func_228301_a_(-1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F);
		foot1.func_228301_a_(0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F);

		foot2 = new ModelRenderer(this, 0, 0);
		foot2.setTextureOffset(0, 37);
		foot2.func_228301_a_(-1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F);
		foot2.setTextureOffset(16, 39);
		foot2.func_228301_a_(-1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F);
		foot2.func_228301_a_(0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F);


		foot3 = new ModelRenderer(this, 0, 0);



		foot4 = new ModelRenderer(this, 0, 0);

//		foot3 = new ModelRenderer(this);
//		foot3.setRotationPoint(-5.5F, 23.5F, 5.8333F);
//		foot3.cubeList.add(new ModelBox(foot3, 0, 37, -1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F, false));
//		foot3.cubeList.add(new ModelBox(foot3, 16, 39, -1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
//		foot3.cubeList.add(new ModelBox(foot3, 16, 39, 0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));

//		foot4 = new ModelRenderer(this);
//		foot4.setRotationPoint(5.5F, 23.5F, 5.8333F);
//		foot4.cubeList.add(new ModelBox(foot4, 0, 37, -1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F, false));
//		foot4.cubeList.add(new ModelBox(foot4, 16, 39, -1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
//		foot4.cubeList.add(new ModelBox(foot4, 16, 39, 0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));

	}

	@Override
	public Iterable<ModelRenderer> func_225601_a_() {
		return ImmutableList.of(body, tail, nose, noseNipple, foot1, foot2, foot3, foot4);
	}

	@Override
	public void func_225598_a_(MatrixStack matrixStack, IVertexBuilder p_225598_2_, int p_225598_3_, int p_225598_4_, float p_225598_5_, float p_225598_6_, float p_225598_7_, float p_225598_8_) {
//		matrixStack.func_227860_a_();																						//pushMatrix
//		matrixStack.func_227862_a_(5, 5, 5);												//scale
//		matrixStack.func_227861_a_(0, -1.2F, 0);		 									//translate
//		matrixStack.func_227865_b_();																						//popMatrix

	}

	@Override
	public void func_225597_a_(T entity, float f, float f1, float f2, float f3, float f4) {
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

}