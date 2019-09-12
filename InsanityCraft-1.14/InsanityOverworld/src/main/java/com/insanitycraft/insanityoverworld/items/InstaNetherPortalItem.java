package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class InstaNetherPortalItem extends Item {

	public InstaNetherPortalItem() {
		super(new Item.Properties().group(InsanityOverworld.itemGroup));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity playerEntity, Hand hand) {
		ItemStack stack = playerEntity.getHeldItem(hand);
		playerEntity.setActiveHand(hand);
		BlockPos pos = playerEntity.getPosition();
		Direction direction = playerEntity.getAdjustedHorizontalFacing();
		if(!playerEntity.abilities.isCreativeMode) {
			stack.shrink(1);
		}
		if(!world.isRemote) {
			for(int x = 0; x <= 3; x++) {
				for(int y = 0; y <= 4; y++) {

					BlockPos newPos = new BlockPos(pos);
					if(direction == Direction.SOUTH) {
						newPos = new BlockPos(pos.getX() + x, pos.getY() + y, pos.getZ() + 2);
					}else if(direction == Direction.NORTH) {
						newPos = new BlockPos(pos.getX() - x, pos.getY() + y, pos.getZ() - 2);
					}else if(direction == Direction.EAST) {
						newPos = new BlockPos(pos.getX() + 2, pos.getY() + y, pos.getZ() + x);
					}else if(direction == Direction.WEST) {
						newPos = new BlockPos(pos.getX() - 2, pos.getY() + y, pos.getZ() + x);
					}
					if(x == 1 || x == 2) {
						if(y == 1 || y == 2 || y == 3) {
							//world.setBlockState(newPos, Blocks.FIRE.getDefaultState());
						}else {
							world.setBlockState(newPos, Blocks.OBSIDIAN.getDefaultState());
						}
					}else {
						world.setBlockState(newPos, Blocks.OBSIDIAN.getDefaultState());
					}
				}
			}
			if(direction == Direction.SOUTH) {
				world.setBlockState(new BlockPos(pos.getX() + 1, pos.getY() + 1, pos.getZ() + 2), Blocks.FIRE.getDefaultState());
			}else if(direction == Direction.NORTH) {
				world.setBlockState(new BlockPos(pos.getX() - 1, pos.getY() + 1, pos.getZ() - 2), Blocks.FIRE.getDefaultState());
			}else if(direction == Direction.EAST) {
				world.setBlockState(new BlockPos(pos.getX() + 2, pos.getY() + 1, pos.getZ() + 1), Blocks.FIRE.getDefaultState());
			}else if(direction == Direction.WEST) {
				world.setBlockState(new BlockPos(pos.getX() - 2, pos.getY() + 1, pos.getZ() - 1), Blocks.FIRE.getDefaultState());
			}


			return new ActionResult<>(ActionResultType.SUCCESS, stack);
		}

		return new ActionResult<>(ActionResultType.FAIL, stack);
	}
}
