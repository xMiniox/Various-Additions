
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
public class EterniumPickaxeItem extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:eternium_pickaxe")
	public static final Item block = null;
	public EterniumPickaxeItem(VariousAdditionsModElements instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4096;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EterniumItem.block, (int) (1)));
			}
		}, 1, -2.8f, new Item.Properties().group(MagniumItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("eternium_pickaxe"));
	}
}
