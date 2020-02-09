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
					BAT_EGG_ORE, BLAZE_EGG_ORE, CAT_EGG_ORE, CAVE_SPIDER_EGG_ORE, CHICKEN_EGG_ORE, COW_EGG_ORE, CREEPER_EGG_ORE, DOLPHIN_EGG_ORE, DONKEY_EGG_ORE, DROWNED_EGG_ORE, ELDER_GUARDIAN_EGG_ORE, ENDER_DRAGON_EGG_ORE, ENDERMAN_EGG_ORE, ENDERMITE_EGG_ORE, EVOKER_EGG_ORE, FOX_EGG_ORE, GHAST_EGG_ORE, GUARDIAN_EGG_ORE, HORSE_EGG_ORE, HUSK_EGG_ORE, IRON_GOLEM_EGG_ORE, LLAMA_EGG_ORE, MAGMA_CUBE_EGG_ORE, MOOSHROOM_EGG_ORE, OCELOT_EGG_ORE, PANDA_EGG_ORE, PARROT_EGG_ORE, PHANTOM_EGG_ORE, PIG_EGG_ORE, PILLAGER_EGG_ORE, POLAR_BEAR_EGG_ORE, RABBIT_EGG_ORE, RAVAGER_EGG_ORE, SHEEP_EGG_ORE, SHULKER_EGG_ORE, SKELETON_EGG_ORE, SLIME_EGG_ORE, SNOW_GOLEM_EGG_ORE, SPIDER_EGG_ORE, SQUID_EGG_ORE, STRAY_EGG_ORE, TURTLE_EGG_ORE, VILLAGER_EGG_ORE, VINDICATOR_EGG_ORE, WITCH_EGG_ORE, WITHER_EGG_ORE, WITHER_SKELETON_EGG_ORE, WOLF_EGG_ORE, ZOMBIE_EGG_ORE, ZOMBIE_PIGMAN_EGG_ORE,
					//Other
					AMETHYST_BLOCK, RUBY_BLOCK, TITANIUM_BLOCK, URANIUM_BLOCK, PINK_TOURMALINE_BLOCK, TIGER_EYE_BLOCK, ENDER_EYE_BLOCK, ENDER_PEARL_BLOCK


			);
			//endregion


		}

		@Override
		protected Iterable<Block> getKnownBlocks() {
			return Lists.newArrayList(BAT_EGG_ORE, BLAZE_EGG_ORE, CAT_EGG_ORE, CAVE_SPIDER_EGG_ORE, CHICKEN_EGG_ORE, COW_EGG_ORE, CREEPER_EGG_ORE, DOLPHIN_EGG_ORE, DONKEY_EGG_ORE, DROWNED_EGG_ORE, ELDER_GUARDIAN_EGG_ORE, ENDER_DRAGON_EGG_ORE, ENDERMAN_EGG_ORE, ENDERMITE_EGG_ORE, EVOKER_EGG_ORE, FOX_EGG_ORE, GHAST_EGG_ORE, GUARDIAN_EGG_ORE, HORSE_EGG_ORE, HUSK_EGG_ORE, IRON_GOLEM_EGG_ORE, LLAMA_EGG_ORE, MAGMA_CUBE_EGG_ORE, MOOSHROOM_EGG_ORE, OCELOT_EGG_ORE, PANDA_EGG_ORE, PARROT_EGG_ORE, PHANTOM_EGG_ORE, PIG_EGG_ORE, PILLAGER_EGG_ORE, POLAR_BEAR_EGG_ORE, RABBIT_EGG_ORE, RAVAGER_EGG_ORE, SHEEP_EGG_ORE, SHULKER_EGG_ORE, SKELETON_EGG_ORE, SLIME_EGG_ORE, SNOW_GOLEM_EGG_ORE, SPIDER_EGG_ORE, SQUID_EGG_ORE, STRAY_EGG_ORE, TURTLE_EGG_ORE, VILLAGER_EGG_ORE, VINDICATOR_EGG_ORE, WITCH_EGG_ORE, WITHER_EGG_ORE, WITHER_SKELETON_EGG_ORE, WOLF_EGG_ORE, ZOMBIE_EGG_ORE, ZOMBIE_PIGMAN_EGG_ORE,
					//Other
					AMETHYST_BLOCK, RUBY_BLOCK, TITANIUM_BLOCK, URANIUM_BLOCK, PINK_TOURMALINE_BLOCK, TIGER_EYE_BLOCK, ENDER_EYE_BLOCK, ENDER_PEARL_BLOCK);
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
