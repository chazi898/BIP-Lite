package BIP.common.core.handler;

import BIP.common.BIP;
import BIP.common.entity.rollingStock.EntityLocoDieselClass158;
import BIP.common.entity.rollingStock.EntityLocoDieselClass43;
import BIP.common.entity.rollingStock.EntityPassengerBR_MK3_Buffet;
import BIP.common.entity.rollingStock.EntityPassengerBR_MK3_Coach;
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
                                        new String[]{"Cyan", "Blue", "Black", "Brown", "Red", "White", "LightGrey", "Green", "Magenta", "Yellow", "Grey", "Lime", "LightBlue", "Purple", "Skin16", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22", "Skin23", "Skin24"},
                                        12),
                                Instance() // don't touch this line
                        );
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (BIPTrainItemIDs.BR_Mk3_Buffet.item,
                                new TrainRecord("BR_Mk3_Buffet", EntityPassengerBR_MK3_Buffet.class, BIPTrainItemIDs.BR_Mk3_Buffet.item, EnumTrainType.Passenger, 3.2,
                                        new String[]{"Cyan", "Blue", "Black", "Brown", "Red", "White", "LightGrey", "Green", "Magenta", "Yellow", "Grey", "Lime", "LightBlue", "Purple", "Skin17", "Skin18", "Skin19"},
                                        12),
                                Instance() // don't touch this line
                        );

        /** diesel */
        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(BIPTrainItemIDs.class43.item,
                        new TrainRecord("class43", EntityLocoDieselClass43.class, BIPTrainItemIDs.class43.item, EnumTrainType.Diesel, 0,
                                new String[] {"White", "Blue", "Brown", "Green", "Red", "Cyan", "LightBlue", "Orange", "Yellow", "Purple", "Pink", "Black", "Grey", "LightGrey", "Magenta", "Lime", "Skin17", "Skin18", "Skin19", "Skin20", "Skin21", "Skin22"}, 12, 0, 0.74, 238,
                                2250, 60, 160,
                                0.7, 3.15f, 10000),
                        Instance()
                );

        /** electric */

        /** steam */

        /** tender */

        /** freight */

        /** workcart/brakevan */


        // Put Calls to RegisterRollingStockEntity below this.
    }
}
