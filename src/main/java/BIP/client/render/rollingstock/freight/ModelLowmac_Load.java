package BIP.client.render.rollingstock.freight; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelLowmac_Load extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLowmac_Load() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[36];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 68
		bodyModel[1] = new ModelRendererTurbo(this, 187, 7, textureX, textureY); // Box 73
		bodyModel[2] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 7
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 187, 7, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 32, 4, textureX, textureY); // Box 19
		bodyModel[9] = new ModelRendererTurbo(this, 32, 4, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 32, 4, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 32, 4, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 76, 32, textureX, textureY); // Box 24
		bodyModel[14] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 30, 33, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 30, 33, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 30, 33, textureX, textureY); // Box 31
		bodyModel[21] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 30, 33, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 35
		bodyModel[25] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 36
		bodyModel[26] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 37
		bodyModel[27] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 38
		bodyModel[28] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 39
		bodyModel[29] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 40
		bodyModel[30] = new ModelRendererTurbo(this, 189, 37, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 189, 37, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 189, 37, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 189, 37, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 36, 19, textureX, textureY); // Box 46

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[0].setRotationPoint(-12.5F, 2.75F, -5.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 60, 12, 0, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, 0F, -6F, 0F); // Box 73
		bodyModel[1].setRotationPoint(-15F, 0.25F, -5.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[2].setRotationPoint(-6.5F, 2.75F, -5.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[3].setRotationPoint(-0.5F, 2.75F, -5.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[4].setRotationPoint(5.5F, 2.75F, -5.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[5].setRotationPoint(11.5F, 2.75F, -5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[6].setRotationPoint(-15F, 5.25F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 60, 12, 0, 0F,0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -30F, -6F, 0F, -30F, -6F, 0F, 0F, -6F, 0F); // Box 18
		bodyModel[7].setRotationPoint(-15F, 0.25F, 5.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[8].setRotationPoint(-10F, 5.25F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[9].setRotationPoint(-4F, 5.25F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[10].setRotationPoint(2F, 5.25F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[11].setRotationPoint(8F, 5.25F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[12].setRotationPoint(14F, 5.25F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 27, 14, 17, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 24
		bodyModel[13].setRotationPoint(-13.5F, -7.5F, -8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[14].setRotationPoint(-13.5F, -6.5F, -8.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[15].setRotationPoint(-13.5F, -7.5F, -8.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[16].setRotationPoint(-13.5F, 5.5F, -8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(-13.5F, -6.5F, 7.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, -5F, -11F, 0F, -5F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 11F, 0F, -5F, 11F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[18].setRotationPoint(-12.5F, -6.5F, -8.4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[19].setRotationPoint(-12.5F, 5.5F, -8.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[20].setRotationPoint(12.5F, -7.5F, -8.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[21].setRotationPoint(12.5F, -6.5F, 7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[22].setRotationPoint(12.5F, 5.5F, -8.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[23].setRotationPoint(12.5F, -6.5F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[24].setRotationPoint(-12.5F, -7.5F, 7.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[25].setRotationPoint(-12.5F, 5.5F, 7.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 25, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[26].setRotationPoint(-12.5F, -7.5F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,-5F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -11F, 0F, -5F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 11F, 0F); // Box 38
		bodyModel[27].setRotationPoint(-17.5F, -6.5F, -8.45F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, -5F, -11F, 0F, -5F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 11F, 0F, -5F, 11F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[28].setRotationPoint(-12.5F, -6.5F, 7.4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,-5F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -11F, 0F, -5F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 11F, 0F); // Box 40
		bodyModel[29].setRotationPoint(-17.5F, -6.5F, 7.45F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, -5F, 0F, 11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[30].setRotationPoint(12.4F, -6.5F, -12.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, -5F, 0F, 11F, -5F); // Box 42
		bodyModel[31].setRotationPoint(12.45F, -6.5F, -7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, -5F, 0F, 11F, -5F); // Box 43
		bodyModel[32].setRotationPoint(-13.4F, -6.5F, -7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, -11F, -5F, 0F, -11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, -5F, 0F, 11F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[33].setRotationPoint(-13.45F, -6.5F, -12.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, -5F, 0F, -14F, -5F, 0F, 14F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -14F, -5F, 0F, 14F, 0F, 0F, 0F); // Box 45
		bodyModel[34].setRotationPoint(-12.5F, -7.45F, -7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, -5F, 0F, 14F, -5F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 14F, -5F, 0F, -14F, 0F, 0F, 0F); // Box 46
		bodyModel[35].setRotationPoint(-12.5F, -7.4F, 6.5F);
	}
}