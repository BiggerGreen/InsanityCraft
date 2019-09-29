package com.BiggerGreen.insanitycraft.tools;

import com.BiggerGreen.insanitycraft.Main;
import com.BiggerGreen.insanitycraft.init.ModItems;
import com.BiggerGreen.insanitycraft.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolUltimateShovel extends ItemSpade implements IHasModel{

	public ToolUltimateShovel(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}

