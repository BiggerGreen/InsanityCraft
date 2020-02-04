package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.init.InsanityItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
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
			if(stack.getItem() == InsanityItems.BRIDGE) {
				for(int x = 0; x <= InsanityOverworld.config.bridgeLength.get(); x++) {
					BlockPos newPos = new BlockPos(pos);
					if(direction == Direction.SOUTH) {
						newPos = pos.add(0, 0, x);
					}else if(direction == Direction.NORTH) {
						newPos = pos.add(0, 0, -(x));
					}else if(direction == Direction.EAST) {
						newPos = pos.add(x, 0, 0);
					}else if(direction == Direction.WEST) {
						newPos = pos.add(-(x), 0, 0);
					}

					Block block = world.getBlockState(newPos).getBlock();
					if(x != 0 && block != Blocks.AIR) {
						break;
					}

					world.setBlockState(newPos, Blocks.COBBLESTONE.getDefaultState());
					if((x - 1) % 8 == 0) {
						BlockPos torchPos = newPos.add(0, 1, 0);
						world.setBlockState(torchPos, Blocks.TORCH.getDefaultState());
					}

				}
			}else if(stack.getItem() == InsanityItems.STAIRS_UP) {
				for(int xy = 0; xy <= InsanityOverworld.config.stairHeight.get(); xy++) {
					BlockPos newPos = new BlockPos(pos);
					if(direction == Direction.SOUTH) {
						newPos = pos.add(0, xy, xy);
					}else if(direction == Direction.NORTH) {
						newPos = pos.add(0, xy, -(xy));
					}else if(direction == Direction.EAST) {
						newPos = pos.add(xy, xy, 0);
					}else if(direction == Direction.WEST) {
						newPos = pos.add(-(xy), xy, 0);
					}

					Block block = world.getBlockState(newPos).getBlock();
					if(xy != 0 && block != Blocks.AIR) {
						break;
					}

					world.setBlockState(newPos, Blocks.COBBLESTONE.getDefaultState());
					if((xy - 1) % 8 == 0) {
						BlockPos torchPos = newPos.add(0, 1, 0);
						world.setBlockState(torchPos, Blocks.TORCH.getDefaultState());
					}
				}
			}else if(stack.getItem() == InsanityItems.STAIRS_DOWN) {
				for(int xy = 0; xy >= -(InsanityOverworld.config.stairHeight.get()); xy--) {
					BlockPos newPos = new BlockPos(pos);
					if(direction == Direction.SOUTH) {
						newPos = pos.add(0, xy, -(xy));
					}else if(direction == Direction.NORTH) {
						newPos = pos.add(0, xy, xy);
					}else if(direction == Direction.EAST) {
						newPos = pos.add(-(xy), xy, 0);
					}else if(direction == Direction.WEST) {
						newPos = pos.add(xy, xy, 0);
					}

					Block block = world.getBlockState(newPos).getBlock();
					if(xy != 0 && block != Blocks.AIR) {
						break;
					}

					world.setBlockState(newPos, Blocks.COBBLESTONE.getDefaultState());
					if((xy - 1) % 8 == 0) {
						BlockPos torchPos = newPos.add(0, 1, 0);
						world.setBlockState(torchPos, Blocks.TORCH.getDefaultState());
					}
				}
			}
			return ActionResultType.SUCCESS;
		}



		return ActionResultType.FAIL;
	}

}
