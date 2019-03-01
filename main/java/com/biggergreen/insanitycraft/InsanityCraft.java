package com.biggergreen.insanitycraft;

import org.apache.logging.log4j.Logger;

import com.biggergreen.insanitycraft.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= InsanityCraft.MODID, name = InsanityCraft.MODNAME, version = InsanityCraft.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768,]", useMetadata = true)
public class InsanityCraft {
	
	public static final String MODID = "insancraftmod";
	public static final String MODNAME = "InsanityCraft";
	public static final String MODVERSION= "1.0.0";
	
	@SidedProxy(clientSide = "com.biggergreen.insanitycraft.proxy.ClientProxy", serverSide = "com.biggergreen.insanitycraft.proxy.ServerProxy")
    public static CommonProxy proxy;
	
	@Mod.Instance
	public static InsanityCraft instance;
	
	public static Logger logger;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
