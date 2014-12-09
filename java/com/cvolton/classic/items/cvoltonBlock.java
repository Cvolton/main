package com.cvolton.classic.items;

import com.cvolton.classic.help.Reference;
import com.cvolton.classic.init.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class cvoltonBlock extends Block{

	public cvoltonBlock()
	{
	super(Material.rock);
	setCreativeTab(ModTabs.classtab);
	}
}
