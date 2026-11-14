package BIP.common.entity.rollingStock;

import BIP.client.render.rollingstock.passenger.ModelPEPTSO;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;

public class EntityPassengerpepTSO extends AbstractPassengerCar{

    public EntityPassengerpepTSO(World world) {
        super(world);
        InsertTexture(0, "Class BR blue 1970s");
        InsertTexture(1, "Class 315 NX East Anglia");
        InsertTexture(2, "Class 315 One Anglia");
        InsertTexture(3, "Class 315 Greater Anglia");
        InsertTexture(4, "Class 508 SouthEastern Blue doors");
        InsertTexture(5, "Class 508 SouthEastern Yellow doors");
        InsertTexture(6, "Class 508 Connex SouthEastern");
        InsertTexture(7, "Class 507/508 MerseyRail");
        InsertTexture(8, "Class 507/508 Mersey Connections");
        InsertTexture(9, "Class 507/508 BR MerseyRail");
        InsertTexture(10, "Class 315 TFL");
        InsertTexture(11, "Class 315 London Overground");
        InsertTexture(12, "Class 313/508 SilverLink");
        InsertTexture(13, "Class 313/315 Network SouthEast");
    }
    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityPassengerpepTSO.class, new ModelPEPTSO(),
                        "PEP_",
                        new float[] {0.0F, 0.18F, 0.0F},
                        new float[] { 0F, 180F, 180F },
                        null) {
                });
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 2.72F;}

    @Override
    public String transportCountry() {
        return "uk";
    }
}
