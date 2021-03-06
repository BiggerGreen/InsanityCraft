package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.client.renderer.entity.*;
import com.insanitycraft.insanityoverworld.entity.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
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

	//Zangetsu Bosses
//	public static EntityType<?> ENTITY_NYTEMAIRS = EntityType.Builder.create(NytemairsEntity::new, EntityClassification.MONSTER).build(MODID + ":nytemairs").setRegistryName("nytemairs");
	public static EntityType ENTITY_GIANT_MOLE = EntityType.Builder.create(GiantMoleEntity::new, EntityClassification.MONSTER).size(5.0F, 3.0F).build(MODID + ":giant_mole").setRegistryName("giant_mole");
//	public static EntityType<?> ENTITY_TRIFFID = EntityType.Builder.create(TriffidEntity::new, EntityClassification.MONSTER).build(MODID + ":triffid").setRegistryName("triffid");
	public static EntityType ENTITY_MOTHRA = EntityType.Builder.create(MothraEntity::new, EntityClassification.MONSTER).size(5.0F, 3.0F).build(MODID + ":mothra").setRegistryName("mothra");
//	public static EntityType<?> ENTITY_KATTERKILLER = EntityType.Builder.create(KatterkillerEntity::new, EntityClassification.MONSTER).size(8.0F, 5.0F).build(MODID + ":katterkiller").setRegistryName("katterkiller");
//	public static EntityType<?> ENTITY_TREX = EntityType.Builder.create(TrexEntity::new, EntityClassification.MONSTER).size(6.0F, 4.0F).build(MODID + ":trex").setRegistryName("trex");
//	public static EntityType<?> ENTITY_KRAKEN = EntityType.Builder.create(KrakenEntity::new, EntityClassification.MONSTER).size(3.0F, 16.5F).build(MODID + ":kraken").setRegistryName("kraken");

	public static EntityType ENTITY_WATER_DRAGON = EntityType.Builder.create(WaterDragonEntity::new, EntityClassification.WATER_CREATURE).size(5.0F, 3.2F).build(MODID + ":water_dragon").setRegistryName("water_dragon");


