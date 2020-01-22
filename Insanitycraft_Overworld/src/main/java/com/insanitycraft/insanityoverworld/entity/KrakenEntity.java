package com.insanitycraft.insanityoverworld.entity;

import com.insanitycraft.insanityoverworld.InsanityOverworld;
import com.insanitycraft.insanityoverworld.util.GenericTargetSorter;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerBossInfo;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.WorldInfo;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class KrakenEntity extends MobEntity implements IMob {

	private final ServerBossInfo bossInfo = new ServerBossInfo(getDisplayName(), BossInfo.Color.BLUE, BossInfo.Overlay.PROGRESS);

	private GenericTargetSorter targetSorter = null;
	private BlockPos currentFlightTarget = null;
	private LivingEntity caught = null;
	private int targetNum = 0;
	private boolean release = false;
	private int straight_down = 1;
	private int hurtTimer = 0;


	public KrakenEntity(EntityType<KrakenEntity> type, World world) {
		super(type, world);
		targetSorter = new GenericTargetSorter(this);
	}

	@Override
	protected void registerGoals() {

		goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		goalSelector.addGoal(8, new LookRandomlyGoal(this));
		targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, CowEntity.class, true));
	}

	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1000.0D);
		getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0F);
		getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(10.0F);
		getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(100.0D);
