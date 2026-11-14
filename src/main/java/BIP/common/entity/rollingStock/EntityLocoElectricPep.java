package BIP.common.entity.rollingStock;

import BIP.client.render.locomotive.electric.ModelPEPDMSO;
import BIP.client.render.locomotive.electric.PEPparts.ModelPEPshoes;
import BIP.common.library.BIPInfo;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.sounds.SoundRecord;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;

public class EntityLocoElectricPep extends ElectricTrain {
    public EntityLocoElectricPep(World world) {
        super(world);

        this.initOverlayTextures();
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Route IndicatorA", 24, 7, 10, EnumOverlayFonts.OxygenSansMid, 11F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(45, 49)}));
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Route IndicatorB", 24, 7, 10, EnumOverlayFonts.OxygenSansMid, 11F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(285, 106)}));
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Running Number", 30, 10, 6, EnumOverlayFonts.OxygenSansMid, 15F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(378, 493)}));
        setCargoManager(new CargoManager(new CargoSpecification[][]
                {
                        {new CargoSpecification(ModelPEPshoes.class,
                                BIPInfo.bip, "trains/PEPparts/PEPshoes", "Third Rail Shoes",
                                new CargoSpecification.RenderParameters().setOffset(0.0, 3, 0))
                        },
                }));

        InsertTexture(0, "Class 314, 315, 507, 508 BR blue 1970s");
        InsertTexture(1, "Class 313 BR blue 1970s");
        InsertTexture(2, "Class 315 NX East Anglia");
        InsertTexture(3, "Class 315 One Anglia");
        InsertTexture(4, "Class 315 Greater Anglia");
        InsertTexture(5, "Class 313 Southern");
        InsertTexture(6, "Class 313 Southern BR blue 2020s");
        InsertTexture(7, "Class 508 SouthEastern Blue Doors");
        InsertTexture(8, "Class 508 SouthEastern Yellow Doors");
        InsertTexture(9, "Class 508 Connex");
        InsertTexture(10, "Class 314 ScotRail");
        InsertTexture(11, "Class 314 PTE ScotRail");
        InsertTexture(12, "Class 314 First ScotRail");
        InsertTexture(13, "Class 313 Capital Connect");
        InsertTexture(14, "Class 507/508 MerseyRail");
        InsertTexture(15, "Class 507/508 Mersey Connections");
        InsertTexture(16, "Class 507/508 Mersey Connections flip");
        InsertTexture(17, "Class 507 BR MerseyRail");
        InsertTexture(18, "Class 315 TFL");
        InsertTexture(19, "Class 315 London Overground");
        InsertTexture(20, "Class 313/508 SilverLink");
        InsertTexture(21, "Class 313/315 Network SouthEast");
        InsertTexture(22, "Class 313 Network Rail");

    }



    public final SoundRecord sound = new SoundRecord(this.getClass(), "bip:PEPHorn", 1.2F, "vl10_idle", 0.5F, 40, "vl10_run", 0.3F, 50, false, "bip:ButtonDoorClosing", 18);
    public SoundRecord getSoundRecord() {
        return sound;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityLocoElectricPep.class, new ModelPEPDMSO(),
                        "PEP_",
                        new float[] {-2.0F, 0.18F, 0.0F},
                        new float[] { 0F, 180F, 180F },
                        null) {
                });
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 0.77F;}

    @Override
    public void updateRiderPosition(){
        TraincraftUtil.updateRider(this, 4.25, -0.1, 0.35); }

    @Override
    public float getPlayerScale(){
        return 0.65f;}

    @Override
    public String getInventoryName() {
        return "Class 313/314/315/507/508";
    }

    @Override
    public String transportCountry() {
        return "uk";
    }
}


