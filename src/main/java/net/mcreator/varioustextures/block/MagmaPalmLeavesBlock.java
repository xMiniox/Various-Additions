
package net.mcreator.varioustextures.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousAdditionsModElements;

@VariousAdditionsModElements.ModElement.Tag
public class MagmaPalmLeavesBlock extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:magma_palm_leaves")
	public static final Block block = null;
	public MagmaPalmLeavesBlock(VariousAdditionsModElements instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MagniumItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends LeavesBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.PLANT).hardnessAndResistance(0.24f, 0.24f).setLightLevel(s -> 0)
					.harvestLevel(0).harvestTool(ToolType.HOE).setRequiresTool().notSolid());
			setRegistryName("magma_palm_leaves");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 36;
		}
	}
}
