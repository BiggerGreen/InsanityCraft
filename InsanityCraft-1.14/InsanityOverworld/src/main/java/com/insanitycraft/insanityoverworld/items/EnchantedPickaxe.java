package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.init.InsanityItems;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

import static com.insanitycraft.insanityoverworld.init.InsanityItems.*;
import static net.minecraft.enchantment.Enchantments.*;

public class EnchantedPickaxe extends PickaxeItem {

	public EnchantedPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
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
				if(stack.getItem() == ultimatePickAxe) {
					stack.addEnchantment(EFFICIENCY, 5);
					stack.addEnchantment(FORTUNE, 5);
				}
				if(stack.getItem() == lapisPickAxe) {
					stack.addEnchantment(EFFICIENCY, 1);
				}
			}
		}
	}

}
