package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.init.InsanityConfig;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ItemDevStick extends Item {
	public ItemDevStick() {
		super(new Properties().maxStackSize(1));
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	@Override
	public boolean canPlayerBreakBlockWhileHolding(BlockState p_195938_1_, World p_195938_2_, BlockPos p_195938_3_, PlayerEntity p_195938_4_) {
		return false;
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
		if(entity instanceof LivingEntity) {
			LivingEntity livingEntity = (LivingEntity)entity;
			InsanityLog.info(livingEntity.getMaxHealth());
			InsanityLog.info(livingEntity);
			livingEntity.setHealth(0);
		}
		InsanityLog.info(entity);
		return true;
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		PlayerEntity player = context.getPlayer();
		World world = context.getWorld();
		BlockState blockState = world.getBlockState(context.getPos());
		TileEntity tileEntity = world.getTileEntity(context.getPos());
		BlockState state2 = player.getBlockState();

		BlockPos oi = context.getPos();
		if(!context.getWorld().isRemote) {
			if(blockState != null)
				InsanityLog.info(blockState);
			if(tileEntity != null)
				InsanityLog.info(tileEntity.serializeNBT());
			if(state2 != null) {
				InsanityLog.info(state2);
			}
		}

		return super.onItemUse(context);
	}
}
