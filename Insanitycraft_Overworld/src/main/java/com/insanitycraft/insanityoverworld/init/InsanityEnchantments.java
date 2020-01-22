package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.enchantment.HappyFeetCurse;
import com.insanitycraft.insanityoverworld.enchantment.SteadyFeetEnchantment;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Reference.MODID)
public class InsanityEnchantments {

	//Enchantments
	public static Enchantment STEADYFEET;



	//Curses
	public static Enchantment HAPPYFEET;


	@SubscribeEvent
	public static void registerEnchantments(final RegistryEvent.Register<Enchantment> event) {
		if(InsanityOverworld.debug) {
			event.getRegistry().register(STEADYFEET = new SteadyFeetEnchantment());
			event.getRegistry().register(HAPPYFEET = new HappyFeetCurse());

		}


	}


}
