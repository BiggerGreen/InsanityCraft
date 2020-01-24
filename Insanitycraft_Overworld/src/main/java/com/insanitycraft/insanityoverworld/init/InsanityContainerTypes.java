package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.client.gui.screen.TrackerScreen;
import com.insanitycraft.insanityoverworld.inventory.container.TrackerContainer;
import net.minecraft.client.gui.IHasContainer;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InsanityContainerTypes {

	public static final ContainerType<TrackerContainer> TRACKER = new ContainerType<>(TrackerContainer::new);


	@SubscribeEvent
	public static void registerContainers(final RegistryEvent.Register<ContainerType<?>> event) {
		event.getRegistry().registerAll(
				TRACKER.setRegistryName("tracker")
		);

	}

	public static void registerScreens() {
		registerScreen(TRACKER, TrackerScreen::new);
	}



	private static <S extends Screen & IHasContainer<C>, C extends Container> void registerScreen(ContainerType<C> type, ScreenManager.IScreenFactory<C, S> factory) {

		ScreenManager.registerFactory(type, factory);
	}


}
