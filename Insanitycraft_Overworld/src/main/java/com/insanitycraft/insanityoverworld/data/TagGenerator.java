package com.insanitycraft.insanityoverworld.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;

import static com.insanitycraft.insanityoverworld.init.InsanityBlocks.*;
import static com.insanitycraft.insanityoverworld.init.InsanityTags.*;

public class TagGenerator {

	public static class BlockTagGenerator extends BlockTagsProvider {

		public BlockTagGenerator(DataGenerator generator) {
			super(generator);
		}

		@Override
		protected void registerTags() {

			getBuilder(Blocks.SPAWN_EGG_ORES).add(batEggOre, blazeEggOre, catEggOre, cavespiderEggOre, chickenEggOre, cowEggOre, creeperEggOre, dolphinEggOre, donkeyEggOre, drownedEggOre, elderGuardianEggOre, enderdragonEggOre, endermanEggOre, endermiteEggOre, evokerEggOre, foxEggOre, ghastEggOre, guardianEggOre, horseEggOre, huskEggOre, ironGolemEggOre, llamaEggOre, magmacubeEggOre, mooshroomEggOre, ocelotEggOre, pandabearEggOre, parrotEggOre, phantomEggOre, pigEggOre, pillagerEggOre, polarbearEggOre, rabbitEggOre, ravagerEggOre, sheepEggOre, shulkerEggOre, skeletonEggOre, slimeEggOre, snowGolemEggOre, spiderEggOre, squidEggOre, strayEggOre, turtleEggOre, villagerEggOre, vindicatorEggOre, witchEggOre, witherEggOre, witherSkeletonEggOre, wolfEggOre, zombieEggOre, zombiePigmanEggOre);
			getBuilder(Blocks.SPAWN_EGG_ORES_VANILLA).add(batEggOre, blazeEggOre, catEggOre, cavespiderEggOre, chickenEggOre, cowEggOre, creeperEggOre, dolphinEggOre, donkeyEggOre, drownedEggOre, elderGuardianEggOre, enderdragonEggOre, endermanEggOre, endermiteEggOre, evokerEggOre, foxEggOre, ghastEggOre, guardianEggOre, horseEggOre, huskEggOre, ironGolemEggOre, llamaEggOre, magmacubeEggOre, mooshroomEggOre, ocelotEggOre, pandabearEggOre, parrotEggOre, phantomEggOre, pigEggOre, pillagerEggOre, polarbearEggOre, rabbitEggOre, ravagerEggOre, sheepEggOre, shulkerEggOre, skeletonEggOre, slimeEggOre, snowGolemEggOre, spiderEggOre, squidEggOre, strayEggOre, turtleEggOre, villagerEggOre, vindicatorEggOre, witchEggOre, witherEggOre, witherSkeletonEggOre, wolfEggOre, zombieEggOre, zombiePigmanEggOre);

			getBuilder(Tags.Blocks.ORES).add(Blocks.ORES_AMETHYST, Blocks.ORES_RUBY, Blocks.ORES_PINK_TOURMALINE, Blocks.ORES_TIGER_EYE);
			getBuilder(Blocks.ORES_AMETHYST).add(amethystOre);
			getBuilder(Blocks.ORES_RUBY).add(rubyOre);
			getBuilder(Blocks.ORES_PINK_TOURMALINE).add(pinkTourmalineOre);
			getBuilder(Blocks.ORES_TIGER_EYE).add(tigerEyeOre);

			getBuilder(Tags.Blocks.STORAGE_BLOCKS).add(Blocks.STORAGE_BLOCKS_AMETHYST, Blocks.STORAGE_BLOCKS_RUBY, Blocks.STORAGE_BLOCKS_PINK_TOURMALINE, Blocks.STORAGE_BLOCKS_TIGER_EYE);
			getBuilder(Blocks.STORAGE_BLOCKS_AMETHYST).add(amethystBlock);
			getBuilder(Blocks.STORAGE_BLOCKS_RUBY).add(rubyBlock);
			getBuilder(Blocks.STORAGE_BLOCKS_PINK_TOURMALINE).add(pinkTourmalineBlock);
			getBuilder(Blocks.STORAGE_BLOCKS_TIGER_EYE).add(tigerEyeBlock);


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
