package BIP.client.render.locomotive.steam; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelGWR42xxHeadcode extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGWR42xxHeadcode() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[24];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 550
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 551
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Lamp
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 414
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 415
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Lamp
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 417
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 418
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Lamp
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 420
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 421
		bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Lamp
		bodyModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Lamp
		bodyModel[13] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 424
		bodyModel[14] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 425
		bodyModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Lamp
		bodyModel[16] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 427
		bodyModel[17] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 428
		bodyModel[18] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Lamp
		bodyModel[19] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 430
		bodyModel[20] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 431
		bodyModel[21] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 432
		bodyModel[22] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Lamp
		bodyModel[23] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 434

		bodyModel[0].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 550
		bodyModel[0].setRotationPoint(-32F, -1F, 6.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 551
		bodyModel[1].setRotationPoint(-32.5F, 0F, 6.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[2].setRotationPoint(-32.75F, 0F, 6.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 414
		bodyModel[3].setRotationPoint(-32F, -1F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 415
		bodyModel[4].setRotationPoint(-32.5F, 0F, -7.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[5].setRotationPoint(-32.75F, 0F, -7.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 417
		bodyModel[6].setRotationPoint(-32F, -1F, -0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 418
		bodyModel[7].setRotationPoint(-32.5F, 0F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[8].setRotationPoint(-32.75F, 0F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 420
		bodyModel[9].setRotationPoint(-29F, -12.75F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 421
		bodyModel[10].setRotationPoint(-29.5F, -11.75F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[11].setRotationPoint(-29.75F, -11.75F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[12].setRotationPoint(33.25F, -2.5F, 6.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 424
		bodyModel[13].setRotationPoint(33F, -2.5F, 6.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 425
		bodyModel[14].setRotationPoint(33.5F, -3.5F, 6.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[15].setRotationPoint(33.25F, -2.5F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 427
		bodyModel[16].setRotationPoint(33F, -2.5F, -0.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 428
		bodyModel[17].setRotationPoint(33.5F, -3.5F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[18].setRotationPoint(33.25F, -2.5F, -7.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 430
		bodyModel[19].setRotationPoint(33F, -2.5F, -7.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 431
		bodyModel[20].setRotationPoint(33.5F, -3.5F, -7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 432
		bodyModel[21].setRotationPoint(33.25F, -9.5F, -0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[22].setRotationPoint(33.5F, -9.5F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 434
		bodyModel[23].setRotationPoint(33.75F, -10.5F, -0.5F);
	}
}