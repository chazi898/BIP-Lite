package BIP.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import BIP.common.items.ItemBIPRollingStock;

public class BIPItems
{
    /**
     * Setup all items
     */
    public BIPItems()
    {
        loadRollingStockItems();
        registerItems();
    }

    private void loadRollingStockItems()
    {
        for (BIPTrainItemIDs item : BIPTrainItemIDs.values())
        {
            item.item = new ItemBIPRollingStock(item.iconName);
        }
    }

    private void registerItems() {
        for (BIPTrainItemIDs item : BIPTrainItemIDs.values()) {
            if (item.item != null) {
                item.item.setUnlocalizedName(BIPInfo.bip + "" + item.ItemName);
                GameRegistry.registerItem(item.item, item.ItemName);
            }
        }
    }
}
