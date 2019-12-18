package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.util.ResourceLocation;

public enum InsanityDungeons {

	TEST("test", setDungeonLocation("name"));




	String name;
	ResourceLocation location;

	InsanityDungeons(String name, ResourceLocation location) {
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public ResourceLocation getLocation() {
		return location;
	}



	private static ResourceLocation setDungeonLocation(String name) {
		return new ResourceLocation(Reference.MODID, name);
	}

}
