package com.insanitycraft.insanityoverworld.data;

import com.insanitycraft.insanityoverworld.init.InsanityBlocks;
import com.insanitycraft.insanityoverworld.init.InsanityItems;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;

import static com.insanitycraft.insanityoverworld.init.InsanityTags.*;

public class TagGenerator {

	public static class BlockTagGenerator extends BlockTagsProvider {

		public BlockTagGenerator(DataGenerator generator) {
			super(generator);
		}

		@Override
		protected void registerTags() {

			getBuilder(Blocks.SPAWN_EGG_ORES).add(InsanityBlocks.BAT_EGG_ORE, InsanityBlocks.BLAZE_EGG_ORE, InsanityBlocks.CAT_EGG_ORE, InsanityBlocks.CAVE_SPIDER_EGG_ORE, InsanityBlocks.CHICKEN_EGG_ORE, InsanityBlocks.COW_EGG_ORE, InsanityBlocks.CREEPER_EGG_ORE, InsanityBlocks.DOLPHIN_EGG_ORE, InsanityBlocks.DONKEY_EGG_ORE, InsanityBlocks.DROWNED_EGG_ORE, InsanityBlocks.ELDER_GUARDIAN_EGG_ORE, InsanityBlocks.ENDER_DRAGON_EGG_ORE, InsanityBlocks.ENDERMAN_EGG_ORE, InsanityBlocks.ENDERMITE_EGG_ORE, InsanityBlocks.EVOKER_EGG_ORE, InsanityBlocks.FOX_EGG_ORE, InsanityBlocks.GHAST_EGG_ORE, InsanityBlocks.GUARDIAN_EGG_ORE, InsanityBlocks.HORSE_EGG_ORE, InsanityBlocks.HUSK_EGG_ORE, InsanityBlocks.IRON_GOLEM_EGG_ORE, InsanityBlocks.LLAMA_EGG_ORE, InsanityBlocks.MAGMA_CUBE_EGG_ORE, InsanityBlocks.MOOSHROOM_EGG_ORE, InsanityBlocks.OCELOT_EGG_ORE, InsanityBlocks.PANDA_EGG_ORE, InsanityBlocks.PARROT_EGG_ORE, InsanityBlocks.PHANTOM_EGG_ORE, InsanityBlocks.PIG_EGG_ORE, InsanityBlocks.PILLAGER_EGG_ORE, InsanityBlocks.POLAR_BEAR_EGG_ORE, InsanityBlocks.RABBIT_EGG_ORE, InsanityBlocks.RAVAGER_EGG_ORE, InsanityBlocks.SHEEP_EGG_ORE, InsanityBlocks.SHULKER_EGG_ORE, InsanityBlocks.SKELETON_EGG_ORE, InsanityBlocks.SLIME_EGG_ORE, InsanityBlocks.SNOW_GOLEM_EGG_ORE, InsanityBlocks.SPIDER_EGG_ORE, InsanityBlocks.SQUID_EGG_ORE, InsanityBlocks.STRAY_EGG_ORE, InsanityBlocks.TURTLE_EGG_ORE, InsanityBlocks.VILLAGER_EGG_ORE, InsanityBlocks.VINDICATOR_EGG_ORE, InsanityBlocks.WITCH_EGG_ORE, InsanityBlocks.WITHER_EGG_ORE, InsanityBlocks.WITHER_SKELETON_EGG_ORE, InsanityBlocks.WOLF_EGG_ORE, InsanityBlocks.ZOMBIE_EGG_ORE, InsanityBlocks.ZOMBIE_PIGMAN_EGG_ORE);
			getBuilder(Blocks.SPAWN_EGG_ORES_VANILLA).add(InsanityBlocks.BAT_EGG_ORE, InsanityBlocks.BLAZE_EGG_ORE, InsanityBlocks.CAT_EGG_ORE, InsanityBlocks.CAVE_SPIDER_EGG_ORE, InsanityBlocks.CHICKEN_EGG_ORE, InsanityBlocks.COW_EGG_ORE, InsanityBlocks.CREEPER_EGG_ORE, InsanityBlocks.DOLPHIN_EGG_ORE, InsanityBlocks.DONKEY_EGG_ORE, InsanityBlocks.DROWNED_EGG_ORE, InsanityBlocks.ELDER_GUARDIAN_EGG_ORE, InsanityBlocks.ENDER_DRAGON_EGG_ORE, InsanityBlocks.ENDERMAN_EGG_ORE, InsanityBlocks.ENDERMITE_EGG_ORE, InsanityBlocks.EVOKER_EGG_ORE, InsanityBlocks.FOX_EGG_ORE, InsanityBlocks.GHAST_EGG_ORE, InsanityBlocks.GUARDIAN_EGG_ORE, InsanityBlocks.HORSE_EGG_ORE, InsanityBlocks.HUSK_EGG_ORE, InsanityBlocks.IRON_GOLEM_EGG_ORE, InsanityBlocks.LLAMA_EGG_ORE, InsanityBlocks.MAGMA_CUBE_EGG_ORE, InsanityBlocks.MOOSHROOM_EGG_ORE, InsanityBlocks.OCELOT_EGG_ORE, InsanityBlocks.PANDA_EGG_ORE, InsanityBlocks.PARROT_EGG_ORE, InsanityBlocks.PHANTOM_EGG_ORE, InsanityBlocks.PIG_EGG_ORE, InsanityBlocks.PILLAGER_EGG_ORE, InsanityBlocks.POLAR_BEAR_EGG_ORE, InsanityBlocks.RABBIT_EGG_ORE, InsanityBlocks.RAVAGER_EGG_ORE, InsanityBlocks.SHEEP_EGG_ORE, InsanityBlocks.SHULKER_EGG_ORE, InsanityBlocks.SKELETON_EGG_ORE, InsanityBlocks.SLIME_EGG_ORE, InsanityBlocks.SNOW_GOLEM_EGG_ORE, InsanityBlocks.SPIDER_EGG_ORE, InsanityBlocks.SQUID_EGG_ORE, InsanityBlocks.STRAY_EGG_ORE, InsanityBlocks.TURTLE_EGG_ORE, InsanityBlocks.VILLAGER_EGG_ORE, InsanityBlocks.VINDICATOR_EGG_ORE, InsanityBlocks.WITCH_EGG_ORE, InsanityBlocks.WITHER_EGG_ORE, InsanityBlocks.WITHER_SKELETON_EGG_ORE, InsanityBlocks.WOLF_EGG_ORE, InsanityBlocks.ZOMBIE_EGG_ORE, InsanityBlocks.ZOMBIE_PIGMAN_EGG_ORE);

			getBuilder(Tags.Blocks.ORES).add(Blocks.ORES_AMETHYST, Blocks.ORES_RUBY, Blocks.ORES_PINK_TOURMALINE, Blocks.ORES_TIGER_EYE);
			getBuilder(Blocks.ORES_AMETHYST).add(InsanityBlocks.AMETHYST_ORE);
			getBuilder(Blocks.ORES_RUBY).add(InsanityBlocks.RUBY_ORE);
			getBuilder(Blocks.ORES_PINK_TOURMALINE).add(InsanityBlocks.PINK_TOURMALINE_ORE);
			getBuilder(Blocks.ORES_TIGER_EYE).add(InsanityBlocks.TIGER_EYE_ORE);

			getBuilder(Tags.Blocks.STORAGE_BLOCKS).add(Blocks.STORAGE_BLOCKS_AMETHYST, Blocks.STORAGE_BLOCKS_RUBY, Blocks.STORAGE_BLOCKS_PINK_TOURMALINE, Blocks.STORAGE_BLOCKS_TIGER_EYE);
			getBuilder(Blocks.STORAGE_BLOCKS_AMETHYST).add(InsanityBlocks.AMETHYST_BLOCK);
			getBuilder(Blocks.STORAGE_BLOCKS_RUBY).add(InsanityBlocks.RUBY_BLOCK);
			getBuilder(Blocks.STORAGE_BLOCKS_PINK_TOURMALINE).add(InsanityBlocks.PINK_TOURMALINE_BLOCK);
			getBuilder(Blocks.STORAGE_BLOCKS_TIGER_EYE).add(InsanityBlocks.TIGER_EYE_BLOCK);


		}

