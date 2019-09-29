package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.client.renderer.entity.GiantMoleRenderer;
import com.insanitycraft.insanityoverworld.client.renderer.entity.GoldenAppleCowRenderer;
import com.insanitycraft.insanityoverworld.client.renderer.entity.NytemairsRenderer;
import com.insanitycraft.insanityoverworld.entity.EntityGiantMole;
import com.insanitycraft.insanityoverworld.entity.EntityGoldenAppleCow;
import com.insanitycraft.insanityoverworld.entity.EntityNytemairs;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import static com.insanitycraft.insanityoverworld.init.InsanityItems.*;
import static com.insanitycraft.insanityoverworld.util.Reference.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(MODID)
public class InsanityEntities {

	public static EntityType<?> ENTITY_NYTEMAIRS = EntityType.Builder.create(EntityNytemairs::new, EntityClassification.MONSTER).build(MODID + ":nytemairs").setRegistryName("nytemairs");
	public static EntityType<?> ENTITY_GIANT_MOLE = EntityType.Builder.create(EntityGiantMole::new, EntityClassification.MONSTER).size(10.0F, 3.5F).build(MODID + ":giant_mole").setRegistryName("giant_mole");

	public static EntityType<?> ENTITY_APPLE_COW = EntityType.Builder.create(EntityGoldenAppleCow::new, EntityClassification.CREATURE).size(0.9F, 1.4F).build(MODID + "apple_cow").setRegistryName("apple_cow");
	public static EntityType<?> ENTITY_GOLDEN_COW = EntityType.Builder.create(EntityGoldenAppleCow::new, EntityClassification.CREATURE).size(0.9F, 1.4F).build(MODID + "golden_apple_cow").setRegistryName("golden_apple_cow");
	public static EntityType<?> ENTITY_ENCHANTED_COW = EntityType.Builder.create(EntityGoldenAppleCow::new, EntityClassification.CREATURE).size(0.9F, 1.4F).build(MODID + "enchanted_apple_cow").setRegistryName("enchanted_apple_cow");


	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityNytemairs.class, NytemairsRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityGiantMole.class, GiantMoleRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldenAppleCow.class, GoldenAppleCowRenderer::new);
	}


	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
		if(InsanityOverworld.debug)
		event.getRegistry().registerAll(

				ENTITY_NYTEMAIRS,
				ENTITY_GIANT_MOLE

		);

		event.getRegistry().registerAll(
				ENTITY_APPLE_COW,
				ENTITY_GOLDEN_COW,
				ENTITY_ENCHANTED_COW
		);

	}

	@SubscribeEvent
	public static void registerSpawnEggs(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				nytemairsSpawnEgg = registerSpawnEgg(ENTITY_NYTEMAIRS, 0x1c1001, 0x38250d, "nytemairs_spawn_egg"),
				giantMoleSpawnEgg = registerSpawnEgg(ENTITY_GIANT_MOLE, 0, 1, "giant_mole_spawn_egg"),

				appleCowEgg = registerSpawnEgg(ENTITY_APPLE_COW, 0xed1d0e, 0xed1c1c, "apple_cow_spawn_egg"),
				goldenAppleCowEgg = registerSpawnEgg(ENTITY_GOLDEN_COW, 0xed1d0e, 0xCFB53B, "golden_apple_cow_spawn_egg"),
				enchantedAppleCowEgg = registerSpawnEgg(ENTITY_ENCHANTED_COW, 0xCFB53B, 0xed1d0e, "enchanted_apple_cow_spawn_egg")

		);
	}

	private static Item registerSpawnEgg(EntityType<?> type, int color1, int color2, String name) {
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ItemGroup.MISC));
		item.setRegistryName(name);
		return item;
	}
}
