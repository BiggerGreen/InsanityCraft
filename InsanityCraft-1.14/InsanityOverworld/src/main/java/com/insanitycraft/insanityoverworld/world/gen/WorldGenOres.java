package com.insanitycraft.insanityoverworld.world.gen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import static com.insanitycraft.insanityoverworld.init.InsanityBlocks.*;

public class WorldGenOres {

	private static final CountRangeConfig amethystConfig = new CountRangeConfig(9, 5, 0, 64);
	private static final int amethystVeinSize = 7;
	private static final CountRangeConfig rubyConfig = new CountRangeConfig(9, 5, 0, 64);
	private static final int rubyVeinSize = 7;
	private static final CountRangeConfig titaniumConfig = new CountRangeConfig(4, 5, 0, 20);
	private static final int titaniumVeinSize = 5;
	private static final CountRangeConfig uraniumConfig = new CountRangeConfig(4, 5, 0, 20);
	private static final int uraniumVeinSize = 5;



	public static void setupOreGen() {
		for(Biome biome : ForgeRegistries.BIOMES.getValues()) {
			if (  biome.getCategory() == Biome.Category.THEEND)
			{
				continue;
			}
			if (  biome.getCategory() == Biome.Category.NETHER)
			{
				continue;
			}

			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, amethystOre.getDefaultState(), amethystVeinSize), Placement.COUNT_RANGE, amethystConfig));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, rubyOre.getDefaultState(), rubyVeinSize), Placement.COUNT_RANGE, rubyConfig));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, titaniumOre.getDefaultState(), titaniumVeinSize), Placement.COUNT_RANGE, titaniumConfig));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, uraniumOre.getDefaultState(), uraniumVeinSize), Placement.COUNT_RANGE, uraniumConfig));
		}
	}

}
