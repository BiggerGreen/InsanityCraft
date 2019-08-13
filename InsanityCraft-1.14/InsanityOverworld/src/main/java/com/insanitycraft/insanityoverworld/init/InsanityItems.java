package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.insanitycraft.insanityoverworld.init.InsanityMaterialStats.InsanityToolTier.*;
import static com.insanitycraft.insanityoverworld.init.InsanityMaterialStats.InsanityArmorMaterials.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InsanityItems {

	//Amethyst
	public static Item amethyst;

	public static Item amethystPickAxe;
	public static Item amethystAxe;
	public static Item amethystShovel;
	//public static Item amethystHoe; I don't know if we will add a hoe. Link
	public static Item amethystSword;

	public static Item amethystHelmet;
	public static Item amethystChestplate;
	public static Item amethystLeggings;
	public static Item amethystBoots;


	//Ruby
	public static Item ruby;

	public static Item rubyPickAxe;
	public static Item rubyAxe;
	public static Item rubyShovel;
	//public static Item rubyHoe;
	public static Item rubySword;

	public static Item rubyHelmet;
	public static Item rubyChestplate;
	public static Item rubyLeggings;
	public static Item rubyBoots;


	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(

				amethyst = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(getLocation("amethyst")),

				amethystPickAxe = new PickaxeItem(AMETHYST_TIER, 1, -3F, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("amethyst_pickaxe"),
				amethystAxe = new AxeItem(AMETHYST_TIER, 6, -3.4F, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("amethyst_axe"),
				amethystShovel = new ShovelItem(AMETHYST_TIER, 0, -3F, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("amethyst_shovel"),
				//amethystHoe = new HoeItem(AMETHYST_TIER, 0, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("amethyst_hoe"),
				amethystSword = new SwordItem(AMETHYST_TIER, 3, -2.6F, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("amethyst_sword"),

				amethystHelmet = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("amethyst_helmet"),
				amethystChestplate = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("amethyst_chestplate"),
				amethystLeggings = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("amethyst_leggings"),
				amethystBoots = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("amethyst_boots"),


				ruby = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(getLocation("ruby")),

				rubyPickAxe = new PickaxeItem(RUBY_TIER, 1, -3F, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ruby_pickaxe"),
				rubyAxe = new AxeItem(RUBY_TIER, 6, -3.4F, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ruby_axe"),
				rubyShovel = new ShovelItem(RUBY_TIER, 0, -3F, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ruby_shovel"),
				//rubyHoe = new HoeItem(RUBY_TIER, 0, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ruby_hoe"),
				rubySword = new SwordItem(RUBY_TIER, 3, -2.6F, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ruby_sword"),

				rubyHelmet = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ruby_helmet"),
				rubyChestplate = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ruby_chestplate"),
				rubyLeggings = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ruby_leggings"),
				rubyBoots = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("ruby_boots")


		);


	}

	private static ResourceLocation getLocation(String name) {
		return new ResourceLocation(Reference.MODID, name);
	}
}
