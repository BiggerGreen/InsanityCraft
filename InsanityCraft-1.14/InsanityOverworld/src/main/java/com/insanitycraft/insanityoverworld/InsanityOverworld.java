package com.insanitycraft.insanityoverworld;

import com.insanitycraft.insanityoverworld.init.InsanityEntities;
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

	public static boolean debug;

	public static ItemGroup itemGroup;

	public InsanityOverworld() {

		/*
		if(VERSIONTYPE.equals("@DEBUG@")) {
			debug = true;
		}else {
			debug = false;
		}
		 */

		debug = true;

		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		MinecraftForge.EVENT_BUS.register(this);

		itemGroup = new ItemGroupInsanityOverworld();

	}

	private void setup(final FMLCommonSetupEvent event) {
		WorldGenOres.setupOreGen();
	}

	private void clientSetup(final FMLClientSetupEvent event) {
		InsanityEntities.registerEntityRenders();
	}



	//TODO list
	//Instant garden
	//number 1(chunk garden) won


}
