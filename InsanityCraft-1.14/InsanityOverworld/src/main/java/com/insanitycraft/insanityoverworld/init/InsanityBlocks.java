package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.block.BlockGenericEgg;
import com.insanitycraft.insanityoverworld.block.BlockItemGenericEgg;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.insanitycraft.insanityoverworld.InsanityOverworld.itemGroup;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InsanityBlocks {


	public static Block amethystBlock;
	public static Block amethystOre;

	public static Block rubyBlock;
	public static Block rubyOre;

	public static Block titaniumBlock;
	public static Block titaniumOre;

	public static Block uraniumBlock;
	public static Block uraniumOre;

	public static BlockItem titaniumBlockItem;
	public static BlockItem titaniumOreItem;

	public static BlockItem uraniumBlockItem;
	public static BlockItem uraniumOreItem;

	public static BlockItem amethystBlockItem;
	public static BlockItem amethystOreItem;

	public static BlockItem rubyBlockItem;
	public static BlockItem rubyOreItem;


	//region eggs

	public static Block cowEggBlock;


	public static BlockItem cowEggItem;


	//endregion


	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				amethystBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("amethyst_block")),
				amethystOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("amethyst_ore")),
				rubyBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("ruby_block")),
				rubyOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("ruby_ore")),

				titaniumBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("titanium_block")),
				titaniumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(8.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("titanium_ore")),
				uraniumBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("uranium_block")),
				uraniumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(8.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("uranium_ore")),

				//region eggs
				cowEggBlock = new BlockGenericEgg(getLocation("cow_egg_ore"))


				//endregion

		);
	}

	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(

				amethystBlockItem = (BlockItem)new BlockItem(amethystBlock, new Item.Properties().group(itemGroup)).setRegistryName(amethystBlock.getRegistryName()),
				amethystOreItem = (BlockItem)new BlockItem(amethystOre, new Item.Properties().group(itemGroup)).setRegistryName(amethystOre.getRegistryName()),
				rubyBlockItem = (BlockItem)new BlockItem(rubyBlock, new Item.Properties().group(itemGroup)).setRegistryName(rubyBlock.getRegistryName()),
				rubyOreItem = (BlockItem)new BlockItem(rubyOre, new Item.Properties().group(itemGroup)).setRegistryName(rubyOre.getRegistryName()),

				titaniumBlockItem = (BlockItem)new BlockItem(titaniumBlock, new Item.Properties().group(itemGroup)).setRegistryName(titaniumBlock.getRegistryName()),
				titaniumOreItem = (BlockItem)new BlockItem(titaniumOre, new Item.Properties().group(itemGroup)).setRegistryName(titaniumOre.getRegistryName()),
				uraniumBlockItem = (BlockItem)new BlockItem(uraniumBlock, new Item.Properties().group(itemGroup)).setRegistryName(uraniumBlock.getRegistryName()),
				uraniumOreItem = (BlockItem)new BlockItem(uraniumOre, new Item.Properties().group(itemGroup)).setRegistryName(uraniumOre.getRegistryName()),

				//region eggs
				cowEggItem = new BlockItemGenericEgg(cowEggBlock)

				//endregion
		);
	}

	private static ResourceLocation getLocation(String name) {
		return new ResourceLocation(Reference.MODID, name);
	}


}
