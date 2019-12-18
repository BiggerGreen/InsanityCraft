package com.insanitycraft.insanityoverworld.init;

import com.google.common.collect.ImmutableSet;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.village.PointOfInterestType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Set;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Reference.MODID)
public class InsanityVillagers {


	public static PointOfInterestType TEST_POINT;
	public static VillagerProfession TEST_PROFESSION;
/*
	@SubscribeEvent
	public static void registerPointOfInterestTypes(final IForgeRegistry<PointOfInterestType> registry) {
		registry.registerAll(TEST_POINT = new PointOfInterestType("test_point", getAllStates(InsanityBlocks.debugBlock), 1, null, 1).setRegistryName("test_point"));
	}

	@SubscribeEvent
	public static void registerVillagerProfessions(IForgeRegistry<VillagerProfession> registry) {
		registry.registerAll(TEST_PROFESSION = new VillagerProfession("test_profession", TEST_POINT, ImmutableSet.of(), ImmutableSet.of()).setRegistryName("test_profession"));
	}




	private static Set<BlockState> getAllStates(Block block) {
		return ImmutableSet.copyOf(block.getStateContainer().getValidStates());
	}

 */
}
