package com.insanitycraft.insanityoverworld.client.gui.widget;

import com.insanitycraft.insanityoverworld.client.gui.IGuiWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class GuiWidget extends Widget {

	public static final Minecraft minecraft = Minecraft.getInstance();
	protected final IGuiWrapper gui;
	private ResourceLocation resource;

	public GuiWidget(ResourceLocation resource, IGuiWrapper gui, ResourceLocation def, int x, int y, int width, int height) {
		super(gui.getLeft() + x, gui.getTop() + y, width, height, "");
		this.resource = resource;
		this.gui = gui;
	}

	public void displayTooltip(ITextComponent component, int xAxis, int yAxis) {
		gui.displayTooltip(component, xAxis, yAxis);
	}

	public void displayTooltips(List<ITextComponent> list, int xAxis, int yAxis) {
		gui.displayTooltips(list, xAxis, yAxis);
	}

	@Override
	protected boolean clicked(double mouseX, double mouseY) {
		return isMouseOver(mouseX, mouseY);
	}

	public ResourceLocation getResource() {
		return resource;
	}
}
