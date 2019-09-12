package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.AntModel;
import com.insanitycraft.insanityoverworld.entity.EntityAnt;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class AntRenderer extends MobRenderer<EntityAnt, AntModel<EntityAnt>> {
	public AntRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new AntModel<>(), 1);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityAnt entity) {
		return new ResourceLocation(Reference.MODID,"textures/entity/ant/ant1.png");
	}

}
