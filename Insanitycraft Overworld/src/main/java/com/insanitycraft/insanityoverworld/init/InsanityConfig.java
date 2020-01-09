package com.insanitycraft.insanityoverworld.init;

import static net.minecraftforge.common.ForgeConfigSpec.*;

public class InsanityConfig {

	public BooleanValue playNice;

	public IntValue bridgeLength;
	public IntValue stairHeight;



	public BooleanValue extendedPlayerModels;


	public InsanityConfig(Builder builder) {
		builder.comment("General settings").push("general");

		playNice = builder.comment("Disables some of the attacks from bosses").comment("config.insanityoverworld.prop.play_nice.desc").define("play_nice", false);

		bridgeLength = builder.comment("The length of the Instant Bridge Item").translation("config.insanityoverworld.prop.bridgelength.desc").defineInRange("bridgeLength", 32, 0, 128);

		stairHeight = builder.comment("The length and height of the Instant Stair items").translation("config.insanityoverworld.prop.stairheight.desc").defineInRange("stairHeight", 32, 0, 128);

		builder.pop();

		builder.comment("Extended Player models").push("player_models");

		extendedPlayerModels = builder.comment("Enable Extended Player Models").translation("config.insanityoverworld.prop.extended_player_models.desc").define("extended_player_models", true);

		builder.pop();
	}
}
