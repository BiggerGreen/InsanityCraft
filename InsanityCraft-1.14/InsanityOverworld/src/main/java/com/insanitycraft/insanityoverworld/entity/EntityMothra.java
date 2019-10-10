package com.insanitycraft.insanityoverworld.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class EntityMothra extends MonsterEntity implements IMob {

	public EntityMothra(EntityType<EntityMothra> type, World world) {
		super(type, world);
	}
}
