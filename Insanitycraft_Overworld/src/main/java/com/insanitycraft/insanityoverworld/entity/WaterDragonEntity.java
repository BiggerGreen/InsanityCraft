package com.insanitycraft.insanityoverworld.entity;

import com.insanitycraft.insanityoverworld.util.GenericTargetSorter;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.GuardianEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerBossInfo;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class WaterDragonEntity extends WaterMobEntity implements IMob {

	private final ServerBossInfo bossInfo = new ServerBossInfo(this.getDisplayName(), BossInfo.Color.WHITE, BossInfo.Overlay.PROGRESS);

	private int nearestWater = 99999;
	private int tx = 0;
	private int ty = 0;
	private int tz = 0;
	private GenericTargetSorter targetSorter;

	public WaterDragonEntity(EntityType<? extends WaterMobEntity> type, World world) {
		super(type, world);
		targetSorter = new GenericTargetSorter(this);
	}


	@Override
	protected void registerGoals() {
		goalSelector.addGoal(2, new RandomWalkingGoal(this, 0.25D));
		goalSelector.addGoal(4, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		goalSelector.addGoal(4, new LookRandomlyGoal(this));

		targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, true, true, new TargetPredicate(this)));
	}

	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(150.0D);
		getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(20.0D);
	}

	@Override
	protected void updateAITasks() {
		if(isAlive()) {
			super.updateAITasks();
			this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());

//			if(world.rand.nextInt(200) == 1) {
//				setAttackTarget(null);
//			}

//			if(world.getDifficulty() != Difficulty.PEACEFUL && world.rand.nextInt(5) == 2) {
//				LivingEntity livingEntity = findTarget();
//				if(livingEntity != null) {
//					InsanityLog.info(livingEntity);
//					faceEntity(livingEntity, 10.0F, 10.0F);
//					if(getDistanceSq(livingEntity) < (4.0F + livingEntity.getWidth() / 2.0F) * (4.0F + livingEntity.getWidth() / 2.0F)) {
//						if(world.rand.nextInt(4) == 3 || world.rand.nextInt(5) == 4) {
//							attackEntityAsMob(livingEntity);
//						}
//					}
//				}
//			}


		}
	}

//	private LivingEntity findTarget() {
//		List entites = world.getEntitiesWithinAABB(LivingEntity.class, getBoundingBox().grow(14.0D, 4.0D, 14.0D));
//		Collections.sort(entites, targetSorter);
//		Iterator iterator = entites.iterator();
//		LivingEntity livingEntity;
//
//		do {
//			if(!iterator.hasNext()) {
//				return null;
//			}
//			livingEntity = (LivingEntity)iterator.next();
//		}while(!isTarget(livingEntity)); {
//			return livingEntity;
//		}
//
//	}
//
//	private boolean isTarget(LivingEntity livingEntity) {
//		if(livingEntity == null) {
//			return false;
//		}else if(livingEntity == this) {
//			return false;
//		}else if(!livingEntity.isAlive()) {
//			return false;
//		}else {
//			if(!getEntitySenses().canSee(livingEntity)) {
//				return false;
//			}else if(livingEntity instanceof PlayerEntity) {
//				if(((PlayerEntity)livingEntity).isCreative()) {
//					return false;
//				}else {
//					return true;
//				}
//			}else {
//				return true;
//			}
//		}
//	}



	@Override
	public void setCustomName(@Nullable ITextComponent name) {
		super.setCustomName(name);
		bossInfo.setName(this.getDisplayName());
	}

	@Override
	public void addTrackingPlayer(ServerPlayerEntity player) {
		super.addTrackingPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void removeTrackingPlayer(ServerPlayerEntity player) {
		super.removeTrackingPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void onKillCommand() {
		super.onKillCommand();
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}


	static class TargetPredicate implements Predicate<LivingEntity> {
		private final WaterDragonEntity parent;

		public TargetPredicate(WaterDragonEntity waterDragonEntity) {
			parent = waterDragonEntity;
		}

		@Override
		public boolean test(@Nullable LivingEntity entity) {
			if(entity.getDistanceSq(parent) > 9.0D) {
				if(entity instanceof GuardianEntity) {
					return false;
				}else return !(entity instanceof WaterMobEntity);
			}else {
				return false;
			}
		}
	}






}
