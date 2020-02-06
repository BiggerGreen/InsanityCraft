package com.insanitycraft.insanityoverworld.world.gen;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.init.InsanityConfig;
import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.registries.ForgeRegistries;

import static com.insanitycraft.insanityoverworld.init.InsanityBlocks.*;
import static net.minecraft.world.gen.GenerationStage.Decoration.*;
import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.*;

public class WorldGenOres {

	static InsanityConfig config;

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
		config = InsanityOverworld.config;

		for(Biome biome : ForgeRegistries.BIOMES.getValues()) {
			if(biome.getCategory() == Biome.Category.THEEND) {
				//END ores
				continue;
			}

			if(biome.getCategory() == Biome.Category.NETHER) {
				addOre(biome, NETHERRACK, pinkTourmalineOre, pinkTourmalineVeinSize, pinkTourmalineConfig);
				addOre(biome, NETHERRACK, tigerEyeOre, tigerEyeVeinSize, tigerEyeConfig);
				continue;
			}

			addOre(biome, NATURAL_STONE, amethystOre, amethystVeinSize, amethystConfig);
			addOre(biome, NATURAL_STONE, rubyOre, rubyVeinSize, rubyConfig);
			addOre(biome, NATURAL_STONE, titaniumOre, titaniumVeinSize, titaniumConfig);
			addOre(biome, NATURAL_STONE, uraniumOre, uraniumVeinSize, uraniumConfig);

			//region Mob Ore spawn
			if(config.shouldEggOresGenerate.get()) {
				addMobOres(biome, batEggOre, config.batOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, blazeEggOre, config.blazeOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, cavespiderEggOre, config.cavespiderOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, chickenEggOre, config.chickenOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, cowEggOre, config.cowOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, creeperEggOre, config.creeperOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, dolphinEggOre, config.dolphinOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, donkeyEggOre, config.donkeyOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, drownedEggOre, config.drownedOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, elderGuardianEggOre, config.elderGuardianOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, enderdragonEggOre, config.enderDragonOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, endermanEggOre, config.endermanOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, evokerEggOre, config.evokerOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, guardianEggOre, config.guardianOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, horseEggOre, config.horseOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, huskEggOre, config.huskOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, ironGolemEggOre, config.ironGolemOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, llamaEggOre, config.llamaOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, magmacubeEggOre, config.magmacubeOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, mooshroomEggOre, config.mooshroomOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, ocelotEggOre, config.ocelotOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, pandabearEggOre, config.pandabearOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, parrotEggOre, config.parrotOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, phantomEggOre, config.phantomOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, pigEggOre, config.pigOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, polarbearEggOre, config.polarbearOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, rabbitEggOre, config.rabbitOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, sheepEggOre, config.sheepOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, skeletonEggOre, config.skeletonOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, slimeEggOre, config.slimeOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, snowGolemEggOre, config.snowGolemOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, spiderEggOre, config.spiderOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, squidEggOre, config.squidOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, strayEggOre, config.strayOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, turtleEggOre, config.turtleOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, villagerEggOre, config.villagerOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, vindicatorEggOre, config.vindicatorOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, witchEggOre, config.witchOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, witherEggOre, config.witherOre.get(), eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, witherSkeletonEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, wolfEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, zombieEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, zombiePigmanEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, catEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, endermiteEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, foxEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, ghastEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, pillagerEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, ravagerEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);
				addMobOres(biome, shulkerEggOre, true, eggVeinSize, maxEggVeins, maxEggHeight);

				//endregion
			}
		}

	}


	private static void addMobOres(Biome biome, Block block, boolean enabled, int size, int count, int maxHeight) {
		if(enabled) {
			biome.addFeature(UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(NATURAL_STONE, block.getDefaultState(), size)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(count, 0, 0, maxHeight))));
		}
	}

	private static void addOre(Biome biome, OreFeatureConfig.FillerBlockType fillerBlockType, Block block, int size, CountRangeConfig config) {
		biome.addFeature(UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(fillerBlockType, block.getDefaultState(), size)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(config)));
	}


}
