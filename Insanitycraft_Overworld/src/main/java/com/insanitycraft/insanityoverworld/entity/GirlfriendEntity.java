package com.insanitycraft.insanityoverworld.entity;

import com.insanitycraft.insanityoverworld.util.CalendarUtils;
import net.minecraft.entity.*;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class GirlfriendEntity extends TameableEntity {
	private static final DataParameter<Integer> VARIANT = EntityDataManager.createKey(GirlfriendEntity.class, DataSerializers.VARINT);
	private static final DataParameter<Boolean> CALM = EntityDataManager.createKey(GirlfriendEntity.class, DataSerializers.BOOLEAN);
	private int baseHealth = 80;

	public GirlfriendEntity(EntityType<? extends TameableEntity> type, World world) {
		super(type, world);
	}

	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(CalendarUtils.isToday()/*isValentinesDay()*/ && !isCalm() ? 800 : baseHealth);

	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
	}

	@Override
	public boolean processInteract(PlayerEntity player, Hand hand) {
		ItemStack stack = player.getHeldItem(hand);
		if(!isCalm() && CalendarUtils.isToday()) {
			if(stack.getItem() == Items.DIAMOND) {
				setCalm(true);

				if(!player.abilities.isCreativeMode) {
					stack.shrink(1);
				}
				return true;
			}
		}
		return super.processInteract(player, hand);
	}

	@Override
	public boolean attackEntityFrom(DamageSource damageSource, float p_70097_2_) {




		return super.attackEntityFrom(damageSource, p_70097_2_);
	}

	@Nullable
	@Override
	public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
		setVariant(0);
		return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
	}

	@Nullable
	@Override
	public AgeableEntity createChild(AgeableEntity ageableEntity) {
		return null;
	}

	@Override
	protected void registerData() {
		super.registerData();
		dataManager.register(VARIANT, 0);
		dataManager.register(CALM, false);
	}

	@Override
	public void writeAdditional(CompoundNBT compound) {
		super.writeAdditional(compound);
		compound.putInt("Variant", getVariant());
		compound.putBoolean("Calm", isCalm());
	}

	@Override
	public void readAdditional(CompoundNBT compound) {
		super.readAdditional(compound);
		setVariant(compound.getInt("Variant"));
		setCalm(compound.getBoolean("Calm"));
	}

	public boolean isCalm() {
		return dataManager.get(CALM);
	}

	public void setCalm(boolean calm) {
		dataManager.set(CALM, calm);
	}

	public int getVariant() {
		return dataManager.get(VARIANT);
	}

	public void setVariant(int variant) {
		dataManager.set(VARIANT, variant);
	}
}
