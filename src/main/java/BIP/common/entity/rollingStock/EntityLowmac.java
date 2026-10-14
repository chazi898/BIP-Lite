package BIP.common.entity.rollingStock;

import BIP.client.render.rollingstock.freight.ModelBip7plank_Load;
import BIP.client.render.rollingstock.freight.ModelLowmac;
import BIP.client.render.rollingstock.freight.ModelLowmac_Load;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import BIP.common.library.BIPInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;


import java.awt.*;

public class EntityLowmac extends AbstractStandardFreightCar {
    public EntityLowmac(World world) {
        super(world);
        setupTextureDescription();
    }

    @Override
    public CargoManager setupCargoManager() {
        return new CargoManager(new CargoSpecification[][]
                {
                        {new CargoSpecification(ModelLowmac_Load.class,
                                BIPInfo.bip, "trains/Freight/Lowmac/LOWMAC_Load_Crate", "Machine parts",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelLowmac_Load.class,
                                BIPInfo.bip, "trains/Freight/Lowmac/LOWMAC_Load_Wheels", "Wheels",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank/Bip7plank_Loads_Factory_goods", "Warehouse goods",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3.25, 0))
                        },
                });
    }
    @Override
    public void setupTextureDescription() {

    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityLowmac.class, new ModelLowmac(),
                        "LOWMAC_",
                        new float[]{0f, 0.15F, 0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                });
    }
    @Override
    public float getOptimalDistance(EntityMinecart cart) {return  1.95F;}

    @Override
    public String getInventoryName() {
        return "Lowmac";
    }

    @Override
    public String transportCountry() {
        return "uk";
    }
}
