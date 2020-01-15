package com.insanitycraft.insanityoverworld.client.gui.screen;

import com.insanitycraft.insanityoverworld.inventory.container.TrackerContainer;
import com.insanitycraft.insanityoverworld.util.Reference;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.structure.Structure;

public class TrackerScreen extends ContainerScreen<TrackerContainer> {

	private static final ResourceLocation GUI_TEXTURE = new ResourceLocation(Reference.MODID, "textures/gui/container/structure_tracker.png");
//	private static final ResourceLocation GUI_TEXTURE = new ResourceLocation("textures/gui/container/beacon.png");

	protected double scroll;

	public TrackerScreen(TrackerContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
		super(screenContainer, inv, titleIn);
	}

	@Override
	protected void init() {
		super.init();

	}

	@Override
	public void render(int mouseX, int mouseY, float partialTicks)
	{
		this.renderBackground();
		super.render(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);

	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		font.drawString(title.getFormattedText(), 8.0F, 6.0F, 0x404040);

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		minecraft.textureManager.bindTexture(GUI_TEXTURE);
		int startX = (this.width - this.xSize) / 2;
		int startY = (this.height - this.ySize) / 2;
		blit(startX, startY, 0, 0, this.xSize, this.ySize);
		blit(getGuiLeft() + 154, getGuiTop() + 18 + getScroll(), 244, 0, 12, 15);

		for(int i = 0; i < 8; i++) {
			blit(getGuiLeft() + 10, getGuiTop() + 18 + (i == 0 ? 0 : (13 * i)), 0, 166, 138, 13);

		}

	}

	public int getScroll() {
		return Math.max(Math.min((int)(scroll * 123), 123), 0);
	}

}
