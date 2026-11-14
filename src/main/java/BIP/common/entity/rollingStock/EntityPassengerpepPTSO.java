package BIP.common.entity.rollingStock;

import BIP.client.render.locomotive.electric.PEPparts.ModelPEPpantograph;
import BIP.client.render.rollingstock.passenger.ModelPEPPTSO;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class EntityPassengerpepPTSO extends AbstractPassengerCar{

    public EntityPassengerpepPTSO(World world) {
        super(world);
        setCargoManager(new CargoManager(new CargoSpecification[][]
                {
                        {new CargoSpecification(ModelPEPpantograph.class,
                                BIPInfo.bip, "trains/PEPparts/PEP_panto_up", "Pantograph Raised",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelPEPpantograph.class,
                                BIPInfo.bip, "trains/PEPparts/PEP_panto_down", "Pantograph Lowered",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                }));
        InsertTexture(0, "BR blue 1970s");
        InsertTexture(1, "Class 315 NX East Anglia");
        InsertTexture(2, "Class 315 One Anglia");
        InsertTexture(3, "Class 315 Greater Anglia");
        InsertTexture(4, "Class 313 Southern");
        InsertTexture(5, "Class 313 BR Blue Southern");
        InsertTexture(6, "Class 314 ScotRail");
        InsertTexture(7, "Class 314 PTE ScotRail");
        InsertTexture(8, "Class 314 First ScotRail");
        InsertTexture(9, "Class 313 Capital Connect");
        InsertTexture(10, "Class 315 TFL");
        InsertTexture(11, "Class 315 London Overground");
        InsertTexture(12, "Class 313/508 SilverLink");
        InsertTexture(13, "Class 313/315 Network SouthEast");
        InsertTexture(14, "Class 313 Network Rail");
    }
    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityPassengerpepPTSO.class, new ModelPEPPTSO(),
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

