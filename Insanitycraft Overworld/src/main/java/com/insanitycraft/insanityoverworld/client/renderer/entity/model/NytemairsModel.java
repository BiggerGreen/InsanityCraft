package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.NytemairsEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;

public class NytemairsModel<T extends NytemairsEntity> extends EntityModel<T> {

	@Override
	public void render(T t, float v, float v1, float v2, float v3, float v4) {

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v, float v1, float v2, float v3) {

	}
	//	private float wingspeed = 1.0F;
//	private final ModelRenderer Nitemare;
//	private final ModelRenderer Body;
//	private final ModelRenderer Neck;
//	private final ModelRenderer wings;
//	private final ModelRenderer wingLeft;
//	private final ModelRenderer bone;
//	private final ModelRenderer wingRight;
//	private final ModelRenderer bone2;
//	private final ModelRenderer legs;
//	private final ModelRenderer left;
//	private final ModelRenderer foot;
//	private final ModelRenderer toe1;
//	private final ModelRenderer toe2;
//	private final ModelRenderer toe3;
//	private final ModelRenderer toe4;
//	private final ModelRenderer Right;
//	private final ModelRenderer foot2;
//	private final ModelRenderer toe5;
//	private final ModelRenderer toe6;
//	private final ModelRenderer toe7;
//	private final ModelRenderer toe8;
//	private final ModelRenderer tail;
//	private final ModelRenderer head;
//	private final ModelRenderer Top;
//	private final ModelRenderer Teeth2;
//	private final ModelRenderer Bottom;
//	private final ModelRenderer Teeth;
//
//	public NytemairsModel(float f1) {
//		this.wingspeed = f1;
//
//		textureWidth = 128;
//		textureHeight = 128;
//
//		Nitemare = new ModelRenderer(this);
//		Nitemare.setRotationPoint(0.0F, 24.0F, 0.0F);
//
//		Body = new ModelRenderer(this);
//		Body.setRotationPoint(0.0F, -15.6F, -5.0F);
//		Nitemare.addChild(Body);
//		Body.cubeList.add(new ModelBox(Body, 39, 39, -5.0F, -11.0F, -8.0F, 10, 4, 20, 2.0F, false));
//
//		Neck = new ModelRenderer(this);
//		Neck.setRotationPoint(0.0F, -15.6F, -5.0F);
//		Nitemare.addChild(Neck);
//		Neck.cubeList.add(new ModelBox(Neck, 26, 7, -1.25F, -13.0F, -11.0F, 2, 2, 2, 3.0F, false));
//		Neck.cubeList.add(new ModelBox(Neck, 0, 62, -3.0F, -20.0F, -16.0F, 6, 6, 6, 0.0F, false));
//		Neck.cubeList.add(new ModelBox(Neck, 0, 50, -3.0F, -22.25F, -20.0F, 6, 6, 6, 0.0F, false));
//
//		wings = new ModelRenderer(this);
//		wings.setRotationPoint(4.75F, -21.85F, -5.0F);
//		Nitemare.addChild(wings);
//
//		wingLeft = new ModelRenderer(this);
//		wingLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
//		setRotationAngle(wingLeft, 0.0F, 0.0F, -0.2618F);
//		wings.addChild(wingLeft);
//		wingLeft.cubeList.add(new ModelBox(wingLeft, 0, 84, 3.25F, -6.75F, -5.0F, 1, 1, 16, 0.0F, false));
//
//		bone = new ModelRenderer(this);
//		bone.setRotationPoint(3.75F, -6.25F, -9.0F);
//		setRotationAngle(bone, 0.0F, -1.5708F, 0.0F);
//		wingLeft.addChild(bone);
//		bone.cubeList.add(new ModelBox(bone, 86, 92, 19.5F, 0.0F, -36.5F, -15, 0, 36, 0.0F, false));
//		bone.cubeList.add(new ModelBox(bone, 0, 84, 3.5F, -0.5F, -36.5F, 1, 1, 37, 0.0F, false));
//
//		wingRight = new ModelRenderer(this);
//		wingRight.setRotationPoint(-39.75F, -8.0F, 0.0F);
//		setRotationAngle(wingRight, 0.0F, 0.0F, 0.2618F);
//		wings.addChild(wingRight);
//		wingRight.cubeList.add(new ModelBox(wingRight, 0, 84, 27.25F, -6.75F, -5.0F, 1, 1, 16, 0.0F, false));
//
//		bone2 = new ModelRenderer(this);
//		bone2.setRotationPoint(3.75F, -6.25F, -9.0F);
//		setRotationAngle(bone2, 0.0F, -1.5708F, 0.0F);
//		wingRight.addChild(bone2);
//		bone2.cubeList.add(new ModelBox(bone2, 0, 84, 3.5F, -0.5F, -24.25F, 1, 1, 37, 0.0F, false));
//		bone2.cubeList.add(new ModelBox(bone2, 84, 91, 19.5F, 0.0F, -24.5F, -15, 0, 37, 0.0F, false));
//
//		legs = new ModelRenderer(this);
//		legs.setRotationPoint(0.0F, -15.85F, -11.25F);
//		Nitemare.addChild(legs);
//
//		left = new ModelRenderer(this);
//		left.setRotationPoint(0.0F, 0.0F, 0.0F);
//		legs.addChild(left);
//		left.cubeList.add(new ModelBox(left, 74, 74, 2.0F, -5.0F, 8.0F, 5, 8, 5, -0.1F, false));
//		left.cubeList.add(new ModelBox(left, 0, 17, 2.5F, 2.75F, 10.0F, 4, 10, 4, -0.1F, false));
//
//		foot = new ModelRenderer(this);
//		foot.setRotationPoint(0.0F, 0.0F, 0.0F);
//		left.addChild(foot);
//
//		toe1 = new ModelRenderer(this);
//		toe1.setRotationPoint(3.0F, 13.5F, 7.0F);
//		setRotationAngle(toe1, 0.6981F, 0.5236F, 0.0F);
//		foot.addChild(toe1);
//		toe1.cubeList.add(new ModelBox(toe1, 39, 52, -2.5F, 0.5F, -2.75F, 1, 1, 6, -0.1F, false));
//
//		toe2 = new ModelRenderer(this);
//		toe2.setRotationPoint(3.0F, 13.5F, 7.0F);
//		setRotationAngle(toe2, 0.6981F, 0.0F, 0.0F);
//		foot.addChild(toe2);
//		toe2.cubeList.add(new ModelBox(toe2, 47, 30, 1.0F, 0.5F, -2.5F, 1, 1, 6, -0.1F, false));
//
//		toe3 = new ModelRenderer(this);
//		toe3.setRotationPoint(8.0F, 14.5F, 7.0F);
//		setRotationAngle(toe3, 0.6981F, -0.5236F, 0.0F);
//		foot.addChild(toe3);
//		toe3.cubeList.add(new ModelBox(toe3, 18, 45, -0.5F, 0.25F, -1.5F, 1, 1, 6, -0.1F, false));
//
//		toe4 = new ModelRenderer(this);
//		toe4.setRotationPoint(4.5F, 15.5F, 16.5F);
//		setRotationAngle(toe4, -0.6981F, 0.0F, 0.0F);
//		foot.addChild(toe4);
//		toe4.cubeList.add(new ModelBox(toe4, 39, 29, -0.5F, -1.5F, -5.0F, 1, 1, 6, -0.1F, false));
//
//		Right = new ModelRenderer(this);
//		Right.setRotationPoint(-9.0F, 0.0F, 0.0F);
//		legs.addChild(Right);
//		Right.cubeList.add(new ModelBox(Right, 39, 39, 2.0F, -5.0F, 8.0F, 5, 8, 5, -0.1F, false));
//		Right.cubeList.add(new ModelBox(Right, 0, 0, 2.5F, 2.75F, 10.0F, 4, 10, 4, -0.1F, false));
//
//		foot2 = new ModelRenderer(this);
//		foot2.setRotationPoint(9.0F, 19.0F, 6.25F);
//		Right.addChild(foot2);
//
//		toe5 = new ModelRenderer(this);
//		toe5.setRotationPoint(-6.0F, -5.5F, 0.75F);
//		setRotationAngle(toe5, 0.6981F, 0.5236F, 0.0F);
//		foot2.addChild(toe5);
//		toe5.cubeList.add(new ModelBox(toe5, 17, 38, -2.5F, 0.5F, -2.0F, 1, 1, 6, -0.1F, false));
//
//		toe6 = new ModelRenderer(this);
//		toe6.setRotationPoint(-6.0F, -5.5F, 0.75F);
//		setRotationAngle(toe6, 0.6981F, 0.0F, 0.0F);
//		foot2.addChild(toe6);
//		toe6.cubeList.add(new ModelBox(toe6, 18, 26, 1.0F, 0.5F, -2.0F, 1, 1, 6, -0.1F, false));
//
//		toe7 = new ModelRenderer(this);
//		toe7.setRotationPoint(-1.0F, -4.5F, 0.75F);
//		setRotationAngle(toe7, 0.6981F, -0.5236F, 0.0F);
//		foot2.addChild(toe7);
//		toe7.cubeList.add(new ModelBox(toe7, 18, 7, -0.5F, 0.25F, -1.0F, 1, 1, 6, -0.1F, false));
//
//		toe8 = new ModelRenderer(this);
//		toe8.setRotationPoint(-4.5F, -3.5F, 10.25F);
//		setRotationAngle(toe8, -0.6981F, 0.0F, 0.0F);
//		foot2.addChild(toe8);
//		toe8.cubeList.add(new ModelBox(toe8, 18, 0, -0.5F, -1.5F, -5.0F, 1, 1, 6, -0.1F, false));
//
//		tail = new ModelRenderer(this);
//		tail.setRotationPoint(0.0F, -15.6F, -5.0F);
//		Nitemare.addChild(tail);
//		tail.cubeList.add(new ModelBox(tail, 26, 0, -0.5F, -9.8F, 17.0F, 1, 1, 3, 3.0F, false));
//		tail.cubeList.add(new ModelBox(tail, 19, 57, -1.0F, -10.3F, 25.0F, 2, 2, 5, 2.0F, false));
//		tail.cubeList.add(new ModelBox(tail, 26, 26, -0.5F, -9.8F, 46.0F, 1, 1, 4, 1.0F, false));
//		tail.cubeList.add(new ModelBox(tail, 0, 38, -2.5F, -11.8F, 32.0F, 5, 5, 7, 0.0F, false));
//		tail.cubeList.add(new ModelBox(tail, 68, 17, -2.0F, -11.3F, 39.0F, 4, 4, 6, 0.0F, false));
//		tail.cubeList.add(new ModelBox(tail, 18, 18, -1.0F, -10.3F, 51.0F, 2, 2, 6, 0.0F, false));
//		tail.cubeList.add(new ModelBox(tail, 55, 29, -0.5F, -9.8F, 57.0F, 1, 1, 6, 0.0F, false));
//
//		head = new ModelRenderer(this);
//		head.setRotationPoint(-0.25F, -37.1F, -26.5F);
//		Nitemare.addChild(head);
//
//		Top = new ModelRenderer(this);
//		Top.setRotationPoint(0.0F, 0.0F, 0.0F);
//		head.addChild(Top);
//		Top.cubeList.add(new ModelBox(Top, 39, 17, -4.25F, -0.5F, -9.25F, 9, 1, 11, 0.0F, false));
//		Top.cubeList.add(new ModelBox(Top, 39, 0, -6.25F, -6.0F, -9.25F, 13, 6, 11, 0.0F, false));
//
//		Teeth2 = new ModelRenderer(this);
//		Teeth2.setRotationPoint(0.0F, 0.0F, 0.0F);
//		Top.addChild(Teeth2);
//		Teeth2.cubeList.add(new ModelBox(Teeth2, 12, 0, -4.0F, 0.5F, -9.0F, 1, 3, 1, 0.0F, false));
//		Teeth2.cubeList.add(new ModelBox(Teeth2, 0, 0, 3.25F, 0.5F, -9.0F, 1, 3, 1, 0.0F, false));
//		Teeth2.cubeList.add(new ModelBox(Teeth2, 18, 21, 1.75F, 0.5F, -9.0F, 1, 2, 1, 0.0F, false));
//		Teeth2.cubeList.add(new ModelBox(Teeth2, 18, 10, 0.25F, 0.5F, -9.0F, 1, 2, 1, 0.0F, false));
//		Teeth2.cubeList.add(new ModelBox(Teeth2, 18, 7, -1.25F, 0.5F, -9.0F, 1, 2, 1, 0.0F, false));
//		Teeth2.cubeList.add(new ModelBox(Teeth2, 18, 3, -2.75F, 0.5F, -9.0F, 1, 2, 1, 0.0F, false));
//		Teeth2.cubeList.add(new ModelBox(Teeth2, 18, 0, -4.0F, 0.5F, -7.0F, 1, 2, 1, 0.0F, false));
//		Teeth2.cubeList.add(new ModelBox(Teeth2, 18, 18, 3.25F, 0.5F, -7.0F, 1, 2, 1, 0.0F, false));
//
//		Bottom = new ModelRenderer(this);
//		Bottom.setRotationPoint(0.25F, 0.0F, -3.75F);
//		setRotationAngle(Bottom, 0.7854F, 0.0F, 0.0F);
//		head.addChild(Bottom);
//		Bottom.cubeList.add(new ModelBox(Bottom, 39, 63, -4.5F, 3.25F, -6.5F, 9, 1, 11, 0.0F, false));
//
//		Teeth = new ModelRenderer(this);
//		Teeth.setRotationPoint(-0.25F, 0.0F, 3.75F);
//		Bottom.addChild(Teeth);
//		Teeth.cubeList.add(new ModelBox(Teeth, 32, 20, -4.0F, 1.4F, -8.5F, 1, 2, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 28, 17, 3.5F, 1.4F, -8.5F, 1, 2, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 12, 17, -4.0F, 0.4F, -10.0F, 1, 3, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 31, 13, -2.5F, 1.4F, -10.0F, 1, 2, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 18, 29, -1.0F, 1.4F, -10.0F, 1, 2, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 31, 0, 2.0F, 1.4F, -10.0F, 1, 2, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 28, 20, 0.5F, 1.4F, -10.0F, 1, 2, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 0, 17, 3.5F, 0.4F, -10.0F, 1, 3, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 32, 17, -4.0F, 1.4F, -6.75F, 1, 2, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 18, 26, 3.5F, 1.4F, -6.75F, 1, 2, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 32, 4, -4.0F, 1.4F, -5.0F, 1, 2, 1, 0.0F, false));
//		Teeth.cubeList.add(new ModelBox(Teeth, 26, 26, 3.5F, 1.4F, -5.0F, 1, 2, 1, 0.0F, false));
//	}
//
//	@Override
//	public void render(NytemairsEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		Nitemare.render(f5);
//	}
//	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
//		modelRenderer.rotateAngleX = x;
//		modelRenderer.rotateAngleY = y;
//		modelRenderer.rotateAngleZ = z;
//	}
//
//	@Override
//	public void setRotationAngles(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		float newAngle = 0.0f;
//		float lspeed = 0.0F;
//		float tailspeed = 0.76F;
//		float tailamp = 0.25F;
//		float pi4 = 0.7853982F;
//		super.setRotationAngles(entity, f, f1, f2, f3, f4, f5);
//		newAngle = -pi4 + MathHelper.cos(f2 * 0.05F * this.wingspeed) * 3.1415927F * 0.02F;
//
//
//		this.wingRight.rotateAngleZ = -newAngle * 2.0F;
//		this.wingLeft.rotateAngleZ = newAngle;
//
//	}

}