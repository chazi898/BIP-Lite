package BIP.common.entity.rollingStock;
import BIP.client.render.rollingstock.freight.ModelVentVan;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import BIP.common.library.BIPInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import train.common.overlaytexture.EnumOverlayFonts;
import train.common.overlaytexture.OTSpecificationDynamic;

import java.awt.*;

public class EntityVentVan extends AbstractStandardFixedFreightCar {
    public EntityVentVan(World world) {
        super(world);
        setupTextureDescription();
        this.initOverlayTextures();
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Van Sides top", 60, 6, 20, EnumOverlayFonts.OxygenSansSmall, 10F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(1, 150), new Point(61, 200)}));
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Van Sides middle", 60, 14, 12, EnumOverlayFonts.OxygenSansMid, 15F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(1, 160), new Point(61, 210)}));
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Van Sides bottom", 60, 6, 20, EnumOverlayFonts.OxygenSansSmall, 10F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(1, 175), new Point(61, 230)}));
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Van Doors top", 20, 6, 20, EnumOverlayFonts.OxygenSansSmall, 10F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(130, 150), new Point(150, 200)}));
        this.getOverlayTextureContainer().initOverlaySpecification(new OTSpecificationDynamic("Van Doors middle", 20, 14, 20, EnumOverlayFonts.OxygenSansMid, 15F, OTSpecificationDynamic.AlignmentMode.ALIGN_CENTER_AND_FILL, new Point[]{new Point(130, 160), new Point(150, 210)}));

    }
    @Override
    public void setupTextureDescription() {

    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityVentVan.class, new ModelVentVan(),
                        "Vent_Van_",
                        new float[]{0f, 0.15F, 0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                });
    }
    @Override
    public float getOptimalDistance(EntityMinecart cart) {return  1.18F;}

    @Override
    public String getInventoryName() {
        return "Ventilated Van";
    }

    @Override
    public String transportCountry() {
        return "uk";
    }
}
