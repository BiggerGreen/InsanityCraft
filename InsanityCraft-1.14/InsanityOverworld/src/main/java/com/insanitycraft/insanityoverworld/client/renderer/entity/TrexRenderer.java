package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.TrexModel;
import com.insanitycraft.insanityoverworld.entity.EntityTrex;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class TrexRenderer extends MobRenderer<EntityTrex, TrexModel<EntityTrex>> {

	public TrexRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new TrexModel<>(), 1);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityTrex entityTrex) {
		return new ResourceLocation(Reference.MODID, "textures/entity/trex.png");
	}
}
