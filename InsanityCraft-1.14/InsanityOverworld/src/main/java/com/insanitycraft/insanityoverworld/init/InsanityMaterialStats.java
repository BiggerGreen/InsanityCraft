package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import static com.insanitycraft.insanityoverworld.init.InsanityItems.*;

public class InsanityMaterialStats {


	public enum InsanityToolTier implements IItemTier {
		AMETHYST_TIER(11f, 11f, 2000, 4, 70, amethyst),
		RUBY_TIER(16f, 11f, 1500, 5, 85, ruby);

		private float attackDamage, efficiency;
		private int durability, harvestLevel, enchantability;
		private Item repairMaterial;

		InsanityToolTier(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) {
			this.attackDamage = attackDamage;
			this.efficiency = efficiency;
			this.durability = durability;
			this.harvestLevel = harvestLevel;
			this.enchantability = enchantability;
			this.repairMaterial = repairMaterial;
		}


		@Override
		public int getMaxUses() {
			return durability;
		}

		@Override
		public float getEfficiency() {
			return efficiency;
		}

		@Override
		public float getAttackDamage() {
			return attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(repairMaterial);
		}
	}

	public enum InsanityArmorMaterials implements IArmorMaterial {

		AMETHYST_ARMOR("amethyst", 100, new int[]{3, 7, 8, 4}, 40, amethyst, "item.armor.equip_diamond", 0.0f),
		RUBY_ARMOR("ruby", 90, new int[]{4, 8, 9, 4}, 40, ruby, "item.armor.equip_diamond", 0.0f);


		private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
		private String name, equipSound;
		private int durability, enchantability;
		private Item repairItem;
		private int[] damageRedutionAmount; //{boots, leggings, chestplate, helmet}
		private float toughness;

		InsanityArmorMaterials(String name, int durability, int[] damageReductionAmount, int enchantability, Item repairItem, String equipSound, float toughness) {
			this.name = name;
			this.durability = durability;
			this.damageRedutionAmount = damageReductionAmount;
			this.enchantability = enchantability;
			this.repairItem = repairItem;
			this.equipSound = equipSound;
			this.toughness = toughness;
		}


		@Override
		public int getDurability(EquipmentSlotType equipmentSlotType) {
			return max_damage_array[equipmentSlotType.getIndex()] * durability;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType equipmentSlotType) {
			return damageRedutionAmount[equipmentSlotType.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return enchantability;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return new SoundEvent(new ResourceLocation(equipSound));
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromItems(repairItem);
		}

		@Override
		public String getName() {
			return Reference.MODID + ":" + name;
		}

		@Override
		public float getToughness() {
			return toughness;
		}
	}
}
