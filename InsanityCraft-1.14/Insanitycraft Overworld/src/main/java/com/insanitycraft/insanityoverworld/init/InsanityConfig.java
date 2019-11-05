package com.insanitycraft.insanityoverworld.init;

import static net.minecraftforge.common.ForgeConfigSpec.*;

public class InsanityConfig {

	public IntValue testInt;

	public BooleanValue extendedPlayerModels;


	public InsanityConfig(Builder builder) {
		builder.comment("General settings").push("general");

		testInt = builder.comment("Test").translation("config.insanityoverworld.prop.test.desc").defineInRange("test", 2, 0, 5);

		builder.pop();

		builder.comment("Extended Player models").push("player_models");

		extendedPlayerModels = builder.comment("Enable Extended Player Models").translation("config.insanityoverworld.prop.extended_player_models.desc").define("extended_player_models", true);

		builder.pop();
	}
}
