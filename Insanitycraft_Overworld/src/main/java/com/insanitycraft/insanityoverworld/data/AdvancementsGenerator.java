package com.insanitycraft.insanityoverworld.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.insanitycraft.insanityoverworld.init.InsanityTags;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.criterion.*;
import net.minecraft.data.AdvancementProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Consumer;

import static com.insanitycraft.insanityoverworld.init.InsanityBlocks.*;

public class AdvancementsGenerator extends AdvancementProvider {

	private final DataGenerator generator;
	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();


	public AdvancementsGenerator(DataGenerator generator) {
		super(generator);
		this.generator = generator;
	}

	@Override
	public void act(DirectoryCache cache) throws IOException {
		Path outputFolder = generator.getOutputFolder();

		Consumer<Advancement> consumer = (advancement -> {
			Path path = outputFolder.resolve("data/" + advancement.getId().getNamespace() + "/advancements/" + advancement.getId().getPath() + ".json");
			try {
				IDataProvider.save(GSON, cache, advancement.copy().serialize(), path);
				InsanityLog.debug("Creating advancement " + advancement.getId());
			}catch(IOException e) {
				InsanityLog.error("Error while saving advancement {}", path, e);
			}
		});

		new EggOreAdvancements().accept(consumer);

	}

	@Override
	public String getName() {
		return "Insanitycraft Overworld Advancements";
	}

	private static class EggOreAdvancements implements Consumer<Consumer<Advancement>> {

