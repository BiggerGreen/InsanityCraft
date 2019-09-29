package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;

public class ItemDevStick extends Item {
	public ItemDevStick() {
		super(new Properties().maxStackSize(1));
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
		if(entity instanceof LivingEntity) {
			LivingEntity livingEntity = (LivingEntity)entity;
			livingEntity.setHealth(0);
		}
		return true;
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		PlayerEntity player = context.getPlayer();
		World world = context.getWorld();
		BlockState blockState = world.getBlockState(context.getPos());
		TileEntity tileEntity = world.getTileEntity(context.getPos());
		if(!context.getWorld().isRemote) {
			if(blockState != null)
				InsanityLog.info(blockState);
			if(tileEntity != null)
				InsanityLog.info(tileEntity.serializeNBT());
		}
		return super.onItemUse(context);
	}
}
