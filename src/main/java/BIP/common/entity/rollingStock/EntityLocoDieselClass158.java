package BIP.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.sounds.SoundRecord;

public class EntityLocoDieselClass158 extends DieselTrain {
	public EntityLocoDieselClass158(World world) {
		super(world, LiquidManager.dieselFilter());
	}


	@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = 5.03;
		double yOffset = -0.1;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
		if (side.isServer()) {
			rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
			rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
			anglePitchClient = serverRealPitch * 60;
		}
		float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
				+ riddenByEntity.getYOffset() + yOffset);
		float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
		double bogieX1 = (this.posX + (rotationCos1 * distance));
		double bogieZ1 = (this.posZ + (rotationSin1 * distance));
		// System.out.println(rotationCos1+" "+rotationSin1);
		if (anglePitchClient > 20 && rotationCos1 == 1) {
			bogieX1 -= pitchRads * 2;
			pitch -= pitchRads * 1.2;
		}
		if (anglePitchClient > 20 && rotationSin1 == 1) {
			bogieZ1 -= pitchRads * 2;
			pitch -= pitchRads * 1.2;
		}
		if (pitchRads == 0.0) {
			riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
		}
		if (pitchRads > -1.01 && pitchRads < 1.01) {
			riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
		}
	}

	public final SoundRecord sound = new SoundRecord(this.getClass(), " ", 1.2F, "chme3_idle", 0.7F, 40, "chme3_idle", 0.6F, 40, false, "bell", 18,
			new String[]{"Class158Horn"});
	public SoundRecord getSoundRecord() {
		return sound;
	}

	@Override
	public String getInventoryName() {
		return "Class 158";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.7F;
	}

	@Override
	public String transportCountry() {
		return "uk";
	}
}