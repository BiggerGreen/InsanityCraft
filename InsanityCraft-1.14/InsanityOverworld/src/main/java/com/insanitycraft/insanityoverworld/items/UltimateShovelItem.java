package com.insanitycraft.insanityoverworld.items;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.world.World;

public class UltimateShovelItem extends ShovelItem {

	public UltimateShovelItem(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(stack.getEnchantmentTagList().isEmpty()) {
			stack.addEnchantment(Enchantments.EFFICIENCY, 5);
		}
	}
}
