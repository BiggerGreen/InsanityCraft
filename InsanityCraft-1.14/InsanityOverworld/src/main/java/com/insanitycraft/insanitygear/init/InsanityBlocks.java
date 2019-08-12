package com.insanitycraft.insanitygear.init;

import com.insanitycraft.insanitygear.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InsanityBlocks {


	public static Block testblock;

	public static BlockItem testblockitem;

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				testblock = new Block(Block.Properties.create(Material.ANVIL)).setRegistryName(getLocation("test_block"))



		);
	}

	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(

				testblockitem = (BlockItem)new BlockItem(testblock, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(testblock.getRegistryName())


		);
	}

	private static ResourceLocation getLocation(String name) {
		return new ResourceLocation(Reference.MODID, name);
	}


}
