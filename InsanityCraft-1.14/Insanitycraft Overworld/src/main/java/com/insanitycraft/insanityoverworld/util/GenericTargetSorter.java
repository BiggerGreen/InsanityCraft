package com.insanitycraft.insanityoverworld.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.CreeperEntity;

import java.util.Comparator;

public class GenericTargetSorter implements Comparator {

	private Entity entity;

	public GenericTargetSorter(Entity entity) {
		this.entity = entity;
	}

	public int compareDistanceSq(Entity entity1, Entity entity2) {
		double weight = 0.0D;
		double dist1 = this.entity.getDistanceSq(entity1);
		if(entity1 instanceof CreeperEntity) {
			dist1 /= 2.0D;
		}

		weight = entity1.getHeight() * entity1.getWidth();
		if(weight > 1.0D) {
			dist1 /= weight;
		}

		double dist2 = this.entity.getDistanceSq(entity2);
		if(entity2 instanceof CreeperEntity) {
			dist2 /= 2.0D;
		}

		weight = entity2.getHeight() * entity2.getWidth();
		if(weight > 1.0D) {
			dist2 /= weight;
		}

		return Double.compare(dist1, dist2);

	}

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Entity && o2 instanceof Entity) {
			return this.compareDistanceSq((Entity)o1, (Entity)o2);
		}
		return 0;
	}
}
