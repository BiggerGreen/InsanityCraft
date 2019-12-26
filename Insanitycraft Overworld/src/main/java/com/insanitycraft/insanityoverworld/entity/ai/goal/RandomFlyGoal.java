package com.insanitycraft.insanityoverworld.entity.ai.goal;

import net.minecraft.entity.FlyingEntity;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.entity.ai.goal.Goal;
import java.util.EnumSet;
import java.util.Random;

public class RandomFlyGoal extends Goal {
	protected final FlyingEntity creature;

	public RandomFlyGoal(FlyingEntity entity) {
		this.creature = entity;
		this.setMutexFlags(EnumSet.of(Flag.MOVE));
	}

	@Override
	public boolean shouldExecute() {
		MovementController movementController = this.creature.getMoveHelper();
		if(!movementController.isUpdating()){
			return true;
		}else {
//			double d0 = movementController.getX() - this.creature.posX;
//			double d1 = movementController.getY() - this.creature.posY;
//			double d2 = movementController.getZ() - this.creature.posZ;
//			double d3 = d0 * d0 + d1 * d1 + d2 * d2;
//			return d3 < 1.0D || d3 > 3600.0D;
		}
		return false;
	}

	@Override
	public boolean shouldContinueExecuting() {
		return false;
	}

	@Override
	public void startExecuting() {
//		Random random = this.creature.getRNG();
//		double d0 = this.creature.posX + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
//		double d1 = this.creature.posY + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
//		double d2 = this.creature.posZ + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
//		this.creature.getMoveHelper().setMoveTo(d0, d1, d2, 1.0D);
	}
}
