package com.insanitycraft.insanityoverworld.world.gen;

import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import static com.insanitycraft.insanityoverworld.init.InsanityBlocks.*;
import static net.minecraft.world.gen.GenerationStage.Decoration.*;
import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.*;

public class WorldGenOres {

	private static final CountRangeConfig amethystConfig = new CountRangeConfig(8, 0, 0, 25);
	private static final int amethystVeinSize = 5;
	private static final CountRangeConfig rubyConfig = new CountRangeConfig(3, 0, 0, 20);
	private static final int rubyVeinSize = 2;
	private static final CountRangeConfig titaniumConfig = new CountRangeConfig(1, 0, 0, 15);
	private static final int titaniumVeinSize = 1;
	private static final CountRangeConfig uraniumConfig = new CountRangeConfig(1, 0, 0, 15);
	private static final int uraniumVeinSize = 1;


	public static void setupOreGen() {
		for(Biome biome : ForgeRegistries.BIOMES.getValues()) {
			if(biome.getCategory() == Biome.Category.THEEND) {
				//END ores
				continue;
			}
			if(biome.getCategory() == Biome.Category.NETHER) {
				//NETHER ores
				continue;
			}

			biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, amethystOre.getDefaultState(), amethystVeinSize), Placement.COUNT_RANGE, amethystConfig));
			biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, rubyOre.getDefaultState(), rubyVeinSize), Placement.COUNT_RANGE, rubyConfig));
			biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, titaniumOre.getDefaultState(), titaniumVeinSize), Placement.COUNT_RANGE, titaniumConfig));
			biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, uraniumOre.getDefaultState(), uraniumVeinSize), Placement.COUNT_RANGE, uraniumConfig));

			addMobOres(biome, batEggOre, 2, 1, 128);
			addMobOres(biome, blazeEggOre, 2, 1, 128);
			addMobOres(biome, cavespiderEggOre, 2, 1, 128);
			addMobOres(biome, chickenEggOre, 2, 1, 128);
			addMobOres(biome, cowEggOre, 2, 1, 128);
			addMobOres(biome, creeperEggOre, 2, 1, 128);
			addMobOres(biome, dolphinEggOre, 2, 1, 128);
			addMobOres(biome, donkeyEggOre, 2, 1, 128);
			addMobOres(biome, drownedEggOre, 2, 1, 128);
			addMobOres(biome, elderGuardianEggOre, 2, 1, 128);
			addMobOres(biome, enderdragonEggOre, 2, 1, 128);
			addMobOres(biome, endermanEggOre, 2, 1, 128);
			addMobOres(biome, evokerEggOre, 2, 1, 128);
			addMobOres(biome, guardianEggOre, 2, 1, 128);
			addMobOres(biome, horseEggOre, 2, 1, 128);
			addMobOres(biome, huskEggOre, 2, 1, 128);
			addMobOres(biome, ironGolemEggOre, 2, 1, 128);
			addMobOres(biome, llamaEggOre, 2, 1, 128);
			addMobOres(biome, magmacubeEggOre, 2, 1, 128);
			addMobOres(biome, mooshroomEggOre, 2, 1, 128);
			addMobOres(biome, ocelotEggOre, 2, 1, 128);
			addMobOres(biome, pandabearEggOre, 2, 1, 128);
			addMobOres(biome, parrotEggOre, 2, 1, 128);
			addMobOres(biome, phantomEggOre, 2, 1, 128);
			addMobOres(biome, pigEggOre, 2, 1, 128);
			addMobOres(biome, polarbearEggOre, 2, 1, 128);
			addMobOres(biome, rabbitEggOre, 2, 1, 128);
			addMobOres(biome, sheepEggOre, 2, 1, 128);
			addMobOres(biome, skeletonEggOre, 2, 1, 128);
			addMobOres(biome, slimeEggOre, 2, 1, 128);
			addMobOres(biome, snowGolemEggOre, 2, 1, 128);
			addMobOres(biome, spiderEggOre, 2, 1, 128);
			addMobOres(biome, squidEggOre, 2, 1, 128);
			addMobOres(biome, strayEggOre, 2, 1, 128);
			addMobOres(biome, turtleEggOre, 2, 1, 128);
			addMobOres(biome, villagerEggOre, 2, 1, 128);
			addMobOres(biome, vindicatorEggOre, 2, 1, 128);
			addMobOres(biome, witchEggOre, 2, 1, 128);
			addMobOres(biome, witherEggOre, 2, 1, 128);
			addMobOres(biome, witherSkeletonEggOre, 2, 1, 128);
			addMobOres(biome, wolfEggOre, 2, 1, 128);
			addMobOres(biome, zombieEggOre, 2, 1, 128);
			addMobOres(biome, zombiePigmanEggOre, 2, 1, 128);

		}
	}


	private static void addMobOres(Biome biome, Block block, int size, int count, int maxHeight) {
		biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, block.getDefaultState(), size), Placement.COUNT_RANGE, new CountRangeConfig(count, 0, 0, maxHeight)));
	}

}
