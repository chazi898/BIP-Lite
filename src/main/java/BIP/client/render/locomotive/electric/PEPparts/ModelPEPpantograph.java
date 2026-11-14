package BIP.client.render.locomotive.electric.PEPparts; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelPEPpantograph extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPEPpantograph() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[34];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 374
		bodyModel[1] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 375
		bodyModel[2] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 376
		bodyModel[3] = new ModelRendererTurbo(this, 265, 113, textureX, textureY); // Box 377
		bodyModel[4] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 378
		bodyModel[5] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 379
		bodyModel[6] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 380
		bodyModel[7] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 381
		bodyModel[8] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Box 382
		bodyModel[9] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 383
		bodyModel[10] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 384
		bodyModel[11] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 385
		bodyModel[12] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 386
		bodyModel[13] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 388
		bodyModel[14] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 389
		bodyModel[15] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 390
		bodyModel[16] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 391
		bodyModel[17] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 392
		bodyModel[18] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 393
		bodyModel[19] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 394
		bodyModel[20] = new ModelRendererTurbo(this, 457, 121, textureX, textureY); // Box 395
		bodyModel[21] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 396
		bodyModel[22] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 397
		bodyModel[23] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 398
		bodyModel[24] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 399
		bodyModel[25] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 400
		bodyModel[26] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 401
		bodyModel[27] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 402
		bodyModel[28] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 403
		bodyModel[29] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 405
		bodyModel[30] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 406
		bodyModel[31] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 411
		bodyModel[32] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 412
		bodyModel[33] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Box 464

		bodyModel[0].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 374
		bodyModel[0].setRotationPoint(24F, -17.5F, 8F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 375
		bodyModel[1].setRotationPoint(24F, -17.5F, -9F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 376
		bodyModel[2].setRotationPoint(38F, -17.5F, 5F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 377
		bodyModel[3].setRotationPoint(38F, -17.5F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, 4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4F); // Box 378
		bodyModel[4].setRotationPoint(25F, -17.5F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 4F); // Box 379
		bodyModel[5].setRotationPoint(25F, -17.5F, 4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 380
		bodyModel[6].setRotationPoint(38F, -17.5F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 381
		bodyModel[7].setRotationPoint(32F, -17.5F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.15F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.15F, 0F, -0.5F, -0.45F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 382
		bodyModel[8].setRotationPoint(32F, -17.5F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 383
		bodyModel[9].setRotationPoint(36F, -17.5F, -3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F); // Box 384
		bodyModel[10].setRotationPoint(25F, -17.5F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 385
		bodyModel[11].setRotationPoint(24F, -18F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, 5.25F, 2.75F, 0F, 5.25F, -3.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, 2.75F, 0F, -5.5F, -3.25F, 0F, 0F, -0.25F); // Box 386
		bodyModel[12].setRotationPoint(28F, -24.5F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 388
		bodyModel[13].setRotationPoint(38.75F, -18.5F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 389
		bodyModel[14].setRotationPoint(39F, -18.25F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 390
		bodyModel[15].setRotationPoint(39F, -18.25F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 0, 8, 0F,-1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 391
		bodyModel[16].setRotationPoint(38F, -18.25F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-1.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 392
		bodyModel[17].setRotationPoint(38F, -18.25F, -4.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,-1.75F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1F, 0F, -1F, -1.25F, 0F, -1F, -1.75F, 0.5F, -1.25F, -1.25F, 0.5F, -1.25F, -1F, 0F, -1F, -1.25F, 0F, -1F); // Box 393
		bodyModel[18].setRotationPoint(38F, -17.75F, -6.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1.25F, 0.5F, 0F); // Box 394
		bodyModel[19].setRotationPoint(38F, -18.25F, 3.75F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,-1.25F, 0F, -1F, -1F, 0F, -1F, -1.25F, -0.5F, -1.25F, -1.75F, -0.5F, -1.25F, -1.25F, 0F, -1F, -1F, 0F, -1F, -1.25F, 0.5F, -1.25F, -1.75F, 0.5F, -1.25F); // Box 395
		bodyModel[20].setRotationPoint(38F, -17.75F, 3.75F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1.25F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -1.25F, 0.5F, 0F); // Box 396
		bodyModel[21].setRotationPoint(35F, -30F, 3.75F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,-1.25F, 0F, -1F, -1F, 0F, -1F, -1.25F, -0.5F, -1.25F, -1.75F, -0.5F, -1.25F, -1.25F, 0F, -1F, -1F, 0F, -1F, -1.25F, 0.5F, -1.25F, -1.75F, 0.5F, -1.25F); // Box 397
		bodyModel[22].setRotationPoint(35F, -29.5F, 3.75F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 0, 8, 0F,-1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F); // Box 398
		bodyModel[23].setRotationPoint(35F, -30F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 0, 1, 0F,-1.25F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 399
		bodyModel[24].setRotationPoint(35F, -30F, -4.75F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 0, 3, 0F,-1.75F, -0.5F, -1.25F, -1.25F, -0.5F, -1.25F, -1F, 0F, -1F, -1.25F, 0F, -1F, -1.75F, 0.5F, -1.25F, -1.25F, 0.5F, -1.25F, -1F, 0F, -1F, -1.25F, 0F, -1F); // Box 400
		bodyModel[25].setRotationPoint(35F, -29.5F, -6.75F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 401
		bodyModel[26].setRotationPoint(36F, -30F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 402
		bodyModel[27].setRotationPoint(36F, -30F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 403
		bodyModel[28].setRotationPoint(35.75F, -30.25F, -4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, 2.75F, 0F, -0.5F, -3.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 2.75F, 0F, 0F, -3.25F, 0F, 0F, -0.25F); // Box 405
		bodyModel[29].setRotationPoint(25F, -18.5F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -3.25F, 0F, -0.5F, 2.75F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -3.25F, 0F, 0F, 2.75F, 0F, 0F, -0.25F); // Box 406
		bodyModel[30].setRotationPoint(25F, -18.5F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 411
		bodyModel[31].setRotationPoint(27F, -24F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -2F, 0.25F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F, 0.25F, 0F, 1.5F, 0.25F, 0F, 7.5F, 0F, 0F, 7.5F, 0F, 0F, 1.5F, 0.25F); // Box 412
		bodyModel[32].setRotationPoint(28F, -25.5F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, 5.25F, -3.25F, 0F, 5.25F, 2.75F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -5.5F, -3.25F, 0F, -5.5F, 2.75F, 0F, 0F, -0.25F); // Box 464
		bodyModel[33].setRotationPoint(28F, -24.5F, 0F);
	}
}