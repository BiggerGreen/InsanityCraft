package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
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
		BlockPos playerPos = new BlockPos(playerIn.posX - 3 , playerIn.posY - 1, playerIn.posZ - 3);
		Direction playerDirection = playerIn.getAdjustedHorizontalFacing();
		if(!playerIn.abilities.isCreativeMode) {
			stack.shrink(1);
		}
		generateShelter(serverWorld, playerPos, playerDirection);

		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

	private void generateShelter(ServerWorld world, BlockPos pos, Direction direction) {
		Template template = world.getStructureTemplateManager().getTemplate(new ResourceLocation(Reference.MODID, "struct_shelter"));
		Rotation rotation;
		PlacementSettings settings = new PlacementSettings();


		template.addBlocksToWorld(world, pos, settings);

	}

}
