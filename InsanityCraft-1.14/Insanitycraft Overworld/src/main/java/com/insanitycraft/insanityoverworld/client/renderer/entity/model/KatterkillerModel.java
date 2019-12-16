package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.KatterkillerEntity;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class KatterkillerModel<T extends KatterkillerEntity> extends EntityModel<T> {
	private final RendererModel bb_main;
	private final RendererModel bone;
	private final RendererModel bone2;
	private final RendererModel bone3;
	private final RendererModel bone4;
	private final RendererModel bone5;
	private final RendererModel bone6;
	private final RendererModel bone7;
	private final RendererModel bone8;
	private final RendererModel bone9;
	private final RendererModel bone10;
	private final RendererModel bone11;
	private final RendererModel bone12;
	private final RendererModel bone13;

	public KatterkillerModel() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new RendererModel(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 43, 30, -5.0F, -2.0F, 12.0F, 2, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 43, 30, 2.0F, -2.0F, 12.0F, 2, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 43, 30, 2.0F, -2.0F, 16.0F, 2, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 43, 30, -5.0F, -2.0F, 16.0F, 2, 2, 2, 0.0F, false));

		bone = new RendererModel(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 2, 7, -5.0F, -12.0F, 0.0F, 9, 10, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 7, -2.0F, -6.0F, 0.0F, 3, 4, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 7, 4.0F, -9.0F, 1.0F, 7, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 7, 2.0F, -14.0F, 1.0F, 1, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 7, -4.0F, -14.0F, 1.0F, 1, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 2, 7, -12.0F, -9.0F, 1.0F, 7, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 43, 30, -5.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 43, 30, 2.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 2, 7, -5.0F, -12.0F, 4.0F, 9, 10, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 2, 7, -2.0F, -6.0F, 4.0F, 3, 4, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 2, 7, 4.0F, -9.0F, 5.0F, 7, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 2, 7, 2.0F, -14.0F, 5.0F, 1, 2, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 2, 7, -4.0F, -14.0F, 5.0F, 1, 2, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 2, 7, -12.0F, -9.0F, 5.0F, 7, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 43, 30, -5.0F, -2.0F, 4.0F, 2, 2, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 43, 30, 2.0F, -2.0F, 4.0F, 2, 2, 2, 0.0F, false));

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 2, 7, -5.0F, -12.0F, 8.0F, 9, 10, 4, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 7, -2.0F, -6.0F, 8.0F, 3, 4, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 7, 4.0F, -9.0F, 9.0F, 7, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 7, 2.0F, -14.0F, 9.0F, 1, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 7, -4.0F, -14.0F, 9.0F, 1, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 2, 7, -12.0F, -9.0F, 9.0F, 7, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 35, 34, -5.0F, -2.0F, 8.0F, 2, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 43, 30, 2.0F, -2.0F, 8.0F, 2, 2, 2, 0.0F, false));

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 2, 7, -5.0F, -12.0F, 12.0F, 9, 10, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 7, -2.0F, -6.0F, 12.0F, 3, 4, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 7, 4.0F, -9.0F, 13.0F, 7, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 7, 2.0F, -14.0F, 13.0F, 1, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 7, -4.0F, -14.0F, 13.0F, 1, 2, 2, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 2, 7, -12.0F, -9.0F, 13.0F, 7, 1, 1, 0.0F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 2, 7, -5.0F, -12.0F, 16.0F, 9, 10, 4, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 2, 7, -2.0F, -6.0F, 16.0F, 3, 4, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 2, 7, 4.0F, -9.0F, 17.0F, 7, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 2, 7, 2.0F, -14.0F, 17.0F, 1, 2, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 2, 7, -4.0F, -14.0F, 17.0F, 1, 2, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 2, 7, -12.0F, -9.0F, 17.0F, 7, 1, 1, 0.0F, false));

		bone6 = new RendererModel(this);
		bone6.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 2, 7, -5.0F, -12.0F, 20.0F, 9, 10, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 7, -2.0F, -6.0F, 20.0F, 3, 4, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 7, 4.0F, -9.0F, 21.0F, 7, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 7, 2.0F, -14.0F, 21.0F, 1, 2, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 7, -4.0F, -14.0F, 21.0F, 1, 2, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 2, 7, -12.0F, -9.0F, 21.0F, 7, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 43, 30, -5.0F, -2.0F, 20.0F, 2, 2, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 43, 30, 2.0F, -2.0F, 20.0F, 2, 2, 2, 0.0F, false));

		bone7 = new RendererModel(this);
		bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 2, 7, -5.0F, -14.0F, -4.0F, 9, 10, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 2, 7, -2.0F, -8.0F, -4.0F, 3, 4, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 2, 7, 4.0F, -11.0F, -3.0F, 7, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 2, 7, 2.0F, -16.0F, -3.0F, 1, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 2, 7, -4.0F, -16.0F, -3.0F, 1, 2, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 2, 7, -12.0F, -11.0F, -3.0F, 7, 1, 1, 0.0F, false));

		bone8 = new RendererModel(this);
		bone8.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 2, 7, -5.0F, -16.0F, -8.0F, 9, 10, 4, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 2, 7, -2.0F, -10.0F, -8.0F, 3, 4, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 2, 7, 4.0F, -13.0F, -7.0F, 7, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 2, 7, 2.0F, -18.0F, -7.0F, 1, 2, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 2, 7, -4.0F, -18.0F, -7.0F, 1, 2, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 2, 7, -12.0F, -13.0F, -7.0F, 7, 1, 1, 0.0F, false));

		bone9 = new RendererModel(this);
		bone9.setRotationPoint(-0.5F, 11.0F, -10.4167F);
		bone9.cubeList.add(new ModelBox(bone9, 2, 7, -4.5F, -5.0F, -1.5833F, 9, 10, 4, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 2, 7, -1.5F, 1.0F, -1.5833F, 3, 4, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 2, 7, 4.5F, -2.0F, -0.5833F, 7, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 2, 7, 2.5F, -7.0F, -0.5833F, 1, 2, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 2, 7, -3.5F, -7.0F, -0.5833F, 1, 2, 2, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 2, 7, -11.5F, -2.0F, -0.5833F, 7, 1, 1, 0.0F, false));

		bone10 = new RendererModel(this);
		bone10.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 33, 10, -4.0F, -17.0F, -15.0F, 7, 7, 3, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 36, 28, -3.0F, -10.0F, -14.0F, 5, 3, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 46, 31, -3.0F, -7.0F, -13.0F, 2, 2, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 45, 31, 0.0F, -7.0F, -13.0F, 2, 2, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, -13.0F, -15.0F, -14.0F, 9, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, 3.0F, -15.0F, -14.0F, 9, 1, 1, 0.0F, false));

		bone11 = new RendererModel(this);
		bone11.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 2, 7, -4.0F, -10.0F, 32.0F, 7, 8, 4, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 7, -2.0F, -6.0F, 32.0F, 3, 4, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 7, 3.0F, -9.0F, 33.0F, 5, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 7, 2.0F, -10.0F, 36.0F, 1, 2, 5, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 7, -4.0F, -10.0F, 36.0F, 1, 2, 5, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 7, 3.0F, -9.0F, 33.0F, 5, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 7, 1.0F, -12.0F, 33.0F, 1, 2, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 7, -3.0F, -12.0F, 33.0F, 1, 2, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 2, 7, -9.0F, -9.0F, 33.0F, 5, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 43, 30, -4.0F, -2.0F, 32.0F, 2, 2, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 43, 30, 1.0F, -2.0F, 32.0F, 2, 2, 2, 0.0F, false));

		bone12 = new RendererModel(this);
		bone12.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 2, 7, -5.0F, -12.0F, 24.0F, 9, 10, 4, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 2, 7, -2.0F, -6.0F, 24.0F, 3, 4, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 2, 7, 4.0F, -9.0F, 25.0F, 7, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 2, 7, 2.0F, -14.0F, 25.0F, 1, 2, 2, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 2, 7, -4.0F, -14.0F, 25.0F, 1, 2, 2, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 2, 7, -12.0F, -9.0F, 25.0F, 7, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 43, 30, -5.0F, -2.0F, 24.0F, 2, 2, 2, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 43, 30, 2.0F, -2.0F, 24.0F, 2, 2, 2, 0.0F, false));

		bone13 = new RendererModel(this);
		bone13.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 2, 7, -5.0F, -12.0F, 28.0F, 9, 10, 4, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 2, 7, -2.0F, -6.0F, 28.0F, 3, 4, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 2, 7, 4.0F, -9.0F, 29.0F, 7, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 2, 7, 2.0F, -14.0F, 29.0F, 1, 2, 2, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 2, 7, -4.0F, -14.0F, 29.0F, 1, 2, 2, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 2, 7, -12.0F, -9.0F, 29.0F, 7, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 43, 30, -5.0F, -2.0F, 28.0F, 2, 2, 2, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 43, 30, 2.0F, -2.0F, 28.0F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.scalef(4.2f, 4.2f, 4.2f);
		GlStateManager.translatef(0, -1.14f, -0.8f);
		bb_main.render(f5);
		bone.render(f5);
		bone2.render(f5);
		bone3.render(f5);
		bone4.render(f5);
		bone5.render(f5);
		bone6.render(f5);
		bone7.render(f5);
		bone8.render(f5);
		bone9.render(f5);
		bone10.render(f5);
		bone11.render(f5);
		bone12.render(f5);
		bone13.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
/*
	@Override
	public void setLivingAnimations(T entity, float limbSwing, float limbSwingAmount, float partialTickTime) {

		bone.rotateAngleY = limbSwingAmount;
		bone2.rotateAngleX = limbSwingAmount;
		bone3.rotateAngleZ = limbSwingAmount;

	}

 */
	@Override
	public void setRotationAngles(T p_212844_1_, float p_212844_2_, float p_212844_3_, float p_212844_4_, float p_212844_5_, float p_212844_6_, float p_212844_7_) {
		bone.rotateAngleY = p_212844_2_;
		bone2.rotateAngleX = p_212844_2_;
		bone3.rotateAngleZ = p_212844_2_;

		bb_main.rotateAngleY = p_212844_3_;
	}
}