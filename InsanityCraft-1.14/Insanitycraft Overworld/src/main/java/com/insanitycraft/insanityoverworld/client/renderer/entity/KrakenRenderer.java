package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.KrakenModel;
import com.insanitycraft.insanityoverworld.entity.EntityKraken;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class KrakenRenderer extends MobRenderer<EntityKraken, KrakenModel<EntityKraken>> {

	public KrakenRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new KrakenModel<>(), 1);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityKraken entityKraken) {
		return new ResourceLocation(Reference.MODID, "textures/entity/kraken.png");
	}
}
