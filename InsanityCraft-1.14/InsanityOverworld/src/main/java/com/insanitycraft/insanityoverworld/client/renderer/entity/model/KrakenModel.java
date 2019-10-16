package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.EntityKraken;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class KrakenModel<T extends EntityKraken> extends EntityModel<T> {
	private final RendererModel head_Body;
	private final RendererModel left_Fins;
	private final RendererModel right_Fins;
	private final RendererModel Mouth;
	private final RendererModel left_beak;
	private final RendererModel right_beak;
	private final RendererModel tentacle1;
	private final RendererModel tentacle2;
	private final RendererModel tentacle3;
	private final RendererModel tentacle4;
	private final RendererModel inner_Tentacle_1;
	private final RendererModel inner_Tentacle_2;
	private final RendererModel inner_Tentacle_3;
	private final RendererModel inner_Tentacle_4;
	private final RendererModel inner_Tentacle_5;
	private final RendererModel inner_Tentacle_6;

	public KrakenModel() {
		textureWidth = 256;
		textureHeight = 256;

		head_Body = new RendererModel(this);
		head_Body.setRotationPoint(0.0F, 14.0F, 33.0F);
		setRotationAngle(head_Body, 1.5708F, 0.0F, 0.0F);
		head_Body.cubeList.add(new ModelBox(head_Body, 0, 139, -10.0F, -41.0F, 3.3F, 20, 20, 30, 0.0F, false));
		head_Body.cubeList.add(new ModelBox(head_Body, 0, 211, -11.0F, -40.0F, 71.3F, 22, 18, 27, 0.0F, false));
		head_Body.cubeList.add(new ModelBox(head_Body, 0, 220, -10.0F, -38.0F, 98.3F, 20, 14, 22, 0.0F, false));
		head_Body.cubeList.add(new ModelBox(head_Body, 0, 194, -12.0F, -43.0F, 33.3F, 24, 24, 38, 0.0F, false));

		left_Fins = new RendererModel(this);
		left_Fins.setRotationPoint(0.0F, 0.0F, 0.0F);
		head_Body.addChild(left_Fins);
		left_Fins.cubeList.add(new ModelBox(left_Fins, 0, 231, 10.0F, -32.0F, 98.3F, 16, 3, 22, 0.0F, false));
		left_Fins.cubeList.add(new ModelBox(left_Fins, 0, 226, 11.0F, -32.0F, 71.3F, 17, 3, 27, 0.0F, false));

		right_Fins = new RendererModel(this);
		right_Fins.setRotationPoint(0.0F, 0.0F, 0.0F);
		head_Body.addChild(right_Fins);
		right_Fins.cubeList.add(new ModelBox(right_Fins, 0, 231, -26.0F, -32.0F, 98.3F, 16, 3, 22, 0.0F, false));
		right_Fins.cubeList.add(new ModelBox(right_Fins, 0, 226, -28.0F, -32.0F, 71.3F, 17, 3, 27, 0.0F, false));

		Mouth = new RendererModel(this);
		Mouth.setRotationPoint(-0.0083F, 13.9958F, -2.75F);
		setRotationAngle(Mouth, 1.5708F, 0.0F, 0.0F);
		Mouth.cubeList.add(new ModelBox(Mouth, 65, 225, 10.0083F, 15.0042F, -2.95F, 3, 3, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 65, 225, -12.9917F, 15.0042F, -2.95F, 3, 3, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 65, 225, 10.0083F, -7.9958F, -2.95F, 3, 3, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 65, 225, -12.9917F, -7.9958F, -2.95F, 3, 3, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 0, 236, -9.9917F, -6.9958F, -3.95F, 20, 2, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 0, 218, -9.9917F, 15.0042F, -3.95F, 20, 2, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 0, 218, -11.9917F, -4.9958F, -3.95F, 2, 20, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 6.0083F, -1.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -6.9917F, -1.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -6.9917F, 11.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 6.0083F, 11.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 2.0083F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 2.0083F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 6.0083F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 6.0083F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 234, 246, -0.9917F, -3.9958F, -5.95F, 2, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 234, 246, -0.9917F, 13.0042F, -5.95F, 2, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -4.9917F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -4.9917F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 4.0083F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 4.0083F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -2.9917F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -2.9917F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -6.9917F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -6.9917F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, -1.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, -1.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 0.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 0.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 1.9042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 1.9042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 11.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 11.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 9.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 9.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 7.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 7.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 234, 246, -8.9917F, 4.0042F, -5.95F, 1, 2, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 245, 8.0083F, 4.0042F, -5.95F, 1, 2, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 0, 218, 10.0083F, -4.9958F, -3.95F, 2, 20, 18, 0.0F, false));

		left_beak = new RendererModel(this);
		left_beak.setRotationPoint(-0.4917F, 35.2542F, -42.0F);
		setRotationAngle(left_beak, 0.0F, 0.0F, 1.5708F);
		Mouth.addChild(left_beak);
		left_beak.cubeList.add(new ModelBox(left_beak, 124, 245, -32.5F, -3.5F, 36.05F, 5, 2, 9, 0.0F, false));
		left_beak.cubeList.add(new ModelBox(left_beak, 124, 245, -27.5F, -2.5F, 36.05F, 2, 2, 9, 0.0F, false));
		left_beak.cubeList.add(new ModelBox(left_beak, 124, 245, -34.5F, -2.5F, 36.05F, 2, 2, 9, 0.0F, false));
		left_beak.cubeList.add(new ModelBox(left_beak, 124, 246, -32.5F, -2.5F, 28.05F, 5, 2, 8, 0.0F, false));

		right_beak = new RendererModel(this);
		right_beak.setRotationPoint(-0.4917F, 36.7542F, -42.0F);
		setRotationAngle(right_beak, 0.0F, 0.0F, 1.5708F);
		Mouth.addChild(right_beak);
		right_beak.cubeList.add(new ModelBox(right_beak, 124, 245, -34.0F, 0.5F, 36.05F, 5, 2, 9, 0.0F, false));
		right_beak.cubeList.add(new ModelBox(right_beak, 124, 245, -29.0F, -0.5F, 36.05F, 2, 2, 9, 0.0F, false));
		right_beak.cubeList.add(new ModelBox(right_beak, 124, 245, -36.0F, -0.5F, 36.05F, 2, 2, 9, 0.0F, false));
		right_beak.cubeList.add(new ModelBox(right_beak, 124, 246, -34.0F, -0.5F, 28.05F, 5, 2, 8, 0.0F, false));

		tentacle1 = new RendererModel(this);
		tentacle1.setRotationPoint(19.3F, 10.0F, -20.5F);
		setRotationAngle(tentacle1, 1.5708F, 0.0F, 0.0F);
		tentacle1.cubeList.add(new ModelBox(tentacle1, 54, 229, -7.3F, 13.0F, 0.8F, 8, 8, 8, 0.0F, false));
		tentacle1.cubeList.add(new ModelBox(tentacle1, 12, 215, 0.7F, 14.0F, -19.2F, 6, 6, 27, 0.0F, false));
		tentacle1.cubeList.add(new ModelBox(tentacle1, 0, 199, 0.7F, 15.0F, -72.2F, 5, 4, 53, 0.0F, false));
		tentacle1.cubeList.add(new ModelBox(tentacle1, 16, 208, 1.7F, 16.0F, -118.2F, 3, 2, 46, 0.0F, false));
		tentacle1.cubeList.add(new ModelBox(tentacle1, 151, 219, 1.7F, 14.0F, -143.2F, 5, 6, 25, 0.0F, false));

		tentacle2 = new RendererModel(this);
		tentacle2.setRotationPoint(19.0F, 20.0F, -14.625F);
		setRotationAngle(tentacle2, 1.5708F, 0.0F, 0.0F);
		tentacle2.cubeList.add(new ModelBox(tentacle2, 54, 229, -7.0F, 18.0F, 10.925F, 8, 8, 8, 0.0F, false));
		tentacle2.cubeList.add(new ModelBox(tentacle2, 12, 215, 1.0F, 19.0F, -13.075F, 6, 6, 31, 0.0F, false));
		tentacle2.cubeList.add(new ModelBox(tentacle2, 47, 223, 1.0F, 20.0F, -42.075F, 5, 4, 29, 0.0F, false));
		tentacle2.cubeList.add(new ModelBox(tentacle2, 40, 219, 2.0F, 21.0F, -71.075F, 3, 2, 29, 0.0F, false));

		tentacle3 = new RendererModel(this);
		tentacle3.setRotationPoint(19.0F, 20.0F, -14.625F);
		setRotationAngle(tentacle3, 1.5708F, 0.0F, 0.0F);
		tentacle3.cubeList.add(new ModelBox(tentacle3, 54, 229, -39.0F, 18.0F, 10.925F, 8, 8, 8, 0.0F, false));
		tentacle3.cubeList.add(new ModelBox(tentacle3, 12, 215, -45.0F, 19.0F, -13.075F, 6, 6, 31, 0.0F, false));
		tentacle3.cubeList.add(new ModelBox(tentacle3, 47, 223, -44.0F, 20.0F, -42.075F, 5, 4, 29, 0.0F, false));
		tentacle3.cubeList.add(new ModelBox(tentacle3, 40, 219, -43.0F, 21.0F, -71.075F, 3, 2, 29, 0.0F, false));

		tentacle4 = new RendererModel(this);
		tentacle4.setRotationPoint(-34.5F, 58.0F, -110.3F);
		setRotationAngle(tentacle4, 1.5708F, 3.1416F, 0.0F);
		tentacle4.cubeList.add(new ModelBox(tentacle4, 54, 229, -22.5F, -111.0F, 48.6F, 8, 8, 8, 0.0F, false));
		tentacle4.cubeList.add(new ModelBox(tentacle4, 12, 215, -14.5F, -110.0F, 28.6F, 6, 6, 27, 0.0F, false));
		tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 199, -14.5F, -109.0F, -24.4F, 5, 4, 53, 0.0F, false));
		tentacle4.cubeList.add(new ModelBox(tentacle4, 16, 208, -13.5F, -108.0F, -70.4F, 3, 2, 46, 0.0F, false));
		tentacle4.cubeList.add(new ModelBox(tentacle4, 151, 225, -13.5F, -110.0F, -95.4F, 5, 6, 25, 0.0F, false));

		inner_Tentacle_1 = new RendererModel(this);
		inner_Tentacle_1.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(inner_Tentacle_1, 1.5708F, 0.0F, 0.0F);
		inner_Tentacle_1.cubeList.add(new ModelBox(inner_Tentacle_1, 18, 219, 8.0F, 10.5F, -46.45F, 6, 6, 31, 0.0F, false));
		inner_Tentacle_1.cubeList.add(new ModelBox(inner_Tentacle_1, 26, 221, 9.0F, 11.5F, -77.45F, 4, 4, 31, 0.0F, false));
		inner_Tentacle_1.cubeList.add(new ModelBox(inner_Tentacle_1, 26, 212, 10.0F, 12.5F, -112.45F, 2, 2, 35, 0.0F, false));

		inner_Tentacle_2 = new RendererModel(this);
		inner_Tentacle_2.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(inner_Tentacle_2, 1.5708F, 0.0F, 0.0F);
		inner_Tentacle_2.cubeList.add(new ModelBox(inner_Tentacle_2, 18, 219, -23.0F, 10.5F, -46.45F, 6, 6, 31, 0.0F, false));
		inner_Tentacle_2.cubeList.add(new ModelBox(inner_Tentacle_2, 26, 221, -22.0F, 11.5F, -77.45F, 4, 4, 31, 0.0F, false));
		inner_Tentacle_2.cubeList.add(new ModelBox(inner_Tentacle_2, 26, 212, -21.0F, 12.5F, -112.45F, 2, 2, 35, 0.0F, false));

		inner_Tentacle_3 = new RendererModel(this);
		inner_Tentacle_3.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(inner_Tentacle_3, 1.5708F, 0.0F, 0.0F);
		inner_Tentacle_3.cubeList.add(new ModelBox(inner_Tentacle_3, 33, 208, -14.0F, -3.5F, -46.45F, 6, 6, 31, 0.0F, false));
		inner_Tentacle_3.cubeList.add(new ModelBox(inner_Tentacle_3, 11, 218, -13.0F, -2.5F, -77.45F, 4, 4, 31, 0.0F, false));
		inner_Tentacle_3.cubeList.add(new ModelBox(inner_Tentacle_3, 26, 212, -12.0F, -1.5F, -112.45F, 2, 2, 35, 0.0F, false));

		inner_Tentacle_4 = new RendererModel(this);
		inner_Tentacle_4.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(inner_Tentacle_4, 1.5708F, 0.0F, 0.0F);
		inner_Tentacle_4.cubeList.add(new ModelBox(inner_Tentacle_4, 33, 208, -2.0F, -3.5F, -46.45F, 6, 6, 31, 0.0F, false));
		inner_Tentacle_4.cubeList.add(new ModelBox(inner_Tentacle_4, 11, 218, -1.0F, -2.5F, -77.45F, 4, 4, 31, 0.0F, false));
		inner_Tentacle_4.cubeList.add(new ModelBox(inner_Tentacle_4, 26, 212, 0.0F, -1.5F, -112.45F, 2, 2, 35, 0.0F, false));

		inner_Tentacle_5 = new RendererModel(this);
		inner_Tentacle_5.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(inner_Tentacle_5, 1.5708F, 0.0F, 0.0F);
		inner_Tentacle_5.cubeList.add(new ModelBox(inner_Tentacle_5, 33, 208, -14.0F, 26.5F, -46.45F, 6, 6, 31, 0.0F, false));
		inner_Tentacle_5.cubeList.add(new ModelBox(inner_Tentacle_5, 11, 218, -13.0F, 27.5F, -77.45F, 4, 4, 31, 0.0F, false));
		inner_Tentacle_5.cubeList.add(new ModelBox(inner_Tentacle_5, 26, 212, -12.0F, 28.5F, -112.45F, 2, 2, 35, 0.0F, false));

		inner_Tentacle_6 = new RendererModel(this);
		inner_Tentacle_6.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(inner_Tentacle_6, 1.5708F, 0.0F, 0.0F);
		inner_Tentacle_6.cubeList.add(new ModelBox(inner_Tentacle_6, 33, 208, -2.0F, 26.5F, -46.45F, 6, 6, 31, 0.0F, false));
		inner_Tentacle_6.cubeList.add(new ModelBox(inner_Tentacle_6, 11, 218, -1.0F, 27.5F, -77.45F, 4, 4, 31, 0.0F, false));
		inner_Tentacle_6.cubeList.add(new ModelBox(inner_Tentacle_6, 26, 212, 0.0F, 28.5F, -112.45F, 2, 2, 35, 0.0F, false));
	}

	@Override
	public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.translatef(0, -8.5f, 0);
		head_Body.render(f5);
		Mouth.render(f5);
		tentacle1.render(f5);
		tentacle2.render(f5);
		tentacle3.render(f5);
		tentacle4.render(f5);
		inner_Tentacle_1.render(f5);
		inner_Tentacle_2.render(f5);
		inner_Tentacle_3.render(f5);
		inner_Tentacle_4.render(f5);
		inner_Tentacle_5.render(f5);
		inner_Tentacle_6.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}