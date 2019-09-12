package com.insanitycraft.insanityoverworld.items;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

import static com.insanitycraft.insanityoverworld.init.InsanityItems.*;
import static net.minecraft.enchantment.Enchantments.*;

public class EnchantedArmorItem extends ArmorItem {

	public EnchantedArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);
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
				//region ultimate armor
				if(stack.getItem() == ultimateHelmet) {
					stack.addEnchantment(PROTECTION, 3);
					stack.addEnchantment(FIRE_PROTECTION, 1);
					stack.addEnchantment(BLAST_PROTECTION, 1);
					stack.addEnchantment(PROJECTILE_PROTECTION, 1);
					stack.addEnchantment(RESPIRATION, 3);
					stack.addEnchantment(AQUA_AFFINITY, 1);
				}
				if(stack.getItem() == ultimateChestplate || stack.getItem() == ultimateLeggings) {
					stack.addEnchantment(PROTECTION, 3);
					stack.addEnchantment(FIRE_PROTECTION, 1);
					stack.addEnchantment(BLAST_PROTECTION, 1);
					stack.addEnchantment(PROJECTILE_PROTECTION, 1);
				}
				if(stack.getItem() == ultimateBoots) {
					stack.addEnchantment(PROTECTION, 3);
					stack.addEnchantment(FIRE_PROTECTION, 1);
					stack.addEnchantment(BLAST_PROTECTION, 1);
					stack.addEnchantment(PROJECTILE_PROTECTION, 1);
					stack.addEnchantment(FEATHER_FALLING, 4);
					stack.addEnchantment(DEPTH_STRIDER, 3);
				}
				//endregion
				//region lapis armor
				if(stack.getItem() == lapisHelmet) {
					stack.addEnchantment(PROTECTION, 1);
					stack.addEnchantment(RESPIRATION, 1);
					stack.addEnchantment(AQUA_AFFINITY, 1);
				}
				if(stack.getItem() == lapisChestplate || stack.getItem() == lapisLeggings) {
					stack.addEnchantment(PROTECTION, 1);
				}
				if(stack.getItem() == lapisBoots) {
					stack.addEnchantment(PROTECTION, 1);
					stack.addEnchantment(FEATHER_FALLING, 1);
					stack.addEnchantment(DEPTH_STRIDER, 1);
				}
				//endregion
				//region lava armor
				if(stack.getItem() == lavaHelmet || stack.getItem() == lavaChestplate || stack.getItem() == lavaLeggings || stack.getItem() == lavaBoots) {
					stack.addEnchantment(FIRE_PROTECTION, 4);
				}
				//endregion

			}
		}
	}

}
