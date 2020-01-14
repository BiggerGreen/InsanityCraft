package com.insanitycraft.insanityoverworld.client.gui.widget;

import com.insanitycraft.insanityoverworld.client.gui.IGuiWrapper;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class GuiListWidget extends GuiWidget {

	private List<String> entries = new ArrayList<>();
	private double scroll;
	private int selected = -1;

	public GuiListWidget(IGuiWrapper gui, ResourceLocation resource, int x, int y, int width, int height) {
		super(new ResourceLocation(Reference.MODID, "gui/widget/list.png"), gui, resource, x, y, width, height);
	}

	public boolean hasSelected() {
		return selected != -1;
	}

	public int getSelected() {
		return selected;
	}

	public void clearSelected() {
		selected = -1;
	}

	private int getRenderedEntries() {
		return height / 10;
	}

	public void setText(List<String> text) {
		if(text == null) {
			entries.clear();
			return;
		}
		if(selected > text.size() - 1) {
			clearSelected();
		}
		if(!canScroll()) {
			scroll = 0;
		}
 	}

 	private boolean canScroll() {
		return entries.size() > getRenderedEntries();
	}

	@Override
	public void renderButton(int mouseX, int mouseY, float partialTicks) {
		minecraft.textureManager.bindTexture(getResource());

		gui.drawRectWithTexture(x, y, width, height, 0, 0, 10, 10, 20, 20);
	}
}
