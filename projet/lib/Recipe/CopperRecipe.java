package projet.lib.Recipe;

import net.minecraft.item.ItemStack;
import projet.blocks.Blocks;
import projet.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class CopperRecipe {
	public static void init(){
		GameRegistry.addRecipe(new ItemStack(Blocks.Block_Copper, 1),
				new Object[] {
					"DDD",
					"DDD",
					"DDD",
					'D', Items.Ingot_Copper
				});
		GameRegistry.addRecipe(new ItemStack(Items.Ingot_Copper, 1),
				new Object[] {
					"DDD",
					'D', Items.Nugget_Copper
				});
		GameRegistry.addRecipe(new ItemStack(Items.Ingot_Copper, 9),
				new Object[] {
					"D",
					'D', Blocks.Block_Copper
				});
		GameRegistry.addRecipe(new ItemStack(Items.Nugget_Copper, 3),
				new Object[] {
					"D",
					'D', Items.Ingot_Copper
				});
		GameRegistry.addSmelting(Items.Frag_Copper.itemID, new ItemStack(Items.Nugget_Copper), 0.2f);
	}
}
