package com.insanitycraft.insanityoverworld.client.gui.screen;

import com.insanitycraft.insanityoverworld.client.gui.IGuiWrapper;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.List;

public abstract class InsanityScreen<T extends Container> extends ContainerScreen<T> implements IGuiWrapper {
	public InsanityScreen(T screenContainer, PlayerInventory inv, ITextComponent titleIn) {
		super(screenContainer, inv, titleIn);
	}

	@Override
	public void render(int mouseX, int mouseY, float partialTicks) {
		renderBackground();
		super.render(mouseX, mouseY, partialTicks);
		renderHoveredToolTip(mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		minecraft.textureManager.bindTexture(getScreenLocation());
		drawTexturedRect(getLeft(), getTop(), 0, 0, getXSize(), getYSize());
		int xAxis = mouseX - getGuiLeft();
		int yAxis = mouseY - getGuiTop();
		drawGuiContainerBackgroundLayer(xAxis, yAxis);
	}

	protected void drawGuiContainerBackgroundLayer(int xAxis, int yAxis) {

	}

	@Override
	public void drawTexturedRect(int x, int y, int textureX, int textureY, int width, int height) {

	}

	@Override
	public void drawRectWithTexture(int x, int y, int textureX, int textureY, int width, int height, int textureWidth, int textureHeight) {

	}

	@Override
	public void drawRectWithTexture(int x, int y, int desiredWidth, int desiredHeight, int textureX, int textureY, int width, int height, int textureWidth, int textureHeight) {

	}

	@Override
	public void displayTooltip(ITextComponent component, int xAxis, int yAxis) {

	}

	@Override
	public void displayTooltips(List<ITextComponent> list, int xAxis, int yAxis) {

	}

	@Nullable
	@Override
	public FontRenderer getFont() {
		return null;
	}


	protected abstract ResourceLocation getScreenLocation();
}
