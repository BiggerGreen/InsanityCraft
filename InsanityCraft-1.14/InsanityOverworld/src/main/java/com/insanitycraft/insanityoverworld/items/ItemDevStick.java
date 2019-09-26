package com.insanitycraft.insanityoverworld.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemDevStick extends Item {
	public ItemDevStick() {
		super(new Properties());

	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
		if(entity instanceof LivingEntity) {
			LivingEntity livingEntity = (LivingEntity)entity;
			livingEntity.setHealth(0);
		}
		return true;
	}
}
