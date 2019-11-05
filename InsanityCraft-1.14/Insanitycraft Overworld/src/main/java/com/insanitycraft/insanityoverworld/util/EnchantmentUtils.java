package com.insanitycraft.insanityoverworld.util;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;

public class EnchantmentUtils {

	public static boolean hasEnchantment(ItemStack stack, Enchantment enchantment) {
		return enchantment != null && EnchantmentHelper.getEnchantmentLevel(enchantment, stack) > 0;
	}
}
