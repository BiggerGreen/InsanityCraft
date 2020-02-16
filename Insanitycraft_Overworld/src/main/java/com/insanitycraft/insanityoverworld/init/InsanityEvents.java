package com.insanitycraft.insanityoverworld.init;

import com.insanitycraft.insanityoverworld.entity.GirlfriendEntity;
import com.insanitycraft.insanityoverworld.util.CalendarUtils;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.*;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.client.event.RenderLivingEvent;
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

	@SubscribeEvent
	public static void onRenderLiving(RenderLivingEvent.Pre event) {
		Entity entity = event.getEntity();
		EntityType type = entity.getType();
		MatrixStack matrixStack = event.getMatrixStack();
		if(entity instanceof GirlfriendEntity) {
			if(!((GirlfriendEntity)entity).isCalm() && CalendarUtils.isToday()) {
				matrixStack.scale(6.0F, 6.0F, 6.0F);
				type.size = EntitySize.flexible(3.6F, 12.0F);
			}else {
				matrixStack.scale(1.0F, 1.0F, 1.0F);
				type.size = EntitySize.flexible(0.6F, 1.8F);
			}
		}
	}

}
