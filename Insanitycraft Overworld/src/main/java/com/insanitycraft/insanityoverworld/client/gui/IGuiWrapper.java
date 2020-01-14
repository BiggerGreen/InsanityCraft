package com.insanitycraft.insanityoverworld.client.gui;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.List;

public interface IGuiWrapper {

	void drawTexturedRect(int x, int y, int textureX, int textureY, int width, int height);

	void drawRectWithTexture(int x, int y, int textureX, int textureY, int width, int height, int textureWidth, int textureHeight);

	void drawRectWithTexture(int x, int y, int desiredWidth, int desiredHeight, int textureX, int textureY, int width, int height, int textureWidth, int textureHeight);

	void displayTooltip(ITextComponent component, int xAxis, int yAxis);

	void displayTooltips(List<ITextComponent> list, int xAxis, int yAxis);


	default int getTop() {
		if(this instanceof ContainerScreen) {
			return ((ContainerScreen)this).getGuiTop();
		}
		return 0;
	}

	default int getLeft() {
		if(this instanceof ContainerScreen) {
			return ((ContainerScreen)this).getGuiLeft();
		}
		return 0;
	}

	default int getWidth() {
		if(this instanceof ContainerScreen) {
			return ((ContainerScreen)this).getXSize();
		}
		return 0;
	}

	default int getHeight() {
		if(this instanceof ContainerScreen) {
			return ((ContainerScreen)this).getYSize();
		}
		return 0;
	}

	@Nullable
	FontRenderer getFont();

}
