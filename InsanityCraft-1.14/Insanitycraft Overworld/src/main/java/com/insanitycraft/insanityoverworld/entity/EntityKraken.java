package com.insanitycraft.insanityoverworld.entity;

import com.insanitycraft.insanityoverworld.entity.ai.controller.FlyHelperController;
import com.insanitycraft.insanityoverworld.entity.ai.goal.RandomFlyGoal;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.ServerBossInfo;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityKraken extends FlyingEntity implements IMob {

	private final ServerBossInfo bossInfo = new ServerBossInfo(this.getDisplayName(), BossInfo.Color.BLUE, BossInfo.Overlay.PROGRESS);

	public EntityKraken(EntityType<EntityKraken> type, World world) {
		super(type, world);
		this.moveController = new FlyHelperController(this);

	}

	@Override
	protected void registerGoals() {

		this.goalSelector.addGoal(1, new RandomFlyGoal(this));
		this.goalSelector.addGoal(8, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));

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
		super.updateAITasks();
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}

	@Override
	public void onKillCommand() {
		super.onKillCommand();
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}

}
