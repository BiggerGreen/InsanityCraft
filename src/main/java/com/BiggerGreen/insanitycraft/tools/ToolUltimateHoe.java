package com.BiggerGreen.insanitycraft.tools;

import com.BiggerGreen.insanitycraft.Main;
import com.BiggerGreen.insanitycraft.init.ModItems;
import com.BiggerGreen.insanitycraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolUltimateHoe extends ItemHoe implements IHasModel{

	public ToolUltimateHoe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
