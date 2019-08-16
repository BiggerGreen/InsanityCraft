package com.insanitycraft.insanityoverworld.items;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UltimateArmorItem extends ArmorItem {

	public UltimateArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(stack.getEnchantmentTagList().isEmpty()) {
			if(slot == EquipmentSlotType.HEAD) {
				stack.addEnchantment(Enchantments.PROTECTION, 5);
				stack.addEnchantment(Enchantments.FIRE_PROTECTION, 5);
				stack.addEnchantment(Enchantments.BLAST_PROTECTION, 5);
				stack.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 5);
				stack.addEnchantment(Enchantments.RESPIRATION, 2);
				stack.addEnchantment(Enchantments.AQUA_AFFINITY, 1);
			}
			if(slot == EquipmentSlotType.CHEST) {
				stack.addEnchantment(Enchantments.PROTECTION, 5);
				stack.addEnchantment(Enchantments.FIRE_PROTECTION, 5);
				stack.addEnchantment(Enchantments.BLAST_PROTECTION, 5);
				stack.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 5);
			}
			if(slot == EquipmentSlotType.LEGS) {
				stack.addEnchantment(Enchantments.PROTECTION, 5);
				stack.addEnchantment(Enchantments.FIRE_PROTECTION, 5);
				stack.addEnchantment(Enchantments.BLAST_PROTECTION, 5);
				stack.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 5);
			}
			if(slot == EquipmentSlotType.FEET) {
				stack.addEnchantment(Enchantments.PROTECTION, 5);
				stack.addEnchantment(Enchantments.FIRE_PROTECTION, 5);
				stack.addEnchantment(Enchantments.BLAST_PROTECTION, 5);
				stack.addEnchantment(Enchantments.PROJECTILE_PROTECTION, 5);
				stack.addEnchantment(Enchantments.DEPTH_STRIDER, 3);
			}
		}
	}

}
