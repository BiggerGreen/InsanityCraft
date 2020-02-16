package com.insanitycraft.insanityoverworld.util;

import com.insanitycraft.insanityoverworld.init.InsanityBlocks;
import com.insanitycraft.insanityoverworld.init.InsanityItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupInsanityOverworld {

	public static class InsanityGroup extends ItemGroup {

		public InsanityGroup() {
			super("insanity_overworld");
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(InsanityItems.AMETHYST);
		}
	}

	public static class EggOreGroup extends ItemGroup {

		public EggOreGroup() {
			super("egg_ores");
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(InsanityBlocks.BAT_EGG_ORE);
		}
	}

}
