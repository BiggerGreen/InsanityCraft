package com.insanitycraft.insanityoverworld.enchantment;

import com.insanitycraft.insanityoverworld.init.InsanityEnchantments;
import com.insanitycraft.insanityoverworld.util.EnchantmentUtils;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraft.block.Blocks.*;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class SteadyFeetEnchantment extends Enchantment {

	private static Block[] disabledBlocks = new Block[]{ICE, PACKED_ICE, BLUE_ICE, SOUL_SAND, MAGMA_BLOCK};


	public SteadyFeetEnchantment() {
		super(Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[]{EquipmentSlotType.FEET});
		setRegistryName("steady_feet");
	}

	@Override
	protected boolean canApplyTogether(Enchantment enchantment) {
		return enchantment != Enchantments.DEPTH_STRIDER && enchantment != Enchantments.FROST_WALKER;
	}

	@SubscribeEvent
	public static void playerTick(TickEvent.PlayerTickEvent event) {
		PlayerEntity player = event.player;
		if(player == null)
			return;
		if(!EnchantmentUtils.hasEnchantment(player.getItemStackFromSlot(EquipmentSlotType.FEET), InsanityEnchantments.STEADYFEET))
			return;
		if(!player.onGround)
			return;
		World world = player.world;
//		BlockPos belowPlayer = new BlockPos(player.posX, player.posY -0.5, player.posZ);
//		Block standingOn = world.getBlockState(belowPlayer).getBlock();
//		InsanityLog.info(standingOn);
//		if(standingOn == ICE) {
//			//player.jump();
//		}
	}

}
