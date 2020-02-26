package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.entity.ShoeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class ShoeItem extends Item {

	public ShoeItem() {
		super(new Item.Properties().group(InsanityOverworld.DEFAULT_GROUP).maxStackSize(16));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
		ItemStack stack = player.getHeldItem(hand);
		world.playSound(null, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
		if(!world.isRemote) {
			ShoeEntity shoeEntity = new ShoeEntity(player, world);
			shoeEntity.setItem(stack);
			shoeEntity.shoot(player, player.rotationPitch, player.rotationYaw, 0.0F, 1.5F, 1.0F);
			world.addEntity(shoeEntity);
		}

		player.addStat(Stats.ITEM_USED.get(this));
		if(!player.abilities.isCreativeMode) {
			stack.shrink(1);
		}

		return ActionResult.resultSuccess(stack);
	}
}
