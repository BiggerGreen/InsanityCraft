package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.NytemairsModel;
import com.insanitycraft.insanityoverworld.entity.NytemairsEntity;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class NytemairsRenderer extends MobRenderer<NytemairsEntity, NytemairsModel<NytemairsEntity>> {
	public NytemairsRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new NytemairsModel<>(), 1);
	}

	@Nullable
	@Override
	public ResourceLocation getEntityTexture(NytemairsEntity entity) {
		return new ResourceLocation(Reference.MODID,"textures/entity/nytemairs/nytemairs.png");
	}
}
