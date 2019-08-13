package com.insanitycraft.insanityoverworld;

import com.insanitycraft.insanityoverworld.util.ItemGroupInsanityOverworld;
import com.insanitycraft.insanityoverworld.world.gen.WorldGenOres;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.insanitycraft.insanityoverworld.util.Reference.*;

@Mod(value = MODID)
public class InsanityOverworld {

	public static ItemGroup itemGroupInsanityOverworld;

	public InsanityOverworld() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		MinecraftForge.EVENT_BUS.register(this);

		itemGroupInsanityOverworld = new ItemGroupInsanityOverworld();

	}

	private void setup(final FMLCommonSetupEvent event) {
		WorldGenOres.setupOreGen();
	}

	private void clientSetup(final FMLClientSetupEvent event) {

	}

}
