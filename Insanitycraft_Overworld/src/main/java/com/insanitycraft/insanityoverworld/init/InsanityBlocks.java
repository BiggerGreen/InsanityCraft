package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.block.BlockMobOre;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.MushroomBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import static net.minecraftforge.common.ToolType.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Reference.MODID)
public class InsanityBlocks {

	//region Materials
	public static Block AMETHYST_BLOCK;
	public static Block AMETHYST_ORE;
	public static Block RUBY_BLOCK;
	public static Block RUBY_ORE;
	public static Block TITANIUM_BLOCK;
	public static Block TITANIUM_ORE;
	public static Block URANIUM_BLOCK;
	public static Block URANIUM_ORE;
	public static Block PINK_TOURMALINE_BLOCK;
	public static Block PINK_TOURMALINE_ORE;
	public static Block TIGER_EYE_BLOCK;
	public static Block TIGER_EYE_ORE;
	//endregion

	//region vanilla eggs
	public static Block BAT_EGG_ORE;
	public static Block BLAZE_EGG_ORE;
	public static Block CAVE_SPIDER_EGG_ORE;
	public static Block CHICKEN_EGG_ORE;
	public static Block COW_EGG_ORE;
	public static Block CREEPER_EGG_ORE;
	public static Block DOLPHIN_EGG_ORE;
	public static Block DONKEY_EGG_ORE;
	public static Block DROWNED_EGG_ORE;
	public static Block ELDER_GUARDIAN_EGG_ORE;
	public static Block ENDER_DRAGON_EGG_ORE;
	public static Block ENDERMAN_EGG_ORE;
	public static Block EVOKER_EGG_ORE;
	public static Block GUARDIAN_EGG_ORE;
	public static Block HORSE_EGG_ORE;
	public static Block HUSK_EGG_ORE;
	public static Block IRON_GOLEM_EGG_ORE;
	public static Block LLAMA_EGG_ORE;
	public static Block MAGMA_CUBE_EGG_ORE;
	public static Block MOOSHROOM_EGG_ORE;
	public static Block OCELOT_EGG_ORE;
	public static Block PANDA_EGG_ORE;
	public static Block PARROT_EGG_ORE;
	public static Block PHANTOM_EGG_ORE;
	public static Block PIG_EGG_ORE;
	public static Block POLAR_BEAR_EGG_ORE;
	public static Block RABBIT_EGG_ORE;
	public static Block SHEEP_EGG_ORE;
	public static Block SKELETON_EGG_ORE;
	public static Block SLIME_EGG_ORE;
	public static Block SNOW_GOLEM_EGG_ORE;
	public static Block SPIDER_EGG_ORE;
	public static Block SQUID_EGG_ORE;
	public static Block STRAY_EGG_ORE;
	public static Block TURTLE_EGG_ORE;
	public static Block VILLAGER_EGG_ORE;
	public static Block VINDICATOR_EGG_ORE;
	public static Block WITCH_EGG_ORE;
	public static Block WITHER_EGG_ORE;
	public static Block WITHER_SKELETON_EGG_ORE;
	public static Block WOLF_EGG_ORE;
	public static Block ZOMBIE_EGG_ORE;
	public static Block ZOMBIE_PIGMAN_EGG_ORE;
	public static Block CAT_EGG_ORE;
	public static Block ENDERMITE_EGG_ORE;
	public static Block FOX_EGG_ORE;
	public static Block GHAST_EGG_ORE;
	public static Block PILLAGER_EGG_ORE;
	public static Block RAVAGER_EGG_ORE;
	public static Block SHULKER_EGG_ORE;


	//maybe we will add them later
	//public static Block codEggOre;
	//public static Block muleEggOre;
	//public static Block pufferfishEggOre;
	//public static Block salmonEggOre;
	//public static Block silverfishEggOre;
	//public static Block skeletonHorseEggOre;
	//public static Block traderLlamaEggOre;
	//public static Block tropicalFishEggOre;
	//public static Block vexEggOre;
	//public static Block wanderingTraderEggOre;
	//public static Block zombieHorseEggOre;
	//public static Block villagerZombieEggOre;
	//endregion

