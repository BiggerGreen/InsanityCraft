package com.insanitycraft.insanityoverworld.init;

import com.google.common.collect.Sets;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collections;
import java.util.Set;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class InsanityLootTables {

	private static final Set<ResourceLocation> LOOT_TABLES = Sets.newHashSet();
	private static final Set<ResourceLocation> READ_ONLY_LOOT_TABLES = Collections.unmodifiableSet(LOOT_TABLES);
	public static final ResourceLocation CHESTS_BASILISC_TEMPLE = register("chests/basilisc_temple");


	private static ResourceLocation register(String id) {
		return register(new ResourceLocation(Reference.MODID, id));
	}

	private static ResourceLocation register(ResourceLocation id) {
		if (LOOT_TABLES.add(id)) {
			return id;
		} else {
			throw new IllegalArgumentException(id + " is already a registered built-in loot table");
		}
	}

	public static Set<ResourceLocation> getReadOnlyLootTables() {
		return READ_ONLY_LOOT_TABLES;
	}


	@SubscribeEvent
	public static void loadloot(LootTableLoadEvent event) {
		String prefix = "minecraft:chests/";
		String name = event.getName().toString();

		if(name.startsWith(prefix)) {
			String file = name.substring(name.indexOf(prefix) + prefix.length());

			switch(file) {
				case "simple_dungeon":
				case "end_city_treasure":
					event.getTable().addPool(getInjectPool(file));
					break;
				default:
					break;
			}
		}
	}

	private static LootPool getInjectPool(String name) {
		return LootPool.builder().addEntry(getInjectEntry(name, 1)).bonusRolls(0, 1).name("insanity_inject").build();
	}

	private static LootEntry.Builder getInjectEntry(String name, int weight) {
		ResourceLocation table = new ResourceLocation(Reference.MODID, "chests/inject/" + name);
		return TableLootEntry.builder(table).weight(weight);
	}

}
