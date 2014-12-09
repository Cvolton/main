package com.cvolton.classic.items;

import com.cvolton.classic.init.ModItems;
import com.cvolton.classic.init.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class itemCvoltonSlab extends ItemSlab
{
    public itemCvoltonSlab(Block block)
    {
	    super(block, (BlockSlab)ModItems.cobbleSlab, (BlockSlab)ModItems.cobbleSlabDouble, false);
	    this.setMaxDamage(0);
	    this.setHasSubtypes(true);
    }
}
