package com.insanitycraft.insanityoverworld.world.gen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import static com.insanitycraft.insanityoverworld.init.InsanityBlocks.*;
import static net.minecraft.world.gen.GenerationStage.Decoration.UNDERGROUND_ORES;
import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NATURAL_STONE;

public class WorldGenOres {

	private static final CountRangeConfig amethystConfig = new CountRangeConfig(8, 0, 0, 25);
	private static final int amethystVeinSize = 5;
	private static final CountRangeConfig rubyConfig = new CountRangeConfig(3, 0, 0, 20);
	private static final int rubyVeinSize = 2;
	private static final CountRangeConfig titaniumConfig = new CountRangeConfig(1, 0, 0, 5);
	private static final int titaniumVeinSize = 2;
	private static final CountRangeConfig uraniumConfig = new CountRangeConfig(1, 0, 0, 5);
	private static final int uraniumVeinSize = 2;


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

			addMobOres(biome);
			
		}
	}


	private static void addMobOres(Biome biome) {

	}

}
