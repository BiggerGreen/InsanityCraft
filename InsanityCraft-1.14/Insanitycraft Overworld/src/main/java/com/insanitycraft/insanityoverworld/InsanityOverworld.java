package com.insanitycraft.insanityoverworld;

import com.insanitycraft.insanityoverworld.init.InsanityConfig;
import com.insanitycraft.insanityoverworld.init.InsanityDungeons;
import com.insanitycraft.insanityoverworld.init.InsanityEntities;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import com.insanitycraft.insanityoverworld.util.ItemGroupInsanityOverworld;
import com.insanitycraft.insanityoverworld.world.gen.WorldGenOres;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.Map;

import static com.insanitycraft.insanityoverworld.util.Reference.*;

@Mod(value = MODID)
public class InsanityOverworld {

	public static boolean debug;

	public static ItemGroup itemGroup;

	public static InsanityConfig config;

	public InsanityOverworld() {
		InsanityLog.info(InsanityDungeons.TEST.getName());
		InsanityLog.info(InsanityDungeons.TEST.getLocation());
		InsanityLog.info(InsanityDungeons.TEST);

		/*
		if(VERSIONTYPE.equals("@DEBUG@")) {
			debug = true;
		}else {
			debug = false;
		}
		 */

		debug = true;

		setupConfig();
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::finishLoading);
		MinecraftForge.EVENT_BUS.register(this);

		itemGroup = new ItemGroupInsanityOverworld();

	}

	private void setup(final FMLCommonSetupEvent event) {
		WorldGenOres.setupOreGen();
	}

	private void clientSetup(final FMLClientSetupEvent event) {
		InsanityEntities.registerEntityRenders();
	}

	@OnlyIn(Dist.CLIENT)
	private void finishLoading(final FMLLoadCompleteEvent event) {
		if(config.extendedPlayerModels.get()) {
			InsanityLog.info("Finish Loading");
			EntityRenderer playerRender = Minecraft.getInstance().getRenderManager().getRenderer(AbstractClientPlayerEntity.class);
			InsanityLog.info(playerRender); //TODO Find out what I need to do here
		/*if(playerRender instanceof DefaultRenderer) {
			PlayerRenderer playerRenderer = (PlayerRenderer)playerRender;
			InsanityLog.info(playerRenderer);
			playerRenderer.addLayer(new LinksHornsLayer(playerRenderer));
		}

		 */
		}
	}

	private void setupConfig() {
		ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();

		config = new InsanityConfig(configBuilder);

		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, configBuilder.build(), MODID + ".toml");
	}


	//TODO list
	//Add the other mobs
	//Animation for the mobs

	//fix ore gen




	//--name=Corrupted_Link --uuid=166d690ac70c48f59559f6b04e754c52
}
