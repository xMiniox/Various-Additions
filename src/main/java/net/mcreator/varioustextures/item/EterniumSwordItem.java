
package net.mcreator.varioustextures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.varioustextures.VariousAdditionsModElements;

@VariousAdditionsModElements.ModElement.Tag
public class EterniumSwordItem extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:eternium_sword")
	public static final Item block = null;
	public EterniumSwordItem(VariousAdditionsModElements instance) {
		super(instance, 99);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1741;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 22f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 56;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EterniumItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("eternium_sword"));
	}
}
