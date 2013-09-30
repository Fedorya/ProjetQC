package projet.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import projet.Main;
import projet.lib.ModInfo;
import projet.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SaplingBlock extends BlockFlower{

	public SaplingBlock(int par1) {
		super(par1);
		
        this.setCreativeTab(Main.ProjetCreativetabDecorations);
        this.setStepSound(Block.soundGrassFootstep);
	}
	
	@SideOnly(Side.CLIENT)
	public static Icon[] icons;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		icons = new Icon[Names.Sapling_Type_unlocalizedName.length];

		for(int i = 0; i < icons.length; i++) {
			icons[i] = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.Sapling_Type_unlocalizedName[i]);
		}
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@Override
	public void getSubBlocks(int id, CreativeTabs tab, List list) {
		for(int i = 0; i < Names.Sapling_Type_Name.length; i++) {
			list.add(new ItemStack(this, 1, i));
		}
	}
	
	@Override
	public Icon getIcon(int par1, int par2)
    {
        return icons[par2];
    }
}
