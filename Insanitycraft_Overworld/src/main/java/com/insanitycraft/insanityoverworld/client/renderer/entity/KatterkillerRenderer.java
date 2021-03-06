package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.KatterkillerModel;
import com.insanitycraft.insanityoverworld.entity.KatterkillerEntity;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class KatterkillerRenderer extends MobRenderer<KatterkillerEntity, KatterkillerModel<KatterkillerEntity>> {

	public KatterkillerRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new KatterkillerModel<>(), 1);
	}

	@Nullable
	@Override
	public ResourceLocation getEntityTexture(KatterkillerEntity katterkillerEntity) {
		return new ResourceLocation(Reference.MODID, "textures/entity/katterkiller.png");
	}
}
