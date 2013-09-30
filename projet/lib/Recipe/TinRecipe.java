package projet.lib.Recipe;

import net.minecraft.item.ItemStack;
import projet.blocks.Blocks;
import projet.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class TinRecipe {
	public static void init(){
		GameRegistry.addRecipe(new ItemStack(Blocks.Block_Tin, 1),
				new Object[] {
					"DDD",
					"DDD",
					"DDD",
					'D', Items.Ingot_Tin
				});
		GameRegistry.addRecipe(new ItemStack(Items.Ingot_Tin, 1),
				new Object[] {
					"DDD",
					'D', Items.Nugget_Tin
				});
		GameRegistry.addRecipe(new ItemStack(Items.Ingot_Tin, 9),
				new Object[] {
					"D",
					'D', Blocks.Block_Tin
				});
		GameRegistry.addRecipe(new ItemStack(Items.Nugget_Tin, 3),
				new Object[] {
					"D",
					'D', Items.Ingot_Tin
				});
		GameRegistry.addSmelting(Items.Frag_Tin.itemID, new ItemStack(Items.Nugget_Tin), 0.2f);
	}
}
