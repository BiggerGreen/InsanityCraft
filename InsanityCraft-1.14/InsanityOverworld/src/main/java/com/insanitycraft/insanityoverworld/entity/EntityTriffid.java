package com.insanitycraft.insanityoverworld.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class EntityTriffid extends MonsterEntity implements IMob {

	public EntityTriffid(EntityType<EntityTriffid> type, World world) {
		super(type, world);
	}
}
