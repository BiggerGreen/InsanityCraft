package com.insanitycraft.insanityoverworld.init;

import static net.minecraftforge.common.ForgeConfigSpec.*;

public class InsanityConfig {

	public IntValue testInt;

	public InsanityConfig(Builder builder) {
		builder.comment("General settings").push("general");

		testInt = builder.comment("Test").translation("config.insanityoverworld.prop.test.desc").defineInRange("test", 2, 0, 5);

		builder.pop();

	}
}
