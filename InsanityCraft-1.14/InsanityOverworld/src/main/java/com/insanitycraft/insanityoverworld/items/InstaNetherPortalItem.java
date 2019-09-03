package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class InstaNetherPortalItem extends Item {

	public InstaNetherPortalItem() {
		super(new Item.Properties().group(InsanityOverworld.itemGroup));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {


		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}
