package com.insanitycraft.insanityoverworld.client.renderer.entity;

import com.insanitycraft.insanityoverworld.entity.GirlfriendEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.util.ResourceLocation;

import static com.insanitycraft.insanityoverworld.util.Reference.*;

public class GirlfriendRenderer extends MobRenderer<GirlfriendEntity, PlayerModel<GirlfriendEntity>> {

	//TODO change ones the textures are done
	public static final ResourceLocation[] GIRLFRIEND_TEXTURES = new ResourceLocation[]{
			new ResourceLocation(MODID, "textures/entity/girlfriend/test1.png"),
			new ResourceLocation(MODID, "textures/entity/girlfriend/test2.png"),
			new ResourceLocation(MODID, "textures/entity/girlfriend/test1.png"),
			new ResourceLocation(MODID, "textures/entity/girlfriend/test2.png")
	};
	public static final ResourceLocation[] GIRLFRIEND_BIKINI_TEXTURES = new ResourceLocation[]{
			new ResourceLocation(MODID, "textures/entity/girlfriend/test2.png"),
			new ResourceLocation(MODID, "textures/entity/girlfriend/test1.png"),
			new ResourceLocation(MODID, "textures/entity/girlfriend/test2.png"),
			new ResourceLocation(MODID, "textures/entity/girlfriend/test1.png")
	};


	public GirlfriendRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new PlayerModel<>(1.0F, true), 1);
	}

	@Override
	public ResourceLocation getEntityTexture(GirlfriendEntity entity) {

		if(entity.isInWater()) {
			return GIRLFRIEND_BIKINI_TEXTURES[entity.getVariant()];
		}else {
			return GIRLFRIEND_TEXTURES[entity.getVariant()];
		}
	}
}
