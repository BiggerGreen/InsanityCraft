package com.insanitycraft.insanityoverworld.init;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class InsanityEvents {

	@SubscribeEvent
	public static void onEntitySpawn(LivingSpawnEvent.SpecialSpawn event) {
		World world = (World)event.getWorld();
		if(world.isRemote) {
			return;
		}

		if(event.getSpawnReason() == SpawnReason.SPAWN_EGG) {
			LivingEntity livingEntity = event.getEntityLiving();
			if(livingEntity instanceof EnderDragonEntity && world.dimension.getType() != DimensionType.THE_END) {
				// Makes the dragon behave like the old one
				CompoundNBT tag = new CompoundNBT();
				livingEntity.writeAdditional(tag);
				tag.putShort("DragonPhase", (short)0);
				livingEntity.readAdditional(tag);
			}
		}
	}
}
