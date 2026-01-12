package BIP.common.entity.rollingStock;

import BIP.client.render.rollingstock.passenger.ModelBR_MK3_Coach;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;

public class EntityPassengerBR_MK3_Coach extends AbstractPassengerCar {
    //public TiltingHandler tiltingHandler = new TiltingHandler(7);

    public EntityPassengerBR_MK3_Coach(World world) {
        super(world);
        InsertTexture(0, "BR Blue Grey Standard Class");
        InsertTexture(1, "GNER Standard Class");
        InsertTexture(2, "ScotRail Standard Class");
        InsertTexture(3, "Cross Country Standard Class");
        InsertTexture(4, "LNER Standard Class");
        InsertTexture(5, "GNER First Class");
        InsertTexture(6, "Cross Country First Class");
        InsertTexture(7, "GWR Castle Standard Class");
        InsertTexture(8, "Virgin First Class");
        InsertTexture(9, "Intercity First Class");
        InsertTexture(10, "BR Blue Grey First Class");
        InsertTexture(11, "ScotRail First Class");
        InsertTexture(12, "Intercity Standard Class");
        InsertTexture(13, "Midland Pullman First Class");
        InsertTexture(14, "LNER First Class");
        InsertTexture(15, "Virgin Standard Class");
        InsertTexture(16, "GWR Standard Class");
        InsertTexture(17, "Grand Central Standard Class");
        InsertTexture(18, "Grand Central First Class");
        InsertTexture(19, "Network Rail Coach");
        InsertTexture(20, "Network Rail Coach 2");
        InsertTexture(21, "First Great Western Standard Class");
        InsertTexture(22, "First Great Western First Class");
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityPassengerBR_MK3_Coach.class, new ModelBR_MK3_Coach(),
                        "BR_Mk3_Coach_",
                        new float[]{0.15f, 0F, 0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                });
    }

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 0, -0.1, 0.11); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {return  3.04F;}

    @Override
    public String transportCountry() {
        return "uk";
    }
}