package projet.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import projet.Main;
import projet.lib.ModInfo;
import projet.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LeavePalmTree extends BlockLeavesBase{
	protected Icon fastIcon;
	
	public LeavePalmTree(int par1) {
		super(par1,Material.leaves,false);
				
		this.setTickRandomly(true);
        this.setCreativeTab(Main.ProjetCreativetabDecorations);
        this.setStepSound(Block.soundGrassFootstep);
        this.setUnlocalizedName(Names.Leave_PalmTree_unlocalizedName);
        this.setLightOpacity(1);
        this.setHardness(0.2f);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		blockIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.Leave_PalmTree_unlocalizedName);
		fastIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.Leave_PalmTree_Opaque_unlocalizedName);
	}
	
	public boolean isOpaqueCube()
	{
		return Block.leaves.isOpaqueCube();
	}
	
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess blockaccess, int x, int y, int z, int side)
	{
		return !this.isOpaqueCube() ? true : super.shouldSideBeRendered(blockaccess, x, y, z, side);
	}
	
	public Icon getIcon(int side, int metadata)
	{
		if(isOpaqueCube()){
			return fastIcon;
		}
		else{
			return blockIcon;
		}
	}
	
	public void getSubBlocks(int par1, CreativeTabs creativeTabs, List list)
	{
		list.add(new ItemStack(par1, 1, 0));
	}
	
	@Override
	public boolean isLeaves(World world, int x, int y, int z)
	{
		return true;
	}
	
	public int quantityDropped(Random random)
	{
		return random.nextInt(20) == 0 ? 1 : 0;
	}

	public int idDropped(int metadata, Random random, int par3)
	{
		return Blocks.Leave_PalmTree.blockID;
	}
	
	public void dropBlockAsItemWithChance(World world, int x, int y, int z, int par5, float par6, int par7)
	{
		if(!world.isRemote)
		{
			if(world.rand.nextInt(20) == 0)
			{
				int splingid = this.idDropped(par5, world.rand, par7);
				this.dropBlockAsItem_do(world, x, y, z, new ItemStack(splingid, 1, this.damageDropped(par5)));
			}
		}
	}
}
