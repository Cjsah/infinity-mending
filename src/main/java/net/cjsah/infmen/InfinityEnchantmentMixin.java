package net.cjsah.infmen;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.InfinityEnchantment;
import net.minecraft.entity.EquipmentSlot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(InfinityEnchantment.class)
public class InfinityEnchantmentMixin extends Enchantment {

	protected InfinityEnchantmentMixin(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
		super(weight, type, slotTypes);
	}

	/**
	 * @author Cjsah
	 * @reason 使无限和经验修补能够打在一张弓上
	 */
	@Overwrite
	public boolean canAccept(Enchantment other) {
		return super.canAccept(other);
	}
}
