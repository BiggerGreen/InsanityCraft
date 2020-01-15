package com.insanitycraft.insanityoverworld.inventory.container;

import com.insanitycraft.insanityoverworld.init.InsanityContainerTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class TrackerContainer extends Container {

	public static final INamedContainerProvider provider = new INamedContainerProvider() {
		@Override
		public ITextComponent getDisplayName() {
			return new TranslationTextComponent("container.insanityoverworld.structure_tracker");
		}

		@Nullable
		@Override
		public Container createMenu(int id, PlayerInventory inventory, PlayerEntity playerEntity) {
			return new TrackerContainer(id, inventory);
		}
	};

	public TrackerContainer(int id, PlayerInventory playerInventory) {
		super(InsanityContainerTypes.TRACKER, id);
	}

	@Override
	public boolean canInteractWith(PlayerEntity playerIn) {
		return true;
	}




}
