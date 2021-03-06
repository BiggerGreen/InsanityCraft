package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.TriffidEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;

public class TriffidModel<T extends TriffidEntity> extends EntityModel<T> {

	@Override
	public void setRotationAngles(T t, float v, float v1, float v2, float v3, float v4) {

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3) {

	}
	//	private final ModelRenderer Triffid;
//	private final ModelRenderer Roots;
//	private final ModelRenderer bone4;
//	private final ModelRenderer bone3;
//	private final ModelRenderer bone5;
//	private final ModelRenderer bone6;
//	private final ModelRenderer bone;
//	private final ModelRenderer Stalk;
//	private final ModelRenderer Head;
//	private final ModelRenderer Leaves;
//	private final ModelRenderer Leaf1;
//	private final ModelRenderer Seg1;
//	private final ModelRenderer Seg2;
//	private final ModelRenderer Seg3;
//	private final ModelRenderer Leaf2;
//	private final ModelRenderer Seg4;
//	private final ModelRenderer Seg5;
//	private final ModelRenderer Seg6;
//	private final ModelRenderer Leaf3;
//	private final ModelRenderer Seg7;
//	private final ModelRenderer Seg8;
//	private final ModelRenderer Seg9;
//
//	public TriffidModel() {
//		textureWidth = 64;
//		textureHeight = 64;
//
//		Triffid = new ModelRenderer(this);
//		Triffid.setRotationPoint(0.0F, 24.0F, 0.0F);
//
//		Roots = new ModelRenderer(this);
//		Roots.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Triffid.addChild(Roots);
//
//		bone4 = new ModelRenderer(this);
//		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(bone4, 0.3491F, 0.3491F, 0.0F);
//		Roots.addChild(bone4);
//		bone4.cubeList.add(new ModelBox(bone4, 36, 36, -1.5F, -1.5F, -5.25F, 1, 1, 4, 0.0F, false));
//		bone4.cubeList.add(new ModelBox(bone4, 36, 13, 2.0F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));
//
//		bone3 = new ModelRenderer(this);
//		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(bone3, -0.3491F, 0.0F, 0.0F);
//		Roots.addChild(bone3);
//		bone3.cubeList.add(new ModelBox(bone3, 14, 23, 0.0F, -2.0F, 1.0F, 1, 1, 4, 0.0F, false));
//
//		bone5 = new ModelRenderer(this);
//		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(bone5, -0.1745F, -0.6981F, 0.0F);
//		Roots.addChild(bone5);
//		bone5.cubeList.add(new ModelBox(bone5, 24, 37, 1.0F, -1.5F, 1.0F, 1, 1, 3, -0.25F, false));
//
//		bone6 = new ModelRenderer(this);
//		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(bone6, 0.2618F, -0.3491F, 0.0F);
//		Roots.addChild(bone6);
//		bone6.cubeList.add(new ModelBox(bone6, 28, 20, -4.75F, -1.0F, -1.75F, 3, 1, 1, -0.25F, false));
//
//		bone = new ModelRenderer(this);
//		bone.setRotationPoint(4.5F, -0.5F, -3.5F);
//		setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
//		Roots.addChild(bone);
//		bone.cubeList.add(new ModelBox(bone, 28, 6, -0.5F, 0.0F, -1.75F, 1, 1, 3, -0.25F, false));
//
//		Stalk = new ModelRenderer(this);
//		Stalk.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Triffid.addChild(Stalk);
//		Stalk.cubeList.add(new ModelBox(Stalk, 0, 29, -2.0F, -4.0F, -2.0F, 4, 4, 4, 0.0F, false));
//		Stalk.cubeList.add(new ModelBox(Stalk, 28, 29, -1.5F, -9.0F, -1.5F, 3, 5, 3, 0.0F, false));
//		Stalk.cubeList.add(new ModelBox(Stalk, 16, 29, -1.5F, -13.75F, -1.5F, 3, 5, 3, -0.25F, false));
//		Stalk.cubeList.add(new ModelBox(Stalk, 36, 6, -1.5F, -17.0F, -1.5F, 3, 4, 3, -0.5F, false));
//
//		Head = new ModelRenderer(this);
//		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Triffid.addChild(Head);
//		Head.cubeList.add(new ModelBox(Head, 33, 20, -1.5F, -20.5F, -1.5F, 3, 4, 3, 0.0F, false));
//
//		Leaves = new ModelRenderer(this);
//		Leaves.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Triffid.addChild(Leaves);
//
//		Leaf1 = new ModelRenderer(this);
//		Leaf1.setRotationPoint(0.5F, 0.0F, 0.0F);
//		setRotationAngle(Leaf1, 0.0F, 0.3491F, 0.0F);
//		Leaves.addChild(Leaf1);
//
//		Seg1 = new ModelRenderer(this);
//		Seg1.setRotationPoint(-3.25F, -2.5F, 0.0F);
//		setRotationAngle(Seg1, 0.0F, 0.0F, 0.4363F);
//		Leaf1.addChild(Seg1);
//		Seg1.cubeList.add(new ModelBox(Seg1, 0, 22, -2.0F, -1.0F, -3.0F, 4, 1, 6, -0.25F, false));
//
//		Seg2 = new ModelRenderer(this);
//		Seg2.setRotationPoint(-3.25F, -2.5F, 0.0F);
//		setRotationAngle(Seg2, 0.0F, 0.0F, 0.9599F);
//		Leaf1.addChild(Seg2);
//		Seg2.cubeList.add(new ModelBox(Seg2, 24, 0, -5.35F, -0.05F, -2.5F, 4, 1, 5, -0.25F, false));
//
//		Seg3 = new ModelRenderer(this);
//		Seg3.setRotationPoint(-3.25F, -2.5F, 0.0F);
//		setRotationAngle(Seg3, 0.0F, 0.0F, 1.5708F);
//		Leaf1.addChild(Seg3);
//		Seg3.cubeList.add(new ModelBox(Seg3, 0, 10, -13.55F, 2.75F, -2.0F, 10, 1, 4, -0.25F, false));
//		Seg3.cubeList.add(new ModelBox(Seg3, 12, 37, -16.05F, 2.75F, -1.5F, 3, 1, 3, -0.25F, false));
//		Seg3.cubeList.add(new ModelBox(Seg3, 37, 16, -17.55F, 2.75F, -1.0F, 2, 1, 2, -0.25F, false));
//
//		Leaf2 = new ModelRenderer(this);
//		Leaf2.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Leaf2, 0.0F, -1.9199F, 0.0F);
//		Leaves.addChild(Leaf2);
//
//		Seg4 = new ModelRenderer(this);
//		Seg4.setRotationPoint(-3.25F, -2.5F, 0.0F);
//		setRotationAngle(Seg4, 0.0F, 0.0F, 0.4363F);
//		Leaf2.addChild(Seg4);
//		Seg4.cubeList.add(new ModelBox(Seg4, 14, 16, -1.7871F, -1.0993F, -3.0855F, 4, 1, 6, -0.25F, false));
//
//		Seg5 = new ModelRenderer(this);
//		Seg5.setRotationPoint(-3.25F, -2.5F, 0.0F);
//		setRotationAngle(Seg5, 0.0F, 0.0F, 0.9599F);
//		Leaf2.addChild(Seg5);
//		Seg5.cubeList.add(new ModelBox(Seg5, 23, 10, -5.2153F, -0.2424F, -2.5855F, 4, 1, 5, -0.25F, false));
//
//		Seg6 = new ModelRenderer(this);
//		Seg6.setRotationPoint(-3.25F, -2.5F, 0.0F);
//		setRotationAngle(Seg6, 0.0F, 0.0F, 1.5708F);
//		Leaf2.addChild(Seg6);
//		Seg6.cubeList.add(new ModelBox(Seg6, 0, 5, -13.55F, 2.5151F, -2.0855F, 10, 1, 4, -0.25F, false));
//		Seg6.cubeList.add(new ModelBox(Seg6, 0, 37, -16.05F, 2.5151F, -1.5855F, 3, 1, 3, -0.25F, false));
//		Seg6.cubeList.add(new ModelBox(Seg6, 37, 0, -17.55F, 2.5151F, -1.0855F, 2, 1, 2, -0.25F, false));
//
//		Leaf3 = new ModelRenderer(this);
//		Leaf3.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(Leaf3, 0.0F, 2.4435F, 0.0F);
//		Leaves.addChild(Leaf3);
//
//		Seg7 = new ModelRenderer(this);
//		Seg7.setRotationPoint(-3.25F, -2.5F, 0.0F);
//		setRotationAngle(Seg7, 0.0F, 0.0F, 0.4363F);
//		Leaf3.addChild(Seg7);
//		Seg7.cubeList.add(new ModelBox(Seg7, 0, 15, -1.7087F, -1.1358F, -2.617F, 4, 1, 6, -0.25F, false));
//
//		Seg8 = new ModelRenderer(this);
//		Seg8.setRotationPoint(-3.25F, -2.5F, 0.0F);
//		setRotationAngle(Seg8, 0.0F, 0.0F, 0.9599F);
//		Leaf3.addChild(Seg8);
//		Seg8.cubeList.add(new ModelBox(Seg8, 20, 23, -5.1657F, -0.3133F, -2.117F, 4, 1, 5, -0.25F, false));
//
//		Seg9 = new ModelRenderer(this);
//		Seg9.setRotationPoint(-3.25F, -2.5F, 0.0F);
//		setRotationAngle(Seg9, 0.0F, 0.0F, 1.5708F);
//		Leaf3.addChild(Seg9);
//		Seg9.cubeList.add(new ModelBox(Seg9, 0, 0, -13.55F, 2.4286F, -1.617F, 10, 1, 4, -0.25F, false));
//		Seg9.cubeList.add(new ModelBox(Seg9, 28, 16, -16.05F, 2.4286F, -1.117F, 3, 1, 3, -0.25F, false));
//		Seg9.cubeList.add(new ModelBox(Seg9, 29, 37, -17.55F, 2.4286F, -0.617F, 2, 1, 2, -0.25F, false));
//	}
//
//	@Override
//	public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		Triffid.render(f5);
//	}
//
//	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
//		modelRenderer.rotateAngleX = x;
//		modelRenderer.rotateAngleY = y;
//		modelRenderer.rotateAngleZ = z;
//	}
}