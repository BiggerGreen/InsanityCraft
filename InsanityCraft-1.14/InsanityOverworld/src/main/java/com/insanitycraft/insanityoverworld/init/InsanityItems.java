package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.items.*;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.insanitycraft.insanityoverworld.InsanityOverworld.*;
import static com.insanitycraft.insanityoverworld.init.InsanityMaterialStats.InsanityToolTier.*;
import static com.insanitycraft.insanityoverworld.init.InsanityMaterialStats.InsanityArmorMaterials.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InsanityItems {

	static Item debug;


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


	public static Item titanium_ingot;
	public static Item titanium_nugget;

	public static Item uranium_ingot;
	public static Item uranium_nugget;


	public static Item ultimatePickAxe;
	public static Item ultimateAxe;
	public static Item ultimateShovel;
	public static Item ultimateSword;

	public static Item ultimateHelmet;
	public static Item ultimateChestplate;
	public static Item ultimateLeggings;
	public static Item ultimateBoots;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		if(InsanityOverworld.debug) {
			event.getRegistry().register(debug = new ItemDebug(new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("debug"));
		}

		event.getRegistry().registerAll(

				amethyst = new Item(new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(getLocation("amethyst")),

				amethystPickAxe = new PickaxeItem(AMETHYST_TIER, 1, -3F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("amethyst_pickaxe"),
				amethystAxe = new AxeItem(AMETHYST_TIER, 6, -3.4F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("amethyst_axe"),
				amethystShovel = new ShovelItem(AMETHYST_TIER, 0, -3F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("amethyst_shovel"),
				amethystSword = new SwordItem(AMETHYST_TIER, 3, -2.6F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("amethyst_sword"),

				amethystHelmet = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("amethyst_helmet"),
				amethystChestplate = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("amethyst_chestplate"),
				amethystLeggings = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("amethyst_leggings"),
				amethystBoots = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("amethyst_boots"),


				ruby = new Item(new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(getLocation("ruby")),

				rubyPickAxe = new PickaxeItem(RUBY_TIER, 1, -3F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ruby_pickaxe"),
				rubyAxe = new AxeItem(RUBY_TIER, 6, -3.4F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ruby_axe"),
				rubyShovel = new ShovelItem(RUBY_TIER, 0, -3F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ruby_shovel"),
				rubySword = new SwordItem(RUBY_TIER, 3, -2.6F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ruby_sword"),

				rubyHelmet = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ruby_helmet"),
				rubyChestplate = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ruby_chestplate"),
				rubyLeggings = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ruby_leggings"),
				rubyBoots = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ruby_boots"),

				titanium_ingot = new Item(new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(getLocation("titanium_ingot")),
				titanium_nugget = new Item(new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(getLocation("titanium_nugget")),

				uranium_ingot = new Item(new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(getLocation("uranium_ingot")),
				uranium_nugget = new Item(new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName(getLocation("uranium_nugget")),

															//TODO change these stats!
				ultimatePickAxe = new UltimatePickaxeItem(ULTIMATE_TIER, 1, -3F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ultimate_pickaxe"),
				ultimateAxe = new UltimateAxeItem(ULTIMATE_TIER, 6, -3.4F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ultimate_axe"),
				ultimateShovel = new UltimateShovelItem(ULTIMATE_TIER, 0, -3F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ultimate_shovel"),
				ultimateSword = new UltimateSwordItem(ULTIMATE_TIER, 3, -2.6F, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ultimate_sword"),

				ultimateHelmet = new UltimateArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ultimate_helmet"),
				ultimateChestplate = new UltimateArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ultimate_chestplate"),
				ultimateLeggings = new UltimateArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ultimate_leggings"),
				ultimateBoots = new UltimateArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroupInsanityOverworld)).setRegistryName("ultimate_boots")

				);

	}

	private static void addEnchantment(Item item, Enchantment enchantment, int level) {
		item.getDefaultInstance().addEnchantment(enchantment, level);

	}


	private static ResourceLocation getLocation(String name) {
		return new ResourceLocation(Reference.MODID, name);
	}
}
