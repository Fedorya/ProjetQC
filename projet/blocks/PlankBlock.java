package projet.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import projet.Main;
import projet.lib.ModInfo;
import projet.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PlankBlock extends Block{
	
	public PlankBlock(int id){
		super(id,Material.wood);
		
		this.setCreativeTab(Main.ProjetCreativetabBlocks);
		this.setHardness(2F);
		this.setResistance(5F);
		this.setStepSound(Block.soundWoodFootstep);
	}
	
	@SideOnly(Side.CLIENT)
	public static Icon[] icons;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		icons = new Icon[Names.Plank_Wood_unlocalizedName.length];

		for(int i = 0; i < icons.length; i++) {
			icons[i] = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.Plank_Wood_unlocalizedName[i]);
		}
	}
	
	@Override
	public Icon getIcon(int side, int meta) {
		return icons[meta];
	}
	
	@Override
	public void getSubBlocks(int id, CreativeTabs tab, List list) {
		for(int i = 0; i < Names.Plank_Wood_Name.length; i++) {
			list.add(new ItemStack(this, 1, i));
		}
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}
}
