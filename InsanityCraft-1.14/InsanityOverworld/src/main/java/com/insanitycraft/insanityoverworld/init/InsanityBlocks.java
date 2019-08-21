package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.block.BlockMobOre;
import com.insanitycraft.insanityoverworld.block.BlockItemMobOre;
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

	//region vanilla eggs
	public static Block batEggOre;
	public static Block blazeEggOre;
	public static Block cavespiderEggOre;
	public static Block chickenEggOre;
	public static Block cowEggOre;
	public static Block creeperEggOre;
	public static Block dolphinEggOre;
	public static Block donkeyEggOre;
	public static Block drownedEggOre;
	public static Block elderGuardianEggOre;
	public static Block enderdragonEggOre;
	public static Block endermanEggOre;
	public static Block evokerEggOre;
	public static Block guardianEggOre;
	public static Block horseEggOre;
	public static Block huskEggOre;
	public static Block ironGolemEggOre;
	public static Block llamaEggOre;
	public static Block magmacubeEggOre;
	public static Block mooshroomEggOre;
	public static Block ocelotEggOre;
	public static Block pandabearEggOre;
	public static Block parrotEggOre;
	public static Block phantomEggOre;
	public static Block pigEggOre;
	public static Block polarbearEggOre;
	public static Block rabbitEggOre;
	public static Block sheepEggOre;
	public static Block skeletonEggOre;
	public static Block slimeEggOre;
	public static Block snowGolemEggOre;
	public static Block spiderEggOre;
	public static Block squidEggOre;
	public static Block strayEggOre;
	public static Block turtleEggOre;
	public static Block villagerEggOre;
	public static Block vindicatorEggOre;
	public static Block witchEggOre;
	public static Block witherEggOre;
	public static Block witherSkeletonEggOre;
	public static Block wolfEggOre;
	public static Block zombieEggOre;
	public static Block zombiePigmanEggOre;


	public static BlockItem batEggItem;
	public static BlockItem blazeEggItem;
	public static BlockItem cavespiderEggItem;
	public static BlockItem chickenEggItem;
	public static BlockItem cowEggItem;
	public static BlockItem creeperEggItem;
	public static BlockItem dolphinEggItem;
	public static BlockItem donkeyEggItem;
	public static BlockItem drownedEggItem;
	public static BlockItem elderGuardianEggItem;
	public static BlockItem enderdragonEggItem;
	public static BlockItem endermanEggItem;
	public static BlockItem evokerEggItem;
	public static BlockItem guardianEggItem;
	public static BlockItem horseEggItem;
	public static BlockItem huskEggItem;
	public static BlockItem ironGolemEggItem;
	public static BlockItem llamaEggItem;
	public static BlockItem magmacubeEggItem;
	public static BlockItem mooshroomEggItem;
	public static BlockItem ocelotEggItem;
	public static BlockItem pandabearEggItem;
	public static BlockItem parrotEggItem;
	public static BlockItem phantomEggItem;
	public static BlockItem pigEggItem;
	public static BlockItem polarbearEggItem;
	public static BlockItem rabbitEggItem;
	public static BlockItem sheepEggItem;
	public static BlockItem skeletonEggItem;
	public static BlockItem slimeEggItem;
	public static BlockItem snowGolemEggItem;
	public static BlockItem spiderEggItem;
	public static BlockItem squidEggItem;
	public static BlockItem strayEggItem;
	public static BlockItem turtleEggItem;
	public static BlockItem villagerEggItem;
	public static BlockItem vindicatorEggItem;
	public static BlockItem witchEggItem;
	public static BlockItem witherEggItem;
	public static BlockItem witherSkeletonEggItem;
	public static BlockItem wolfEggItem;
	public static BlockItem zombieEggItem;
	public static BlockItem zombiePigmanEggItem;
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

				//region vanilla eggs
				batEggOre = new BlockMobOre(getLocation("bat_ore")),
				blazeEggOre = new BlockMobOre(getLocation("blaze_ore")),
				cavespiderEggOre = new BlockMobOre(getLocation("cavespider_ore")),
				chickenEggOre = new BlockMobOre(getLocation("chicken_ore")),
				cowEggOre = new BlockMobOre(getLocation("cow_ore")),
				creeperEggOre = new BlockMobOre(getLocation("creeper_ore")),
				dolphinEggOre = new BlockMobOre(getLocation("dolphin_ore")),
				donkeyEggOre = new BlockMobOre(getLocation("donkey_ore")),
				drownedEggOre = new BlockMobOre(getLocation("drowned_ore")),
				elderGuardianEggOre = new BlockMobOre(getLocation("elder_guardian_ore")),
				enderdragonEggOre = new BlockMobOre(getLocation("enderdragon_ore")),
				endermanEggOre = new BlockMobOre(getLocation("enderman_ore")),
				evokerEggOre = new BlockMobOre(getLocation("evoker_ore")),
				guardianEggOre = new BlockMobOre(getLocation("guardian_ore")),
				horseEggOre = new BlockMobOre(getLocation("horse_ore")),
				huskEggOre = new BlockMobOre(getLocation("husk_ore")),
				ironGolemEggOre = new BlockMobOre(getLocation("iron_golem_ore")),
				llamaEggOre = new BlockMobOre(getLocation("llama_ore")),
				magmacubeEggOre = new BlockMobOre(getLocation("magmacube_ore")),
				mooshroomEggOre = new BlockMobOre(getLocation("mooshroom_ore")),
				ocelotEggOre = new BlockMobOre(getLocation("ocelot_ore")),
				pandabearEggOre = new BlockMobOre(getLocation("pandabear_ore")),
				parrotEggOre = new BlockMobOre(getLocation("parrot_ore")),
				phantomEggOre = new BlockMobOre(getLocation("phantom_ore")),
				pigEggOre = new BlockMobOre(getLocation("pig_ore")),
				polarbearEggOre = new BlockMobOre(getLocation("polarbear_ore")),
				rabbitEggOre = new BlockMobOre(getLocation("rabbit_ore")),
				sheepEggOre = new BlockMobOre(getLocation("sheep_ore")),
				skeletonEggOre = new BlockMobOre(getLocation("skeleton_ore")),
				slimeEggOre = new BlockMobOre(getLocation("slime_ore")),
				snowGolemEggOre = new BlockMobOre(getLocation("snow_golem_ore")),
				spiderEggOre = new BlockMobOre(getLocation("spider_ore")),
				squidEggOre = new BlockMobOre(getLocation("squid_ore")),
				strayEggOre = new BlockMobOre(getLocation("stray_ore")),
				turtleEggOre = new BlockMobOre(getLocation("turtle_ore")),
				villagerEggOre = new BlockMobOre(getLocation("villager_ore")),
				vindicatorEggOre = new BlockMobOre(getLocation("vindicator_ore")),
				witchEggOre = new BlockMobOre(getLocation("witch_ore")),
				witherEggOre = new BlockMobOre(getLocation("wither_ore")),
				witherSkeletonEggOre = new BlockMobOre(getLocation("wither_skeleton_ore")),
				wolfEggOre = new BlockMobOre(getLocation("wolf_ore")),
				zombieEggOre = new BlockMobOre(getLocation("zombie_ore")),
				zombiePigmanEggOre = new BlockMobOre(getLocation("zombie_pigman_ore"))


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

				//region vanilla eggs
				batEggItem = new BlockItemMobOre(batEggOre),
				blazeEggItem = new BlockItemMobOre(blazeEggOre),
				cavespiderEggItem = new BlockItemMobOre(cavespiderEggOre),
				chickenEggItem = new BlockItemMobOre(chickenEggOre),
				cowEggItem = new BlockItemMobOre(cowEggOre),
				creeperEggItem = new BlockItemMobOre(creeperEggOre),
				dolphinEggItem = new BlockItemMobOre(dolphinEggOre),
				donkeyEggItem = new BlockItemMobOre(donkeyEggOre),
				drownedEggItem = new BlockItemMobOre(drownedEggOre),
				elderGuardianEggItem = new BlockItemMobOre(elderGuardianEggOre),
				enderdragonEggItem = new BlockItemMobOre(enderdragonEggOre),
				endermanEggItem = new BlockItemMobOre(endermanEggOre),
				evokerEggItem = new BlockItemMobOre(evokerEggOre),
				guardianEggItem = new BlockItemMobOre(guardianEggOre),
				horseEggItem = new BlockItemMobOre(horseEggOre),
				huskEggItem = new BlockItemMobOre(huskEggOre),
				ironGolemEggItem = new BlockItemMobOre(ironGolemEggOre),
				llamaEggItem = new BlockItemMobOre(llamaEggOre),
				magmacubeEggItem = new BlockItemMobOre(magmacubeEggOre),
				mooshroomEggItem = new BlockItemMobOre(mooshroomEggOre),
				ocelotEggItem = new BlockItemMobOre(ocelotEggOre),
				pandabearEggItem = new BlockItemMobOre(pandabearEggOre),
				parrotEggItem = new BlockItemMobOre(parrotEggOre),
				phantomEggItem = new BlockItemMobOre(phantomEggOre),
				pigEggItem = new BlockItemMobOre(pigEggOre),
				polarbearEggItem = new BlockItemMobOre(polarbearEggOre),
				rabbitEggItem = new BlockItemMobOre(rabbitEggOre),
				sheepEggItem = new BlockItemMobOre(sheepEggOre),
				skeletonEggItem = new BlockItemMobOre(skeletonEggOre),
				slimeEggItem = new BlockItemMobOre(slimeEggOre),
				snowGolemEggItem = new BlockItemMobOre(snowGolemEggOre),
				spiderEggItem = new BlockItemMobOre(spiderEggOre),
				squidEggItem = new BlockItemMobOre(squidEggOre),
				strayEggItem = new BlockItemMobOre(strayEggOre),
				turtleEggItem = new BlockItemMobOre(turtleEggOre),
				villagerEggItem = new BlockItemMobOre(villagerEggOre),
				vindicatorEggItem = new BlockItemMobOre(vindicatorEggOre),
				witchEggItem = new BlockItemMobOre(witchEggOre),
				witherEggItem = new BlockItemMobOre(witherEggOre),
				witherSkeletonEggItem = new BlockItemMobOre(witherSkeletonEggOre),
				wolfEggItem = new BlockItemMobOre(wolfEggOre),
				zombieEggItem = new BlockItemMobOre(zombieEggOre),
				zombiePigmanEggItem = new BlockItemMobOre(zombiePigmanEggOre)
				//endregion
		);
	}

	private static ResourceLocation getLocation(String name) {
		return new ResourceLocation(Reference.MODID, name);
	}


}
