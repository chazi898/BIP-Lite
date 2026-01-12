package BIP.common.items;

import BIP.common.library.BIPInfo;
import train.common.items.ItemAbstractRollingStock;
import BIP.common.BIP;


public class ItemBIPRollingStock extends ItemAbstractRollingStock
{
    public ItemBIPRollingStock(String iconName)
    {
        super(iconName);
        setCreativeTab(BIP.BIPLite);
    }

    @Override
    public String GetContentPackName()
    {
        return "BIP-Lite";
    }

    @Override
    public String GetTexturePath()
    {
        return BIPInfo.bip.toLowerCase() + ":icons/" + this.iconName;
    }
}
