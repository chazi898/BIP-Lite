package BIP.client.render.locomotive.electric.PEPparts; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelPEPshoes extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPEPshoes() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 58
		bodyModel[1] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 405
		bodyModel[2] = new ModelRendererTurbo(this, 369, 321, textureX, textureY); // Box 669
		bodyModel[3] = new ModelRendererTurbo(this, 449, 321, textureX, textureY); // Box 670
		bodyModel[4] = new ModelRendererTurbo(this, 473, 321, textureX, textureY); // Box 671
		bodyModel[5] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 672
		bodyModel[6] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 673
		bodyModel[7] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Box 674

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 58
		bodyModel[0].setRotationPoint(-28.75F, 9F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 405
		bodyModel[1].setRotationPoint(-28.75F, 9F, 9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		bodyModel[2].setRotationPoint(-31.75F, 7.75F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		bodyModel[3].setRotationPoint(-31.75F, 7.75F, 9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		bodyModel[4].setRotationPoint(24.25F, 7.75F, 9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 672
		bodyModel[5].setRotationPoint(27.25F, 9F, 9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 673
		bodyModel[6].setRotationPoint(24.25F, 7.75F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 674
		bodyModel[7].setRotationPoint(27.25F, 9F, -10F);
	}
}