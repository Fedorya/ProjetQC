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

public class LeaveTestPalmTree extends BlockLeavesBase{
	protected Icon fastIcon;
	
	public LeaveTestPalmTree(int par1) {
		super(par1,Material.leaves,false);
				
        this.setCreativeTab(Main.ProjetCreativetabDecorations);
        this.setStepSound(Block.soundGrassFootstep);
        this.setUnlocalizedName(Names.Leave_PalmTree_unlocalizedName);
        this.setTickRandomly(true);
        this.setBurnProperties(this.blockID, 5, 20);
        this.setLightOpacity(1);
        this.setHardness(0.2f);
	}
	
	@SideOnly(Side.CLIENT)
	public int getBlockColor(){
		double d0 = 1.0D;
	    double d1 = 0.5D;
	    return ColorizerFoliage.getFoliageColor(d0, d1);
	}
	
	@SideOnly(Side.CLIENT)
    public int getRenderColor(int par1)
    {
        return  ColorizerFoliage.getFoliageColorBasic();
    }
	
	@SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
       
        {
            int i1 = 0;
            int j1 = 0;
            int k1 = 0;

            for (int l1 = -1; l1 <= 1; ++l1)
            {
                for (int i2 = -1; i2 <= 1; ++i2)
                {
                    int j2 = par1IBlockAccess.getBiomeGenForCoords(par2 + i2, par4 + l1).getBiomeFoliageColor();
                    i1 += (j2 & 16711680) >> 16;
                    j1 += (j2 & 65280) >> 8;
                    k1 += j2 & 255;
                }
            }

            return (i1 / 9 & 255) << 16 | (j1 / 9 & 255) << 8 | k1 / 9 & 255;
        }
    }
	
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.canLightningStrikeAt(par2, par3 + 1, par4) && !par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4) && par5Random.nextInt(15) == 1)
        {
            double d0 = (double)((float)par2 + par5Random.nextFloat());
            double d1 = (double)par3 - 0.05D;
            double d2 = (double)((float)par4 + par5Random.nextFloat());
            par1World.spawnParticle("dripWater", d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }
	
	private void removeLeaves(World par1World, int par2, int par3, int par4)
    {
        this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
        par1World.setBlockToAir(par2, par3, par4);
    }
	
	public int quantityDropped(Random random)
	{
		return random.nextInt(20) == 0 ? 1 : 0;
	}
	
	public int idDropped(int metadata, Random random, int par3)
	{
		return Blocks.Leave_PalmTree.blockID;
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
