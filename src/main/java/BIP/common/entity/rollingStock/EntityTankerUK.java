package BIP.common.entity.rollingStock;
import BIP.client.render.rollingstock.freight.ModelTankerUK;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import BIP.common.library.BIPInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardTankerCar;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;

public class EntityTankerUK extends AbstractStandardTankerCar {
    public EntityTankerUK(World world) {
        super(world);
        setupTextureDescription();
        this.initOverlayTextures();
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Tanker sides top", 60, 8, 15, EnumOverlayFonts.OxygenSansMid, 12F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(320, 50), new Point(380, 50)}));
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Tanker sides bottom", 60, 8, 15, EnumOverlayFonts.OxygenSansMid, 12F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(320, 59), new Point(380, 59)}));

    }
    @Override
    public void setupTextureDescription() {

    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityTankerUK.class, new ModelTankerUK(),
                        "Tanker_BIP_",
                        new float[]{0f, 0.15F, 0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                });
    }
    @Override
    public float getOptimalDistance(EntityMinecart cart) {return  1.18F;}

    @Override
    public String getInventoryName() {
        return "PO Tanker";
    }

    @Override
    public String transportCountry() {
        return "uk";
    }
}
