package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import com.insanitycraft.insanityoverworld.util.Reference;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.server.ServerWorld;

public class InstaShelterItem extends Item {

	public InstaShelterItem() {
		super(new Item.Properties().group(InsanityOverworld.itemGroup));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if(!(worldIn instanceof ServerWorld)) {
			return super.onItemRightClick(worldIn, playerIn, handIn);
		}
		ItemStack stack = playerIn.getHeldItem(handIn);
		ServerWorld serverWorld = (ServerWorld)worldIn;
		Direction playerDirection = playerIn.getAdjustedHorizontalFacing();
		BlockPos playerPos = playerIn.getPosition();
		Rotation rotation = Rotation.CLOCKWISE_180;
		if(!playerIn.abilities.isCreativeMode) {
			stack.shrink(1);
		}

		if(playerDirection == Direction.NORTH) {
			playerPos = playerIn.getPosition().add(3, -1, 3);
			rotation = Rotation.CLOCKWISE_180;
		}else if(playerDirection == Direction.SOUTH) {
			playerPos = playerIn.getPosition().add(-3, -1, -3);
			rotation = Rotation.NONE;
		}else if(playerDirection == Direction.EAST) {
			playerPos = playerIn.getPosition().add(-3, -1, 3);
			rotation = Rotation.COUNTERCLOCKWISE_90;
		}else if(playerDirection == Direction.WEST) {
			playerPos = playerIn.getPosition().add(3, -1, -3);
			rotation = Rotation.CLOCKWISE_90;
		}

		generateShelter(serverWorld, playerPos, rotation);

		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

	private void generateShelter(ServerWorld world, BlockPos pos, Rotation rotation) {
		Template template = world.getStructureTemplateManager().getTemplate(new ResourceLocation(Reference.MODID, "struct_instant_shelter"));
		PlacementSettings settings = new PlacementSettings();
		settings.setRotation(rotation);

		template.addBlocksToWorld(world, pos, settings);

	}

}
