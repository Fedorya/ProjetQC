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

public class OreSlate extends Block{
	
	public OreSlate(int id){
		super(id,Material.rock);
		
		this.setUnlocalizedName(Names.Ore_Slate_unlocalizedName);
		this.setCreativeTab(Main.ProjetCreativetabBlocks);
		this.setHardness(3F);
		this.setResistance(5F);
		this.setStepSound(Block.soundStoneFootstep);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.Ore_Slate_unlocalizedName);
	}
	
	@Override
	public int quantityDropped(Random par1Random)
    {
		final double random = (Math.random()*5)+1; 
        return (int)random;
    }
	
	/*@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return Items.copperFrag.itemID;
    }*/
	
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta){
		final double random = Math.random()*5;
		this.dropXpOnBlockBreak(world, x, y, z, (int)random);
	}
}
