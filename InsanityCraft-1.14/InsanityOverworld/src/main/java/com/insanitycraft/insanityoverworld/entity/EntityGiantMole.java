package com.insanitycraft.insanityoverworld.entity;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class EntityGiantMole extends MonsterEntity implements IMob {

	public EntityGiantMole(EntityType<EntityGiantMole> type, World world) {
		super(type, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose p_213348_1_, EntitySize p_213348_2_) {
		return 2.0F;
	}

	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 0.5F, true));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
	}

	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5F);
		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(18.0F);
	}
}
