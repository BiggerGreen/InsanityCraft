package com.insanitycraft.insanityoverworld.entity;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class EntityKraken extends MonsterEntity implements IMob {

	public EntityKraken(EntityType<EntityKraken> type, World world) {
		super(type, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose p_213348_1_, EntitySize p_213348_2_) {
		return 11.0F;
	}
}
