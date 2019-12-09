package com.insanitycraft.insanityoverworld.entity;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.entity.ai.controller.FlyHelperController;
import com.insanitycraft.insanityoverworld.entity.ai.goal.RandomFlyGoal;
import com.insanitycraft.insanityoverworld.util.GenericTargetSorter;
import com.insanitycraft.insanityoverworld.util.ITarget;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.block.Block;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.ServerBossInfo;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EntityKraken extends FlyingEntity implements IMob {

	private final ServerBossInfo bossInfo = new ServerBossInfo(this.getDisplayName(), BossInfo.Color.BLUE, BossInfo.Overlay.PROGRESS);

	private GenericTargetSorter TargetSorter = null;
	private LivingEntity caught = null;
	private int targetNum = 0;
	private boolean release = false;
	private int hurtTimer = 0;


	public EntityKraken(EntityType<EntityKraken> type, World world) {
		super(type, world);
		this.moveController = new FlyHelperController(this);
		this.TargetSorter = new GenericTargetSorter(this);
	}

	@Override
	protected void registerGoals() {

		this.goalSelector.addGoal(1, new RandomFlyGoal(this));
		this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, CowEntity.class, true));
	//	this.goalSelector.addGoal(3, new LightningBoltAttackGoal(this, 500, true));
	}

	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1000.0D);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0F);
		this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0F);
		this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(100.0D);

		//		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(40.0F);
	}



	@Override
	protected float getStandingEyeHeight(Pose p_213348_1_, EntitySize p_213348_2_) {
		return 11.0F;
	}

	@Override
	public boolean isNonBoss() {
		return false;
	}

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
	protected void updateAITasks() {
		int keep_trying = 50;

		if(isAlive()) {
			super.updateAITasks();
			this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());

			//InsanityLog.info("IS ALIVE");

			if(hurtTime > 0) {
				--this.hurtTimer;
			}

			if(this.world.rand.nextInt(400) == 1 && !InsanityOverworld.config.playNice.get()) {
				if(world instanceof ServerWorld) {
					ServerWorld serverWorld = (ServerWorld)world;
					serverWorld.addLightningBolt(new LightningBoltEntity(this.world, this.posX, this.posY - 16.0D, this.posZ, false));
				}
			}

			int i;
			Block block;
			CreatureEntity creature;

			if(this.targetNum == 0 && this.rand.nextInt(250) != 1) {
				if(this.caught == null && this.world.rand.nextInt(8) == 1 && !InsanityOverworld.config.playNice.get()) {
					creature = null;
					PlayerEntity target = this.world.getClosestEntityWithinAABB(PlayerEntity.class, EntityPredicate.DEFAULT, this, 25.0D, 40.0D, 25.0D, this.getBoundingBox());
					if(target != null) {
						if(!target.isCreative()) {
							if(this.getEntitySenses().canSee(target)) {
								this.attackWithSomething(target);
							}
						} else {
							target = null;
						}
					}

					if(target == null && this.world.rand.nextInt(2) == 0) {
						LivingEntity e = null;
						e = this.findSomethingToAttack();
					}
				}
			}

		}

	}

	private void attackWithSomething(LivingEntity entity) {
		if(caught == null) {
			double dist = (this.posX - entity.posX) * (this.posX - entity.posX);
			dist += (this.posZ - entity.posZ) * (this.posZ - entity.posZ);
			dist += (this.posY - entity.posY - 15.0D) * (this.posY - entity.posY - 15.0D);
			if(dist < 30.0D) {
				this.caught = entity;
				this.release = false;
			}
		}
	}

	private LivingEntity findSomethingToAttack() {
		if(InsanityOverworld.config.playNice.get()) {
			return null;
		}else {
			List entities = this.world.getEntitiesWithinAABB(LivingEntity.class, this.getBoundingBox().grow(20.0D, 40.0D, 20.0D));
			Collections.sort(entities, this.TargetSorter);
			Iterator iterator = entities.iterator();
			Entity entity;
			LivingEntity livingEntity;

			do {
				if(!iterator.hasNext()) {
					return null;
				}

				entity = (Entity)iterator.next();
				livingEntity = (LivingEntity)entity;
				InsanityLog.info(livingEntity);
			}while(!this.isSuitableTarget(livingEntity));
			return livingEntity;
		}
	}

	private boolean isSuitableTarget(LivingEntity livingEntity) {
		if(livingEntity == null) {
			return false;
		}else if(livingEntity == this) {
			return false;
		}else {
			if(livingEntity instanceof ITarget) {
				return true;
			}
		}
		return false;
	}


	@Override
	public void onKillCommand() {
		super.onKillCommand();
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}

}
