package com.BiggerGreen.insanitycraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PinkTourmalineBlock extends BlockBase
{

	public PinkTourmalineBlock(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
