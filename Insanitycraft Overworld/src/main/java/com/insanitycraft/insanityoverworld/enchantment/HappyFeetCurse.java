package com.insanitycraft.insanityoverworld.enchantment;

import com.insanitycraft.insanityoverworld.init.InsanityEnchantments;
import com.insanitycraft.insanityoverworld.util.EnchantmentUtils;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class HappyFeetCurse extends Enchantment {

	public HappyFeetCurse() {
		super(Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[]{EquipmentSlotType.FEET});
		setRegistryName("happy_feet");
	}

	@Override
	public boolean isCurse() {
		return true;
	}

	@Override
	public boolean isTreasureEnchantment() {
		return true;
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@SubscribeEvent
	public static void playerTick(TickEvent.PlayerTickEvent event) {
		PlayerEntity player = event.player;
		if(player == null)
			return;
		if(!EnchantmentUtils.hasEnchantment(player.getItemStackFromSlot(EquipmentSlotType.FEET), InsanityEnchantments.HAPPYFEET))
			return;
		if(!player.onGround) {
			return;
		}
		Random random = new Random();
		int bound = 5;//in minutes
		if(random.nextInt((bound * 20) * 60) == 1) {
			player.jump();
		}
	}
}
