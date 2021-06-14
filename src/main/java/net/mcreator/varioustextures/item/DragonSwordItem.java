
package net.mcreator.varioustextures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousAdditionsModElements;

@VariousAdditionsModElements.ModElement.Tag
public class DragonSwordItem extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:dragon_sword")
	public static final Item block = null;
	public DragonSwordItem(VariousAdditionsModElements instance) {
		super(instance, 108);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 4096;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 3.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(StarFragmentItem.block, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(MagniumItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("dragon_sword"));
	}
}
