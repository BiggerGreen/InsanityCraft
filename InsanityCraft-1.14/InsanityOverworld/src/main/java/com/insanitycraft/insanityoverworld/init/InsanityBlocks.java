package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.insanitycraft.insanityoverworld.InsanityOverworld.itemGroupInsanityOverworld;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InsanityBlocks {

	//Amethyst

	public static Block amethystBlock;
	public static Block amethystOre;

	public static BlockItem amethystBlockItem;
	public static BlockItem amethystOreItem;


	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				amethystBlock = new Block(Block.Properties.create(Material.IRON)).setRegistryName(getLocation("amethyst_block")),
				amethystOre = new Block(Block.Properties.create(Material.ROCK)).setRegistryName(getLocation("amethyst_ore"))



		);
	}

	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(

				amethystBlockItem = (BlockItem)new BlockItem(amethystBlock, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(amethystBlock.getRegistryName()),
				amethystOreItem = (BlockItem)new BlockItem(amethystOre, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(amethystOre.getRegistryName())


		);
	}

	private static ResourceLocation getLocation(String name) {
		return new ResourceLocation(Reference.MODID, name);
	}


}
