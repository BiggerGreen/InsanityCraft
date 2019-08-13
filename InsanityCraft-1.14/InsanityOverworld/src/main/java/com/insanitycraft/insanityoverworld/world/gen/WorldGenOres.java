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

	//TODO change the values to be more balanced

	private static final CountRangeConfig amethystConfig = new CountRangeConfig(50, 5, 0, 128);
	private static final int amethystVeinSize = 20;



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
		}
	}

}
