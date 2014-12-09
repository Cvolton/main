package com.cvolton.classic.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGravel;
import net.minecraft.block.material.Material;

import com.cvolton.classic.init.ModTabs;

public class cvoltonGravel extends BlockGravel{

	public cvoltonGravel()
	{
	//super(Material.rock);
	setCreativeTab(ModTabs.classtab);
	}
}
