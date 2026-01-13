package BIP.common.library;

import net.minecraft.item.Item;

/**
 * Enum class for the Rolling stock item
 * DO NOT ADD OTHER ITEMS BESIDES ROLLING STOCK ITEMS HERE
 */
public enum BIPTrainItemIDs
{
    class43("class43", "class43",4),
    BR_Mk3_Coach("BR_Mk3_Coach", "br_mk3_coach",1),
    BR_Mk3_Buffet("BR_Mk3_Buffet", "br_mk3_buffet",1),
    class90("class90", "class90",4),
    //minecraftTemplate("template-icon", STEAM, 100),
    //minecraftTemplateUntradeable("template-icon", STEAM)
    ;


    /**
     * @param iconName
     * @param //typeOfRollingStock the type of rollingstock
     * @param amountForEmerald amount for Emerald
     */
    BIPTrainItemIDs(String iconName, int amountForEmerald)
    {
        this.iconName = iconName;
        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = this.name();
    }

    BIPTrainItemIDs(String itemName, String iconName, int amountForEmerald)
    {
        this.iconName = iconName;
        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = itemName;
    }

    /** USED FOR ROLLINGSTOCK THAT IS NOT ALLOWED TO BE TRADED FOR
     * @param iconName
     * @param //typeOfRollingStock the type of rollingstock
     */

    BIPTrainItemIDs(String iconName)
    {
        this.iconName = iconName;
        this.amountForEmerald = -1;
        ItemName = this.name();
    }

    BIPTrainItemIDs(String itemName, String iconName)
    {
        this.iconName = iconName;
        this.amountForEmerald = -1;
        ItemName = itemName;
    }

    public Item item;
    public final String iconName;
    public final String ItemName;

    /**
     * amount for emerald. For ItemRollingStock, it is the price for one train
     */
    public byte amountForEmerald;
}
