package com.insanitycraft.insanityoverworld.entity;

import com.insanitycraft.insanityoverworld.client.renderer.entity.GirlfriendRenderer;
import com.insanitycraft.insanityoverworld.util.CalendarUtils;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
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

	public GirlfriendEntity(EntityType<? extends TameableEntity> type, World world) {
		super(type, world);
		setTamed(false);
	}

	@Override
	protected void registerAttributes() {
		super.registerAttributes();
		if(CalendarUtils.isToday() && !isCalm()) {
			getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(80.0D);
		}else {
			getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		}
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
		if(stack.getItem() == Items.GOLD_NUGGET) {
			changeVariant();

			if(!player.abilities.isCreativeMode) {
				stack.shrink(1);
			}
		}
		return super.processInteract(player, hand);
	}

	private void changeVariant() {
		if(dataManager.get(VARIANT) < (GirlfriendRenderer.GIRLFRIEND_TEXTURES.length - 1)) {//TODO change number ones the textures are done
			dataManager.set(VARIANT, dataManager.get(VARIANT) + 1);
		}else {
			dataManager.set(VARIANT, 0);
		}
		InsanityLog.info(dataManager.get(VARIANT));
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
