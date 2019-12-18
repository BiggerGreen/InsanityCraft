package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.GiantMoleModel;
import com.insanitycraft.insanityoverworld.entity.GiantMoleEntity;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class GiantMoleRenderer extends MobRenderer<GiantMoleEntity, GiantMoleModel<GiantMoleEntity>> {


	public GiantMoleRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new GiantMoleModel<>(), 1);
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(GiantMoleEntity giantMoleEntity) {
		return new ResourceLocation(Reference.MODID, "textures/entity/giant_mole.png");
	}
}
