package BIP.common.entity.rollingStock;

import BIP.client.render.rollingstock.passenger.ModelBR_MK3_Buffet;
import BIP.client.render.rollingstock.passenger.ModelBR_MK3_Coach;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.core.util.TraincraftUtil;

public class EntityPassengerBR_MK3_Buffet extends AbstractPassengerCar {
    //public TiltingHandler tiltingHandler = new TiltingHandler(7);

    public EntityPassengerBR_MK3_Buffet(World world) {
        super(world);
        InsertTexture(0, "BR Blue Grey Standard Buffet");
        InsertTexture(1, "GNER First Buffet");
        InsertTexture(2, "ScotRail First Buffet");
        InsertTexture(3, "Cross Country First Buffet");
        InsertTexture(4, "LNER First Buffet");
        InsertTexture(5, "Virgin First Buffet");
        InsertTexture(6, "Greater Anglia Standard Buffet");
        InsertTexture(7, "GWR Standard Buffet");
        InsertTexture(8, "Virgin Pretendolino First Buffet");
        InsertTexture(9, "Intercity First Buffet");
        InsertTexture(10, "Boogaloo First Buffet");
        InsertTexture(11, "Grand Central Standard Buffet");
        InsertTexture(12, "Anglia Standard Buffet");
        InsertTexture(13, "Midland Pullman First Buffet");
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
                        EntityPassengerBR_MK3_Buffet.class, new ModelBR_MK3_Buffet(),
                        "BR_Mk3_Buffet_",
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