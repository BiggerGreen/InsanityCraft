package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.client.renderer.entity.AntRenderer;
import com.insanitycraft.insanityoverworld.entity.EntityAnt;
import com.insanitycraft.insanityoverworld.util.Reference;
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

	public static EntityType<?> ENTITY_ANT = EntityType.Builder.create(EntityAnt::new, EntityClassification.CREATURE).build(MODID + ":ant").setRegistryName("ant");


	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityAnt.class, AntRenderer::new);
	}


	@SubscribeEvent
	public static void registerEntitis(final RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(

				ENTITY_ANT

		);
	}

	@SubscribeEvent
	public static void registerSpawnEggs(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				antSpawnEgg = registerSpawnEgg(ENTITY_ANT, 0x1c1001, 0x38250d, "brown_ant_spawnegg")


		);
	}

	private static Item registerSpawnEgg(EntityType<?> type, int color1, int color2, String name) {
		SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(ItemGroup.MISC));
		item.setRegistryName(name);
		return item;
	}
}
