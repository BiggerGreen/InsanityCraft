package com.insanitycraft.insanityoverworld.entity;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.world.World;

public class EntityGiantMole extends MonsterEntity implements IMob {

	private EntitySize size;

	public EntityGiantMole(EntityType<EntityGiantMole> type, World world) {
		super(type, world);
		size = EntitySize.flexible(14.0F, 3.0F);
		recalculateSize();
	}


	@Override
	protected void registerGoals() {
		super.registerGoals();
	}

}
