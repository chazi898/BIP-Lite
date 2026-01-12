package BIP.common.entity.rollingStock;

import BIP.client.render.locomotive.diesel.ModelClass43;
import BIP.common.BIP;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityLocoDieselClass43 extends DieselTrain {
    public EntityLocoDieselClass43(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "Intercity Swallow");
        InsertTexture(1, "GNER");
        InsertTexture(2, "Cross Country");
        InsertTexture(3, "GWR");
        InsertTexture(4, "LNER");
        InsertTexture(5, "Virgin");
        InsertTexture(6, "ScotRail");
        InsertTexture(7, "BR Blue Grey");
        InsertTexture(8, "Intercity Executive");
        InsertTexture(9, "Midland Pullman");
        InsertTexture(10, "Midland Pullman Yellow Panel");
        InsertTexture(11, "Grand Central");
        InsertTexture(12, "Cotswold Rail");
        InsertTexture(13, "Rail Adventure");
        InsertTexture(14, "Hornby HST");
        InsertTexture(15, "Network Rail");
        InsertTexture(16, "Intercity Swallow Buffers");
        InsertTexture(17, "Intercity Swallow Buffers Yellow");
        InsertTexture(18, "Intercity Executive Buffers Yellow");
        InsertTexture(19, "EMR Blue Buffers");
        InsertTexture(20, "First Great Western");
        InsertTexture(21, "BR Scotrail (Fictional)");
        InsertTexture(22, "First Great Western Standard Class");

    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), "bip:HSTHorn", 1.3F, "chme3_idle", 0.65F, 35, "chme3_idle", 0.5F, 35, false, "bell", 18);
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityLocoDieselClass43.class, new ModelClass43(),
                        "Class_43_",
                        new float[] { -0.65f,0F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{0D, 1.25D, 0.0D});
                            }},
                        "", null, 3, 2)
                {
                });
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.17F;}

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.31, -0.1, 0.11); }

    @Override
    public String getInventoryName() {
        return "Class 43";
    }

    @Override
    public String transportCountry() {
        return "uk";
    }
}
