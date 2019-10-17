package com.insanitycraft.insanityoverworld.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import static com.insanitycraft.insanityoverworld.init.InsanityItems.*;

public class SpecialSwordItem extends SwordItem {
	public SpecialSwordItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);

	}

	@Override
	public boolean hitEntity(ItemStack stack, LivingEntity entity, LivingEntity player) {
		super.hitEntity(stack, entity, player);
		if(!player.world.isRemote) {
			if(stack.getItem() == mantisClaw) {
				entity.heal(-1.0F);
				player.heal(1.0F);
				return true;
			}else if(stack.getItem() == scorpionTail) {
				int length = 10 + player.world.rand.nextInt(10);
				entity.addPotionEffect(new EffectInstance(Effects.POISON, length * 20, 0));
				return true;
			}
		}
		return true;
	}


}
