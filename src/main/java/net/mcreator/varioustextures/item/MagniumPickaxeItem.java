
package net.mcreator.varioustextures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousAdditionsModElements;

@VariousAdditionsModElements.ModElement.Tag
public class MagniumPickaxeItem extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:magnium_pickaxe")
	public static final Item block = null;
	public MagniumPickaxeItem(VariousAdditionsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2048;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 4.5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MagniumSwordItem.block, (int) (1)));
			}
		}, 1, -2.8f, new Item.Properties().group(MagniumItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("magnium_pickaxe"));
	}
}
