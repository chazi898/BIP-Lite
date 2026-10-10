package BIP.common.core.handler;

import BIP.common.BIP;
import BIP.common.entity.rollingStock.*;
import BIP.common.library.BIPTrainItemIDs;
import train.common.Traincraft;
import train.common.library.EnumTrainType;
import train.common.library.register.TrainRecord;

public class BIPRollingStockEntityHandler
{
    private Object Instance()
    {
        return BIP.instance;
    }

    public BIPRollingStockEntityHandler()
    {
        /* Sample

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Instance() // don't touch this line
                        );
         */

        /** passenger */
        Traincraft.traincraftRegistry
               .RegisterRollingStockEntity
                        (BIPTrainItemIDs.BR_Mk3_Coach.item,
                                new TrainRecord("BR_Mk3_Coach", EntityPassengerBR_MK3_Coach.class, BIPTrainItemIDs.BR_Mk3_Coach.item, EnumTrainType.Passenger, 3.2,
                                        new String[]{"Cyan", "Blue", "Black", "Brown", "Red", "White", "LightGrey", "Green", "Magenta", "Yellow", "Grey", "Lime", "LightBlue", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24", "Skin25", "Skin26"},
                                        12),
                                Instance() // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (BIPTrainItemIDs.BR_Mk3_Buffet.item,
                                new TrainRecord("BR_Mk3_Buffet", EntityPassengerBR_MK3_Buffet.class, BIPTrainItemIDs.BR_Mk3_Buffet.item, EnumTrainType.Passenger, 3.2,
                                        new String[]{"Cyan", "Blue", "Black", "Brown", "Red", "White", "LightGrey", "Green", "Magenta", "Yellow", "Grey", "Lime", "LightBlue", "Purple", "Skin17", "Skin18", "Skin19", "Skin20"},
                                        12),
                                Instance() // don't touch this line
                        );

        /** diesel */
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(BIPTrainItemIDs.class43.item,
                        new TrainRecord("class43", EntityLocoDieselClass43.class, BIPTrainItemIDs.class43.item, EnumTrainType.Diesel, 0,
                                new String[] {"White", "Blue", "Brown", "Green", "Red", "Cyan", "LightBlue", "Orange", "Yellow", "Purple", "Pink", "Black", "Grey", "LightGrey", "Magenta", "Lime", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23"}, 12, 0, 0.74, 238,
                                2250, 50, 160,
                                0.7, 3.15f, 10000),
                        Instance()
                );

        /** electric */
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(BIPTrainItemIDs.class90.item,
                        new TrainRecord("class90", EntityLocoElectricClass90.class, BIPTrainItemIDs.class90.item, EnumTrainType.Electric, 0,
                                new String[] {"Black", "Green", "LightGrey", "Grey", "Pink", "Red", "White", "Magenta", "Brown", "Orange", "Yellow"}, 12, 0, 0.74, 178,
                                5000, 50, 100,
                                0.75, 2.77f, 10000),
                        Instance()
                );
        /** steam */
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(BIPTrainItemIDs.LNERY7.item,
                        new TrainRecord("LNERY7", EntityLocoSteamLNERY7.class, BIPTrainItemIDs.LNERY7.item, EnumTrainType.Steam, 0,
                                new String[]{"Blue", "Green", "Orange", "Red", "Black", "Grey", "LightGrey", "Lime", "LightBlue", "Pink"}, 8,
                                0, 0.6, 50, 250,
                                10, 60, 0.7, -1f, 2000),
                        Instance()
                );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(BIPTrainItemIDs.GWR42xx.item,
                        new TrainRecord("GWR42xx", EntityLocoSteam42xx.class, BIPTrainItemIDs.GWR42xx.item, EnumTrainType.Steam, 0,
                                new String[]{"Blue", "Green", "Lime", "Pink", "Purple", "Red", "Yellow", "Skin17", "White", "Black", "Cyan", "LightBlue", "Grey", "Skin18", "Orange", "LightGrey", "Brown"}, 8,
                                0, 0.8, 100, 1500, 10, 100, 0.8, -2.54f, 8200),
                        Instance()
                );
        /** tender */

        /** freight */
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (BIPTrainItemIDs.sevenplank.item,
                                new TrainRecord("sevenplank", EntitySevenplank.class, BIPTrainItemIDs.sevenplank.item, EnumTrainType.Gondola, 1,
                                        new String[]{"Brown", "Grey", "Blue", "Black", "Cyan",  "Red", "White", "LightGrey", "Green", "Magenta", "Yellow", "Lime", "LightBlue", "Purple"},
                                        12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                                Instance() // don't touch this line
                        );


        /** workcart/brakevan */


        // Put Calls to RegisterRollingStockEntity below this.
    }
}
