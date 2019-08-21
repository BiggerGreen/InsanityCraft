package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;
import net.minecraftforge.common.util.INBTSerializable;

public class UltimateSwordItem extends SwordItem {

	public UltimateSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	int count = 0;

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		CompoundNBT nbt;
		if(stack.hasTag()) {
			nbt = stack.getTag();
		}else {
			nbt = new CompoundNBT();
		}


		if(!nbt.contains("added")) {

			if(!nbt.getBoolean("added") && stack.getEnchantmentTagList().isEmpty()) {
				nbt.putBoolean("added", true);
				stack.addEnchantment(Enchantments.SHARPNESS, 5);
				stack.addEnchantment(Enchantments.SMITE, 5);
				stack.addEnchantment(Enchantments.BANE_OF_ARTHROPODS, 5);
				stack.addEnchantment(Enchantments.KNOCKBACK, 3);
				stack.addEnchantment(Enchantments.LOOTING, 3);
				stack.addEnchantment(Enchantments.UNBREAKING, 3);
				stack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
				stack.addEnchantment(Enchantments.SWEEPING, 3);
				InsanityLog.info(nbt);

			}

		}

		InsanityLog.info(nbt);
	}
}
