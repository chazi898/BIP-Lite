package BIP.client.render.rollingstock.freight; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelBip7plank_Load extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBip7plank_Load() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[65];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 191
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 192
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 193
		bodyModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 195
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 196
		bodyModel[5] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 53
		bodyModel[6] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 53
		bodyModel[7] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 53
		bodyModel[8] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 53
		bodyModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		bodyModel[10] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		bodyModel[11] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		bodyModel[13] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 53
		bodyModel[14] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 53
		bodyModel[15] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 53
		bodyModel[16] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 53
		bodyModel[17] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 53
		bodyModel[18] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 53
		bodyModel[19] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 53
		bodyModel[20] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		bodyModel[21] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 227
		bodyModel[22] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 228
		bodyModel[23] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 229
		bodyModel[24] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 230
		bodyModel[25] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 231
		bodyModel[26] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 232
		bodyModel[27] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 233
		bodyModel[28] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 234
		bodyModel[29] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 235
		bodyModel[30] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 236
		bodyModel[31] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 237
		bodyModel[32] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 238
		bodyModel[33] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 239
		bodyModel[34] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 240
		bodyModel[35] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 241
		bodyModel[36] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 242
		bodyModel[37] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 243
		bodyModel[38] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 244
		bodyModel[39] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 245
		bodyModel[40] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 247
		bodyModel[41] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 248
		bodyModel[42] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 249
		bodyModel[43] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 250
		bodyModel[44] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 251
		bodyModel[45] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 252
		bodyModel[46] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 253
		bodyModel[47] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 254
		bodyModel[48] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 255
		bodyModel[49] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 256
		bodyModel[50] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 257
		bodyModel[51] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 258
		bodyModel[52] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 259
		bodyModel[53] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 260
		bodyModel[54] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 261
		bodyModel[55] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 262
		bodyModel[56] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 263
		bodyModel[57] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 264
		bodyModel[58] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 265
		bodyModel[59] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 266
		bodyModel[60] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 267
		bodyModel[61] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 268
		bodyModel[62] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 269
		bodyModel[63] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 270
		bodyModel[64] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 64

		bodyModel[0].addBox(0F, 0F, 0F, 30, 1, 18, 0F); // Box 191
		bodyModel[0].setRotationPoint(-15F, -7.5F, -9F);

		bodyModel[1].addBox(0F, 11F, 0F, 33, 3, 21, 0F); // Box 192
		bodyModel[1].setRotationPoint(-16.5F, -8.25F, -10.5F);

		bodyModel[2].addShapeBox(0F, 11F, 0F, 33, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[2].setRotationPoint(-16.5F, -14.25F, -0.5F);

		bodyModel[3].addShapeBox(0F, 11F, 0F, 33, 6, 10, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[3].setRotationPoint(-16.5F, -14.25F, 0.5F);

		bodyModel[4].addShapeBox(0F, 11F, 0F, 33, 6, 10, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[4].setRotationPoint(-16.5F, -14.25F, -10.5F);

		bodyModel[5].addBox(0F, -12F, 0F, 8, 8, 8, 0F); // Box 53
		bodyModel[5].setRotationPoint(-14F, -6.75F, -8F);

		bodyModel[6].addBox(0F, -12F, 0F, 1, 1, 10, 0F); // Box 53
		bodyModel[6].setRotationPoint(-15F, -7.75F, -9F);

		bodyModel[7].addBox(0F, -12F, 0F, 1, 1, 10, 0F); // Box 53
		bodyModel[7].setRotationPoint(-15F, 1.25F, -9F);

		bodyModel[8].addBox(0F, -12F, 0F, 1, 1, 10, 0F); // Box 53
		bodyModel[8].setRotationPoint(-6F, -7.75F, -9F);

		bodyModel[9].addBox(0F, -12F, 0F, 8, 1, 1, 0F); // Box 53
		bodyModel[9].setRotationPoint(-14F, -7.75F, 0F);

		bodyModel[10].addBox(0F, -12F, 0F, 8, 1, 1, 0F); // Box 53
		bodyModel[10].setRotationPoint(-14F, 1.25F, 0F);

		bodyModel[11].addBox(0F, -12F, 0F, 8, 1, 1, 0F); // Box 53
		bodyModel[11].setRotationPoint(-14F, -7.75F, -9F);

		bodyModel[12].addBox(0F, -12F, 0F, 8, 1, 1, 0F); // Box 53
		bodyModel[12].setRotationPoint(-14F, 1.25F, -9F);

		bodyModel[13].addBox(0F, -12F, 0F, 1, 8, 1, 0F); // Box 53
		bodyModel[13].setRotationPoint(-15F, -6.75F, -9F);

		bodyModel[14].addBox(0F, -12F, 0F, 1, 8, 1, 0F); // Box 53
		bodyModel[14].setRotationPoint(-6F, -6.75F, -9F);

		bodyModel[15].addBox(0F, -12F, 0F, 1, 8, 1, 0F); // Box 53
		bodyModel[15].setRotationPoint(-15F, -6.75F, 0F);

		bodyModel[16].addBox(0F, -12F, 0F, 1, 8, 1, 0F); // Box 53
		bodyModel[16].setRotationPoint(-6F, -6.75F, 0F);

		bodyModel[17].addShapeBox(0F, -12F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 53
		bodyModel[17].setRotationPoint(-14F, -6.75F, -9F);

		bodyModel[18].addShapeBox(0F, -12F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F); // Box 53
		bodyModel[18].setRotationPoint(-6F, -6.75F, -8F);

		bodyModel[19].addShapeBox(0F, -12F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 53
		bodyModel[19].setRotationPoint(-7F, -6.75F, 0F);

		bodyModel[20].addShapeBox(0F, -12F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F); // Box 53
		bodyModel[20].setRotationPoint(-14F, -7.75F, -8F);

		bodyModel[21].addBox(0F, -12F, 0F, 1, 1, 10, 0F); // Box 227
		bodyModel[21].setRotationPoint(-6F, 1.25F, -9F);

		bodyModel[22].addBox(0F, -12F, 0F, 1, 1, 10, 0F); // Box 228
		bodyModel[22].setRotationPoint(5F, 1.25F, -1F);

		bodyModel[23].addBox(0F, -12F, 0F, 1, 8, 1, 0F); // Box 229
		bodyModel[23].setRotationPoint(5F, -6.75F, 8F);

		bodyModel[24].addShapeBox(0F, -12F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 230
		bodyModel[24].setRotationPoint(5F, -6.75F, 7F);

		bodyModel[25].addBox(0F, -12F, 0F, 1, 1, 10, 0F); // Box 231
		bodyModel[25].setRotationPoint(5F, -7.75F, -1F);

		bodyModel[26].addBox(0F, -12F, 0F, 1, 8, 1, 0F); // Box 232
		bodyModel[26].setRotationPoint(5F, -6.75F, -1F);

		bodyModel[27].addShapeBox(0F, -12F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F); // Box 233
		bodyModel[27].setRotationPoint(6F, -6.75F, -1F);

		bodyModel[28].addBox(0F, -12F, 0F, 8, 8, 8, 0F); // Box 234
		bodyModel[28].setRotationPoint(6F, -6.75F, 0F);

		bodyModel[29].addBox(0F, -12F, 0F, 8, 1, 1, 0F); // Box 235
		bodyModel[29].setRotationPoint(6F, -7.75F, -1F);

		bodyModel[30].addShapeBox(0F, -12F, 0F, 8, 1, 1, 0F,0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 236
		bodyModel[30].setRotationPoint(6F, -7.75F, 7F);

		bodyModel[31].addBox(0F, -12F, 0F, 8, 1, 1, 0F); // Box 237
		bodyModel[31].setRotationPoint(6F, -7.75F, 8F);

		bodyModel[32].addBox(0F, -12F, 0F, 1, 1, 10, 0F); // Box 238
		bodyModel[32].setRotationPoint(14F, -7.75F, -1F);

		bodyModel[33].addBox(0F, -12F, 0F, 1, 8, 1, 0F); // Box 239
		bodyModel[33].setRotationPoint(14F, -6.75F, -1F);

		bodyModel[34].addBox(0F, -12F, 0F, 1, 1, 10, 0F); // Box 240
		bodyModel[34].setRotationPoint(14F, 1.25F, -1F);

		bodyModel[35].addBox(0F, -12F, 0F, 8, 1, 1, 0F); // Box 241
		bodyModel[35].setRotationPoint(6F, 1.25F, -1F);

		bodyModel[36].addShapeBox(0F, -12F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 7F, 0F, 0F); // Box 242
		bodyModel[36].setRotationPoint(13F, -6.75F, 8F);

		bodyModel[37].addBox(0F, -12F, 0F, 8, 1, 1, 0F); // Box 243
		bodyModel[37].setRotationPoint(6F, 1.25F, 8F);

		bodyModel[38].addBox(0F, -12F, 0F, 20, 8, 8, 0F); // Box 244
		bodyModel[38].setRotationPoint(-15F, -5.75F, 1F);

		bodyModel[39].addShapeBox(0F, -12F, 0F, 8, 10, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 245
		bodyModel[39].setRotationPoint(-5F, -8F, -9F);

		bodyModel[40].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[40].setRotationPoint(7F, -6F, -9F);

		bodyModel[41].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 248
		bodyModel[41].setRotationPoint(7F, -6F, -7F);

		bodyModel[42].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 249
		bodyModel[42].setRotationPoint(9F, -6F, -7F);

		bodyModel[43].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[43].setRotationPoint(9F, -6F, -9F);

		bodyModel[44].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 251
		bodyModel[44].setRotationPoint(9F, -6F, -3F);

		bodyModel[45].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[45].setRotationPoint(9F, -6F, -5F);

		bodyModel[46].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[46].setRotationPoint(7F, -6F, -5F);

		bodyModel[47].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 254
		bodyModel[47].setRotationPoint(7F, -6F, -3F);

		bodyModel[48].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 255
		bodyModel[48].setRotationPoint(13F, -6F, -3F);

		bodyModel[49].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[49].setRotationPoint(13F, -6F, -5F);

		bodyModel[50].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[50].setRotationPoint(11F, -6F, -5F);

		bodyModel[51].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 258
		bodyModel[51].setRotationPoint(11F, -6F, -3F);

		bodyModel[52].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 259
		bodyModel[52].setRotationPoint(13F, -6F, -7F);

		bodyModel[53].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[53].setRotationPoint(13F, -6F, -9F);

		bodyModel[54].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[54].setRotationPoint(11F, -6F, -9F);

		bodyModel[55].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 262
		bodyModel[55].setRotationPoint(11F, -6F, -7F);

		bodyModel[56].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		bodyModel[56].setRotationPoint(5F, -6F, -5F);

		bodyModel[57].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 264
		bodyModel[57].setRotationPoint(5F, -6F, -3F);

		bodyModel[58].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 265
		bodyModel[58].setRotationPoint(3F, -6F, -3F);

		bodyModel[59].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[59].setRotationPoint(3F, -6F, -5F);

		bodyModel[60].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 267
		bodyModel[60].setRotationPoint(3F, -6F, -7F);

		bodyModel[61].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 268
		bodyModel[61].setRotationPoint(5F, -6F, -7F);

		bodyModel[62].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[62].setRotationPoint(5F, -6F, -9F);

		bodyModel[63].addShapeBox(0F, -12F, 0F, 2, 8, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[63].setRotationPoint(3F, -6F, -9F);

		bodyModel[64].addBox(0F, -12F, 0F, 1, 8, 1, 0F); // Box 64
		bodyModel[64].setRotationPoint(14F, -6.75F, 8F);
	}
}