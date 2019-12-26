package com.insanitycraft.insanityoverworld.client.renderer.entity.layers;

import com.insanitycraft.insanityoverworld.client.renderer.entity.model.LinksHornsModel;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import com.insanitycraft.insanityoverworld.util.Reference;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class LinksHornsLayer extends LayerRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> {

	private LinksHornsModel model = new LinksHornsModel();
	private final ResourceLocation hornTexture = new ResourceLocation(Reference.MODID, "misc/links_horns.png");

	public LinksHornsLayer(IEntityRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> p_i50926_1_) {
		super(p_i50926_1_);
	}

	@Override
	public void func_225628_a_(MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, AbstractClientPlayerEntity abstractClientPlayerEntity, float v, float v1, float v2, float v3, float v4, float v5) {

	}

	/*
	@Override
	public void render(AbstractClientPlayerEntity player, float v, float v1, float v2, float v3, float v4, float v5, float v6) {
		//if(!player.isInvisible()) {
			//if(player.getUniqueID().equals("166d690ac70c48f59559f6b04e754c52")) {
			//GlStateManager.enableBlend();
			//	GlStateManager.pushMatrix();
			//GlStateManager.scalef(0.6F, 0.6F, 0.6F);
			//GlStateManager.translatef(0.0F, 16.0F * 0.0625F, 0.0F);
			//	this.bindTexture(hornTexture);
				InsanityLog.info("work please");
				model.renderHorns(1F);
			//	GlStateManager.popMatrix();

			//}
		//}
	}

	@Override
	public boolean shouldCombineTextures() {
		return true;
	}

	 */
}
