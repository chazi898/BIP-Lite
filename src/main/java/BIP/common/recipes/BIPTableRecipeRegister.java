package BIP.common.recipes;

import BIP.common.library.BIPItems;
import BIP.common.library.BIPTrainItemIDs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.Traincraft;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.library.BlockIDs;
import train.common.library.ItemIDs;

public class BIPTableRecipeRegister extends AbstractRecipeHandler
{
    public BIPTableRecipeRegister()
    {
        //tier 1
        betterAddRecipe(1, new ItemStack(Blocks.planks,3), null, null, null, new ItemStack(Blocks.chest, 1), null, new ItemStack(Blocks.planks, 4), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item, 1), new ItemStack(Items.iron_ingot, 4),new ItemStack(BIPTrainItemIDs.sevenplank.item), 1);
        betterAddRecipe(1, null, new ItemStack(ItemIDs.ironChimney.item), new ItemStack(ItemIDs.ironCab.item), new ItemStack(Blocks.planks), new ItemStack(Items.water_bucket), new ItemStack(ItemIDs.ironBoiler.item, 2), new ItemStack(ItemIDs.ironFirebox.item, 1), new ItemStack(ItemIDs.ironBogie.item, 2), new ItemStack(ItemIDs.ironFrame.item), new ItemStack(Items.iron_ingot, 4), new ItemStack(BIPTrainItemIDs.LNERY7.item), 1);
        //tier 2
        betterAddRecipe(2, new ItemStack(Items.iron_ingot), new ItemStack(ItemIDs.steelchimney.item), new ItemStack(ItemIDs.ironCab.item), new ItemStack(Items.iron_ingot), new ItemStack(Items.water_bucket), new ItemStack(ItemIDs.boiler.item, 3), new ItemStack(ItemIDs.firebox.item), new ItemStack(ItemIDs.bogie.item, 5), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(Items.iron_ingot, 4), new ItemStack(BIPTrainItemIDs.GWR42xx.item), 1);
        //tier 3
        betterAddRecipe(3, new ItemStack(ItemIDs.controls.item, 2), new ItemStack(ItemIDs.pantograph.item), new ItemStack(ItemIDs.steelcab.item,2), new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.transformer.item, 4), new ItemStack(ItemIDs.copperWireFine.item, 4), new ItemStack(ItemIDs.fourWheelHeavyweightTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 4), new ItemStack(Items.iron_ingot, 2), new ItemStack(BIPTrainItemIDs.class90.item), 1);
        betterAddRecipe(3, new ItemStack(ItemIDs.controls.item), new ItemStack(ItemIDs.partTurboExhaust.item, 2), new ItemStack(ItemIDs.steelcab.item), null, new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.generator.item,1), new ItemStack(ItemIDs.dieselengine.item), new ItemStack(ItemIDs.fourWheelLightweightTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 3), new ItemStack(ItemIDs.steel.item, 4), new ItemStack(BIPTrainItemIDs.class43.item), 1);
        betterAddRecipe(3, new ItemStack(ItemIDs.steel.item, 4), null, new ItemStack(ItemIDs.steelcab.item), null, null, null, new ItemStack(ItemIDs.seats.item, 5), new ItemStack(ItemIDs.fourWheelLightweightTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(Items.iron_ingot, 2), new ItemStack(BIPTrainItemIDs.BR_Mk3_Coach.item), 1);
        betterAddRecipe(3, new ItemStack(ItemIDs.steel.item, 4), null, new ItemStack(ItemIDs.steelcab.item), null, null, null, new ItemStack(ItemIDs.seats.item, 5), new ItemStack(ItemIDs.fourWheelLightweightTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(Items.iron_ingot, 2), new ItemStack(BIPTrainItemIDs.BR_Mk3_Buffet.item), 1);

    }

    public static void betterAddRecipe(int tier, ItemStack top1, ItemStack top2,
                                       ItemStack top3, ItemStack top4, ItemStack mid1, ItemStack mid2, ItemStack mid3,
                                       ItemStack bottom1, ItemStack bottom2, ItemStack bottom3, ItemStack output, int outputSize) {
        ITierCraftingManager cm = TierRecipeManager.getInstance();
        cm.addRecipe(tier, top1, bottom1, bottom2, bottom3, top2, top3, mid2, mid3, mid1, top4, output, outputSize);
    }
}
