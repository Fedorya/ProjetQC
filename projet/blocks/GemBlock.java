package projet.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import projet.Main;
import projet.lib.ModInfo;
import projet.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GemBlock extends Block{
	final String unLocalName;
	
	public GemBlock(int id, String pUnLocaName){
		super(id,Material.rock);
		
		unLocalName = pUnLocaName;
		
		this.setUnlocalizedName(unLocalName);
		this.setCreativeTab(Main.ProjetCreativetabBlocks);
		this.setHardness(3F);
		this.setResistance(10F);
		this.setStepSound(Block.soundMetalFootstep);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + unLocalName);
	}
}
