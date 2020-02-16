package com.insanitycraft.insanityoverworld;

import com.insanitycraft.insanityoverworld.init.*;
import com.insanitycraft.insanityoverworld.util.CalendarUtils;
import com.insanitycraft.insanityoverworld.util.ItemGroupInsanityOverworld;
import com.insanitycraft.insanityoverworld.world.gen.WorldGenOres;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.insanitycraft.insanityoverworld.util.Reference.*;

@Mod(value = MODID)
public class InsanityOverworld {

	public static boolean debug;

	public static ItemGroup DEFAULT_GROUP;
	public static ItemGroup EGG_ORE_GROUP;

	public static InsanityConfig config;

	public InsanityOverworld() {

		debug = true;

		setupConfig();
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::finishLoading);
		MinecraftForge.EVENT_BUS.register(this);

		DEFAULT_GROUP = new ItemGroupInsanityOverworld.InsanityGroup();
		EGG_ORE_GROUP = new ItemGroupInsanityOverworld.EggOreGroup();
	}

	private void setup(final FMLCommonSetupEvent event) {
		CalendarUtils.dayCheck();
		WorldGenOres.setupOreGen();
	}

	private void clientSetup(final FMLClientSetupEvent event) {
		InsanityBlocks.setRenderLayers();
		InsanityEntities.registerEntityRenders();
		InsanityContainerTypes.registerScreens();
	}

	private void finishLoading(final FMLLoadCompleteEvent event) {

	}

	private void setupConfig() {
		ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();

		config = new InsanityConfig(configBuilder);

		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, configBuilder.build(), MODID + ".toml");
	}

}
