package com.insanitycraft.insanityoverworld.entity;

import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.ServerBossInfo;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityTrex extends MonsterEntity implements IMob {

	private final ServerBossInfo bossInfo = new ServerBossInfo(this.getDisplayName(), BossInfo.Color.GREEN, BossInfo.Overlay.PROGRESS);

	public EntityTrex(EntityType<EntityTrex> type, World world) {
		super(type, world);
	}

	@Override
	protected float getStandingEyeHeight(Pose p_213348_1_, EntitySize p_213348_2_) {
		return this.getSize(p_213348_1_).height * 0.90F;
	}

	@Override
	public void tick() {
		super.tick();

		if(this.hasCustomName()) {
			if("Conga".equals(this.getName().getString())) { //Conga is an artist for the mod if your wondering.
				this.recalculateSize();
			}
		}
	}

	@Override
	public float getRenderScale() {
		if(this.hasCustomName()) {
			if("Conga".equals(this.getName().getString())) { //Conga is an artist for the mod if your wondering.
				return 0.2f;
			}
		}

		return 1.0f;
	}

	@Override
	public void setCustomName(@Nullable ITextComponent name) {
		super.setCustomName(name);
		bossInfo.setName(this.getDisplayName());
	}

	@Override
	public void addTrackingPlayer(ServerPlayerEntity player) {
		super.addTrackingPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void removeTrackingPlayer(ServerPlayerEntity player) {
		super.removeTrackingPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	protected void updateAITasks() {
		super.updateAITasks();
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}

	@Override
	public void onKillCommand() {
		super.onKillCommand();
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
	}
}
