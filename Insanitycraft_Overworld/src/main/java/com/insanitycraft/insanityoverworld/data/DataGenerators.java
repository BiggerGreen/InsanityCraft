package com.insanitycraft.insanityoverworld.data;

import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();
		InsanityLog.info(event.getGenerator().getOutputFolder());

		dataGenerator.addProvider(new LootTableGenerator(dataGenerator));


	}


}
