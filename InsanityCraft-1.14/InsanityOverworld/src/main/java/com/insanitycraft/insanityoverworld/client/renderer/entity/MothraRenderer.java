package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.MothraModel;
import com.insanitycraft.insanityoverworld.entity.EntityMothra;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class MothraRenderer extends MobRenderer<EntityMothra, MothraModel<EntityMothra>> {

	public MothraRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new MothraModel<>(), 1);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityMothra entityMothra) {
		return new ResourceLocation(Reference.MODID, "textures/entity/mothra.png");
	}
}
