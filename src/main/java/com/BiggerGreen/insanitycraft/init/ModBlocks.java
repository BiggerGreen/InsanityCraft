package com.BiggerGreen.insanitycraft.init;

import java.util.ArrayList;
import java.util.List;

import com.BiggerGreen.insanitycraft.blocks.BlockBase;
import com.BiggerGreen.insanitycraft.blocks.ExtremeTorch;
import com.BiggerGreen.insanitycraft.blocks.PinkTourmalineBlock;
import com.BiggerGreen.insanitycraft.blocks.RubyBlock;
import com.BiggerGreen.insanitycraft.blocks.TigerEyeBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block AMETHYST_BLOCK = new RubyBlock("amethyst_block", Material.IRON);
	public static final Block TITANIUM_BLOCK = new RubyBlock("titanium_block", Material.IRON);
	public static final Block URANIUM_BLOCK = new RubyBlock("uranium_block", Material.IRON);
	public static final Block ENDER_PEARL_BLOCK = new BlockBase("ender_pearl_block", Material.GRASS);
	public static final Block EYE_OF_ENDER_BLOCK = new BlockBase("eye_of_ender_block", Material.GRASS);
	public static final Block MOBZILLA_SCALE_BLOCK = new RubyBlock("mobzilla_scale_block", Material.IRON);
	public static final Block PINK_TOURMALINE_BLOCK = new PinkTourmalineBlock("pink_tourmaline_block", Material.IRON);
	public static final Block TIGER_EYE_BLOCK = new TigerEyeBlock("tiger_eye_block", Material.IRON);
}