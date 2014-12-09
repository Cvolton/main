package com.cvolton.classic.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;

import com.cvolton.classic.init.ModItems;
import com.cvolton.classic.init.ModTabs;

public class cvoltonStairs extends BlockStairs {
	public cvoltonStairs(Block block)
	{
	super(block, 1);
	setCreativeTab(ModTabs.classtab);
	this.setLightOpacity(0);
	}
	public boolean isOpaqueCube()
	{
	return false;
	}
	public boolean renderAsNormalBlock()
	{
	return false;
	}
}
