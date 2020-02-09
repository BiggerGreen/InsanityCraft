package com.insanitycraft.insanityoverworld.block;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemMobOre extends BlockItem {

	public BlockItemMobOre(Block blockIn) {
		super(blockIn, new Item.Properties().group(InsanityOverworld.DEFAULT_GROUP));
		setRegistryName(blockIn.getRegistryName());
	}
}
