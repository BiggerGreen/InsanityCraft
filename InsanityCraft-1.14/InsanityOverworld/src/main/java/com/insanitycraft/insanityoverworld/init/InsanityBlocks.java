package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.insanitycraft.insanityoverworld.InsanityOverworld.itemGroupInsanityOverworld;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InsanityBlocks {

	//Amethyst

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


	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				amethystBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("amethyst_block")),
				amethystOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(10.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("amethyst_ore")),
				rubyBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("ruby_block")),
				rubyOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(10.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("ruby_ore")),

				titaniumBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("titanium_block")),
				titaniumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(10.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("titanium_ore")),
				uraniumBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("uranium_block")),
				uraniumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(10.0F, 4.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(getLocation("uranium_ore"))



		);
	}

	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(

				amethystBlockItem = (BlockItem)new BlockItem(amethystBlock, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(amethystBlock.getRegistryName()),
				amethystOreItem = (BlockItem)new BlockItem(amethystOre, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(amethystOre.getRegistryName()),
				rubyBlockItem = (BlockItem)new BlockItem(rubyBlock, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(rubyBlock.getRegistryName()),
				rubyOreItem = (BlockItem)new BlockItem(rubyOre, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(rubyOre.getRegistryName()),

				titaniumBlockItem = (BlockItem)new BlockItem(titaniumBlock, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(titaniumBlock.getRegistryName()),
				titaniumOreItem = (BlockItem)new BlockItem(titaniumOre, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(titaniumOre.getRegistryName()),
				uraniumBlockItem = (BlockItem)new BlockItem(titaniumBlock, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(uraniumBlock.getRegistryName()),
				uraniumOreItem = (BlockItem)new BlockItem(titaniumOre, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(uraniumOre.getRegistryName())


		);
	}

	private static ResourceLocation getLocation(String name) {
		return new ResourceLocation(Reference.MODID, name);
	}


}
