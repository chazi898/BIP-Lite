package BIP.client.render.locomotive.steam.headcodes; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelCompoundHeadcodesFront extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCompoundHeadcodesFront() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 550
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 551
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY, "Lamp"); // Lamp
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 414
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 415
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY, "Lamp"); // Lamp
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 417
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 418
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY, "Lamp"); // Lamp
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 420
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 421
		bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY, "Lamp"); // Lamp

		bodyModel[0].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 550
		bodyModel[0].setRotationPoint(-29.2F, -2F, 8.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 551
		bodyModel[1].setRotationPoint(-29.7F, -1F, 8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[2].setRotationPoint(-29.95F, -1F, 8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 414
		bodyModel[3].setRotationPoint(-29.2F, -2F, -9.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 415
		bodyModel[4].setRotationPoint(-29.7F, -1F, -9.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[5].setRotationPoint(-29.95F, -1F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 417
		bodyModel[6].setRotationPoint(-29.2F, -2F, -0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 418
		bodyModel[7].setRotationPoint(-29.7F, -1F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[8].setRotationPoint(-29.95F, -1F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 420
		bodyModel[9].setRotationPoint(-23.7F, -13.5F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 421
		bodyModel[10].setRotationPoint(-24.2F, -12.5F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[11].setRotationPoint(-24.45F, -12.5F, -0.5F);
	}
}