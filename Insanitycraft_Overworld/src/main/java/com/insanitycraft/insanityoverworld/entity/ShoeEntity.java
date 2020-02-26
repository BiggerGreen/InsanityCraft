package com.insanitycraft.insanityoverworld.entity;

import com.insanitycraft.insanityoverworld.init.InsanityEntities;
import com.insanitycraft.insanityoverworld.init.InsanityItems;
import com.insanitycraft.insanityoverworld.util.CalendarUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class ShoeEntity extends ProjectileItemEntity {

	public ShoeEntity(EntityType<? extends ProjectileItemEntity> type, World world) {
		super(type, world);
	}

	public ShoeEntity(double x, double y, double z, World world) {
		super(InsanityEntities.ENTITY_SHOE, x, y, z, world);
	}

	public ShoeEntity(LivingEntity thrower, World world) {
		super(InsanityEntities.ENTITY_SHOE, thrower, world);
	}

	@Override
	protected Item getDefaultItem() {
		return InsanityItems.RED_SHOE;
	}

	private IParticleData makeParticle() {
		ItemStack stack = func_213882_k();
		return (stack.isEmpty() ? ParticleTypes.ITEM_SNOWBALL : new ItemParticleData(ParticleTypes.ITEM, stack));
	}

	@Override
	public void handleStatusUpdate(byte id) {
		if(id == 3) {
			IParticleData particleData = makeParticle();

			for(int i = 0; i < 8; i++) {
				world.addParticle(particleData, getPosX(), getPosY(), getPosZ(), 0.0D, 0.0D, 0.0D);
			}
		}
	}

	@Override
	protected void onImpact(RayTraceResult result) {
		if(result.getType() == RayTraceResult.Type.ENTITY) {
			Entity entity = ((EntityRayTraceResult)result).getEntity();
			float damage = 2.0F;

			if(entity instanceof PlayerEntity) {
				if(getThrower() instanceof GirlfriendEntity) {
					if(((GirlfriendEntity)getThrower()).isCalm() && CalendarUtils.isValentinesDay()) {
						damage = 10.0F;
					}else {
						damage = 0.0F;
					}
				}
			}else if(entity instanceof CreeperEntity) {
				damage += 4;
			}else if(entity instanceof GirlfriendEntity) {
				damage = 1.0F;
			}

			entity.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), damage);
		}

		if(!world.isRemote) {
			world.setEntityState(this, (byte)3);
			remove();
		}
	}
}
