package com.stuntmania.placeableitems.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.stuntmania.placeableitems.PlaceableItems;
import com.stuntmania.placeableitems.tileentity.TEApple;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockApple extends BlockPlaceableItems {
	
	public BlockApple() {
		super(Material.sponge);
		setBlockTextureName(PlaceableItems.MODID + ":destroy/apple");
		setBlockBounds(0.3F, 0, 0.3F, 0.7F, 0.5F, 0.7F);
		setBlockName("appleBlock");
		GameRegistry.registerBlock(this, "appleBlock");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int par2) {
		return new TEApple();
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Items.apple;
	}
	
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		return new ItemStack(Items.apple);
	}
}