		@Override
		public String getName() {
			return "Insanitycraft Overworld Block Tags";
		}
	}

	public static class ItemTagGenerator extends ItemTagsProvider {

		public ItemTagGenerator(DataGenerator generator) {
			super(generator);
		}

		@Override
		protected void registerTags() {
			getBuilder(Tags.Items.INGOTS).add(Items.INGOTS_PINK_TOURMALINE, Items.INGOTS_TIGER_EYE);
			getBuilder(Items.INGOTS_PINK_TOURMALINE).add(InsanityItems.PINK_TOURMALINE);
			getBuilder(Items.INGOTS_TIGER_EYE).add(InsanityItems.TIGER_EYE);

			getBuilder(Tags.Items.GEMS).add(Items.GEMS_AMETHYST, Items.GEMS_RUBY);
			getBuilder(Items.GEMS_AMETHYST).add(InsanityItems.AMETHYST);
			getBuilder(Items.GEMS_RUBY).add(InsanityItems.RUBY);

			copy(Blocks.SPAWN_EGG_ORES, Items.SPAWN_EGG_ORE);
			copy(Blocks.SPAWN_EGG_ORES_VANILLA, Items.SPAWN_EGG_ORE_VANILLA);

			copy(Blocks.ORES_AMETHYST, Items.ORES_AMETHYST);
			copy(Blocks.ORES_RUBY, Items.ORES_RUBY);
			copy(Blocks.ORES_PINK_TOURMALINE, Items.ORES_PINK_TOURMALINE);
			copy(Blocks.ORES_TIGER_EYE, Items.ORES_TIGER_EYE);

			copy(Blocks.STORAGE_BLOCKS_AMETHYST, Items.STORAGE_BLOCKS_AMETHYST);
			copy(Blocks.STORAGE_BLOCKS_RUBY, Items.STORAGE_BLOCKS_RUBY);
			copy(Blocks.STORAGE_BLOCKS_PINK_TOURMALINE, Items.STORAGE_BLOCKS_PINK_TOURMALINE);
			copy(Blocks.STORAGE_BLOCKS_TIGER_EYE, Items.STORAGE_BLOCKS_TIGER_EYE);

		}

		@Override
		public String getName() {
			return "Insanitycraft Overworld Item Tags";
		}
	}
}
