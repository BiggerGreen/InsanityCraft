package com.insanitycraft.insanityoverworld.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

import static com.insanitycraft.insanityoverworld.init.InsanityItems.*;
import static net.minecraft.enchantment.Enchantments.*;

public class EnchantedSwordItem extends SwordItem {
	public EnchantedSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
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
				if(stack.getItem() == battleAxe) {
					stack.addEnchantment(LOOTING, 3);
					stack.addEnchantment(UNBREAKING, 3);
				}
				if(stack.getItem() == queenBattleAxe) {
					stack.addEnchantment(SHARPNESS, 5);
					stack.addEnchantment(SMITE, 5);
					stack.addEnchantment(BANE_OF_ARTHROPODS, 5);
					stack.addEnchantment(KNOCKBACK, 3);
					stack.addEnchantment(LOOTING, 3);
					stack.addEnchantment(UNBREAKING, 3);
					stack.addEnchantment(FIRE_ASPECT, 2);
					stack.addEnchantment(SWEEPING, 3);
				}
				if(stack.getItem() == ultimateSword) {
					stack.addEnchantment(SHARPNESS, 5);
					stack.addEnchantment(SMITE, 5);
					stack.addEnchantment(BANE_OF_ARTHROPODS, 5);
					stack.addEnchantment(KNOCKBACK, 3);
					stack.addEnchantment(LOOTING, 3);
					stack.addEnchantment(UNBREAKING, 3);
					stack.addEnchantment(FIRE_ASPECT, 2);
					stack.addEnchantment(SWEEPING, 3);
				}
				if(stack.getItem() == zangetsu) {
					stack.addEnchantment(KNOCKBACK, 2);
					stack.addEnchantment(FIRE_ASPECT, 2);
				}
				if(stack.getItem() == lapisSword) {
					stack.addEnchantment(SHARPNESS, 1);
				}
			}
		}
	}
}
