package com.insanitycraft.insanityoverworld.data;

import com.google.common.collect.ImmutableList;
import com.insanitycraft.insanityoverworld.init.InsanityBlocks;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static com.insanitycraft.insanityoverworld.init.InsanityBlocks.*;

public class LootTableGenerator extends LootTableProvider {

	public LootTableGenerator(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
		return ImmutableList.of(Pair.of(BlockTables::new, LootParameterSets.BLOCK));
	}


	private static class BlockTables extends BlockLootTables {

		@Override
		protected void addTables() {
			registerDropSelfLootTable(
					//Egg ores
					batEggOre,
					blazeEggOre,
					catEggOre,
					cavespiderEggOre,
					chickenEggOre,
					cowEggOre,
					creeperEggOre,
					dolphinEggOre,
					donkeyEggOre,
					drownedEggOre,
					elderGuardianEggOre,
					enderdragonEggOre,
					endermanEggOre,
					endermiteEggOre,
					evokerEggOre,
					foxEggOre,
					ghastEggOre,
					guardianEggOre,
					horseEggOre,
					huskEggOre,
					ironGolemEggOre,
					llamaEggOre,
					magmacubeEggOre,
					mooshroomEggOre,
					ocelotEggOre,
					pandabearEggOre,
					parrotEggOre,
					phantomEggOre,
					pigEggOre,
					pillagerEggOre,
					polarbearEggOre,
					rabbitEggOre,
					ravagerEggOre,
					sheepEggOre,
					shulkerEggOre,
					skeletonEggOre,
					slimeEggOre,
					snowGolemEggOre,
					spiderEggOre,
					squidEggOre,
					strayEggOre,
					turtleEggOre,
					villagerEggOre,
					vindicatorEggOre,
					witchEggOre,
					witherEggOre,
					witherSkeletonEggOre,
					wolfEggOre,
					zombieEggOre,
					zombiePigmanEggOre

			);
		}

		@Override
		protected Iterable<Block> getKnownBlocks() {
			return super.getKnownBlocks();
		}

		protected void registerDropSelfLootTable(Block... blocks) {
			for(Block block : blocks) {
				registerDropSelfLootTable(block);
			}
		}

	}


}