//		getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(40.0F);
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
		bossInfo.setName(getDisplayName());
	}

	@Override
	public void addTrackingPlayer(ServerPlayerEntity player) {
		super.addTrackingPlayer(player);
		bossInfo.addPlayer(player);
	}

	@Override
	public void removeTrackingPlayer(ServerPlayerEntity player) {
		super.removeTrackingPlayer(player);
		bossInfo.removePlayer(player);
	}

	int weatherUpdate = 0;
	@Override
	public void tick() {
		super.tick();
		if(isAlive()) {
			if(currentFlightTarget == null) {
				//currentFlightTarget = new BlockPos(posX, posY - 10.0D, posZ);
//			}else if(posY < currentFlightTarget.getY()) {
//				Vec3d motion = getMotion();
//				motion.mul(0, 0.72D, 0);
//				setMotion(motion);
			}else {
				Vec3d motion = getMotion();
				motion.mul(0, 0.5D, 0);
				setMotion(motion);
			}

			if(weatherUpdate > 0) {
				--weatherUpdate;
				if(!world.isRemote && weatherUpdate == 0) {
					WorldInfo info = world.getWorldInfo();
					if(!world.isRaining()) {
						info.setRainTime(300);
						info.setThunderTime(300);
						info.setRaining(true);
						info.setThundering(true);
					}else {
						info.setRainTime(300);
						info.setThunderTime(300);
					}
					weatherUpdate = 100;
				}
			}
		}
	}

	@Override
	protected void updateAITasks() {
		int keep_trying = 50;

		if(isAlive()) {
			super.updateAITasks();
			bossInfo.setPercent(getHealth() / getMaxHealth());

			if(hurtTime > 0) {
				--hurtTimer;
			}

			if(world.rand.nextInt(400) == 1 && !InsanityOverworld.config.playNice.get()) {
				if(world instanceof ServerWorld) {
					ServerWorld serverWorld = (ServerWorld)world;
//					serverWorld.addLightningBolt(new LightningBoltEntity(world, posX, posY - 16.0D, posZ, false));
				}
			}

			if(currentFlightTarget == null) {
//				currentFlightTarget = new BlockPos(posX, posY, posZ);
			}

			int i;
			Block block;
			CreatureEntity creature;

			if(targetNum == 0 && rand.nextInt(250) != 1) {
				if(caught == null && world.rand.nextInt(8) == 1 && !InsanityOverworld.config.playNice.get()) {
					creature = null;
					PlayerEntity target = world.getClosestEntityWithinAABB(PlayerEntity.class, EntityPredicate.DEFAULT, this, 25.0D, 40.0D, 25.0D, getBoundingBox());
					if(target != null) {
						if(!target.isCreative()) {
							if(getEntitySenses().canSee(target)) {
//								currentFlightTarget.add(target.posX, target.posY + 15, target.posZ);
								attackWithSomething(target);
							}
						} else {
							target = null;
						}
					}

					if(target == null && world.rand.nextInt(2) == 0) {
						LivingEntity livingEntity = null;
						livingEntity = findSomethingToAttack();
						if(livingEntity != null) {
//							currentFlightTarget.add(livingEntity.posX, livingEntity.posY + 15, livingEntity.posZ);
							attackWithSomething(livingEntity);
						}
					}
				}
			}else {
				targetNum = 0;

				int groundDist;
				for(groundDist = 0; groundDist < 31; ++groundDist) {
//					block = world.getBlockState(new BlockPos(posX, posY- groundDist, posZ)).getBlock();
//					if(block != Blocks.AIR) {
//						straight_down = 0;
//						break;
//					}
				}

				groundDist = 20 - groundDist;

				for(block = Blocks.STONE; block != Blocks.AIR && keep_trying != 0; --keep_trying) {
					int zDir = world.rand.nextInt(6) + 12;
					int xDir = world.rand.nextInt(6) + 12;
					if(world.rand.nextInt(2) == 0) {
						zDir = -zDir;
					}
					if(world.rand.nextInt(2) == 0) {
						xDir = -xDir;
					}
					if(straight_down != 0) {
						xDir = 0;
						zDir = 0;
					}

//					currentFlightTarget.add(posX + xDir, posY + groundDist + rand.nextInt(9) - 6, posZ + zDir);
					block = world.getBlockState(currentFlightTarget).getBlock();
					if(block == Blocks.AIR) {
						block = Blocks.STONE;
					}
				}
			}
			if(caught != null) {
				if(caught.isAlive()) {
//					currentFlightTarget.add(posX, 200, posZ);
//					if(posY > 190.0D) {
//						release = true;
//					}
//
//					caught.setMotion(getMotion());
//					caught.posX = posX;
//					if(posY - caught.posY > 16.0D) {
//						LivingEntity entity = caught;
//						Vec3d newMotion = caught.getMotion();
//						newMotion.add(0, 0.25D, 0);
//						entity.setMotion(newMotion);
//					}
//
//					caught.posX = posX;
//					caught.posY = posY - 15.0D;
//					caught.posZ = posZ;
//					if(world.rand.nextInt(50) == 1) {
//						attackEntityAsMob(caught);
//					}

				}
			}
		}

	}

	private void attackWithSomething(LivingEntity entity) {
		if(caught == null) {
//			double dist = (posX - entity.posX) * (posX - entity.posX);
//			dist += (posZ - entity.posZ) * (posZ - entity.posZ);
//			dist += (posY - entity.posY - 15.0D) * (posY - entity.posY - 15.0D);
//			if(dist < 30.0D) {
//				caught = entity;
//				InsanityLog.info("Caught: " + caught);
//				release = false;
//
//			}
		}
	}

	private LivingEntity findSomethingToAttack() {

		List entities = world.getEntitiesWithinAABB(LivingEntity.class, getBoundingBox().grow(20.0D, 40.0D, 20.0D));
		Collections.sort(entities, targetSorter);
		Iterator iterator = entities.iterator();
		LivingEntity livingEntity;

		do {
			if(!iterator.hasNext()) {
				return null;
			}

			livingEntity = (LivingEntity)iterator.next();
		}while(!isTarget(livingEntity)); {
			InsanityLog.info("Target: " + livingEntity);
			return livingEntity;
		}
	}

	private boolean isTarget(LivingEntity livingEntity) {
		if(livingEntity == null) {
			return false;
		}else if(livingEntity == this) {
			return false;
		}else if(!livingEntity.isAlive()) {
			return false;
		}else {
			if(!getEntitySenses().canSee(livingEntity)) {
				return false;
			}else if(livingEntity instanceof PlayerEntity) {
				PlayerEntity player = (PlayerEntity)livingEntity;
				if(player.isCreative()) {
					return false;
				}else {
					return !player.abilities.isFlying;
				}

			}else if(!livingEntity.onGround && ! livingEntity.isInWater()) {
				return false;
			}else if(livingEntity instanceof SquidEntity || livingEntity instanceof KrakenEntity) {
				return false;
			}else {
				return !(livingEntity instanceof MothraEntity);
			}
		}
	}


	@Override
	public void onKillCommand() {
		super.onKillCommand();
		bossInfo.setPercent(getHealth() / getMaxHealth());
	}

}
