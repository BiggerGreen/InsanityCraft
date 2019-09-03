package com.insanitycraft.insanityoverworld.entity;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityAnt extends AnimalEntity {

	public EntityAnt(EntityType<EntityAnt> type, World worldIn) {
		super(type, worldIn);
	}

	@Nullable
	@Override
	public AgeableEntity createChild(AgeableEntity ageable) {
		return null;
	}
}
