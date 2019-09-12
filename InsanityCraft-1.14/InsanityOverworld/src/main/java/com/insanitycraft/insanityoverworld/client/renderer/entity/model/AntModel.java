package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.EntityAnt;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class AntModel<T extends EntityAnt> extends EntityModel<T> {
	private final RendererModel Legs;
	private final RendererModel bone4;
	private final RendererModel bone3;
	private final RendererModel bone2;
	private final RendererModel bone5;
	private final RendererModel bone7;
	private final RendererModel bone6;
	private final RendererModel bone8;
	private final RendererModel bone11;
	private final RendererModel bone10;
	private final RendererModel bone9;

	public AntModel() {
		textureWidth = 16;
		textureHeight = 16;

		Legs = new RendererModel(this);
		Legs.setRotationPoint(0.0F, 24.0F, 0.0F);

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone4, 0.0F, -0.3491F, 0.3491F);
		Legs.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 0, 2, -0.7F, -1.5F, 0.25F, 3, 1, 1, 0.0F, false));

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.3491F);
		Legs.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 2, -0.7F, -1.5F, -1.0F, 3, 1, 1, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, 0.3491F, 0.3491F);
		Legs.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 2, -0.2F, -1.5F, -2.25F, 3, 1, 1, 0.0F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.3491F);
		Legs.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 2, -4.2F, -2.25F, -1.0F, 3, 1, 1, 0.0F, false));

		bone7 = new RendererModel(this);
		bone7.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone7, 0.0F, 0.3491F, -0.3491F);
		Legs.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 0, 2, -4.2F, -2.25F, -0.35F, 3, 1, 1, 0.0F, false));

		bone6 = new RendererModel(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone6, 0.0F, -0.3491F, -0.3491F);
		Legs.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 0, 2, -4.55F, -2.25F, -1.65F, 3, 1, 1, 0.0F, false));

		bone8 = new RendererModel(this);
		bone8.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone8, 0.7854F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 12, 0, -1.0F, -6.1F, -1.2F, 1, 2, 1, -0.3F, false));
		bone8.cubeList.add(new ModelBox(bone8, 12, 0, -2.0F, -6.1F, -1.2F, 1, 2, 1, -0.3F, false));

		bone11 = new RendererModel(this);
		bone11.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 0, 0, -2.0F, -3.0F, -4.0F, 2, 2, 2, 0.0F, false));

		bone10 = new RendererModel(this);
		bone10.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 0, 0, -1.5F, -1.7F, 2.0F, 1, 0, 1, 1.0F, false));

		bone9 = new RendererModel(this);
		bone9.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 3, 7, -2.0F, -2.5F, -2.0F, 2, 2, 3, 0.0F, false));
	}

	@Override
	public void render(EntityAnt entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		Legs.render(scale);
		bone8.render(scale);
		bone11.render(scale);
		bone10.render(scale);
		bone9.render(scale);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}