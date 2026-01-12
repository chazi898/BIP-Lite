package BIP.common;

import BIP.common.items.ItemBIPRollingStock;
import BIP.common.library.BIPTrainItemIDs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import BIP.common.core.handler.BIPRollingStockEntityHandler;
import BIP.common.creativetabs.CreativeTabBIP;
import BIP.common.library.BIPItems;
import BIP.common.library.BIPInfo;
import BIP.common.recipes.BIPTableRecipeRegister;

import static BIP.common.library.BIPTrainItemIDs.class43;


@Mod(modid = BIPInfo.bip, name = BIPInfo.modName, version = BIPInfo.modVersion, dependencies = "required-after:tc")
public class BIP
{
    /* TrainCraft instance */
    @Instance(BIPInfo.bip)
    public static BIP instance;

    /* TrainCraft Logger */
    public static Logger addonLog = LogManager.getLogger(BIPInfo.modName);

    public static CreativeTabs BIPLite;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        addonLog.info("preInit BIP-Lite -" + BIPInfo.modName);
        BIPLite = new CreativeTabBIP(CreativeTabs.getNextID(), "BIP-Lite", class43.item);
        BIPItems BIPItems = new BIPItems();
        BIPRollingStockEntityHandler entityHandler = new BIPRollingStockEntityHandler();
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        addonLog.info("load BIP-Lite -" + BIPInfo.modName);

        addonLog.info("Initializing recipes...");
        new BIPTableRecipeRegister();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        addonLog.info("postInit BIP-Lite -" + BIPInfo.modName);
    }
}
