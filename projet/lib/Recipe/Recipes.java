package projet.lib.Recipe;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import projet.blocks.Blocks;
import projet.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init(){
		/* Iron */
		GameRegistry.addRecipe(new ItemStack(Item.ingotIron, 1),
				new Object[] {
					"DDD",
					'D', Items.Nugget_Iron
				});
		GameRegistry.addRecipe(new ItemStack(Items.Nugget_Iron, 3),
				new Object[] {
					"D",
					'D', Item.ingotIron
				});
		GameRegistry.addSmelting(Items.Frag_Iron.itemID, new ItemStack(Items.Nugget_Iron), 0.2f);
		
		/* Gold */
		GameRegistry.addRecipe(new ItemStack(Item.ingotGold, 1),
				new Object[] {
					"DDD",
					'D', Item.goldNugget
				});
		GameRegistry.addRecipe(new ItemStack(Item.goldNugget, 3),
				new Object[] {
					"D",
					'D', Item.ingotGold
				});
		GameRegistry.addSmelting(Items.Frag_Gold.itemID, new ItemStack(Item.goldNugget), 0.2f);
		
		/* Adamantite */
		GameRegistry.addSmelting(Items.Frag_Adamantite.itemID, new ItemStack(Items.Nugget_Adamantite), 0.2f);
		
		/* Gem */
		GameRegistry.addRecipe(new ItemStack(Blocks.Block_Ametyste, 1),
				new Object[] {
					"DDD",
					"DDD",
					"DDD",
					'D', Items.Gem_Ametyste
				});
		GameRegistry.addRecipe(new ItemStack(Items.Gem_Ametyste, 9),
				new Object[] {
					"D",
					'D', Blocks.Block_Ametyste
				});
		GameRegistry.addRecipe(new ItemStack(Blocks.Block_Onyx, 1),
				new Object[] {
					"DDD",
					"DDD",
					"DDD",
					'D', Items.Gem_Onyx
				});
		GameRegistry.addRecipe(new ItemStack(Items.Gem_Onyx, 9),
				new Object[] {
					"D",
					'D', Blocks.Block_Onyx
				});
		GameRegistry.addRecipe(new ItemStack(Blocks.Block_Quartz, 1),
				new Object[] {
					"DDD",
					"DDD",
					"DDD",
					'D', Items.Gem_Quartz
				});
		GameRegistry.addRecipe(new ItemStack(Items.Gem_Quartz, 9),
				new Object[] {
					"D",
					'D', Blocks.Block_Quartz
				});
		GameRegistry.addRecipe(new ItemStack(Blocks.Block_Ruby, 1),
				new Object[] {
					"DDD",
					"DDD",
					"DDD",
					'D', Items.Gem_Ruby
				});
		GameRegistry.addRecipe(new ItemStack(Items.Gem_Ruby, 9),
				new Object[] {
					"D",
					'D', Blocks.Block_Ruby
				});
		GameRegistry.addRecipe(new ItemStack(Blocks.Block_Saphir, 1),
				new Object[] {
					"DDD",
					"DDD",
					"DDD",
					'D', Items.Gem_Saphir
				});
		GameRegistry.addRecipe(new ItemStack(Items.Gem_Saphir, 9),
				new Object[] {
					"D",
					'D', Blocks.Block_Saphir
				});
		
		/* Tree */
		GameRegistry.addRecipe(new ItemStack(Blocks.Plank_Wood, 4, 0),
				new Object[] {
					"D",
					'D', Blocks.Log_AppleTree
				});
		GameRegistry.addRecipe(new ItemStack(Blocks.Plank_Wood, 4, 1),
				new Object[] {
					"D",
					'D', Blocks.Log_BananaTree
				});
		GameRegistry.addRecipe(new ItemStack(Blocks.Plank_Wood, 4, 2),
				new Object[] {
					"D",
					'D', Blocks.Log_Baobab
				});
		GameRegistry.addRecipe(new ItemStack(Blocks.Plank_Wood, 4, 3),
				new Object[] {
					"D",
					'D', Blocks.Log_CherryTree
				});
		GameRegistry.addRecipe(new ItemStack(Blocks.Plank_Wood, 4, 4),
				new Object[] {
					"D",
					'D', Blocks.Log_MapleTree
				});
		GameRegistry.addRecipe(new ItemStack(Blocks.Plank_Wood, 4, 5),
				new Object[] {
					"D",
					'D', Blocks.Log_OrangeTree
				});
		GameRegistry.addRecipe(new ItemStack(Blocks.Plank_Wood, 4, 6),
				new Object[] {
					"D",
					'D', Blocks.Log_PalmTree
				});
		
		/* Wood */
		GameRegistry.addRecipe(new ItemStack(Item.stick, 4),
				new Object[] {
					"D",
					"D",
					'D', Blocks.Plank_Wood
				});
	}
}
