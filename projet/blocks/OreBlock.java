package projet.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import projet.Main;
import projet.items.Items;
import projet.lib.ModInfo;
import projet.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OreBlock extends Block{
	
	final String UnlocalName;
	final int idItem;
	
	public OreBlock(int pId, String pUnlocaName, int pIdItem){
		super(pId,Material.rock);
		
		UnlocalName = pUnlocaName;
		idItem = pIdItem;
		
		this.setUnlocalizedName(pUnlocaName);
		this.setCreativeTab(Main.ProjetCreativetabBlocks);
		this.setHardness(3F);
		this.setResistance(5F);
		this.setStepSound(Block.soundStoneFootstep);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + UnlocalName);
	}
	
	@Override
	public int quantityDropped(Random par1Random)
    {
		if(idItem == Items.Frag_Adamantite.itemID){
			return 1;
		}
		else{
			final double random = (Math.random()*5)+1; 
	        return (int)random;
		}
    }
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return idItem;
    }
	
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta){
		final double random = Math.random()*5;
		this.dropXpOnBlockBreak(world, x, y, z, (int)random);
	}
}
