package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.init.InsanityItems;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

public class EnchantedShovelItem extends ShovelItem {

	public EnchantedShovelItem(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		CompoundNBT nbt;
		if(stack.hasTag()) {
			nbt = stack.getTag();
		}else {
			nbt = new CompoundNBT();
		}


		if(!nbt.contains("added")) {

			if(stack.getEnchantmentTagList().isEmpty()) {
				nbt.putBoolean("added", true);
				if(stack.getItem() == InsanityItems.ultimateShovel) {
					stack.addEnchantment(Enchantments.EFFICIENCY, 5);
				}
				if(stack.getItem() == InsanityItems.lapisShovel) {
					stack.addEnchantment(Enchantments.EFFICIENCY, 1);
				}
			}
		}
	}
}
