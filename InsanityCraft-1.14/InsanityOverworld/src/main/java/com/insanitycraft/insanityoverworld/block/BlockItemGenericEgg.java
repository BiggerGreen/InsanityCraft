package com.insanitycraft.insanityoverworld.block;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemGenericEgg extends BlockItem {

	public BlockItemGenericEgg(Block blockIn) {
		super(blockIn, new Item.Properties().group(InsanityOverworld.itemGroup));
		setRegistryName(blockIn.getRegistryName());
	}
}