	//region misc
	public static Block ENDER_EYE_BLOCK;
	public static Block ENDER_PEARL_BLOCK;

	//endregion



	//region Not usable blocks
	public static Block appleBlock;
	public static Block goldenAppleBlock;

	//endregion

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				//region Materials
				AMETHYST_BLOCK = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(PICKAXE)).setRegistryName("amethyst_block"),
				AMETHYST_ORE = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 4.0F).harvestTool(PICKAXE)).setRegistryName("amethyst_ore"),
				RUBY_BLOCK = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(PICKAXE)).setRegistryName("ruby_block"),
				RUBY_ORE = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 4.0F).harvestTool(PICKAXE)).setRegistryName("ruby_ore"),

				TITANIUM_BLOCK = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(PICKAXE)).setRegistryName("titanium_block"),
				TITANIUM_ORE = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(8.0F, 4.0F).harvestTool(PICKAXE)).setRegistryName("titanium_ore"),
				URANIUM_BLOCK = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(PICKAXE)).setRegistryName("uranium_block"),
				URANIUM_ORE = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(8.0F, 4.0F).harvestTool(PICKAXE)).setRegistryName("uranium_ore"),

				PINK_TOURMALINE_BLOCK = new GlassBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(PICKAXE).notSolid()).setRegistryName("pink_tourmaline_block"),
				PINK_TOURMALINE_ORE = new GlassBlock(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).hardnessAndResistance(5.0F, 4.0F).harvestTool(PICKAXE).notSolid()).setRegistryName("pink_tourmaline_ore"),

				TIGER_EYE_BLOCK = new GlassBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(4.0F, 4.0F).harvestTool(PICKAXE).notSolid()).setRegistryName("tiger_eye_block"),
				TIGER_EYE_ORE = new GlassBlock(Block.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).hardnessAndResistance(5.0F, 4.0F).harvestTool(PICKAXE).notSolid()).setRegistryName("tiger_eye_ore"),
				//endregion


				//region vanilla eggs
				BAT_EGG_ORE = new BlockMobOre(getLocation("bat_ore")),
				BLAZE_EGG_ORE = new BlockMobOre(getLocation("blaze_ore")),
				CAVE_SPIDER_EGG_ORE = new BlockMobOre(getLocation("cavespider_ore")),
				CHICKEN_EGG_ORE = new BlockMobOre(getLocation("chicken_ore")),
				COW_EGG_ORE = new BlockMobOre(getLocation("cow_ore")),
				CREEPER_EGG_ORE = new BlockMobOre(getLocation("creeper_ore")),
				DOLPHIN_EGG_ORE = new BlockMobOre(getLocation("dolphin_ore")),
				DONKEY_EGG_ORE = new BlockMobOre(getLocation("donkey_ore")),
				DROWNED_EGG_ORE = new BlockMobOre(getLocation("drowned_ore")),
				ELDER_GUARDIAN_EGG_ORE = new BlockMobOre(getLocation("elder_guardian_ore")),
				ENDER_DRAGON_EGG_ORE = new BlockMobOre(getLocation("enderdragon_ore")),
				ENDERMAN_EGG_ORE = new BlockMobOre(getLocation("enderman_ore")),
				EVOKER_EGG_ORE = new BlockMobOre(getLocation("evoker_ore")),
				GUARDIAN_EGG_ORE = new BlockMobOre(getLocation("guardian_ore")),
				HORSE_EGG_ORE = new BlockMobOre(getLocation("horse_ore")),
				HUSK_EGG_ORE = new BlockMobOre(getLocation("husk_ore")),
				IRON_GOLEM_EGG_ORE = new BlockMobOre(getLocation("iron_golem_ore")),
				LLAMA_EGG_ORE = new BlockMobOre(getLocation("llama_ore")),
				MAGMA_CUBE_EGG_ORE = new BlockMobOre(getLocation("magmacube_ore")),
				MOOSHROOM_EGG_ORE = new BlockMobOre(getLocation("mooshroom_ore")),
				OCELOT_EGG_ORE = new BlockMobOre(getLocation("ocelot_ore")),
				PANDA_EGG_ORE = new BlockMobOre(getLocation("panda_ore")),
				PARROT_EGG_ORE = new BlockMobOre(getLocation("parrot_ore")),
				PHANTOM_EGG_ORE = new BlockMobOre(getLocation("phantom_ore")),
				PIG_EGG_ORE = new BlockMobOre(getLocation("pig_ore")),
				POLAR_BEAR_EGG_ORE = new BlockMobOre(getLocation("polarbear_ore")),
				RABBIT_EGG_ORE = new BlockMobOre(getLocation("rabbit_ore")),
				SHEEP_EGG_ORE = new BlockMobOre(getLocation("sheep_ore")),
				SKELETON_EGG_ORE = new BlockMobOre(getLocation("skeleton_ore")),
				SLIME_EGG_ORE = new BlockMobOre(getLocation("slime_ore")),
				SNOW_GOLEM_EGG_ORE = new BlockMobOre(getLocation("snow_golem_ore")),
				SPIDER_EGG_ORE = new BlockMobOre(getLocation("spider_ore")),
				SQUID_EGG_ORE = new BlockMobOre(getLocation("squid_ore")),
				STRAY_EGG_ORE = new BlockMobOre(getLocation("stray_ore")),
				TURTLE_EGG_ORE = new BlockMobOre(getLocation("turtle_ore")),
				VILLAGER_EGG_ORE = new BlockMobOre(getLocation("villager_ore")),
				VINDICATOR_EGG_ORE = new BlockMobOre(getLocation("vindicator_ore")),
				WITCH_EGG_ORE = new BlockMobOre(getLocation("witch_ore")),
				WITHER_EGG_ORE = new BlockMobOre(getLocation("wither_ore")),
				WITHER_SKELETON_EGG_ORE = new BlockMobOre(getLocation("wither_skeleton_ore")),
				WOLF_EGG_ORE = new BlockMobOre(getLocation("wolf_ore")),
				ZOMBIE_EGG_ORE = new BlockMobOre(getLocation("zombie_ore")),
				ZOMBIE_PIGMAN_EGG_ORE = new BlockMobOre(getLocation("zombie_pigman_ore")),

				CAT_EGG_ORE = new BlockMobOre(getLocation("cat_ore")),
				ENDERMITE_EGG_ORE = new BlockMobOre(getLocation("endermite_ore")),
				FOX_EGG_ORE = new BlockMobOre(getLocation("fox_ore")),
				GHAST_EGG_ORE = new BlockMobOre(getLocation("ghast_ore")),
				PILLAGER_EGG_ORE = new BlockMobOre(getLocation("pillager_ore")),
				RAVAGER_EGG_ORE = new BlockMobOre(getLocation("ravager_ore")),
				SHULKER_EGG_ORE = new BlockMobOre(getLocation("shulker_ore")),
				//endregion

				//region misc
				ENDER_EYE_BLOCK = new Block(Block.Properties.create(Material.DRAGON_EGG).hardnessAndResistance(2f)).setRegistryName("ender_eye_block"),
				ENDER_PEARL_BLOCK = new Block(Block.Properties.create(Material.DRAGON_EGG).hardnessAndResistance(2f)).setRegistryName("ender_pearl_block"),
				//endregion

				//region not usable blocks
				appleBlock = new MushroomBlock(Block.Properties.create(Material.AIR)).setRegistryName("apple_block"),
				goldenAppleBlock = new MushroomBlock(Block.Properties.create(Material.AIR)).setRegistryName("golden_apple_block")
				//endregion
		);

	}

	public static void setRenderLayers() {
		RenderTypeLookup.setRenderLayer(PINK_TOURMALINE_BLOCK, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(PINK_TOURMALINE_ORE, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(TIGER_EYE_BLOCK, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(TIGER_EYE_ORE, RenderType.getTranslucent());
	}

	private static ResourceLocation getLocation(String name) {
		return new ResourceLocation(Reference.MODID, name);
	}

}
