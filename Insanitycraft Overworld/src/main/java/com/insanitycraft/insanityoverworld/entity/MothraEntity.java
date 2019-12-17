package com.insanitycraft.insanityoverworld.entity;

import com.insanitycraft.insanityoverworld.util.InsanityLog;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.ServerBossInfo;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class MothraEntity extends MonsterEntity implements IMob {

	private final ServerBossInfo bossInfo = new ServerBossInfo(this.getDisplayName(), BossInfo.Color.YELLOW, BossInfo.Overlay.PROGRESS);

	public MothraEntity(EntityType<MothraEntity> type, World world) {
		super(type, world);
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

	@Override
	public void onKillEntity(LivingEntity entity) {
		super.onKillEntity(entity);
		if(entity instanceof PlayerEntity) {
			InsanityLog.info("You fool");
		}
	}
}
