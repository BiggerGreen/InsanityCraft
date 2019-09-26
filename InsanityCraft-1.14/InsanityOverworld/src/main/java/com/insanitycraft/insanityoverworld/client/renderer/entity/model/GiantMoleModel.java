package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.EntityGiantMole;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class GiantMoleModel<T extends EntityGiantMole> extends EntityModel<T> {
	private final RendererModel Body;
	private final RendererModel Tail;
	private final RendererModel Nose;
	private final RendererModel bone8;
	private final RendererModel bone9;
	private final RendererModel bone10;
	private final RendererModel Foot;
	private final RendererModel Foot2;
	private final RendererModel Foot3;
	private final RendererModel Foot4;

	public GiantMoleModel () {
		textureWidth = 64;
		textureHeight = 64;

		Body = new RendererModel(this);
		Body.setRotationPoint(0.0F, 19.25F, 2.3333F);
		Body.cubeList.add(new ModelBox(Body, 0, 44, -6.0F, -5.25F, -7.3333F, 12, 9, 11, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 50, -5.0F, -4.25F, -13.3333F, 10, 8, 6, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 40, 24, -4.0F, -3.25F, -16.3333F, 8, 6, 3, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 51, -5.0F, -4.25F, 3.6667F, 10, 8, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 55, -4.0F, -3.25F, 8.6667F, 8, 7, 2, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 58, -3.0F, -1.25F, 10.6667F, 6, 5, 1, 0.0F, false));

		Tail = new RendererModel(this);
		Tail.setRotationPoint(-0.3333F, 21.5F, 14.1667F);
		Tail.cubeList.add(new ModelBox(Tail, 50, 57, -0.6667F, -0.5F, -0.1667F, 1, 1, 6, 0.0F, false));
		Tail.cubeList.add(new ModelBox(Tail, 52, 58, -1.6667F, -0.5F, 4.8333F, 1, 1, 5, 0.0F, false));
		Tail.cubeList.add(new ModelBox(Tail, 54, 59, -0.6667F, -0.5F, 8.8333F, 1, 1, 4, 0.0F, false));

		Nose = new RendererModel(this);
		Nose.setRotationPoint(0.0F, 21.125F, -9.0625F);
		Nose.cubeList.add(new ModelBox(Nose, 0, 23, -2.0F, -4.125F, -5.9375F, 4, 4, 1, 0.0F, false));
		Nose.cubeList.add(new ModelBox(Nose, 0, 23, 2.0F, -1.125F, -5.9375F, 3, 1, 1, 0.0F, false));
		Nose.cubeList.add(new ModelBox(Nose, 0, 23, 2.0F, -3.125F, -5.9375F, 3, 1, 1, 0.0F, false));
		Nose.cubeList.add(new ModelBox(Nose, 0, 23, -5.0F, -3.125F, -5.9375F, 3, 1, 1, 0.0F, false));
		Nose.cubeList.add(new ModelBox(Nose, 0, 23, -5.0F, -1.125F, -5.9375F, 3, 1, 1, 0.0F, false));

		bone8 = new RendererModel(this);
		bone8.setRotationPoint(4.0F, -3.625F, -5.4375F);
		setRotationAngle(bone8, 0.0F, 0.0F, -0.6981F);
		Nose.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 0, 23, -2.0F, -2.0F, -0.5F, 3, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 23, -9.0F, -2.0F, -0.5F, 3, 1, 1, 0.0F, false));

		bone9 = new RendererModel(this);
		bone9.setRotationPoint(-3.0F, -5.125F, -5.4375F);
		setRotationAngle(bone9, 0.0F, 0.0F, -2.3562F);
		Nose.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 0, 23, -2.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 23, -9.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		bone10 = new RendererModel(this);
		bone10.setRotationPoint(1.0F, -4.625F, -5.4375F);
		setRotationAngle(bone10, 0.0F, 0.0F, 1.5708F);
		Nose.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 0, 23, -2.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 23, 4.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 23, -2.5F, 2.0F, -0.5F, 3, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 23, 4.5F, 2.0F, -0.5F, 3, 1, 1, 0.0F, false));

		Foot = new RendererModel(this);
		Foot.setRotationPoint(5.5F, 23.5F, -6.1667F);
		Foot.cubeList.add(new ModelBox(Foot, 0, 37, -1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F, false));
		Foot.cubeList.add(new ModelBox(Foot, 16, 39, -1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
		Foot.cubeList.add(new ModelBox(Foot, 16, 39, 0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));

		Foot2 = new RendererModel(this);
		Foot2.setRotationPoint(-5.5F, 23.5F, -6.1667F);
		Foot2.cubeList.add(new ModelBox(Foot2, 0, 37, -1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F, false));
		Foot2.cubeList.add(new ModelBox(Foot2, 16, 39, -1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
		Foot2.cubeList.add(new ModelBox(Foot2, 16, 39, 0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));

		Foot3 = new RendererModel(this);
		Foot3.setRotationPoint(-5.5F, 23.5F, 5.8333F);
		Foot3.cubeList.add(new ModelBox(Foot3, 0, 37, -1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F, false));
		Foot3.cubeList.add(new ModelBox(Foot3, 16, 39, -1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
		Foot3.cubeList.add(new ModelBox(Foot3, 16, 39, 0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));

		Foot4 = new RendererModel(this);
		Foot4.setRotationPoint(5.5F, 23.5F, 5.8333F);
		Foot4.cubeList.add(new ModelBox(Foot4, 0, 37, -1.5F, -0.5F, -2.8333F, 3, 1, 5, 0.0F, false));
		Foot4.cubeList.add(new ModelBox(Foot4, 16, 39, -1.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
		Foot4.cubeList.add(new ModelBox(Foot4, 16, 39, 0.5F, -0.5F, -5.8333F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(T entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.scalef(5, 5, 5);
		GlStateManager.translatef(0, -1.2f, 0);
		Body.render(f5);
		Tail.render(f5);
		Nose.render(f5);
		Foot.render(f5);
		Foot2.render(f5);
		Foot3.render(f5);
		Foot4.render(f5);
	}
	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}