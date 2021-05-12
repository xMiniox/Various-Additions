
package net.mcreator.varioustextures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousAdditionsModElements;

@VariousAdditionsModElements.ModElement.Tag
public class CactusSwordItem extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:cactus_sword")
	public static final Item block = null;
	public CactusSwordItem(VariousAdditionsModElements instance) {
		super(instance, 187);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 1.9999999999999996f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(MagniumItemGroup.tab)) {
		}.setRegistryName("cactus_sword"));
	}
}