//	//Ambient
	public static EntityType ENTITY_APPLE_COW = EntityType.Builder.create(GoldenAppleCowEntity::new, EntityClassification.CREATURE).size(0.9F, 1.4F).build(MODID + ":apple_cow").setRegistryName("apple_cow");
	public static EntityType ENTITY_GOLDEN_COW = EntityType.Builder.create(GoldenAppleCowEntity::new, EntityClassification.CREATURE).size(0.9F, 1.4F).build(MODID + ":golden_apple_cow").setRegistryName("golden_apple_cow");
	public static EntityType ENTITY_ENCHANTED_COW = EntityType.Builder.create(GoldenAppleCowEntity::new, EntityClassification.CREATURE).size(0.9F, 1.4F).build(MODID + ":enchanted_apple_cow").setRegistryName("enchanted_apple_cow");

	//Other
	public static EntityType ENTITY_GIRLFRIEND = EntityType.Builder.create(GirlfriendEntity::new, EntityClassification.AMBIENT).build(MODID + ":girlfriend").setRegistryName("girlfriend");

	public static EntityType ENTITY_SHOE = EntityType.Builder.<ShoeEntity>create(ShoeEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).build(MODID + ":shoe").setRegistryName("shoe");


	public static void registerEntityRenders() {
//		RenderingRegistry.registerEntityRenderingHandler(NytemairsEntity.class, NytemairsRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(ENTITY_GIANT_MOLE, GiantMoleRenderer::new);
//		RenderingRegistry.registerEntityRenderingHandler(TriffidEntity.class, TriffidRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(ENTITY_MOTHRA, MothraRenderer::new);
//		RenderingRegistry.registerEntityRenderingHandler(KatterkillerEntity.class, KatterkillerRenderer::new);
//		RenderingRegistry.registerEntityRenderingHandler(TrexEntity.class, TrexRenderer::new);
//		RenderingRegistry.registerEntityRenderingHandler(KrakenEntity.class, KrakenRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(ENTITY_WATER_DRAGON, WaterDragonRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(ENTITY_APPLE_COW, GoldenAppleCowRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(ENTITY_GOLDEN_COW, GoldenAppleCowRenderer::new);
		RenderingRegistry.registerEntityRenderingHandler(ENTITY_ENCHANTED_COW, GoldenAppleCowRenderer::new);


		RenderingRegistry.registerEntityRenderingHandler(ENTITY_GIRLFRIEND, GirlfriendRenderer::new);

		RenderingRegistry.registerEntityRenderingHandler(ENTITY_SHOE, manager -> new SpriteRenderer<ShoeEntity>(manager, Minecraft.getInstance().getItemRenderer()));

	}


	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(

//				ENTITY_NYTEMAIRS,
				ENTITY_GIANT_MOLE,
//				ENTITY_TRIFFID,
				ENTITY_MOTHRA,
//				ENTITY_KATTERKILLER,
//				ENTITY_TREX,
//				ENTITY_KRAKEN


				ENTITY_WATER_DRAGON,

				ENTITY_GIRLFRIEND,

				ENTITY_SHOE,

				ENTITY_APPLE_COW,
				ENTITY_GOLDEN_COW,
				ENTITY_ENCHANTED_COW
		);

	}

	@SubscribeEvent
	public static void registerSpawnEggs(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
//				nytemairsSpawnEgg = registerSpawnEgg(ENTITY_NYTEMAIRS, 0x1c1001, 0x38250d, "nytemairs_spawn_egg"),
				GIANT_MOLE_SPAWN_EGG = registerSpawnEgg(ENTITY_GIANT_MOLE, 0, 1, "giant_mole_spawn_egg"),
//				triffidSpawnEgg = registerSpawnEgg(ENTITY_TRIFFID, 0, 1, "triffid_spawn_egg"),
				MOTHRA_SPAWN_EGG = registerSpawnEgg(ENTITY_MOTHRA, 0xe69215, 0x5c421c, "mothra_spawn_egg"),
//				katterkillerSpawnEgg = registerSpawnEgg(ENTITY_KATTERKILLER, 0xa10606, 0x2e0101, "katterkiller_spawn_egg"),
//				trexSpawnEgg = registerSpawnEgg(ENTITY_TREX, 0xa10606, 0x2e0101, "trex_spawn_egg"),
//				krakenSpawnEgg = registerSpawnEgg(ENTITY_KRAKEN, 0xa10606, 0x2e0101, "kraken_spawn_egg"),
				WATER_DRAGON_SPAWN_EGG = registerSpawnEgg(ENTITY_WATER_DRAGON, 0xa10606, 0x2e0101, "water_dragon_spawn_egg"),

				APPLE_COW_SPAWN_EGG = registerSpawnEgg(ENTITY_APPLE_COW, 0xed1d0e, 0xed1c1c, "apple_cow_spawn_egg"),
				GOLDEN_APPLE_COW_SPAWN_EGG = registerSpawnEgg(ENTITY_GOLDEN_COW, 0xed1d0e, 0xCFB53B, "golden_apple_cow_spawn_egg"),
				ENCHANTED_APPLE_COW_SPAWN_EGG = registerSpawnEgg(ENTITY_ENCHANTED_COW, 0xCFB53B, 0xed1d0e, "enchanted_apple_cow_spawn_egg"),

				GIRLFRIEND_SPAWN_EGG = registerSpawnEgg(ENTITY_GIRLFRIEND, 0, 1, "girlfriend_spawn_egg")

		);
	}

	private static Item registerSpawnEgg(EntityType<?> type, int color1, int color2, String name) {
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(InsanityOverworld.DEFAULT_GROUP));
		item.setRegistryName(name);
		return item;
	}

}
