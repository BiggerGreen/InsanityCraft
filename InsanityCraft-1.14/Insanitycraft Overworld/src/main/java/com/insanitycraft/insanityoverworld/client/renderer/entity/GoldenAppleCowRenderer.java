package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.layers.AppleCowAppleLayer;
import com.insanitycraft.insanityoverworld.entity.EntityGoldenAppleCow;
import com.insanitycraft.insanityoverworld.init.InsanityEntities;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

public class GoldenAppleCowRenderer extends MobRenderer<EntityGoldenAppleCow, CowModel<EntityGoldenAppleCow>> {

	public GoldenAppleCowRenderer(EntityRendererManager p_i50961_1_) {
		super(p_i50961_1_, new CowModel<>(), 0.7F);
		addLayer(new AppleCowAppleLayer(this));
	}

	@Override
	public boolean shouldRender(EntityGoldenAppleCow livingEntity, ICamera camera, double camX, double camY, double camZ) {
		if(livingEntity.getType() == InsanityEntities.ENTITY_ENCHANTED_COW) {
			GL11.glColor3f(1.0F, 1.0F, 1.0F);
		}
		return true;
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityGoldenAppleCow entity) {
		if(entity.getType() == InsanityEntities.ENTITY_APPLE_COW) {
			return new ResourceLocation(Reference.MODID, "textures/entity/applecow/apple_cow.png");
		}else {
			return new ResourceLocation(Reference.MODID, "textures/entity/applecow/goldenapple_cow.png");
		}
	}
}
