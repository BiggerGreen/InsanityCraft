package com.insanitycraft.insanityoverworld.data;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
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


	@Override
	protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
		map.forEach((name, table) -> LootTableManager.func_227508_a_(validationtracker, name, table));
	}

	private static class BlockTables extends BlockLootTables {

		@Override
		protected void addTables() {
			//region SelfDropBlocks
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
					zombiePigmanEggOre,
					//Other
					amethystBlock,
					rubyBlock,
					titaniumBlock,
					uraniumBlock,
					pinkTourmalineBlock,
					tigerEyeBlock,
					enderEyeBlock,
					enderPearlBlock


			);
			//endregion


		}

		@Override
		protected Iterable<Block> getKnownBlocks() {
			return Lists.newArrayList(batEggOre,
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
					zombiePigmanEggOre,
					//Other
					amethystBlock,
					rubyBlock,
					titaniumBlock,
					uraniumBlock,
					pinkTourmalineBlock,
					tigerEyeBlock,
					enderEyeBlock,
					enderPearlBlock);
		}

		protected void registerDropSelfLootTable(Block... blocks) {
			for(Block block : blocks) {
				registerDropSelfLootTable(block);
			}
		}

	}

	@Override
	public String getName() {
		return "InsanityCraft Overworld Block Loot Tables";
	}
}
