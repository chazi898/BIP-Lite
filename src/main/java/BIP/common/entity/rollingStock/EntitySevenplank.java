package BIP.common.entity.rollingStock;

import BIP.client.render.rollingstock.freight.ModelBip7plank;
import BIP.client.render.rollingstock.freight.ModelBip7plank_Load;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import BIP.common.library.BIPInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class EntitySevenplank extends AbstractStandardFreightCar {

    public EntitySevenplank(World world) {
        super(world);
        setupTextureDescription();
    }

    @Override
    public CargoManager setupCargoManager() {
        return new CargoManager(new CargoSpecification[][]
                {
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank/Bip7plank_Loads_China_Clay", "China clay",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank/Bip7plank_Loads_Factory_goods", "Warehouse goods",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank/Bip7plank_Tarp", "Tarp",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank/Bip7plank_Loads_Cobble", "Cobble",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank/Bip7plank_Loads_Coal", "Coal",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank/Bip7plank_Loads_Gravel", "Gravel",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank/Bip7plank_Loads_Sand", "Sand",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank/Bip7plank_Loads_Dirt", "Dirt",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank/Bip7plank_Loads_Iron", "Iron",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
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
                        EntitySevenplank.class, new ModelBip7plank(),
                        "Bip7plank_",
                        new float[]{0f, 0.15F, 0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                });
    }
    @Override
    public float getOptimalDistance(EntityMinecart cart) {return  1.18F;}

    @Override
    public String getInventoryName() {
        return "7-plank";
    }

    @Override
    public String transportCountry() {
        return "uk";
    }
}