
package net.mcreator.varioustextures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousTexturesModElements;

@VariousTexturesModElements.ModElement.Tag
public class MagniumHoeItem extends VariousTexturesModElements.ModElement {
	@ObjectHolder("various_textures:magnium_hoe")
	public static final Item block = null;
	public MagniumHoeItem(VariousTexturesModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MagniumSwordItem.block, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(MagniumItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("magnium_hoe"));
	}
}
