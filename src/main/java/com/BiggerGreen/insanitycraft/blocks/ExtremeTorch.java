package com.BiggerGreen.insanitycraft.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ExtremeTorch extends BlockBase
{

	public ExtremeTorch(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(0F);
		setResistance(0F);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(20.0F);
	}

}