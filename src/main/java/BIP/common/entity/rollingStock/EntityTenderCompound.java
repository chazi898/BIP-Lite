package BIP.common.entity.rollingStock;

import BIP.client.render.locomotive.tender.ModelCompoundTender;
import BIP.client.render.locomotive.steam.headcodes.ModelCompoundHeadcodesBack;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

import java.util.ArrayList;

public class EntityTenderCompound extends Tender {
    public EntityTenderCompound(World world) {
        super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(EntityTenderCompound.class).getTankCapacity(), LiquidManager.WATER_FILTER);
        setupTextureDescription();
        setCargoManager(new CargoManager(new CargoSpecification[][]
                {
                        {new CargoSpecification(ModelCompoundHeadcodesBack.class,
                                BIPInfo.bip, "trains/Headcode/ClassA", "Class A",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesBack.class,
                                BIPInfo.bip, "trains/Headcode/ClassB", "Class B",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesBack.class,
                                BIPInfo.bip, "trains/Headcode/ClassC", "Class C",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesBack.class,
                                BIPInfo.bip, "trains/Headcode/ClassD", "Class D",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesBack.class,
                                BIPInfo.bip, "trains/Headcode/ClassE", "Class E",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesBack.class,
                                BIPInfo.bip, "trains/Headcode/ClassF", "Class F",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesBack.class,
                                BIPInfo.bip, "trains/Headcode/ClassG", "Class G",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesBack.class,
                                BIPInfo.bip, "trains/Headcode/ClassH", "Class H",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesBack.class,
                                BIPInfo.bip, "trains/Headcode/ClassJ", "Class J",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesBack.class,
                                BIPInfo.bip, "trains/Headcode/ClassK", "Class K",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                }));
    }
    public void setupTextureDescription() {
        InsertTexture(0, "MR 1000");
        InsertTexture(1, "MR Photographic Grey");
        InsertTexture(2, "LMS Lake Crimson");
        InsertTexture(3, "Lake Crimson Blank");
        InsertTexture(4, "LMS Black");
        InsertTexture(5, "BR Letters Plain Black");
        InsertTexture(6, "BR Early Plain Black");
        InsertTexture(7, "BR Late Plain Black");
        InsertTexture(8, "Plain Black");
        InsertTexture(9, "BR Letters Lined Black");
        InsertTexture(10, "BR Early Lined Black");
        InsertTexture(11, "BR Late Lined Black");
        InsertTexture(12, "BR Lined Black Plain");
        InsertTexture(14, "BR Andy Capp special");
    }
    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityTenderCompound.class, new ModelCompoundTender(),
                        "LMS_4p_",
                        new float[]{0f, 0.15f, 0},
                        new float[]{0F, 180F, 180F},
                        null
                )
        );
    }
    @Override
    public float getOptimalDistance(EntityMinecart cart) {return  1.35F;}

    @Override
    public String getInventoryName() {
        return "Compound Tender";
    }

    @Override
    public String transportCountry() {
        return "uk";
    }
}