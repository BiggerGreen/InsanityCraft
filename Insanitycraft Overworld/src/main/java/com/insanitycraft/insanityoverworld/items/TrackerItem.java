package com.insanitycraft.insanityoverworld.items;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class TrackerItem extends Item {

	public TrackerItem() {
		super(new Item.Properties().group(InsanityOverworld.itemGroup).maxStackSize(1));


		/* //TODO
		addPropertyOverride(new ResourceLocation("angle"), new IItemPropertyGetter() {
			private double rotation;
			private double rota;
			private double lastUpdateTick;

			@Override
			public float call(ItemStack itemStack, @Nullable World world, @Nullable LivingEntity livingEntity) {
				if(livingEntity == null && !itemStack.isOnItemFrame()) {
					return 0.0F;
				}else {
					boolean flag = livingEntity != null;
					Entity entity = flag ? livingEntity : itemStack.getItemFrame();
					if(world == null) {
						world = entity.world;
					}
					ServerWorld serverWorld = null;
					if(world instanceof ServerWorld) {
						serverWorld = (ServerWorld)world;
					}
					InsanityLog.info(world.isRemote);

					double newRotation;
					if(world.dimension.isNether() && serverWorld != null) {
						double entityRotation = flag ? entity.rotationYaw : getFrameRotation((ItemFrameEntity)entity);
						entityRotation = MathHelper.positiveModulo(entityRotation / 360.0D, 1.0D);
						double fortressAngle = getFortressToAngle(serverWorld, entity) / 6.2831854820251465D;
						newRotation = 0.5D - (entityRotation - 0.25D - fortressAngle);
						InsanityLog.info("fortress " + newRotation);
					}else {
						newRotation = Math.random();
						InsanityLog.info("random " + newRotation);
					}

					if(flag) {
						newRotation = wobble(world, 1.0F);
						InsanityLog.info("wobble " + newRotation);
					}


					//InsanityLog.info(MathHelper.positiveModulo((float)newRotation, 1.0F));
					return MathHelper.positiveModulo((float)newRotation, 1.0F);
				}
			}


			private double wobble(World world, double strength) {
				if(world.getGameTime() != lastUpdateTick) {
					lastUpdateTick = world.getGameTime();
					double rotat = strength - rotation;
					rotat = MathHelper.positiveModulo(rotat + 0.5D, 1.0D) - 0.5D;
					rota += rotat * 0.1D;
					rota *= 0.8D;
					rotation = MathHelper.positiveModulo(rotation+ rota, 1.0D);
				}
				return rotation;
			}

			private double getFrameRotation(ItemFrameEntity entity) {
				return MathHelper.wrapDegrees(180 + entity.getHorizontalFacing().getHorizontalIndex() * 90);
			}

			private BlockPos getFortressPos(ServerWorld world, Entity entity) {
				BlockPos blockPos = new BlockPos(entity.getPosition());

				return world.findNearestStructure("Fortress", blockPos, 10000, false);

			}

			private double getFortressToAngle(ServerWorld world, Entity entity) {
				BlockPos blockPos = getFortressPos(world, entity);
				return Math.atan2(blockPos.getZ(), blockPos.getX());
			}

		});
		 */
	}

}
