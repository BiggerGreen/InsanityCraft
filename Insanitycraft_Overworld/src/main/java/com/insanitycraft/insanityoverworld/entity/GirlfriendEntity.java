package com.insanitycraft.insanityoverworld.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class GirlfriendEntity extends MobEntity {
	private static final DataParameter<Integer> VARIANT = EntityDataManager.createKey(GirlfriendEntity.class, DataSerializers.VARINT);

	public GirlfriendEntity(EntityType<? extends MobEntity> type, World worldIn) {
		super(type, worldIn);
	}

	@Nullable
	@Override
	public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
		setVariant(0);
		return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
	}

	public int getVariant() {
		return dataManager.get(VARIANT);
	}

	public void setVariant(int variant) {
		dataManager.set(VARIANT, variant);
	}

	@Override
	protected void registerData() {
		super.registerData();
		dataManager.register(VARIANT, 0);
	}

	@Override
	public void writeAdditional(CompoundNBT compound) {
		super.writeAdditional(compound);
		compound.putInt("Variant", getVariant());
	}

	@Override
	public void readAdditional(CompoundNBT compound) {
		super.readAdditional(compound);
		setVariant(compound.getInt("Variant"));
	}
}
