package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.EntityMothra;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class MothraModel<T extends EntityMothra> extends EntityModel<T> {
	private final RendererModel bone;
	private final RendererModel bone2;
	private final RendererModel bone3;
	private final RendererModel bone4;
	private final RendererModel bone5;
	private final RendererModel bone6;
	private final RendererModel bone7;

	public MothraModel() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new RendererModel(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 39, -3.0F, -7.0F, -5.0F, 5, 5, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 51, 46, -2.0F, -6.0F, 4.0F, 3, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 18, 43, -3.0F, -7.0F, 5.0F, 5, 5, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 33, 42, -2.0F, -6.0F, 10.0F, 3, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 41, 39, -1.0F, -5.0F, 12.0F, 1, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 42, 39, -1.0F, -4.0F, 14.0F, 1, 2, 1, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 6, 31, -2.0F, -6.0F, -8.0F, 3, 4, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 58, 58, -3.0F, -11.0F, -7.0F, 2, 5, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 58, 58, 0.0F, -11.0F, -7.0F, 2, 5, 1, 0.0F, false));

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, 1.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, -3.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, 1.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, -3.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, 1.0F, -2.0F, -4.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, -3.0F, -2.0F, -4.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, 1.0F, -2.0F, 2.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, -3.0F, -2.0F, 2.0F, 1, 1, 1, 0.0F, false));

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(4.5F, 16.5F, 3.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 54, -4.5F, -0.5F, -7.0F, 20, 1, 9, 0.0F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(4.5F, 16.5F, 3.0F);
		setRotationAngle(bone5, 0.0F, -0.3491F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 54, -4.5F, -1.5F, -4.0F, 19, 1, 9, 0.0F, false));

		bone6 = new RendererModel(this);
		bone6.setRotationPoint(4.5F, 16.5F, 3.0F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 54, -25.5F, -0.5F, -7.0F, 20, 1, 9, 0.0F, false));

		bone7 = new RendererModel(this);
		bone7.setRotationPoint(-11.0F, 15.5F, 0.5F);
		setRotationAngle(bone7, 0.0F, 0.3491F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 54, -10.2F, -0.5F, 0.5F, 19, 1, 9, 0.0F, false));
	}

	@Override
	public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.scalef(4, 4, 4);
		GlStateManager.translatef(0, -1.065f, 0);
		bone.render(f5);
		bone2.render(f5);
		bone3.render(f5);
		bone4.render(f5);
		bone5.render(f5);
		bone6.render(f5);
		bone7.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}