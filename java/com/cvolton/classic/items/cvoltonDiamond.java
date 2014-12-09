package com.cvolton.classic.items;

import java.util.Random;

import com.cvolton.classic.help.Reference;
import com.cvolton.classic.init.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class cvoltonDiamond extends Block{
	public IIcon Bottom;
	public IIcon Top;
	public IIcon Side2;
	public cvoltonDiamond()
	{
	super(Material.rock);
	setCreativeTab(ModTabs.classtab);
	setHardness(10.6F);
	}
	public void registerBlockIcons(IIconRegister icon){
	Bottom = icon.registerIcon(Reference.MODID + ":diamond_bottom");
	Top = icon.registerIcon("minecraft:diamond_block");
	Side2 = icon.registerIcon(Reference.MODID + ":diamond_side");
	
	}
	public IIcon getIcon(int side, int meta)
	    {
		if(side == 0){
			return Bottom;
		}else if(side == 1){
			return Top;
		}else if(side == 2){
			return Side2;
		}else if(side == 3){
			return Side2;
		}else if(side == 4){
			return Side2;
		}else if(side == 5){
			return Side2;
		}
	        return null;
	    }
	
	
	}

