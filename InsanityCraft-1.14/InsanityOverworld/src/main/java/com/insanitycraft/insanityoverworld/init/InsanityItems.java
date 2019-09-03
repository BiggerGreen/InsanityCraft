package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.items.*;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import static com.insanitycraft.insanityoverworld.InsanityOverworld.*;
import static com.insanitycraft.insanityoverworld.init.InsanityMaterialStats.InsanityToolTier.*;
import static com.insanitycraft.insanityoverworld.init.InsanityMaterialStats.InsanityArmorMaterials.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Reference.MODID)
public class InsanityItems {

	static Item debug;

	//region materials
	public static Item amethyst;

	public static Item amethystPickAxe;
	public static Item amethystAxe;
	public static Item amethystShovel;
	public static Item amethystSword;

	public static Item amethystHelmet;
	public static Item amethystChestplate;
	public static Item amethystLeggings;
	public static Item amethystBoots;

	public static Item ruby;

	public static Item rubyPickAxe;
	public static Item rubyAxe;
	public static Item rubyShovel;
	public static Item rubySword;

	public static Item rubyHelmet;
	public static Item rubyChestplate;
	public static Item rubyLeggings;
	public static Item rubyBoots;


	public static Item pinkTourmaline;

	public static Item pinkTourmalinePickAxe;
	public static Item pinkTourmalineAxe;
	public static Item pinkTourmalineShovel;
	public static Item pinkTourmalineSword;

	public static Item pinkTourmalineHelmet;
	public static Item pinkTourmalineChestplate;
	public static Item pinkTourmalineLeggings;
	public static Item pinkTourmalineBoots;


	public static Item tigerEye;

	public static Item tigerEyePickAxe;
	public static Item tigerEyeAxe;
	public static Item tigerEyeShovel;
	public static Item tigerEyeSword;

	public static Item tigerEyeHelmet;
	public static Item tigerEyeChestplate;
	public static Item tigerEyeLeggings;
	public static Item tigerEyeBoots;


	public static Item titanium_ingot;
	public static Item titanium_nugget;

	public static Item uranium_ingot;
	public static Item uranium_nugget;


	public static Item ultimatePickAxe;
	public static Item ultimateAxe;
	public static Item ultimateShovel;
	public static Item ultimateSword;

	public static Item ultimateBow;

	public static Item ultimateHelmet;
	public static Item ultimateChestplate;
	public static Item ultimateLeggings;
	public static Item ultimateBoots;


	public static Item lapisPickAxe;
	public static Item lapisAxe;
	public static Item lapisShovel;
	public static Item lapisSword;

	public static Item lapisHelmet;
	public static Item lapisChestplate;
	public static Item lapisLeggings;
	public static Item lapisBoots;


	public static Item lavaCrystal;

	public static Item lavaHelmet;
	public static Item lavaChestplate;
	public static Item lavaLeggings;
	public static Item lavaBoots;


	//endregion

	public static Item battleAxe;
	public static Item bigHammer;
	public static Item mantisClaw;
	public static Item queenBattleAxe;

	public static Item zangetsu;

	//TODO find out how to do these
	//public static Item rayGun;
	//public static Item squidzookaSmall;

	//public static Item thunder; TODO find out what this does again



	//region misc
	public static Item enderdragonSpawnEgg;
	public static Item witherSpawnEgg;
	public static Item ironGolemSpawnEgg;
	public static Item snowGolemSpawnEgg;

	public static Item instaNetherPortal;

	public static Item blankRecord;

	public static Item enderDragonTooth;
	//endregion


	//region item that are not registered here
	public static Item antSpawnEgg;

