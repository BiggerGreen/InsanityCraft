package com.insanitycraft.insanityoverworld.entity.ai.controller;

import net.minecraft.entity.FlyingEntity;
import net.minecraft.entity.ai.controller.MovementController;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class FlyHelperController extends MovementController {

	private final FlyingEntity creature;
	private int courceChangeCooldown;

	public FlyHelperController(FlyingEntity mob) {
		super(mob);
		this.creature = mob;
	}

	@Override
	public void tick() {
		if(this.action == Action.MOVE_TO) {
			if(this.courceChangeCooldown-- <= 0) {
				this.courceChangeCooldown += this.creature.getRNG().nextInt(5) + 2;
//				Vec3d vec3d = new Vec3d(this.posX - this.creature.posX, this.posY - this.creature.posY, this.posZ - this.creature.posZ);
//				double d0 = vec3d.length();
//				vec3d = vec3d.normalize();
//				if(this.offsetBB(vec3d, MathHelper.ceil(d0))) {
//					this.creature.setMotion(this.creature.getMotion().add(vec3d.scale(0.1D)));
//				}else {
					this.action = Action.WAIT;
//				}
			}
		}
	}

	private boolean offsetBB(Vec3d vec3d, int p_220673_2_) {
		AxisAlignedBB axisalignedbb = this.creature.getBoundingBox();

		for(int i = 1; i < p_220673_2_; ++i) {
			axisalignedbb = axisalignedbb.offset(vec3d);
//			if (!this.creature.world.isCollisionBoxesEmpty(this.creature, axisalignedbb)) {
//				return false;
//			}
		}

		return true;
	}
}