		@Override
		public void accept(Consumer<Advancement> consumer) {
			Advancement root = Advancement.Builder.builder().withDisplay(BAT_EGG_ORE,
					getTitle("root"),
					getDescription("root"),
					new ResourceLocation("textures/gui/advancements/backgrounds/stone.png"),
					FrameType.TASK,
					true/* show_toast */,
					true/* announce_to_chat */,
					false/* hidden */)
					.withCriterion("get_egg_ore",
							InventoryChangeTrigger.Instance.forItems(new ItemPredicate(InsanityTags.Items.SPAWN_EGG_ORE,
									null,
									MinMaxBounds.IntBound.UNBOUNDED,
									MinMaxBounds.IntBound.UNBOUNDED,
									EnchantmentPredicate.field_226534_b_,
									EnchantmentPredicate.field_226534_b_,
									null,
									NBTPredicate.ANY)))
					.register(consumer, getID("root"));

			Advancement batOre = getOreAdvancement(consumer, root, "bat_ore", BAT_EGG_ORE);
			Advancement blazeOre = getOreAdvancement(consumer, root, "blaze_ore", BLAZE_EGG_ORE);
			Advancement catOre = getOreAdvancement(consumer, root, "cat_ore", CAT_EGG_ORE);
			Advancement cavespiderOre = getOreAdvancement(consumer, root, "cavespider_ore", CAVE_SPIDER_EGG_ORE);
			Advancement chickenOre = getOreAdvancement(consumer, root, "chicken_ore", CHICKEN_EGG_ORE);
			Advancement cowOre = getOreAdvancement(consumer, root, "cow_ore", COW_EGG_ORE);
			Advancement creeperOre = getOreAdvancement(consumer, root, "creeper_ore", CREEPER_EGG_ORE);
			Advancement dolphinOre = getOreAdvancement(consumer, root, "dolphin_ore", DOLPHIN_EGG_ORE);
			Advancement donkeyOre = getOreAdvancement(consumer, root, "donkey_ore", DONKEY_EGG_ORE);
			Advancement drownedOre = getOreAdvancement(consumer, root, "drowned_ore", DROWNED_EGG_ORE);
			Advancement elderGuardianOre = getOreAdvancement(consumer, root, "elderGuardian_ore", ELDER_GUARDIAN_EGG_ORE);
			Advancement enderdragonOre = getOreAdvancement(consumer, root, "enderdragon_ore", ENDER_DRAGON_EGG_ORE);
			Advancement endermanOre = getOreAdvancement(consumer, root, "enderman_ore", ENDERMAN_EGG_ORE);
			Advancement evokerOre = getOreAdvancement(consumer, root, "evoker_ore", EVOKER_EGG_ORE);
			Advancement foxOre = getOreAdvancement(consumer, root, "fox_ore", FOX_EGG_ORE);
			Advancement ghastOre = getOreAdvancement(consumer, root, "ghast_ore", GHAST_EGG_ORE);
			Advancement guardianOre = getOreAdvancement(consumer, root, "guardian_ore", GUARDIAN_EGG_ORE);
			Advancement horseOre = getOreAdvancement(consumer, root, "horse_ore", HORSE_EGG_ORE);
			Advancement huskOre = getOreAdvancement(consumer, root, "husk_ore", HUSK_EGG_ORE);
			Advancement ironGolemOre = getOreAdvancement(consumer, root, "ironGolem_ore", IRON_GOLEM_EGG_ORE);
			Advancement llamaOre = getOreAdvancement(consumer, root, "llama_ore", LLAMA_EGG_ORE);
			Advancement magmacubeOre = getOreAdvancement(consumer, root, "magmacube_ore", MAGMA_CUBE_EGG_ORE);
			Advancement mooshroomOre = getOreAdvancement(consumer, root, "mooshroom_ore", MOOSHROOM_EGG_ORE);
			Advancement ocelotOre = getOreAdvancement(consumer, root, "ocelot_ore", OCELOT_EGG_ORE);
			Advancement pandabearOre = getOreAdvancement(consumer, root, "panda_ore", PANDA_EGG_ORE);
			Advancement parrotOre = getOreAdvancement(consumer, root, "parrot_ore", PARROT_EGG_ORE);
			Advancement phantomOre = getOreAdvancement(consumer, root, "phantom_ore", PHANTOM_EGG_ORE);
			Advancement pigOre = getOreAdvancement(consumer, root, "pig_ore", PIG_EGG_ORE);
			Advancement pillagerOre = getOreAdvancement(consumer, root, "pillager_ore", PILLAGER_EGG_ORE);
			Advancement polarbearOre = getOreAdvancement(consumer, root, "polarbear_ore", POLAR_BEAR_EGG_ORE);
			Advancement rabbitOre = getOreAdvancement(consumer, root, "rabbit_ore", RABBIT_EGG_ORE);
			Advancement ravagerOre = getOreAdvancement(consumer, root, "ravager_ore", RAVAGER_EGG_ORE);
			Advancement sheepOre = getOreAdvancement(consumer, root, "sheep_ore", SHEEP_EGG_ORE);
			Advancement shulkerOre = getOreAdvancement(consumer, root, "shulker_ore", SHULKER_EGG_ORE);
			Advancement skeletonOre = getOreAdvancement(consumer, root, "skeleton_ore", SKELETON_EGG_ORE);
			Advancement slimeOre = getOreAdvancement(consumer, root, "slime_ore", SLIME_EGG_ORE);
			Advancement snowGolemOre = getOreAdvancement(consumer, root, "snowGolem_ore", SNOW_GOLEM_EGG_ORE);
			Advancement spiderOre = getOreAdvancement(consumer, root, "spider_ore", SPIDER_EGG_ORE);
			Advancement squidOre = getOreAdvancement(consumer, root, "squid_ore", SQUID_EGG_ORE);
			Advancement strayOre = getOreAdvancement(consumer, root, "stray_ore", STRAY_EGG_ORE);
			Advancement turtleOre = getOreAdvancement(consumer, root, "turtle_ore", TURTLE_EGG_ORE);
			Advancement villagerOre = getOreAdvancement(consumer, root, "villager_ore", VILLAGER_EGG_ORE);
			Advancement vindicatorOre = getOreAdvancement(consumer, root, "vindicator_ore", VINDICATOR_EGG_ORE);
			Advancement witchOre = getOreAdvancement(consumer, root, "witch_ore", WITCH_EGG_ORE);
			Advancement witherOre = getOreAdvancement(consumer, root, "wither_ore", WITHER_EGG_ORE);
			Advancement witherSkeletonOre = getOreAdvancement(consumer, root, "witherSkeleton_ore", WITHER_SKELETON_EGG_ORE);
			Advancement wolfOre = getOreAdvancement(consumer, root, "wolf_ore", WOLF_EGG_ORE);
			Advancement zombieOre = getOreAdvancement(consumer, root, "zombie_ore", ZOMBIE_EGG_ORE);
			Advancement zombiePigmanOre = getOreAdvancement(consumer, root, "zombiePigman_ore", ZOMBIE_PIGMAN_EGG_ORE);


		}

		private Advancement getOreAdvancement(Consumer<Advancement> advancementConsumer, Advancement parent, String name, IItemProvider item) {

			return Advancement.Builder.builder().withParent(parent).withDisplay(item,
					getTitle(name),
					getDescription(name),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore",
							InventoryChangeTrigger.Instance.forItems(item))
					.register(advancementConsumer, getID(name));

		}

		private TranslationTextComponent getTitle(String name) {
			return new TranslationTextComponent("advancements.insanityoverworld.egg_ore." + name.toLowerCase() + ".title");
		}

		private TranslationTextComponent getDescription(String name) {
			return new TranslationTextComponent("advancements.insanityoverworld.egg_ore." + name.toLowerCase() + ".description");
		}

		private String getID(String name) {
			return "insanityoverworld:egg_ore/" + name.toLowerCase();
		}

	}

	private static class AdventureAdvancements implements Consumer<Consumer<Advancement>> {

		@Override
		public void accept(Consumer<Advancement> advancementConsumer) {

		}
	}


}
