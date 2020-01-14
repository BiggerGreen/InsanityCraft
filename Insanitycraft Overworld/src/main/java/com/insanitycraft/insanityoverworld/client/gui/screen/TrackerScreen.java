package com.insanitycraft.insanityoverworld.client.gui.screen;

import com.insanitycraft.insanityoverworld.client.gui.widget.GuiListWidget;
import com.insanitycraft.insanityoverworld.inventory.container.TrackerContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class TrackerScreen extends InsanityScreen<TrackerContainer> {

	private GuiListWidget listWidget;

	public TrackerScreen(TrackerContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
		super(screenContainer, inv, titleIn);
	}


	@Override
	protected void drawGuiContainerBackgroundLayer(int xAxis, int yAxis) {
		super.drawGuiContainerBackgroundLayer(xAxis, yAxis);
	}

	@Override
	protected ResourceLocation getScreenLocation() {
		return new ResourceLocation("textures/gui/container/beacon.png");
	}
}
