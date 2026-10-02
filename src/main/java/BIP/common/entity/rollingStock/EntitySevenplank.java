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
                                BIPInfo.bip, "trains/Freight/7Plank", "China_Clay",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 0.15, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank", "Factory_goods",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 0.15, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank", "Tarp",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 0.15, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank", "Cobble",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 0.15, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank", "Coal",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 0.15, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank", "Gravel",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 0.15, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank", "Sand",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 0.15, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank", "Dirt",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 0.15, 0))
                        },
                        {new CargoSpecification(ModelBip7plank_Load.class,
                                BIPInfo.bip, "trains/Freight/7Plank", "Iron",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 0.15, 0))
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
                        "BIP7plank_",
                        new float[]{0.15f, 0F, 0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                });
    }
    @Override
    public float getOptimalDistance(EntityMinecart cart) {return  1F;}

    @Override
    public String transportCountry() {
        return "uk";
    }
}