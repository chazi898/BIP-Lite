package BIP.common.entity.rollingStock;


import BIP.client.render.locomotive.steam.ModelGWR4252xx;
import BIP.client.render.locomotive.steam.ModelGWR42xxHeadcode;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.sounds.SoundRecord;
import train.common.library.Info;
import java.util.ArrayList;

public class EntityLocoSteam42xx extends SteamTrain {
    public static final SoundRecord sound = new SoundRecord(EntityLocoSteam42xx.class,
            "bip:GWRStandardWhistle", 1.2F,
            "bip:GWR4277Chuff", 0.7F, 80,
            "bip:GWR4277Idle", 0.5F, 30,
            true,
            "bip:Wheesh",
            18);
    public SoundRecord getSoundRecord() {
        return sound;
    }

    public EntityLocoSteam42xx(World world) {
        super(world, LiquidManager.WATER_FILTER);
        setupTextureDescription();
        setCargoManager(new CargoManager(new CargoSpecification[][]
                {
                        {new CargoSpecification(ModelGWR42xxHeadcode.class,
                                BIPInfo.bip, "trains/Headcode/ClassA", "ClassA",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelGWR42xxHeadcode.class,
                                BIPInfo.bip, "trains/Headcode/ClassB", "ClassB",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelGWR42xxHeadcode.class,
                                BIPInfo.bip, "trains/Headcode/ClassC", "ClassC",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelGWR42xxHeadcode.class,
                                BIPInfo.bip, "trains/Headcode/ClassD", "ClassD",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelGWR42xxHeadcode.class,
                                BIPInfo.bip, "trains/Headcode/ClassE", "ClassE",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelGWR42xxHeadcode.class,
                                BIPInfo.bip, "trains/Headcode/ClassF", "ClassF",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelGWR42xxHeadcode.class,
                                BIPInfo.bip, "trains/Headcode/ClassG", "ClassG",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelGWR42xxHeadcode.class,
                                BIPInfo.bip, "trains/Headcode/ClassH", "ClassH",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelGWR42xxHeadcode.class,
                                BIPInfo.bip, "trains/Headcode/ClassJ", "ClassJ",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                        {new CargoSpecification(ModelGWR42xxHeadcode.class,
                                BIPInfo.bip, "trains/Headcode/ClassK", "ClassK",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                }));
        }
    public void setupTextureDescription() {
        InsertTexture(0, "GWR Shirt Button 4383");
        InsertTexture(1, "GWR Lettering 4247");
        InsertTexture(2, "GWR Maintenance");
        InsertTexture(3, "GWR Egyptian 4261");
        InsertTexture(4, "GWR Egyptian 5275");
        InsertTexture(5, "GWR Lined 4277 'Hercules'");
        InsertTexture(6, "GWR Lined 5238 'Goliath'");
        InsertTexture(7, "GWR Photograph Lined 4202");
        InsertTexture(8, "GWR Photograph 5217");
        InsertTexture(9, "BR Early Crest 4298");
        InsertTexture(10, "BR Early Crest 4277 'Hercules' (preserved)");
        InsertTexture(11, "BR Early Crest 5262");
        InsertTexture(12, "BR Late Crest 5227");
        InsertTexture(13, "BR Maintenance");
        InsertTexture(14, "BR Weathered 4287");
        InsertTexture(15, "BR Weathered 5239");
        InsertTexture(16, "Scrapped");
        }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, -0.25, 0, 0.5);
    }

    public void onRenderInsertRecord() {
                Traincraft.traincraftRegistry.RegisterRollingStockModel(
                        new TrainRenderRecord(BIPInfo.bip,
                                EntityLocoSteam42xx.class, new ModelGWR4252xx(),
                                "GWR_425272_",
                                new float[]{-1.26f, 0.15f, 0f},
                                new float[]{0F, 180F, 180F},
                                null, "largesmoke", new ArrayList<double[]>() {
                            {
                                add(new double[]{2.7D, 1.3D, 0D});
                            }
                        },
                                "explode", new ArrayList<double[]>() {
                            {
                                add(new double[]{3D, -0.5D, 0.65D});
                            }
                        },
                                1, 1) {
                        });
            }

    @Override
    public float getOptimalDistance (EntityMinecart cart){
        return 0.94F;
    }

    @Override
    public String getInventoryName () {
        return "GWR 42xx/5202 class";
    }

    @Override
    public String transportCountry () {
        return "uk";
    }
}