package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.items.*;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
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

	static Item DEBUG;
	static Item DEV_STICK;

	//region materials //TODO rewrite registry
	public static Item AMETHYST;
	public static Item AMETHYST_PICKAXE;
	public static Item AMETHYST_AXE;
	public static Item AMETHYST_SHOVEL;
	public static Item AMETHYST_SWORD;
	public static Item AMETHYST_HELMET;
	public static Item AMETHYST_CHESTPLATE;
	public static Item AMETHYST_LEGGINGS;
	public static Item AMETHYST_BOOTS;

	public static Item RUBY;
	public static Item RUBY_PICKAXE;
	public static Item RUBY_AXE;
	public static Item RUBY_SHOVEL;
	public static Item RUBY_SWORD;
	public static Item RUBY_HELMET;
	public static Item RUBY_CHESTPLATE;
	public static Item RUBY_LEGGINGS;
	public static Item RUBY_BOOTS;

	public static Item PINK_TOURMALINE;
	public static Item PINK_TOURMALINE_PICKAXE;
	public static Item PINK_TOURMALINE_AXE;
	public static Item PINK_TOURMALINE_SHOVEL;
	public static Item PINK_TOURMALINE_SWORD;
	public static Item PINK_TOURMALINE_HELMET;
	public static Item PINK_TOURMALINE_CHESTPLATE;
	public static Item PINK_TOURMALINE_LEGGINGS;
	public static Item PINK_TOURMALINE_BOOTS;

	public static Item TIGER_EYE;
	public static Item TIGER_EYE_PICKAXE;
	public static Item TIGER_EYE_AXE;
	public static Item TIGER_EYE_SHOVEL;
	public static Item TIGER_EYE_SWORD;
	public static Item TIGER_EYE_HELMET;
	public static Item TIGER_EYE_CHESTPLATE;
	public static Item TIGER_EYE_LEGGINGS;
	public static Item TIGER_EYE_BOOTS;

	public static Item TITANIUM_INGOT;
	public static Item TITANIUM_NUGGET;
	public static Item URANIUM_INGOT;
	public static Item URANIUM_NUGGET;
	public static Item ULTIMATE_PICKAXE;
	public static Item ULTIMATE_AXE;
	public static Item ULTIMATE_SHOVEL;
	public static Item ULTIMATE_SWORD;
	public static Item ULTIMATE_BOW;
	public static Item ULTIMATE_HELMET;
	public static Item ULTIMATE_CHESTPLATE;
	public static Item ULTIMATE_LEGGINGS;
	public static Item ULTIMATE_BOOTS;

	public static Item LAPIS_PICKAXE;
	public static Item LAPIS_AXE;
	public static Item LAPIS_SHOVEL;
	public static Item LAPIS_SWORD;
	public static Item LAPIS_HELMET;
	public static Item LAPIS_CHESTPLATE;
	public static Item LAPIS_LEGGINGS;
	public static Item LAPIS_BOOTS;

	public static Item LAVA_CRYSTAL;
	public static Item LAVA_HELMET;
	public static Item LAVA_CHESTPLATE;
	public static Item LAVA_LEGGINGS;
	public static Item LAVA_BOOTS;

	//endregion

	public static Item BATTLE_AXE;
	public static Item BIG_HAMMER;
	public static Item QUEEN_BATTLE_AXE;

	public static Item ZANGETSU_GUARD;
	public static Item ZANGETSU_BLADE;
	public static Item ZANGETSU_HANDLE;
	public static Item ZANGETSU;

	//TODO find out how to do these
	//public static Item rayGun;
	//public static Item squidzookaSmall;

	//public static Item thunder; TODO find out what this does again



	//region misc
	public static Item ENDER_DRAGON_SPAWN_EGG;
	public static Item WITHER_SPAWN_EGG;
	public static Item IRON_GOLEM_SPAWN_EGG;
	public static Item SNOW_GOLEM_SPAWN_EGG;

	public static Item INSTANT_NETHER_PORTAL;
	public static Item INSTANT_SHELTER;
	public static Item INSTANT_GARDEN;
	public static Item MINERS_DREAM;

	public static Item STAIRS_UP;
	public static Item STAIRS_DOWN;
	public static Item BRIDGE;

	public static Item STRUCTURE_TRACKER;

	//discs
	public static Item BLANK_DISC;

	//public static Item disc;

	public static Item ENDER_DRAGON_TOOTH;
	public static Item MOLE_NOSE;
	public static Item TRIFFID_GOO;
	public static Item TREX_TOOTH;
	public static Item KRAKEN_TOOTH;
	public static Item SERPENT_TONGUE;
	public static Item MANTIS_CLAW;
	public static Item SCORPION_TAIL;
	public static Item BASILISC_SCALE;
	public static Item NYTEMAIR_SCALE;
	public static Item KATTERKILLER_JAW;

	//endregion


	//region item that are not registered here
	public static Item GIANT_MOLE_SPAWN_EGG;
	public static Item TRIFFID_SPAWN_EGG;
	public static Item MOTHRA_SPAWN_EGG;
	public static Item KATTERKILLER_SPAWN_EGG;
	public static Item TREX_SPAWN_EGG;
	public static Item KRAKEN_SPAWN_EGG;
	public static Item NYTEMAIR_SPAWN_EGG;
	public static Item WATER_DRAGON_SPAWN_EGG;

	public static Item APPLE_COW_SPAWN_EGG;
	public static Item GOLDEN_APPLE_COW_SPAWN_EGG;
	public static Item ENCHANTED_APPLE_COW_SPAWN_EGG;

	public static Item GIRLFRIEND_SPAWN_EGG;

	//endregion


	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		if(InsanityOverworld.debug) {
			event.getRegistry().registerAll(

					DEBUG = new ItemDebug(new Item.Properties().group(itemGroup)).setRegistryName("debug"),
					DEV_STICK = new ItemDevStick().setRegistryName("dev_stick")
					);
		}

		event.getRegistry().registerAll(

				//region materials
				AMETHYST = new Item(new Item.Properties().group(itemGroup)).setRegistryName("amethyst"),

				AMETHYST_PICKAXE = new PickaxeItem(AMETHYST_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_pickaxe"),
				AMETHYST_AXE = new AxeItem(AMETHYST_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_axe"),
				AMETHYST_SHOVEL = new ShovelItem(AMETHYST_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_shovel"),
				AMETHYST_SWORD = new SwordItem(AMETHYST_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_sword"),

				AMETHYST_HELMET = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_helmet"),
				AMETHYST_CHESTPLATE = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_chestplate"),
				AMETHYST_LEGGINGS = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_leggings"),
				AMETHYST_BOOTS = new ArmorItem(AMETHYST_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("amethyst_boots"),


				RUBY = new Item(new Item.Properties().group(itemGroup)).setRegistryName("ruby"),

				RUBY_PICKAXE = new PickaxeItem(RUBY_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("ruby_pickaxe"),
				RUBY_AXE = new AxeItem(RUBY_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("ruby_axe"),
				RUBY_SHOVEL = new ShovelItem(RUBY_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("ruby_shovel"),
				RUBY_SWORD = new SwordItem(RUBY_TIER, 3, -1.7F, new Item.Properties().group(itemGroup)).setRegistryName("ruby_sword"),

				RUBY_HELMET = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("ruby_helmet"),
				RUBY_CHESTPLATE = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("ruby_chestplate"),
				RUBY_LEGGINGS = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("ruby_leggings"),
				RUBY_BOOTS = new ArmorItem(RUBY_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("ruby_boots"),


				PINK_TOURMALINE = new Item(new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline"),

				PINK_TOURMALINE_PICKAXE = new PickaxeItem(PINK_TOURMALINE_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_pickaxe"),
				PINK_TOURMALINE_AXE = new AxeItem(PINK_TOURMALINE_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_axe"),
				PINK_TOURMALINE_SHOVEL = new ShovelItem(PINK_TOURMALINE_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_shovel"),
				PINK_TOURMALINE_SWORD = new SwordItem(PINK_TOURMALINE_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_sword"),

				PINK_TOURMALINE_HELMET = new ArmorItem(PINK_TOURMALINE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_helmet"),
				PINK_TOURMALINE_CHESTPLATE = new ArmorItem(PINK_TOURMALINE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_chestplate"),
				PINK_TOURMALINE_LEGGINGS = new ArmorItem(PINK_TOURMALINE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_leggings"),
				PINK_TOURMALINE_BOOTS = new ArmorItem(PINK_TOURMALINE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("pink_tourmaline_boots"),

				TIGER_EYE = new Item(new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye"),

				TIGER_EYE_PICKAXE = new PickaxeItem(TIGER_EYE_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_pickaxe"),
				TIGER_EYE_AXE = new AxeItem(TIGER_EYE_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_axe"),
				TIGER_EYE_SHOVEL = new ShovelItem(TIGER_EYE_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_shovel"),
				TIGER_EYE_SWORD = new SwordItem(TIGER_EYE_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_sword"),

				TIGER_EYE_HELMET = new ArmorItem(TIGER_EYE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_helmet"),
				TIGER_EYE_CHESTPLATE = new ArmorItem(TIGER_EYE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_chestplate"),
				TIGER_EYE_LEGGINGS = new ArmorItem(TIGER_EYE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_leggings"),
				TIGER_EYE_BOOTS = new ArmorItem(TIGER_EYE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("tiger_eye_boots"),

				TITANIUM_INGOT = new Item(new Item.Properties().group(itemGroup)).setRegistryName("titanium_ingot"),
				TITANIUM_NUGGET = new Item(new Item.Properties().group(itemGroup)).setRegistryName("titanium_nugget"),

				URANIUM_INGOT = new Item(new Item.Properties().group(itemGroup)).setRegistryName("uranium_ingot"),
				URANIUM_NUGGET = new Item(new Item.Properties().group(itemGroup)).setRegistryName("uranium_nugget"),

				ULTIMATE_PICKAXE = new EnchantedPickaxe(ULTIMATE_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_pickaxe"),
				ULTIMATE_AXE = new EnchantedAxeItem(ULTIMATE_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_axe"),
				ULTIMATE_SHOVEL = new EnchantedShovelItem(ULTIMATE_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_shovel"),
				ULTIMATE_SWORD = new EnchantedSwordItem(ULTIMATE_TIER, 3, -1.3F, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_sword"),

				ULTIMATE_BOW = new UltimateBowItem(new Item.Properties().group(itemGroup).maxStackSize(1).defaultMaxDamage(1000)).setRegistryName("ultimate_bow"),

				ULTIMATE_HELMET = new EnchantedArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_helmet"),
				ULTIMATE_CHESTPLATE = new EnchantedArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_chestplate"),
				ULTIMATE_LEGGINGS = new EnchantedArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_leggings"),
				ULTIMATE_BOOTS = new EnchantedArmorItem(ULTIMATE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("ultimate_boots"),


				LAPIS_PICKAXE = new EnchantedPickaxe(LAPIS_TIER, 1, -2.8F, new Item.Properties().group(itemGroup)).setRegistryName("lapis_pickaxe"),
				LAPIS_AXE = new EnchantedAxeItem(LAPIS_TIER, 6, -3F, new Item.Properties().group(itemGroup)).setRegistryName("lapis_axe"),
				LAPIS_SHOVEL = new EnchantedShovelItem(LAPIS_TIER, 0, -3F, new Item.Properties().group(itemGroup)).setRegistryName("lapis_shovel"),
				LAPIS_SWORD = new EnchantedSwordItem(LAPIS_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("lapis_sword"),

				LAPIS_HELMET = new EnchantedArmorItem(LAPIS_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("lapis_helmet"),
				LAPIS_CHESTPLATE = new EnchantedArmorItem(LAPIS_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("lapis_chestplate"),
				LAPIS_LEGGINGS = new EnchantedArmorItem(LAPIS_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("lapis_leggings"),
				LAPIS_BOOTS = new EnchantedArmorItem(LAPIS_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("lapis_boots"),


				LAVA_CRYSTAL = new Item(new Item.Properties().group(itemGroup)).setRegistryName("lava_crystal"),

				LAVA_HELMET = new EnchantedArmorItem(LAVA_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(itemGroup)).setRegistryName("lava_helmet"),
				LAVA_CHESTPLATE = new EnchantedArmorItem(LAVA_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(itemGroup)).setRegistryName("lava_chestplate"),
				LAVA_LEGGINGS = new EnchantedArmorItem(LAVA_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(itemGroup)).setRegistryName("lava_leggings"),
				LAVA_BOOTS = new EnchantedArmorItem(LAVA_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(itemGroup)).setRegistryName("lava_boots"),

				//endregion

				ZANGETSU = new EnchantedSwordItem(ZANGETSU_TIER, 3, -2F, new Item.Properties().group(itemGroup)).setRegistryName("zangetsu"),

				ZANGETSU_BLADE = new Item(new Item.Properties().group(itemGroup)).setRegistryName("zangetsu_blade"),
				ZANGETSU_HANDLE = new Item(new Item.Properties().group(itemGroup)).setRegistryName("zangetsu_handle"),
				ZANGETSU_GUARD = new Item(new Item.Properties().group(itemGroup)).setRegistryName("zangetsu_guard"),

				//region Boss Drops

				ENDER_DRAGON_TOOTH = new Item(new Item.Properties().group(itemGroup)).setRegistryName("ender_dragon_tooth"),
				MOLE_NOSE = new Item(new Item.Properties().group(itemGroup)).setRegistryName("giant_mole_nose"),
				SERPENT_TONGUE = new Item(new Item.Properties().group(itemGroup)).setRegistryName("sea_serpent_tongue"),
				KATTERKILLER_JAW = new Item(new Item.Properties().group(itemGroup)).setRegistryName("katterkiller_jaw"),
				BASILISC_SCALE = new Item(new Item.Properties().group(itemGroup)).setRegistryName("basilisc_scale"),
				NYTEMAIR_SCALE = new Item(new Item.Properties().group(itemGroup)).setRegistryName("nytemair_scale"),
				TREX_TOOTH = new Item(new Item.Properties().group(itemGroup)).setRegistryName("trex_tooth"),
				KRAKEN_TOOTH = new Item(new Item.Properties().group(itemGroup)).setRegistryName("kraken_tooth"),
				TRIFFID_GOO = new Item(new Item.Properties().group(itemGroup)).setRegistryName("triffid_goo"),


				MANTIS_CLAW = new SpecialSwordItem(MANTIS_CLAW_TIER, 3, -2.4f, new Item.Properties().group(itemGroup)).setRegistryName("mantis_claw"),
				SCORPION_TAIL = new SpecialSwordItem(SCORPION_TAIL_TIER, 3, -2.4f, new Item.Properties().group(itemGroup)).setRegistryName("scorpion_tail"),



				//endregion



				//region misc

				INSTANT_NETHER_PORTAL = new InstaNetherPortalItem().setRegistryName("insta_nether_portal"),
				INSTANT_SHELTER = new InstaShelterItem().setRegistryName("insta_shelter"),
				INSTANT_GARDEN = new InstaGardenItem().setRegistryName("insta_garden"),
				MINERS_DREAM = new MinersDreamItem().setRegistryName("miners_dream"),

				BRIDGE = new StairItem().setRegistryName("bridge"),
				STAIRS_UP = new StairItem().setRegistryName("stairs_up"),
				STAIRS_DOWN = new StairItem().setRegistryName("stairs_down"),

				STRUCTURE_TRACKER = new TrackerItem().setRegistryName("structure_tracker"),

				ENDER_DRAGON_SPAWN_EGG = new SpawnEggItem(EntityType.ENDER_DRAGON, 0, 1447446, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("enderdragon_spawn_egg"),
				WITHER_SPAWN_EGG = new SpawnEggItem(EntityType.WITHER, 4672845, 1315860, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("wither_spawn_egg"),
				IRON_GOLEM_SPAWN_EGG = new SpawnEggItem(EntityType.IRON_GOLEM, 13545366, 14144467, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("iron_golem_spawn_egg"),
				SNOW_GOLEM_SPAWN_EGG = new SpawnEggItem(EntityType.SNOW_GOLEM, 15921906, 15690005, new Item.Properties().group(ItemGroup.MISC)).setRegistryName("snow_golem_spawn_egg"),

				BLANK_DISC = new Item(new Item.Properties().group(itemGroup)).setRegistryName("blank_disc")

				//endregion

				);

	}

}
