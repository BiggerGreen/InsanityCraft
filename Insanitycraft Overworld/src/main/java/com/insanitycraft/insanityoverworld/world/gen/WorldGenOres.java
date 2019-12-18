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

	private static final int eggVeinSize = 3;
	private static final int maxEggVeins = 3;
	private static final int maxEggHeight = 128;

	private static final CountRangeConfig amethystConfig = new CountRangeConfig(8, 5, 5, 25);
	private static final int amethystVeinSize = 5;
	private static final CountRangeConfig rubyConfig = new CountRangeConfig(3, 5, 5, 20);
	private static final int rubyVeinSize = 4;
	private static final CountRangeConfig titaniumConfig = new CountRangeConfig(1, 5, 5, 15);
	private static final int titaniumVeinSize = 3;
	private static final CountRangeConfig uraniumConfig = new CountRangeConfig(1, 5, 5, 15);
	private static final int uraniumVeinSize = 3;

	private static final int pinkTourmalineVeinSize = 5;
	private static final CountRangeConfig pinkTourmalineConfig = new CountRangeConfig(3, 10,10, 128);

	private static final int tigerEyeVeinSize = 3;
	private static final CountRangeConfig tigerEyeConfig = new CountRangeConfig(2, 10,10, 128);


	public static void setupOreGen() {
		for(Biome biome : ForgeRegistries.BIOMES.getValues()) {
			if(biome.getCategory() == Biome.Category.THEEND) {
				//END ores
				continue;
			}
//			if(biome.getCategory() == Biome.Category.NETHER) {
//				biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NETHERRACK, pinkTourmalineOre.getDefaultState(), pinkTourmalineVeinSize), Placement.COUNT_RANGE, pinkTourmalineConfig));
//				biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NETHERRACK, tigerEyeOre.getDefaultState(), tigerEyeVeinSize), Placement.COUNT_RANGE, tigerEyeConfig));
//				continue;
//			}
//
//			biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, amethystOre.getDefaultState(), amethystVeinSize), Placement.COUNT_RANGE, amethystConfig));
//			biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, rubyOre.getDefaultState(), rubyVeinSize), Placement.COUNT_RANGE, rubyConfig));
//			biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, titaniumOre.getDefaultState(), titaniumVeinSize), Placement.COUNT_RANGE, titaniumConfig));
//			biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, uraniumOre.getDefaultState(), uraniumVeinSize), Placement.COUNT_RANGE, uraniumConfig));

			//region Mob Ore spawn
			addMobOres(biome, batEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, blazeEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, cavespiderEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, chickenEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, cowEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, creeperEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, dolphinEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, donkeyEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, drownedEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, elderGuardianEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, enderdragonEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, endermanEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, evokerEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, guardianEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, horseEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, huskEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, ironGolemEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, llamaEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, magmacubeEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, mooshroomEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, ocelotEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, pandabearEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, parrotEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, phantomEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, pigEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, polarbearEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, rabbitEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, sheepEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, skeletonEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, slimeEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, snowGolemEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, spiderEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, squidEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, strayEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, turtleEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, villagerEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, vindicatorEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, witchEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, witherEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, witherSkeletonEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, wolfEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, zombieEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, zombiePigmanEggOre, eggVeinSize, maxEggVeins, maxEggHeight);

			addMobOres(biome, catEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, endermiteEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, foxEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, ghastEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, pillagerEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, ravagerEggOre, eggVeinSize, maxEggVeins, maxEggHeight);
			addMobOres(biome, shulkerEggOre, eggVeinSize, maxEggVeins, maxEggHeight);

			//endregion
		}

	}


	private static void addMobOres(Biome biome, Block block, int size, int count, int maxHeight) {
//		biome.addFeature(UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, block.getDefaultState(), size), Placement.COUNT_RANGE, new CountRangeConfig(count, 0, 0, maxHeight)));
	}

}
