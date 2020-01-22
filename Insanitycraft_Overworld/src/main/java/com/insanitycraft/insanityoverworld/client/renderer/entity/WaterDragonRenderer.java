package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.WaterDragonModel;
import com.insanitycraft.insanityoverworld.entity.WaterDragonEntity;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class WaterDragonRenderer extends MobRenderer<WaterDragonEntity, WaterDragonModel<WaterDragonEntity>> {

	public WaterDragonRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new WaterDragonModel<>(), 1);
	}

	@Override
	public ResourceLocation getEntityTexture(WaterDragonEntity entity) {
		return new ResourceLocation(Reference.MODID, "textures/entity/water_dragon/water_dragon.png");
	}
}
