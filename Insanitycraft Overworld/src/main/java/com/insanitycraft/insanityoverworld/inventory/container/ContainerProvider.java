package com.insanitycraft.insanityoverworld.inventory.container;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.IContainerProvider;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;

public class ContainerProvider implements INamedContainerProvider {

	private final ITextComponent displayName;
	private final IContainerProvider provider;

	public ContainerProvider(ITextComponent displayName, IContainerProvider provider) {
		this.displayName = displayName;
		this.provider = provider;
	}

	@Override
	public ITextComponent getDisplayName() {
		return displayName;
	}

	@Nullable
	@Override
	public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
		return provider.createMenu(i, playerInventory, playerEntity);
	}
}
