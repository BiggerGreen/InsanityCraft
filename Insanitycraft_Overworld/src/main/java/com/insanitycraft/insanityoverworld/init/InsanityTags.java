package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class InsanityTags {

	public static class Items {

		public static final Tag<Item> ORES_AMETHYST = forgeTag("ores/amethyst");
		public static final Tag<Item> ORES_RUBY = forgeTag("ores/ruby");

		public static final Tag<Item> STORAGE_BLOCKS_AMETHYST = forgeTag("storage_blocks/amethyst");
		public static final Tag<Item> STORAGE_BLOCKS_RUBY = forgeTag("storage_blocks/ruby");

		public static final Tag<Item> ORES_PINK_TOURMALINE = forgeTag("ores/pink_tourmaline");
		public static final Tag<Item> ORES_TIGER_EYE = forgeTag("ores/tiger_eye");

		public static final Tag<Item> STORAGE_BLOCKS_PINK_TOURMALINE = forgeTag("storage_blocks/pink_tourmaline");
		public static final Tag<Item> STORAGE_BLOCKS_TIGER_EYE = forgeTag("storage_blocks/tiger_eye");

		public static final Tag<Item> SPAWN_EGG_ORE = tag("spawn_egg_ores");
		public static final Tag<Item> SPAWN_EGG_ORE_VANILLA = tag("spawn_egg_ores/vanilla");
		public static final Tag<Item> SPAWN_EGG_ORE_INSANITY_OVERWORLD = tag("spawn_egg_ores/insanityoverworld");



		private static Tag<Item> forgeTag(String name) {
			return new ItemTags.Wrapper(new ResourceLocation("forge", name));
		}

		private static Tag<Item> tag(String name) {
			return new ItemTags.Wrapper(new ResourceLocation(Reference.MODID, name));
		}
	}


	public static class Blocks {

		public static final Tag<Block> ORES_AMETHYST = forgeTag("ores/amethyst");
		public static final Tag<Block> ORES_RUBY = forgeTag("ores/ruby");

		public static final Tag<Block> STORAGE_BLOCKS_AMETHYST = forgeTag("storage_blocks/amethyst");
		public static final Tag<Block> STORAGE_BLOCKS_RUBY = forgeTag("storage_blocks/ruby");

		public static final Tag<Block> ORES_PINK_TOURMALINE = forgeTag("ores/pink_tourmaline");
		public static final Tag<Block> ORES_TIGER_EYE = forgeTag("ores/tiger_eye");

		public static final Tag<Block> STORAGE_BLOCKS_PINK_TOURMALINE = forgeTag("storage_blocks/pink_tourmaline");
		public static final Tag<Block> STORAGE_BLOCKS_TIGER_EYE = forgeTag("storage_blocks/tiger_eye");

		public static final Tag<Block> SPAWN_EGG_ORES = tag("spawn_egg_ores");
		public static final Tag<Block> SPAWN_EGG_ORES_VANILLA = tag("spawn_egg_ores/vanilla");
		public static final Tag<Block> SPAWN_EGG_ORES_INSANITY_OVERWORLD = tag("spawn_egg_ores/insanityoverworld");

		private static Tag<Block> forgeTag(String name) {
			return new BlockTags.Wrapper(new ResourceLocation("forge", name));
		}

		private static Tag<Block> tag(String name) {
			return new BlockTags.Wrapper(new ResourceLocation(Reference.MODID, name));
		}

	}




}
