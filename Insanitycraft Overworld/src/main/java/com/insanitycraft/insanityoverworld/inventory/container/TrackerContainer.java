package com.insanitycraft.insanityoverworld.inventory.container;

import com.insanitycraft.insanityoverworld.init.InsanityContainerTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;

public class TrackerContainer extends Container {

	public TrackerContainer(int id, PlayerInventory playerInventory) {
		super(InsanityContainerTypes.TRACKER, id);
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		return true;
	}
}
