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
import net.minecraftforge.common.Tags;

import javax.annotation.Nullable;

public class GirlfriendEntity extends TameableEntity {
	private static final DataParameter<Integer> VARIANT = EntityDataManager.createKey(GirlfriendEntity.class, DataSerializers.VARINT);
	private boolean calm;
	private int baseHealth = 80;

	public GirlfriendEntity(EntityType<? extends TameableEntity> type, World world) {
		super(type, world);
	}

	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(CalendarUtils.isToday()/*isValentinesDay()*/ && !calm ? 800 : baseHealth);

	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
	}

	@Override
	public boolean processInteract(PlayerEntity player, Hand hand) {
		ItemStack stack = player.getHeldItem(hand);
		if(stack.getItem() == Items.DIAMOND) {
			calm = true;
			if(!player.abilities.isCreativeMode) {
				stack.shrink(1);
			}
			return true;
		}
		return super.processInteract(player, hand);
	}

	@Override
	public boolean attackEntityFrom(DamageSource damageSource, float p_70097_2_) {
		if(!damageSource.getDamageType().equals("cactus")) {
			if(CalendarUtils.isToday()/*isValentinesDay()*/ && !calm) {
			}
		}
		return super.attackEntityFrom(damageSource, p_70097_2_);
	}

 	boolean hasBeenCalmed = false;
	@Override
	public void livingTick() {
		super.livingTick();
		if(calm && !hasBeenCalmed) {
			getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(baseHealth);
			hasBeenCalmed = true;
		}
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
		compound.putBoolean("Calm", calm);
	}

	@Override
	public void readAdditional(CompoundNBT compound) {
		super.readAdditional(compound);
		setVariant(compound.getInt("Variant"));
		calm = compound.getBoolean("Calm");
	}
}
