package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.MothraModel;
import com.insanitycraft.insanityoverworld.entity.MothraEntity;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class MothraRenderer extends MobRenderer<MothraEntity, MothraModel<MothraEntity>> {

	public MothraRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new MothraModel<>(), 1);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(MothraEntity mothraEntity) {
		return new ResourceLocation(Reference.MODID, "textures/entity/mothra.png");
	}
}
