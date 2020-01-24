package com.insanitycraft.insanityoverworld.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.criterion.InventoryChangeTrigger.Instance;
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

		new OreAdvancements().accept(consumer);

	}

	private static class OreAdvancements implements Consumer<Consumer<Advancement>> {

		@Override
		public void accept(Consumer<Advancement> advancementConsumer) {
			Advancement root = Advancement.Builder.builder().withDisplay(batEggOre, new TranslationTextComponent("advancements.insanityoverworld.ore.root.title", new Object[0]), new TranslationTextComponent("advancements.insanityoverworld.ore.root.description", new Object[0]), new ResourceLocation("textures/gui/advancements/backgrounds/stone.png"), FrameType.TASK, true/* show_toast */, false/* announce_to_chat */, false/* hidden */).withCriterion("get_egg_ore", Instance.forItems(new IItemProvider[]{batEggOre})).register(advancementConsumer, "insanityoverworld:ore/root");
		}
	}

}
