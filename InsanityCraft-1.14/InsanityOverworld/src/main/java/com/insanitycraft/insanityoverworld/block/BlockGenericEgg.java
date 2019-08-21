package com.insanitycraft.insanityoverworld.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;

public class BlockGenericEgg extends Block {
	public BlockGenericEgg(ResourceLocation name) {
		super(Block.Properties.create(Material.ROCK).hardnessAndResistance(2,2).harvestTool(ToolType.PICKAXE).harvestLevel(1));
		setRegistryName(name);
	}
}
