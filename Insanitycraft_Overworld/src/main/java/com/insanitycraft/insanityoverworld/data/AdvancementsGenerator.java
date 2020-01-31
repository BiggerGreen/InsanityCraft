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
import org.jline.utils.ShutdownHooks;

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
			Advancement root = Advancement.Builder.builder().withDisplay(batEggOre,
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

			Advancement batOre = getOreAdvancement(consumer, root, "bat_ore", batEggOre);
			Advancement blazeOre = getOreAdvancement(consumer, root, "blaze_ore", blazeEggOre);
			Advancement catOre = getOreAdvancement(consumer, root, "cat_ore", catEggOre);
			Advancement cavespiderOre = getOreAdvancement(consumer, root, "cavespider_ore", cavespiderEggOre);
			Advancement chickenOre = getOreAdvancement(consumer, root, "chicken_ore", chickenEggOre);
			Advancement cowOre = getOreAdvancement(consumer, root, "cow_ore", cowEggOre);
			Advancement creeperOre = getOreAdvancement(consumer, root, "creeper_ore", creeperEggOre);
			Advancement dolphinOre = getOreAdvancement(consumer, root, "dolphin_ore", dolphinEggOre);
			Advancement donkeyOre = getOreAdvancement(consumer, root, "donkey_ore", donkeyEggOre);
			Advancement drownedOre = getOreAdvancement(consumer, root, "drowned_ore", drownedEggOre);
			Advancement elderGuardianOre = getOreAdvancement(consumer, root, "elderGuardian_ore", elderGuardianEggOre);
			Advancement enderdragonOre = getOreAdvancement(consumer, root, "enderdragon_ore", enderdragonEggOre);
			Advancement endermanOre = getOreAdvancement(consumer, root, "enderman_ore", endermanEggOre);
			Advancement evokerOre = getOreAdvancement(consumer, root, "evoker_ore", evokerEggOre);
			Advancement foxOre = getOreAdvancement(consumer, root, "fox_ore", foxEggOre);
			Advancement ghastOre = getOreAdvancement(consumer, root, "ghast_ore", ghastEggOre);
			Advancement guardianOre = getOreAdvancement(consumer, root, "guardian_ore", guardianEggOre);
			Advancement horseOre = getOreAdvancement(consumer, root, "horse_ore", horseEggOre);
			Advancement huskOre = getOreAdvancement(consumer, root, "husk_ore", huskEggOre);
			Advancement ironGolemOre = getOreAdvancement(consumer, root, "ironGolem_ore", ironGolemEggOre);
			Advancement llamaOre = getOreAdvancement(consumer, root, "llama_ore", llamaEggOre);
			Advancement magmacubeOre = getOreAdvancement(consumer, root, "magmacube_ore", magmacubeEggOre);
			Advancement mooshroomOre = getOreAdvancement(consumer, root, "mooshroom_ore", mooshroomEggOre);
			Advancement ocelotOre = getOreAdvancement(consumer, root, "ocelot_ore", ocelotEggOre);
			Advancement pandabearOre = getOreAdvancement(consumer, root, "pandabear_ore", pandabearEggOre);
			Advancement parrotOre = getOreAdvancement(consumer, root, "parrot_ore", parrotEggOre);
			Advancement phantomOre = getOreAdvancement(consumer, root, "phantom_ore", phantomEggOre);
			Advancement pigOre = getOreAdvancement(consumer, root, "pig_ore", pigEggOre);
			Advancement pillagerOre = getOreAdvancement(consumer, root, "pillager_ore", pillagerEggOre);
			Advancement polarbearOre = getOreAdvancement(consumer, root, "polarbear_ore", polarbearEggOre);
			Advancement rabbitOre = getOreAdvancement(consumer, root, "rabbit_ore", rabbitEggOre);
			Advancement ravagerOre = getOreAdvancement(consumer, root, "ravager_ore", ravagerEggOre);
			Advancement sheepOre = getOreAdvancement(consumer, root, "sheep_ore", sheepEggOre);
			Advancement shulkerOre = getOreAdvancement(consumer, root, "shulker_ore", shulkerEggOre);
			Advancement skeletonOre = getOreAdvancement(consumer, root, "skeleton_ore", skeletonEggOre);
			Advancement slimeOre = getOreAdvancement(consumer, root, "slime_ore", slimeEggOre);
			Advancement snowGolemOre = getOreAdvancement(consumer, root, "snowGolem_ore", snowGolemEggOre);
			Advancement spiderOre = getOreAdvancement(consumer, root, "spider_ore", spiderEggOre);
			Advancement squidOre = getOreAdvancement(consumer, root, "squid_ore", squidEggOre);
			Advancement strayOre = getOreAdvancement(consumer, root, "stray_ore", strayEggOre);
			Advancement turtleOre = getOreAdvancement(consumer, root, "turtle_ore", turtleEggOre);
			Advancement villagerOre = getOreAdvancement(consumer, root, "villager_ore", villagerEggOre);
			Advancement vindicatorOre = getOreAdvancement(consumer, root, "vindicator_ore", vindicatorEggOre);
			Advancement witchOre = getOreAdvancement(consumer, root, "witch_ore", witchEggOre);
			Advancement witherOre = getOreAdvancement(consumer, root, "wither_ore", witherEggOre);
			Advancement witherSkeletonOre = getOreAdvancement(consumer, root, "witherSkeleton_ore", witherSkeletonEggOre);
			Advancement wolfOre = getOreAdvancement(consumer, root, "wolf_ore", wolfEggOre);
			Advancement zombieOre = getOreAdvancement(consumer, root, "zombie_ore", zombieEggOre);
			Advancement zombiePigmanOre = getOreAdvancement(consumer, root, "zombiePigman_ore", zombiePigmanEggOre);


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