	//endregion


	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		if(InsanityOverworld.debug) {
			event.getRegistry().registerAll(

					debug = new ItemDebug(new Item.Properties().group(itemGroup)).setRegistryName("debug"),

					zangetsu = new EnchantedSwordItem(ZANGETSU_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("zangetsu"),

					battleAxe = new EnchantedSwordItem(BATTLE_AXE_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("battle_axe"),
					queenBattleAxe = new EnchantedSwordItem(QUEEN_BATTLE_AXE_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("queen_battle_axe")

					);
		}

		event.getRegistry().registerAll(

				//region materials
				amethyst = new Item(new Item.Properties().group(itemGroup)).setRegistryName("amethyst"),

				amethystPickAxe = new PickaxeItem(AMETHYST_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_pickaxe"),
				amethystAxe = new AxeItem(AMETHYST_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_axe"),
				amethystShovel = new ShovelItem(AMETHYST_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_shovel"),
				amethystSword = new SwordItem(AMETHYST_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_sword"),

				amethystHelmet = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_helmet"),
				amethystChestplate = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_chestplate"),
				amethystLeggings = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_leggings"),
				amethystBoots = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_boots"),


				ruby = new Item(new Item.Properties().group(itemGroup)).setRegistryName("ruby"),

				rubyPickAxe = new PickaxeItem(RUBY_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("ruby_pickaxe"),
				rubyAxe = new AxeItem(RUBY_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("ruby_axe"),
				rubyShovel = new ShovelItem(RUBY_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("ruby_shovel"),
				rubySword = new SwordItem(RUBY_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("ruby_sword"),

				rubyHelmet = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("ruby_helmet"),
				rubyChestplate = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("ruby_chestplate"),
				rubyLeggings = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("ruby_leggings"),
				rubyBoots = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("ruby_boots"),


				pinkTourmaline = new Item(new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline"),

				pinkTourmalinePickAxe = new PickaxeItem(PINK_TOURMALINE_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_pickaxe"),
				pinkTourmalineAxe = new AxeItem(PINK_TOURMALINE_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_axe"),
				pinkTourmalineShovel = new ShovelItem(PINK_TOURMALINE_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_shovel"),
				pinkTourmalineSword = new SwordItem(PINK_TOURMALINE_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_sword"),

				pinkTourmalineHelmet = new ArmorItem(PINK_TOURMALINE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_helmet"),
				pinkTourmalineChestplate = new ArmorItem(PINK_TOURMALINE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_chestplate"),
				pinkTourmalineLeggings = new ArmorItem(PINK_TOURMALINE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_leggings"),
				pinkTourmalineBoots = new ArmorItem(PINK_TOURMALINE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_boots"),

				tigerEye = new Item(new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye"),

				tigerEyePickAxe = new PickaxeItem(TIGER_EYE_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_pickaxe"),
				tigerEyeAxe = new AxeItem(TIGER_EYE_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_axe"),
				tigerEyeShovel = new ShovelItem(TIGER_EYE_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_shovel"),
				tigerEyeSword = new SwordItem(TIGER_EYE_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_sword"),

				tigerEyeHelmet = new ArmorItem(TIGER_EYE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_helmet"),
				tigerEyeChestplate = new ArmorItem(TIGER_EYE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_chestplate"),
				tigerEyeLeggings = new ArmorItem(TIGER_EYE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_leggings"),
				tigerEyeBoots = new ArmorItem(TIGER_EYE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_boots"),

				titanium_ingot = new Item(new Item.Properties().group(itemGroup)).setRegistryName("titanium_ingot"),
				titanium_nugget = new Item(new Item.Properties().group(itemGroup)).setRegistryName("titanium_nugget"),

				uranium_ingot = new Item(new Item.Properties().group(itemGroup)).setRegistryName("uranium_ingot"),
				uranium_nugget = new Item(new Item.Properties().group(itemGroup)).setRegistryName("uranium_nugget"),

				ultimatePickAxe = new EnchantedPickaxe(ULTIMATE_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_pickaxe"),
				ultimateAxe = new EnchantedAxeItem(ULTIMATE_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_axe"),
				ultimateShovel = new EnchantedShovelItem(ULTIMATE_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_shovel"),
				ultimateSword = new EnchantedSwordItem(ULTIMATE_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_sword"),

				ultimateBow = new UltimateBowItem(new Item.Properties().group(itemGroup).maxStackSize(1).defaultMaxDamage(1000)).setRegistryName("ultimate_bow"),

				ultimateHelmet = new EnchantedArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_helmet"),
				ultimateChestplate = new EnchantedArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_chestplate"),
				ultimateLeggings = new EnchantedArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_leggings"),
				ultimateBoots = new EnchantedArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_boots"),


				lapisPickAxe = new EnchantedPickaxe(LAPIS_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("lapis_pickaxe"),
				lapisAxe = new EnchantedAxeItem(LAPIS_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("lapis_axe"),
				lapisShovel = new EnchantedShovelItem(LAPIS_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("lapis_shovel"),
				lapisSword = new EnchantedSwordItem(LAPIS_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("lapis_sword"),

				lapisHelmet = new EnchantedArmorItem(LAPIS_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("lapis_helmet"),
				lapisChestplate = new EnchantedArmorItem(LAPIS_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("lapis_chestplate"),
				lapisLeggings = new EnchantedArmorItem(LAPIS_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("lapis_leggings"),
				lapisBoots = new EnchantedArmorItem(LAPIS_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("lapis_boots"),


				lavaCrystal = new Item(new Item.Properties().group(itemGroup)).setRegistryName("lava_crystal"),

				lavaHelmet = new EnchantedArmorItem(LAVA_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("lava_helmet"),
				lavaChestplate = new EnchantedArmorItem(LAVA_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("lava_chestplate"),
				lavaLeggings = new EnchantedArmorItem(LAVA_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("lava_leggings"),
				lavaBoots = new EnchantedArmorItem(LAVA_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("lava_boots"),

				//endregion
				//region misc

				instaNetherPortal = new InstaNetherPortalItem().setRegistryName("insta_nether_portal"),

				enderdragonSpawnEgg = new SpawnEggItem(EntityType.ENDER_DRAGON, 0, 1447446, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("enderdragon_spawn_egg"),
				witherSpawnEgg = new SpawnEggItem(EntityType.WITHER, 4672845, 1315860, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("wither_spawn_egg"),
				ironGolemSpawnEgg= new SpawnEggItem(EntityType.IRON_GOLEM, 13545366, 14144467, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("iron_golem_spawn_egg"),
				snowGolemSpawnEgg = new SpawnEggItem(EntityType.SNOW_GOLEM, 15921906, 15690005, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("snow_golem_spawn_egg"),

				blankRecord = new Item(new Item.Properties().group(itemGroup)).setRegistryName("blank_record"),

				enderDragonTooth = new Item(new Item.Properties().group(itemGroup)).setRegistryName("ender_dragon_tooth")

				//endregion

				);

	}

}
