package com.insanitycraft.insanityoverworld.data;

import com.google.gson.JsonObject;
import net.minecraft.data.*;

import java.nio.file.Path;
import java.util.function.Consumer;

import static com.insanitycraft.insanityoverworld.init.InsanityBlocks.*;
import static com.insanitycraft.insanityoverworld.init.InsanityItems.*;

public class RecipeGenerator extends RecipeProvider {

	public RecipeGenerator(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		shapelessRecipes(consumer);

		eggRecipes(consumer);
	}

	private void shapelessRecipes(Consumer<IFinishedRecipe> consumer) {
		ShapelessRecipeBuilder.shapelessRecipe(AMETHYST, 9).addIngredient(amethystBlock).addCriterion("has_amethyst_block", this.hasItem(amethystBlock)).build(consumer);
		ShapelessRecipeBuilder.shapelessRecipe(amethystBlock, 1).addIngredient(AMETHYST).addCriterion("has_amethyst", this.hasItem(AMETHYST)).build(consumer);

	}

	private void eggRecipes(Consumer<IFinishedRecipe> consumer) {

	}


	@Override
	protected void saveRecipeAdvancement(DirectoryCache p_208310_1_, JsonObject p_208310_2_, Path p_208310_3_) {
		//TODO
	}

	@Override
	public String getName() {
		return "Insanitycraft Overworld Recipes";
	}
}
