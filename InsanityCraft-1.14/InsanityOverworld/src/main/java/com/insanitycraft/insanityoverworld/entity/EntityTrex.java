package com.insanitycraft.insanityoverworld.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class EntityTrex extends MonsterEntity implements IMob {

	public EntityTrex(EntityType<EntityTrex> type, World world) {
		super(type, world);
	}
}
