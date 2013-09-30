package projet.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import projet.Main;
import projet.lib.ModInfo;
import projet.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LogPalmTree extends BlockRotatedPillar {
	
	final String UnlocalNameSide;
	
	public LogPalmTree(int pId, String pUnLocaNameSide){
		super(pId, Material.wood);
		
		UnlocalNameSide = pUnLocaNameSide;
		
		this.setUnlocalizedName(UnlocalNameSide);
		this.setCreativeTab(Main.ProjetCreativetabBlocks);
		this.setHardness(2.0F);
		this.setStepSound(Block.soundWoodFootstep);
		this.setBurnProperties(this.blockID, 5, 20);
	}
	
	@SideOnly(Side.CLIENT)
	public static Icon topBotIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		topBotIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.ArbreTop_unlocalizedName);
		sideIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + UnlocalNameSide);
	}
	
	@SideOnly(Side.CLIENT)
    /**
     * The icon for the side of the block.
     */
    protected Icon getSideIcon(int par1)
    {
        return this.sideIcon;
    }
	
    @SideOnly(Side.CLIENT)

    /**
     * The icon for the tops and bottoms of the block.
     */
    protected Icon getEndIcon(int par1)
    {
        return this.topBotIcon;
    }
    
    @Override
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(World world, int x, int y, int z)
    {
        return true;
    }
    
    /**
     * Called on server worlds only when the block has been replaced by a different block ID, or the same block with a
     * different metadata value, but before the new metadata value is set. Args: World, x, y, z, old block ID, old
     * metadata
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        byte b0 = 4;
        int j1 = b0 + 1;

        if (par1World.checkChunksExist(par2 - j1, par3 - j1, par4 - j1, par2 + j1, par3 + j1, par4 + j1))
        {
            for (int k1 = -b0; k1 <= b0; ++k1)
            {
                for (int l1 = -b0; l1 <= b0; ++l1)
                {
                    for (int i2 = -b0; i2 <= b0; ++i2)
                    {
                        int j2 = par1World.getBlockId(par2 + k1, par3 + l1, par4 + i2);

                        if (Block.blocksList[j2] != null)
                        {
                            Block.blocksList[j2].beginLeavesDecay(par1World, par2 + k1, par3 + l1, par4 + i2);
                        }
                    }
                }
            }
        }
    }
}
