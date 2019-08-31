package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.init.InsanityItems;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

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
				if(stack.getItem() == InsanityItems.battleAxe) {
					stack.addEnchantment(Enchantments.LOOTING, 3);
					stack.addEnchantment(Enchantments.UNBREAKING, 3);
				}else if(stack.getItem() == InsanityItems.queenBattleAxe) {
					stack.addEnchantment(Enchantments.SHARPNESS, 5);
					stack.addEnchantment(Enchantments.SMITE, 5);
					stack.addEnchantment(Enchantments.BANE_OF_ARTHROPODS, 5);
					stack.addEnchantment(Enchantments.KNOCKBACK, 3);
					stack.addEnchantment(Enchantments.LOOTING, 3);
					stack.addEnchantment(Enchantments.UNBREAKING, 3);
					stack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
					stack.addEnchantment(Enchantments.SWEEPING, 3);
				}else if(stack.getItem() == InsanityItems.ultimateSword) {
					stack.addEnchantment(Enchantments.SHARPNESS, 5);
					stack.addEnchantment(Enchantments.SMITE, 5);
					stack.addEnchantment(Enchantments.BANE_OF_ARTHROPODS, 5);
					stack.addEnchantment(Enchantments.KNOCKBACK, 3);
					stack.addEnchantment(Enchantments.LOOTING, 3);
					stack.addEnchantment(Enchantments.UNBREAKING, 3);
					stack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
					stack.addEnchantment(Enchantments.SWEEPING, 3);
				}else if(stack.getItem() == InsanityItems.zangesu) {
					stack.addEnchantment(Enchantments.KNOCKBACK, 2);
					stack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
				}

				//stack.addEnchantment(Enchantments.SWEEPING, 3);
				//InsanityLog.info(nbt);

			}

		}

		//InsanityLog.info(nbt);
	}

}
