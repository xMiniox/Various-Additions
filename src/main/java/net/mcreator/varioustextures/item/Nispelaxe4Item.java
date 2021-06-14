
package net.mcreator.varioustextures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.varioustextures.VariousAdditionsModElements;

@VariousAdditionsModElements.ModElement.Tag
public class Nispelaxe4Item extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:nispelaxe_4")
	public static final Item block = null;
	public Nispelaxe4Item(VariousAdditionsModElements instance) {
		super(instance, 365);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3500;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 9.5f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.7f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("nispelaxe_4"));
	}
}
