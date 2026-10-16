package BIP.common.entity.rollingStock;

import BIP.client.render.rollingstock.freight.ModelBRBrakeVan20t;
import BIP.client.render.rollingstock.freight.ModelLowmac;
import net.minecraft.world.World;
import net.minecraft.entity.item.EntityMinecart;
import train.common.api.AbstractWorkCart;
import BIP.common.library.BIPInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;

import java.awt.*;

public class EntityBRBrakeVan20t extends AbstractWorkCart {
    public EntityBRBrakeVan20t(World world) {
        super(world);
        setupTextureDescription();
        InsertTexture(0, "BR Brown");
        InsertTexture(1, "BR Grey");
        InsertTexture(2, "Railfreight Red");
        InsertTexture(3, "Railfrieght Yellow");
        InsertTexture(4, "Railfreight Airpiped Grey");
        InsertTexture(5, "Railfreight Airpiped Brown");
    }
    public void setupTextureDescription() {

    }

    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(BIPInfo.bip,
                        EntityBRBrakeVan20t.class, new ModelBRBrakeVan20t(),
                        "BRBrakeVan_",
                        new float[]{0f, 0.15F, 0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                });
    }

    public float getOptimalDistance(EntityMinecart cart) {return  1.65F;}

    public String getInventoryName() {
        return "BR 20ton Brake Van";
    }

    public String transportCountry() {
        return "uk";
    }

}
