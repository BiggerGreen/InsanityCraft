package com.insanitycraft.insanityoverworld.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator dataGenerator = event.getGenerator();

		if(event.includeServer()) {
			dataGenerator.addProvider(new LootTableGenerator(dataGenerator));
			dataGenerator.addProvider(new AdvancementsGenerator(dataGenerator));
			dataGenerator.addProvider(new TagGenerator.BlockTagGenerator(dataGenerator));
			dataGenerator.addProvider(new TagGenerator.ItemTagGenerator(dataGenerator));
		}

	}


}
