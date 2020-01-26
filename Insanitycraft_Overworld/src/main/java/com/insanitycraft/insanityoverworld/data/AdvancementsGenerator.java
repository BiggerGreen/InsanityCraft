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
		public void accept(Consumer<Advancement> advancementConsumer) {
			Advancement root = Advancement.Builder.builder().withDisplay(batEggOre,
					getTitle("root"),
					getDescription("root"),
					new ResourceLocation("textures/gui/advancements/backgrounds/stone.png"),
					FrameType.TASK,
					true/* show_toast */,
					true/* announce_to_chat */,
					false/* hidden */)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(new ItemPredicate(InsanityTags.Items.SPAWN_EGG_ORE, null, MinMaxBounds.IntBound.UNBOUNDED, MinMaxBounds.IntBound.UNBOUNDED, EnchantmentPredicate.field_226534_b_, EnchantmentPredicate.field_226534_b_, null, NBTPredicate.ANY)))
					.register(advancementConsumer, getID("root"));


			Advancement batOre = Advancement.Builder.builder().withParent(root).withDisplay(batEggOre,
					getTitle("bat_ore"),
					getDescription("bat_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(batEggOre))
					.register(advancementConsumer, getID("bat_ore"));

			Advancement blazeOre = Advancement.Builder.builder().withParent(root).withDisplay(blazeEggOre,
					getTitle("blaze_ore"),
					getDescription("blaze_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(blazeEggOre))
					.register(advancementConsumer, getID("blaze_ore"));

			Advancement catOre = Advancement.Builder.builder().withParent(root).withDisplay(catEggOre,
					getTitle("cat_ore"),
					getDescription("cat_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(catEggOre))
					.register(advancementConsumer, getID("cat_ore"));


			Advancement cavespiderOre = Advancement.Builder.builder().withParent(root).withDisplay(cavespiderEggOre,
					getTitle("cavespider_ore"),
					getDescription("cavespider_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(cavespiderEggOre))
					.register(advancementConsumer, getID("cavespider_ore"));


			Advancement chickenOre = Advancement.Builder.builder().withParent(root).withDisplay(chickenEggOre,
					getTitle("chicken_ore"),
					getDescription("chicken_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(chickenEggOre))
					.register(advancementConsumer, getID("chicken_ore"));


			Advancement cowOre = Advancement.Builder.builder().withParent(root).withDisplay(cowEggOre,
					getTitle("cow_ore"),
					getDescription("cow_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(cowEggOre))
					.register(advancementConsumer, getID("cow_ore"));

			Advancement creeperOre = Advancement.Builder.builder().withParent(root).withDisplay(creeperEggOre,
					getTitle("creeper_ore"),
					getDescription("creeper_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(creeperEggOre))
					.register(advancementConsumer, getID("creeper_ore"));

			Advancement dolphinOre = Advancement.Builder.builder().withParent(root).withDisplay(dolphinEggOre,
					getTitle("dolphin_ore"),
					getDescription("dolphin_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(dolphinEggOre))
					.register(advancementConsumer, getID("dolphin_ore"));

			Advancement donkeyOre = Advancement.Builder.builder().withParent(root).withDisplay(donkeyEggOre,
					getTitle("donkey_ore"),
					getDescription("donkey_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(donkeyEggOre))
					.register(advancementConsumer, getID("donkey_ore"));

			Advancement drownedOre = Advancement.Builder.builder().withParent(root).withDisplay(drownedEggOre,
					getTitle("drowned_ore"),
					getDescription("drowned_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(drownedEggOre))
					.register(advancementConsumer, getID("drowned_ore"));

			Advancement elderGuardianOre = Advancement.Builder.builder().withParent(root).withDisplay(elderGuardianEggOre,
					getTitle("elderGuardian_ore"),
					getDescription("elderGuardian_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(elderGuardianEggOre))
					.register(advancementConsumer, getID("elderGuardian_ore"));

			Advancement enderdragonOre = Advancement.Builder.builder().withParent(root).withDisplay(enderdragonEggOre,
					getTitle("enderdragon_ore"),
					getDescription("enderdragon_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					true)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(enderdragonEggOre))
					.register(advancementConsumer, getID("enderdragon_ore"));

			Advancement endermanOre = Advancement.Builder.builder().withParent(root).withDisplay(endermanEggOre,
					getTitle("enderman_ore"),
					getDescription("enderman_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(endermanEggOre))
					.register(advancementConsumer, getID("enderman_ore"));

			Advancement endermiteOre = Advancement.Builder.builder().withParent(root).withDisplay(endermiteEggOre,
					getTitle("endermite_ore"),
					getDescription("endermite_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(endermiteEggOre))
					.register(advancementConsumer, getID("endermite_ore"));

			Advancement evokerOre = Advancement.Builder.builder().withParent(root).withDisplay(evokerEggOre,
					getTitle("evoker_ore"),
					getDescription("evoker_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(evokerEggOre))
					.register(advancementConsumer, getID("evoker_ore"));

			Advancement foxOre = Advancement.Builder.builder().withParent(root).withDisplay(foxEggOre,
					getTitle("fox_ore"),
					getDescription("fox_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(foxEggOre))
					.register(advancementConsumer, getID("fox_ore"));

			Advancement ghastOre = Advancement.Builder.builder().withParent(root).withDisplay(ghastEggOre,
					getTitle("ghast_ore"),
					getDescription("ghast_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(ghastEggOre))
					.register(advancementConsumer, getID("ghast_ore"));

			Advancement guardianOre = Advancement.Builder.builder().withParent(root).withDisplay(guardianEggOre,
					getTitle("guardian_ore"),
					getDescription("guardian_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(guardianEggOre))
					.register(advancementConsumer, getID("guardian_ore"));

			Advancement horseOre = Advancement.Builder.builder().withParent(root).withDisplay(horseEggOre,
					getTitle("horse_ore"),
					getDescription("horse_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(horseEggOre))
					.register(advancementConsumer, getID("horse_ore"));

			Advancement huskOre = Advancement.Builder.builder().withParent(root).withDisplay(huskEggOre,
					getTitle("husk_ore"),
					getDescription("husk_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(huskEggOre))
					.register(advancementConsumer, getID("husk_ore"));

			Advancement ironGolemOre = Advancement.Builder.builder().withParent(root).withDisplay(ironGolemEggOre,
					getTitle("ironGolem_ore"),
					getDescription("ironGolem_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(ironGolemEggOre))
					.register(advancementConsumer, getID("ironGolem_ore"));

			Advancement llamaOre = Advancement.Builder.builder().withParent(root).withDisplay(llamaEggOre,
					getTitle("llama_ore"),
					getDescription("llama_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(llamaEggOre))
					.register(advancementConsumer, getID("llama_ore"));

			Advancement magmacubeOre = Advancement.Builder.builder().withParent(root).withDisplay(magmacubeEggOre,
					getTitle("magmacube_ore"),
					getDescription("magmacube_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(magmacubeEggOre))
					.register(advancementConsumer, getID("magmacube_ore"));

			Advancement mooshroomOre = Advancement.Builder.builder().withParent(root).withDisplay(mooshroomEggOre,
					getTitle("mooshroom_ore"),
					getDescription("mooshroom_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(mooshroomEggOre))
					.register(advancementConsumer, getID("mooshroom_ore"));

			Advancement ocelotOre = Advancement.Builder.builder().withParent(root).withDisplay(ocelotEggOre,
					getTitle("ocelot_ore"),
					getDescription("ocelot_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(ocelotEggOre))
					.register(advancementConsumer, getID("ocelot_ore"));

			Advancement pandabearOre = Advancement.Builder.builder().withParent(root).withDisplay(pandabearEggOre,
					getTitle("pandabear_ore"),
					getDescription("pandabear_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(pandabearEggOre))
					.register(advancementConsumer, getID("pandabear_ore"));

			Advancement parrotOre = Advancement.Builder.builder().withParent(root).withDisplay(parrotEggOre,
					getTitle("parrot_ore"),
					getDescription("parrot_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(parrotEggOre))
					.register(advancementConsumer, getID("parrot_ore"));

			Advancement phantomOre = Advancement.Builder.builder().withParent(root).withDisplay(phantomEggOre,
					getTitle("phantom_ore"),
					getDescription("phantom_ore"),
					null,
					FrameType.TASK,
					true,
					true,
					false)
					.withCriterion("get_egg_ore", InventoryChangeTrigger.Instance.forItems(phantomEggOre))
					.register(advancementConsumer, getID("phantom_ore"));


			//					TODO finish the ore advancements,
			//					pigEggOre,
			//					pillagerEggOre,
			//					polarbearEggOre,
			//					rabbitEggOre,
			//					ravagerEggOre,
			//					sheepEggOre,
			//					shulkerEggOre,
			//					skeletonEggOre,
			//					slimeEggOre,
			//					snowGolemEggOre,
			//					spiderEggOre,
			//					squidEggOre,
			//					strayEggOre,
			//					turtleEggOre,
			//					villagerEggOre,
			//					vindicatorEggOre,
			//					witchEggOre,
			//					witherEggOre,
			//					witherSkeletonEggOre,
			//					wolfEggOre,
			//					zombieEggOre,
			//					zombiePigmanEggOre,

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
