package BIP.common.entity.rollingStock;

import BIP.client.render.locomotive.steam.ModelNERHClass;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class EntityLocoSteamLNERY7 extends SteamTrain {
    public final SoundRecord sound = new SoundRecord(this.getClass(),
            "bip:NERHClasswhistle", 1.2F,
            "bip:NERHClasschuff", 0.7F, 40,
            "bip:NERHClassIdle", 0.5F, 15,
            true,
            "bip:Wheesh",
            18);
    @Override
    public SoundRecord getSoundRecord() {
        return sound;
    }

    public EntityLocoSteamLNERY7(World world) {
            super(world, Traincraft.traincraftRegistry.getTrainRecord(EntityLocoSteamLNERY7.class).getTankCapacity(), LiquidManager.WATER_FILTER);

            InsertTexture(0, "NER Blue");
            InsertTexture(1, "NER Green");
            InsertTexture(2, "NER Green Orange Borders");
            InsertTexture(3, "NER Lined Black");
            InsertTexture(4, "LNER 8086");
            InsertTexture(5, "LNER 985 (Preserved)");
            InsertTexture(6, "LNER 1800");
            InsertTexture(7, "LNER Darlington Works");
            InsertTexture(8, "BR 68089");
            InsertTexture(9, "National Coal Board");}

        @Override
        public void onRenderInsertRecord() {
            Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityLocoSteamLNERY7.class, new ModelNERHClass(),
                        "Y7_",
                        new float[]{-0.5f, 0.15F, 0F},
                        new float[]{0F, 180F, 180F},
                        null, "largesmoke",  new ArrayList<double[]>() { { add(new double[] {1.3D, 1.3D, 0D}); } },
                        "explode", new ArrayList<double[]>() { { add(new double[] {1D, -0.3D, 0D}); } },
                        1, 1) {
                });
    }


    @Override
    public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.4, 0, 0.275); }

    @Override
    public float getOptimalDistance(EntityMinecart cart) {return  0.75F;}

    @Override
    public String getInventoryName() {
        return "LNER Y7";}

    @Override
    public String transportCountry() {
        return "uk";}


}

