package com.insanitycraft.insanityoverworld.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.dimension.DimensionType;

public class ItemDebug extends Item {

	public ItemDebug(Properties properties) {
		super(properties);
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		PlayerEntity player = context.getPlayer();

		if(player.dimension != DimensionType.OVERWORLD) {
			player.changeDimension(DimensionType.OVERWORLD);
		}else {
			player.changeDimension(DimensionType.THE_END); //Change to mod Dimension when added
		}

		return ActionResultType.SUCCESS;
	}
}
