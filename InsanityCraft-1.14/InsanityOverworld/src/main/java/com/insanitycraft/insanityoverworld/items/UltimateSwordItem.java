package com.insanitycraft.insanityoverworld.items;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.world.World;

public class UltimateSwordItem extends SwordItem {

	public UltimateSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(stack.getEnchantmentTagList().isEmpty()) {
			stack.addEnchantment(Enchantments.SHARPNESS, 5);
			stack.addEnchantment(Enchantments.SMITE, 5);
			stack.addEnchantment(Enchantments.BANE_OF_ARTHROPODS, 5);
			stack.addEnchantment(Enchantments.KNOCKBACK, 3);
			stack.addEnchantment(Enchantments.LOOTING, 3);
			stack.addEnchantment(Enchantments.UNBREAKING, 3);
			stack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
		}
	}
}
