package BIP.client.render.locomotive.steam.headboards; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelCompoundHeadboards extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelCompoundHeadboards() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 950
		bodyModel[1] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 951
		bodyModel[2] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 952
		bodyModel[3] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 953
		bodyModel[4] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 954
		bodyModel[5] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 955
		bodyModel[6] = new ModelRendererTurbo(this, 153, 225, textureX, textureY); // Box 956
		bodyModel[7] = new ModelRendererTurbo(this, 152, 389, textureX, textureY); // Box 949
		bodyModel[8] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Box 957
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 420
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 421
		bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY, "Lamp"); // Lamp

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 950
		bodyModel[0].setRotationPoint(-23.8F, -9.5F, -4.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 951
		bodyModel[1].setRotationPoint(-23.8F, -9.5F, 1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.875F, -0.875F, 0F, -0.875F, -0.875F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 952
		bodyModel[2].setRotationPoint(-23.8F, -12.5F, 1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.875F, -0.875F, -0.75F, -0.875F, -0.875F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 953
		bodyModel[3].setRotationPoint(-23.8F, -12.5F, -4.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, -0.875F, -0.75F, -0.875F, -0.875F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 954
		bodyModel[4].setRotationPoint(-23.8F, -6.5F, -4.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.875F, -0.875F, 0F, -0.875F, -0.875F); // Box 955
		bodyModel[5].setRotationPoint(-23.8F, -6.5F, 1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 0, 27, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, -18F, 0F, -18F, -18F); // Box 956
		bodyModel[6].setRotationPoint(-23.81F, -12.5F, -4.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 9, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 949
		bodyModel[7].setRotationPoint(-23.8F, -12.5F, -1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -9F, 0F, 0F, -9F, 0F, -4F, 0F, -0.75F, -4F, 0F, -0.75F, -4F, -9F, 0F, -4F, -9F); // Box 957
		bodyModel[8].setRotationPoint(-29.25F, -1.5F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 0, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 420
		bodyModel[9].setRotationPoint(-23.7F, -13.5F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 421
		bodyModel[10].setRotationPoint(-24.2F, -12.5F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Lamp
		bodyModel[11].setRotationPoint(-24.45F, -12.5F, -0.5F);
	}
}