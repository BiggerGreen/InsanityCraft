package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.TriffidModel;
import com.insanitycraft.insanityoverworld.entity.TriffidEntity;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class TriffidRenderer extends MobRenderer<TriffidEntity, TriffidModel<TriffidEntity>> {

	public TriffidRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new TriffidModel<>(), 1);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(TriffidEntity triffidEntity) {
		return new ResourceLocation(Reference.MODID, "textures/entity/triffid.png");
	}
}
