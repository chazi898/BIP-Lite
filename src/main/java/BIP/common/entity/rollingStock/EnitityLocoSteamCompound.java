package BIP.common.entity.rollingStock;

import BIP.client.render.locomotive.steam.ModelCompound;
import BIP.client.render.locomotive.steam.headboards.ModelCompoundHeadboards;
import BIP.client.render.locomotive.steam.headcodes.ModelCompoundHeadcodesFront;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;
import java.util.ArrayList;

public class EnitityLocoSteamCompound extends SteamTrain {
    public static final SoundRecord sound = new SoundRecord(EnitityLocoSteamCompound.class,
            "bip:CompoundWhistle", 1.2F,
            "bip:CompoundChuff", 0.7F, 80,
            "bip:GWR4277Idle", 0.5F, 30,
            true,
            "bip:Wheesh",
            18);


    public SoundRecord getSoundRecord() {
        return sound;
    }
    public EnitityLocoSteamCompound(World world) {
        super(world, LiquidManager.WATER_FILTER);
        setupTextureDescription();
        this.initOverlayTextures();
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Route Indicator", 12, 6, 4, EnumOverlayFonts.OxygenSansMid, 11F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(319, 392)}));
        setCargoManager(new CargoManager(new CargoSpecification[][]
                {
                        {new CargoSpecification(ModelCompoundHeadboards.class,
                                BIPInfo.bip, "trains/CompoundDetails/4p_Route_Indicator", "RouteIndicator",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadboards.class,
                                BIPInfo.bip, "trains/LMS_4p_/LMS_4p_Yellow", "Andy Capp special",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesFront.class,
                                BIPInfo.bip, "trains/Headcode/ClassA", "Class A",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesFront.class,
                                BIPInfo.bip, "trains/Headcode/ClassB", "Class B",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesFront.class,
                                BIPInfo.bip, "trains/Headcode/ClassC", "Class C",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesFront.class,
                                BIPInfo.bip, "trains/Headcode/ClassD", "Class D",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesFront.class,
                                BIPInfo.bip, "trains/Headcode/ClassE", "Class E",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesFront.class,
                                BIPInfo.bip, "trains/Headcode/ClassF", "Class F",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesFront.class,
                                BIPInfo.bip, "trains/Headcode/ClassG", "Class G",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesFront.class,
                                BIPInfo.bip, "trains/Headcode/ClassH", "Class H",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesFront.class,
                                BIPInfo.bip, "trains/Headcode/ClassJ", "Class J",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelCompoundHeadcodesFront.class,
                                BIPInfo.bip, "trains/Headcode/ClassK", "Class K",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                }));
    }
    public void setupTextureDescription() {
        InsertTexture(0, "MR 1000");
        InsertTexture(1, "MR Photographic Grey");
        InsertTexture(2, "LMS Lake Crimson 1013");
        InsertTexture(3, "Lake Crimson Smokebox open");
        InsertTexture(4, "LMS Black 1136");
        InsertTexture(5, "BR Plain Black 935");
        InsertTexture(6, "BR Plain Black 41130");
        InsertTexture(7, "BR Plain Black 41128");
        InsertTexture(8, "Plain Black Smokebox door open");
        InsertTexture(9, "BR Lined Black 41199");
        InsertTexture(10, "BR Lined Black 41134");
        InsertTexture(11, "BR Lined Black 41044");
        InsertTexture(12, "BR Lined Black Smokebox door open");
        InsertTexture(13, "BR Andy Capp special");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, -0.5, 0.1, 0.45);
    }
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EnitityLocoSteamCompound.class, new ModelCompound(),
                        "LMS_4p_",
                        new float[]{-1.55f, 0.15f, 0},
                        new float[]{0F, 180F, 180F},
                        null, "largesmoke", new ArrayList<double[]>() {
                    {
                        add(new double[]{2.67D, 1.4D, 0D});
                    }
                },
                        "explode", new ArrayList<double[]>() {
                    {
                        add(new double[]{3.5D, -0.05D, 0.5D});
                    }
                },
                        1, 1) {
                });
    }
    @Override
    public float getOptimalDistance(EntityMinecart cart) {return  0.6F;}

    @Override
    public String getInventoryName() {
        return "Compound";
    }

    @Override
    public String transportCountry() {
        return "uk";
    }
}
