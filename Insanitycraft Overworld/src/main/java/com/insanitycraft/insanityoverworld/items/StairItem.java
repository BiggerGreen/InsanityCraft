package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.init.InsanityItems;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class StairItem extends Item {

	public StairItem() {
		super(new Item.Properties().group(InsanityOverworld.itemGroup).maxStackSize(16));
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		World world = context.getWorld();
		ItemStack stack = context.getItem();
		PlayerEntity playerEntity = context.getPlayer();
		BlockPos pos = context.getPos();
		Direction direction = context.getPlacementHorizontalFacing();

		if(!playerEntity.abilities.isCreativeMode) {
			stack.shrink(1);
		}

		if(!world.isRemote) {
			if(stack.getItem() == InsanityItems.bridge) {
				for(int x = 1; x <= InsanityOverworld.config.bridgeLength.get(); x++) {
					InsanityLog.info(x);
					InsanityLog.info(InsanityOverworld.config.bridgeLength.get());
					BlockPos newPos = new BlockPos(pos);
					if(direction == Direction.SOUTH) {
						newPos.add(x, -1, 0);
					}else if(direction == Direction.NORTH) {
						newPos.add(-x, -1, 0);
					}else if(direction == Direction.EAST) {
						newPos.add(0, -1, x);
					}else if(direction == Direction.WEST) {
						newPos.add(0, -1, -x);
					}

					Block block = world.getBlockState(newPos).getBlock();
					if(block != Blocks.AIR) {
						InsanityLog.info(block);
						break;
					}

					world.setBlockState(newPos, Blocks.COBBLESTONE.getDefaultState());
					InsanityLog.info("Placing Cobblestone at {}", newPos);
					if((x - 1) % 8 == 0) {
						BlockPos torchPos = newPos.add(0, 1, 0);
						world.setBlockState(torchPos, Blocks.TORCH.getDefaultState());
					}

				}
			}
			return ActionResultType.SUCCESS;
		}



		return ActionResultType.FAIL;
	}

//	@Override
//	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity playerEntity, Hand hand) {
//		ItemStack stack = playerEntity.getHeldItem(hand);
//		BlockPos pos = new BlockPos(playerEntity.getLookVec());
//		Direction direction = playerEntity.getAdjustedHorizontalFacing();
//
//
//		if(!playerEntity.abilities.isCreativeMode) {
//			stack.shrink(1);
//		}
//
//		if(!world.isRemote) {
//			if(stack.getItem() == InsanityItems.bridge) {
//				for(int x = 1; x >= InsanityOverworld.config.bridgeLength.get(); x++) {
//					BlockPos newPos = new BlockPos(pos);
//					if(direction == Direction.SOUTH) {
//						newPos.add(x, -1, 0);
//					}else if(direction == Direction.NORTH) {
//						newPos.add(-x, -1, 0);
//					}else if(direction == Direction.EAST) {
//						newPos.add(0, -1, x);
//					}else if(direction == Direction.WEST) {
//						newPos.add(0, -1, -x);
//					}
//
//					Block block = world.getBlockState(newPos).getBlock();
//					//					if(block != Blocks.AIR) {
//					//						break;
//					//					}
//
//					world.setBlockState(newPos, Blocks.COBBLESTONE.getDefaultState());
//					InsanityLog.info("Placing Cobblestone at {}", newPos);
//					if((x - 1) % 8 == 0) {
//						BlockPos torchPos = newPos.add(0, 1, 0);
//						world.setBlockState(torchPos, Blocks.TORCH.getDefaultState());
//					}
//
//				}
//				return new ActionResult<>(ActionResultType.SUCCESS, stack);
//			}
//
//		}
//		return new ActionResult<>(ActionResultType.FAIL, stack);
//	}
}
