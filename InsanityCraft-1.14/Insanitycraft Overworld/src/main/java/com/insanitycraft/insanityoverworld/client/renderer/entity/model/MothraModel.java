package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.EntityMothra;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class MothraModel<T extends EntityMothra> extends EntityModel<T> {
	private final RendererModel body;
	private final RendererModel head;
	private final RendererModel feet;
	private final RendererModel leftWing1;
	private final RendererModel leftWing2;
	private final RendererModel rightWing1;
	private final RendererModel rightWing2;

	public MothraModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new RendererModel(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 39, -3.0F, -7.0F, -5.0F, 5, 5, 9, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 51, 46, -2.0F, -6.0F, 4.0F, 3, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 18, 43, -3.0F, -7.0F, 5.0F, 5, 5, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 33, 42, -2.0F, -6.0F, 10.0F, 3, 4, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 41, 39, -1.0F, -5.0F, 12.0F, 1, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 42, 39, -1.0F, -4.0F, 14.0F, 1, 2, 1, 0.0F, false));

		head = new RendererModel(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 6, 31, -2.0F, -6.0F, -8.0F, 3, 4, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 58, 58, -3.0F, -11.0F, -7.0F, 2, 5, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 58, 58, 0.0F, -11.0F, -7.0F, 2, 5, 1, 0.0F, false));

		feet = new RendererModel(this);
		feet.setRotationPoint(0.0F, 24.0F, 0.0F);
		feet.cubeList.add(new ModelBox(feet, 0, 36, 1.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		feet.cubeList.add(new ModelBox(feet, 0, 36, -3.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		feet.cubeList.add(new ModelBox(feet, 0, 36, 1.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		feet.cubeList.add(new ModelBox(feet, 0, 36, -3.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		feet.cubeList.add(new ModelBox(feet, 0, 36, 1.0F, -2.0F, -4.0F, 1, 1, 1, 0.0F, false));
		feet.cubeList.add(new ModelBox(feet, 0, 36, -3.0F, -2.0F, -4.0F, 1, 1, 1, 0.0F, false));
		feet.cubeList.add(new ModelBox(feet, 0, 36, 1.0F, -2.0F, 2.0F, 1, 1, 1, 0.0F, false));
		feet.cubeList.add(new ModelBox(feet, 0, 36, -3.0F, -2.0F, 2.0F, 1, 1, 1, 0.0F, false));

		leftWing1 = new RendererModel(this);
		leftWing1.setRotationPoint(4.5F, 16.5F, 3.0F);
		leftWing1.cubeList.add(new ModelBox(leftWing1, 0, 54, -4.5F, -0.5F, -7.0F, 20, 1, 9, 0.0F, false));

		leftWing2 = new RendererModel(this);
		leftWing2.setRotationPoint(4.5F, 16.5F, 3.0F);
		setRotationAngle(leftWing2, 0.0F, -0.3491F, 0.0F);
		leftWing2.cubeList.add(new ModelBox(leftWing2, 0, 54, -4.5F, -1.5F, -4.0F, 19, 1, 9, 0.0F, false));

		rightWing1 = new RendererModel(this);
		rightWing1.setRotationPoint(4.5F, 16.5F, 3.0F);
		rightWing1.cubeList.add(new ModelBox(rightWing1, 0, 54, -25.5F, -0.5F, -7.0F, 20, 1, 9, 0.0F, false));

		rightWing2 = new RendererModel(this);
		rightWing2.setRotationPoint(-11.0F, 15.5F, 0.5F);
		setRotationAngle(rightWing2, 0.0F, 0.3491F, 0.0F);
		rightWing2.cubeList.add(new ModelBox(rightWing2, 0, 54, -10.2F, -0.5F, 0.5F, 19, 1, 9, 0.0F, false));
	}

	@Override
	public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.scalef(4, 4, 4);
		GlStateManager.translatef(0, -1.065f, 0);
		body.render(f5);
		head.render(f5);
		feet.render(f5);
		leftWing1.render(f5);
		leftWing2.render(f5);
		rightWing1.render(f5);
		rightWing2.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}