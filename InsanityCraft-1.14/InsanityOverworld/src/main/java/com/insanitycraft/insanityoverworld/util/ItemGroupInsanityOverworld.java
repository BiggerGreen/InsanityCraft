package com.insanitycraft.insanityoverworld.util;

import com.insanitycraft.insanityoverworld.init.InsanityItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupInsanityOverworld extends ItemGroup {

	public ItemGroupInsanityOverworld() {
		super("insanity_overworld_group");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(InsanityItems.amethyst);
	}
}
