
package net.mcreator.varioustextures.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.properties.SlabType;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousAdditionsModElements;

import java.util.List;
import java.util.Collections;

@VariousAdditionsModElements.ModElement.Tag
public class MagmaPalmSlabBlock extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:magma_palm_slab")
	public static final Block block = null;
	public MagmaPalmSlabBlock(VariousAdditionsModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MagniumItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends SlabBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2.4000000000000004f, 3.6000000000000005f)
					.setLightLevel(s -> 0).harvestLevel(0).harvestTool(ToolType.AXE).setRequiresTool());
			setRegistryName("magma_palm_slab");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 6;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}
	}
}
