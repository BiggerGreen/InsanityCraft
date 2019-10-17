package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.EntityTrex;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class TrexModel<T extends EntityTrex> extends EntityModel<T> {
	private final RendererModel Lower_Jaw;
	private final RendererModel Head;
	private final RendererModel Upper_Jaw;
	private final RendererModel Body;
	private final RendererModel Left_Leg;
	private final RendererModel Right_Leg;

	public TrexModel() {
		textureWidth = 64;
		textureHeight = 64;

		Lower_Jaw = new RendererModel(this);
		Lower_Jaw.setRotationPoint(0.0F, 24.0F, 0.0F);
		Lower_Jaw.cubeList.add(new ModelBox(Lower_Jaw, 0, 56, -2.0F, -9.0F, -19.0F, 4, 1, 6, 0.0F, false));
		Lower_Jaw.cubeList.add(new ModelBox(Lower_Jaw, 18, 40, -2.0F, -10.0F, -18.0F, 1, 1, 1, 0.0F, false));
		Lower_Jaw.cubeList.add(new ModelBox(Lower_Jaw, 1, 43, 1.0F, -10.0F, -15.0F, 1, 1, 2, 0.0F, false));
		Lower_Jaw.cubeList.add(new ModelBox(Lower_Jaw, 1, 43, -2.0F, -10.0F, -15.0F, 1, 1, 2, 0.0F, false));
		Lower_Jaw.cubeList.add(new ModelBox(Lower_Jaw, 18, 40, 1.0F, -10.0F, -18.0F, 1, 1, 1, 0.0F, false));
		Lower_Jaw.cubeList.add(new ModelBox(Lower_Jaw, 18, 40, 1.0F, -10.0F, -16.0F, 1, 1, 1, 0.0F, false));
		Lower_Jaw.cubeList.add(new ModelBox(Lower_Jaw, 18, 40, -2.0F, -10.0F, -16.0F, 1, 1, 1, 0.0F, false));

		Head = new RendererModel(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 31, 54, -2.0F, -14.0F, -13.0F, 4, 6, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 54, -2.0F, -12.0F, -9.0F, 4, 5, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 31, 50, -2.0F, -7.0F, -7.0F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 33, 50, 1.0F, -7.0F, -7.0F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 62, -2.0F, -8.0F, -10.0F, 4, 1, 1, 0.0F, false));

		Upper_Jaw = new RendererModel(this);
		Upper_Jaw.setRotationPoint(0.0F, 24.0F, 0.0F);
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 0, 56, -2.0F, -14.0F, -19.0F, 4, 2, 6, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 18, 40, -2.0F, -12.0F, -19.0F, 1, 1, 1, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 0, 42, 1.0F, -12.0F, -15.0F, 1, 2, 2, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 0, 42, -2.0F, -12.0F, -15.0F, 1, 2, 2, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 18, 40, 1.0F, -12.0F, -19.0F, 1, 1, 1, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 17, 40, -2.0F, -12.0F, -17.0F, 1, 1, 1, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 18, 40, 1.0F, -12.0F, -17.0F, 1, 1, 1, 0.0F, false));

		Body = new RendererModel(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 53, -1.0F, -12.0F, 19.0F, 2, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 53, -1.0F, -12.0F, 14.0F, 2, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 53, -2.0F, -12.0F, 7.0F, 4, 4, 7, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 47, -2.0F, -12.0F, -4.0F, 4, 6, 11, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 52, -2.0F, -13.0F, -4.0F, 4, 1, 11, 0.0F, false));

		Left_Leg = new RendererModel(this);
		Left_Leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		Left_Leg.cubeList.add(new ModelBox(Left_Leg, 10, 54, 2.0F, -9.0F, 1.0F, 2, 7, 3, 0.0F, false));
		Left_Leg.cubeList.add(new ModelBox(Left_Leg, 10, 55, 1.0F, -2.0F, -1.0F, 4, 1, 6, 0.0F, false));
		Left_Leg.cubeList.add(new ModelBox(Left_Leg, 18, 40, 1.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		Left_Leg.cubeList.add(new ModelBox(Left_Leg, 18, 40, 2.0F, -2.0F, -3.0F, 1, 1, 2, 0.0F, false));
		Left_Leg.cubeList.add(new ModelBox(Left_Leg, 18, 40, 4.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		Left_Leg.cubeList.add(new ModelBox(Left_Leg, 10, 55, 2.0F, -10.0F, 4.0F, 2, 4, 2, 0.0F, false));
		Left_Leg.cubeList.add(new ModelBox(Left_Leg, 10, 55, 2.0F, -10.0F, 2.0F, 2, 1, 2, 0.0F, false));

		Right_Leg = new RendererModel(this);
		Right_Leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		Right_Leg.cubeList.add(new ModelBox(Right_Leg, 10, 54, -4.0F, -9.0F, 1.0F, 2, 7, 3, 0.0F, false));
		Right_Leg.cubeList.add(new ModelBox(Right_Leg, 3, 56, -5.0F, -2.0F, -1.0F, 4, 1, 6, 0.0F, false));
		Right_Leg.cubeList.add(new ModelBox(Right_Leg, 18, 40, -5.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		Right_Leg.cubeList.add(new ModelBox(Right_Leg, 18, 40, -3.0F, -2.0F, -3.0F, 1, 1, 2, 0.0F, false));
		Right_Leg.cubeList.add(new ModelBox(Right_Leg, 18, 40, -2.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		Right_Leg.cubeList.add(new ModelBox(Right_Leg, 10, 54, -4.0F, -10.0F, 4.0F, 2, 4, 2, 0.0F, false));
		Right_Leg.cubeList.add(new ModelBox(Right_Leg, 9, 55, -4.0F, -10.0F, 2.0F, 2, 1, 2, 0.0F, false));
	}

	@Override
	public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.scalef(5, 5, 5);
		GlStateManager.translatef(0, -1.125f, 0);
		Lower_Jaw.render(f5);
		Head.render(f5);
		Upper_Jaw.render(f5);
		Body.render(f5);
		Left_Leg.render(f5);
		Right_Leg.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}