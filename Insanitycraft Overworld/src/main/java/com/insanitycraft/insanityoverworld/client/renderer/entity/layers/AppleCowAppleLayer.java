package com.insanitycraft.insanityoverworld.client.renderer.entity.layers;

import com.insanitycraft.insanityoverworld.entity.GoldenAppleCowEntity;
import com.insanitycraft.insanityoverworld.init.InsanityBlocks;
import com.insanitycraft.insanityoverworld.init.InsanityEntities;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.client.renderer.texture.AtlasTexture;

public class AppleCowAppleLayer<T extends GoldenAppleCowEntity> extends LayerRenderer<T, CowModel<T>> {

	public AppleCowAppleLayer(IEntityRenderer<T, CowModel<T>> entityRendererIn) {
		super(entityRendererIn);
	}

	@Override
	public void func_225628_a_(MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, T t, float v, float v1, float v2, float v3, float v4, float v5) {

	}

//
//	@Override
//	public void render(T entityIn, float p_212842_2_, float p_212842_3_, float p_212842_4_, float p_212842_5_, float p_212842_6_, float p_212842_7_, float p_212842_8_) {
//		if(!entityIn.isChild() && !entityIn.isInvisible()) {
//			BlockState blockState = InsanityBlocks.appleBlock.getDefaultState();
//			if(entityIn.getType() == InsanityEntities.ENTITY_GOLDEN_COW || entityIn.getType() == InsanityEntities.ENTITY_ENCHANTED_COW) {
//				blockState = InsanityBlocks.goldenAppleBlock.getDefaultState();
//			}else if(entityIn.getType() == InsanityEntities.ENTITY_APPLE_COW) {
//				blockState = InsanityBlocks.appleBlock.getDefaultState();
//			}
//			this.bindTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE);
//			GlStateManager.enableCull();
//			GlStateManager.cullFace(GlStateManager.CullFace.FRONT);
//			GlStateManager.pushMatrix();
//			GlStateManager.scalef(0.5F, -0.5F, 0.5F);
//			GlStateManager.translatef(0.2F, 0.15F, 0.5F);
//			GlStateManager.rotatef(42.0F, 0.0F, 1.0F, 0.0F);
//			BlockRendererDispatcher blockrendererdispatcher = Minecraft.getInstance().getBlockRendererDispatcher();
//			GlStateManager.pushMatrix();
//			GlStateManager.translatef(-0.5F, -0.5F, 0.5F);
//			blockrendererdispatcher.renderBlockBrightness(blockState, 1.0F);
//			GlStateManager.popMatrix();
//			GlStateManager.pushMatrix();
//			GlStateManager.translatef(0.1F, 0.0F, -0.6F);
//			GlStateManager.rotatef(42.0F, 0.0F, 1.0F, 0.0F);
//			GlStateManager.translatef(-0.5F, -0.5F, 0.5F);
//			blockrendererdispatcher.renderBlockBrightness(blockState, 1.0F);
//			GlStateManager.popMatrix();
//			GlStateManager.popMatrix();
//			GlStateManager.pushMatrix();
//			this.getEntityModel().getHead().postRender(0.0625F);
//			GlStateManager.scalef(0.5F, -0.5F, 0.5F);
//			GlStateManager.translatef(0.0F, 0.9F, -0.2F);
//			GlStateManager.rotatef(12.0F, 0.0F, 1.0F, 0.0F);
//			GlStateManager.translatef(-0.5F, -0.5F, 0.5F);
//			blockrendererdispatcher.renderBlockBrightness(blockState, 1.0F);
//			GlStateManager.popMatrix();
//			GlStateManager.cullFace(GlStateManager.CullFace.BACK);
//			GlStateManager.disableCull();
//
//		}
//	}
//
//	@Override
//	public boolean shouldCombineTextures() {
//		return true;
//	}
}
