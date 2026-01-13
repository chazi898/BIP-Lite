package BIP.common.entity.rollingStock;

import BIP.client.render.locomotive.diesel.ModelClass43;
import BIP.client.render.locomotive.electric.ModelClass90;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.ElectricTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityLocoElectricClass90 extends ElectricTrain {
    public EntityLocoElectricClass90(World world) {
        super(world);
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
    }

    public final SoundRecord sound = new SoundRecord(this.getClass(), "bip:Mk4DVTHorn", 1.2F, "bip:Class868790Thrash", 0.5F, 40, "bip:Class90Idle", 0.3F, 50, false, "bell", 18);
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityLocoElectricClass90.class, new ModelClass90(),
                        "Class_90_",
                        new float[] { -0.55f,0.06F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null) {
                });
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.48F;}

    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.47, -0.1, 0.29); }

    @Override
    public String getInventoryName() {
        return "Class 90";
    }

    @Override
    public String transportCountry() {
        return "uk";
    }
}
