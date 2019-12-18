package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.TrexModel;
import com.insanitycraft.insanityoverworld.entity.TrexEntity;
import com.insanitycraft.insanityoverworld.util.Reference;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class TrexRenderer extends MobRenderer<TrexEntity, TrexModel<TrexEntity>> {

	public TrexRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new TrexModel<>(), 1);
	}

	@Nullable
	@Override
	public ResourceLocation getEntityTexture(TrexEntity trexEntity) {
		return new ResourceLocation(Reference.MODID, "textures/entity/trex.png");
	}


//	@Override
//	protected void applyRotations(TrexEntity entity, float p_77043_2_, float p_77043_3_, float p_77043_4_) {
//		super.applyRotations(entity, p_77043_2_, p_77043_3_, p_77043_4_);
//
//		if(entity.hasCustomName()) {
//			if("Conga".equals(entity.getName().getString())) { //Conga is an artist for the mod if your wondering.
//				GlStateManager.scalef(0.2f, 0.2f, 0.2f);
//			}
//		}
//	}

}
