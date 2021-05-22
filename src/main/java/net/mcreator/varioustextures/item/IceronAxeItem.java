
package net.mcreator.varioustextures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousAdditionsModElements;

@VariousAdditionsModElements.ModElement.Tag
public class IceronAxeItem extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:iceron_axe")
	public static final Item block = null;
	public IceronAxeItem(VariousAdditionsModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 323;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(IceronIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MagniumItemGroup.tab)) {
		}.setRegistryName("iceron_axe"));
	}
}
