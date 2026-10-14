//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.10.2021 - 00:55:19
// Last changed on: 14.10.2021 - 00:55:19

package BIP.client.render.rollingstock.freight; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.common.api.AbstractTrains;

public class ModelLowmac extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelLowmac() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[142];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);

		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f, f1, f2, f3, f4, f5);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 36
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 37
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 38
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 39
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 40
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 41
		bodyModel[11] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 42
		bodyModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 43
		bodyModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 44
		bodyModel[14] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 45
		bodyModel[15] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 46
		bodyModel[16] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 47
		bodyModel[17] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 48
		bodyModel[18] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 49
		bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 50
		bodyModel[20] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 51
		bodyModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 52
		bodyModel[22] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 53
		bodyModel[23] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 54
		bodyModel[24] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 55
		bodyModel[25] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 56
		bodyModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 153
		bodyModel[27] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 154
		bodyModel[28] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 156
		bodyModel[29] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 157
		bodyModel[30] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 158
		bodyModel[31] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 161
		bodyModel[32] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 162
		bodyModel[33] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 227
		bodyModel[34] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 159
		bodyModel[35] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 96
		bodyModel[40] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 28
		bodyModel[42] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 28
		bodyModel[43] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 95
		bodyModel[44] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 52
		bodyModel[53] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 53
		bodyModel[54] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 54
		bodyModel[55] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 55
		bodyModel[56] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 56
		bodyModel[57] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 28
		bodyModel[58] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 58
		bodyModel[59] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 59
		bodyModel[60] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 65
		bodyModel[66] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 66
		bodyModel[67] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 67
		bodyModel[68] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 68
		bodyModel[69] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 69
		bodyModel[70] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 70
		bodyModel[71] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 71
		bodyModel[72] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 72
		bodyModel[73] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 73
		bodyModel[74] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 74
		bodyModel[75] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 75
		bodyModel[76] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 76
		bodyModel[77] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 77
		bodyModel[78] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 78
		bodyModel[79] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 79
		bodyModel[80] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 80
		bodyModel[81] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 81
		bodyModel[82] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 82
		bodyModel[83] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 83
		bodyModel[84] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 84
		bodyModel[85] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 85
		bodyModel[86] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 86
		bodyModel[87] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 87
		bodyModel[88] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 88
		bodyModel[89] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 89
		bodyModel[90] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 90
		bodyModel[91] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 91
		bodyModel[92] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 92
		bodyModel[93] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 93
		bodyModel[94] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 94
		bodyModel[95] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 95
		bodyModel[96] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 96
		bodyModel[97] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 97
		bodyModel[98] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 98
		bodyModel[99] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 99
		bodyModel[100] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 100
		bodyModel[101] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
		bodyModel[102] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 102
		bodyModel[103] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 103
		bodyModel[104] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 104
		bodyModel[105] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 105
		bodyModel[106] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 106
		bodyModel[107] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 107
		bodyModel[108] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 108
		bodyModel[109] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 109
		bodyModel[110] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 110
		bodyModel[111] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 111
		bodyModel[112] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 112
		bodyModel[113] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 113
		bodyModel[114] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 114
		bodyModel[115] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 115
		bodyModel[116] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 116
		bodyModel[117] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 117
		bodyModel[118] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 118
		bodyModel[119] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 119
		bodyModel[120] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 120
		bodyModel[121] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 121
		bodyModel[122] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 122
		bodyModel[123] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 123
		bodyModel[124] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 209
		bodyModel[125] = new ModelRendererTurbo(this, 462, 39, textureX, textureY); // Box 210
		bodyModel[126] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 128
		bodyModel[127] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 129
		bodyModel[128] = new ModelRendererTurbo(this, 234, 37, textureX, textureY); // Box 130
		bodyModel[129] = new ModelRendererTurbo(this, 269, 43, textureX, textureY); // Box 131
		bodyModel[130] = new ModelRendererTurbo(this, 271, 75, textureX, textureY); // Box 132
		bodyModel[131] = new ModelRendererTurbo(this, 234, 69, textureX, textureY); // Box 133
		bodyModel[132] = new ModelRendererTurbo(this, 462, 39, textureX, textureY); // Box 134
		bodyModel[133] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 135
		bodyModel[134] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 134
		bodyModel[135] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 135
		bodyModel[136] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 137
		bodyModel[137] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 138
		bodyModel[138] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 139
		bodyModel[139] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 140
		bodyModel[140] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 141
		bodyModel[141] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 142

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[0].setRotationPoint(28F, 2F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 31
		bodyModel[1].setRotationPoint(29F, 2.5F, -0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.9F, -0.8F, -0.2F, -0.4F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F); // Box 32
		bodyModel[2].setRotationPoint(30F, 1.5F, -0.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F); // Box 34
		bodyModel[3].setRotationPoint(30.5F, 1.5F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.8F, -0.2F, -0.9F, -0.8F, -0.2F, -0.9F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F); // Box 35
		bodyModel[4].setRotationPoint(28.9F, 1.5F, -0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F); // Box 36
		bodyModel[5].setRotationPoint(30.5F, 1.5F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 37
		bodyModel[6].setRotationPoint(30.5F, 2.5F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F); // Box 38
		bodyModel[7].setRotationPoint(30.5F, 2.5F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F); // Box 39
		bodyModel[8].setRotationPoint(30.5F, 1.5F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F); // Box 40
		bodyModel[9].setRotationPoint(30.5F, 2.5F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F); // Box 41
		bodyModel[10].setRotationPoint(30.5F, 1.5F, 7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 42
		bodyModel[11].setRotationPoint(30.5F, 2.5F, 8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F); // Box 43
		bodyModel[12].setRotationPoint(30.5F, 1.5F, 7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 44
		bodyModel[13].setRotationPoint(30.5F, 2.5F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F); // Box 45
		bodyModel[14].setRotationPoint(30.5F, 2.5F, 6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F); // Box 46
		bodyModel[15].setRotationPoint(30.5F, 2.5F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F); // Box 47
		bodyModel[16].setRotationPoint(30.5F, 1.5F, 6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 48
		bodyModel[17].setRotationPoint(28.5F, 2F, 7.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 49
		bodyModel[18].setRotationPoint(28.5F, 3F, 7.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 50
		bodyModel[19].setRotationPoint(28.5F, 3F, 6.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[20].setRotationPoint(28.5F, 2F, 6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 52
		bodyModel[21].setRotationPoint(28.5F, 2F, -7.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 53
		bodyModel[22].setRotationPoint(28.5F, 3F, -7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 54
		bodyModel[23].setRotationPoint(28.5F, 3F, -8.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[24].setRotationPoint(28.5F, 2F, -8.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 56
		bodyModel[25].setRotationPoint(30.5F, 2.5F, -7F);

		bodyModel[26].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 153
		bodyModel[26].setRotationPoint(22.5F, 6F, 8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2F, -2.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -2.25F, 0F, -2F, 2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2F, 2F, 0F); // Box 154
		bodyModel[27].setRotationPoint(22.5F, 4F, 8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 156
		bodyModel[28].setRotationPoint(23.5F, 4F, 8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 157
		bodyModel[29].setRotationPoint(21F, 4F, 8.1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[30].setRotationPoint(22.5F, 4F, 8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -0.5F, -1F, 0F); // Box 161
		bodyModel[31].setRotationPoint(20.5F, 4F, 8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 162
		bodyModel[32].setRotationPoint(22.5F, 6F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 12, 12, 0, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, -6F, 0F); // Box 227
		bodyModel[33].setRotationPoint(14.5F, 4F, 5.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 159
		bodyModel[34].setRotationPoint(25F, 4F, 8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 35
		bodyModel[35].setRotationPoint(21F, 4F, 8.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 36
		bodyModel[36].setRotationPoint(22.5F, 5.25F, 8.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F); // Box 37
		bodyModel[37].setRotationPoint(27.5F, 3F, 7.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[38].setRotationPoint(24.5F, 6F, 8.01F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 96
		bodyModel[39].setRotationPoint(27F, 2F, -9.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -4.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -4.25F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 40
		bodyModel[40].setRotationPoint(15F, 2F, 8.6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 3.25F, 0F); // Box 28
		bodyModel[41].setRotationPoint(15F, 2F, -10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 28
		bodyModel[42].setRotationPoint(27F, 2F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 95
		bodyModel[43].setRotationPoint(27F, 4F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 3.25F, 0F); // Box 44
		bodyModel[44].setRotationPoint(15F, 4F, 9F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 45
		bodyModel[45].setRotationPoint(22.5F, 6F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2F, -2.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -2.25F, 0F, -2F, 2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2F, 2F, 0F); // Box 46
		bodyModel[46].setRotationPoint(22.5F, 4F, -9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 47
		bodyModel[47].setRotationPoint(23.5F, 4F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(21F, 4F, -9.1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 49
		bodyModel[49].setRotationPoint(22.5F, 4F, -9F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -0.5F, -1F, 0F); // Box 50
		bodyModel[50].setRotationPoint(20.5F, 4F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 12, 0, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -6F, -6F, 0F); // Box 51
		bodyModel[51].setRotationPoint(14.5F, 4F, -5.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 52
		bodyModel[52].setRotationPoint(25F, 4F, -9.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 53
		bodyModel[53].setRotationPoint(21F, 4F, -9.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 54
		bodyModel[54].setRotationPoint(22.5F, 5.25F, -9.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 55
		bodyModel[55].setRotationPoint(27.5F, 3F, -8.25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[56].setRotationPoint(24.5F, 6F, -8.01F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 28
		bodyModel[57].setRotationPoint(-15F, 6F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 12, 12, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -6F, 0F); // Box 58
		bodyModel[58].setRotationPoint(-26.5F, 4F, 5.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 59
		bodyModel[59].setRotationPoint(-22F, 4F, 8.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2F, -2.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -2.25F, 0F, -2F, 2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2F, 2F, 0F); // Box 60
		bodyModel[60].setRotationPoint(-24.5F, 4F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 61
		bodyModel[61].setRotationPoint(-23.5F, 4F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 62
		bodyModel[62].setRotationPoint(-26F, 4F, 8.1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[63].setRotationPoint(-24.5F, 4F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 64
		bodyModel[64].setRotationPoint(-26F, 4F, 8.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -0.5F, -1F, 0F); // Box 65
		bodyModel[65].setRotationPoint(-26.5F, 4F, 8F);

		bodyModel[66].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 66
		bodyModel[66].setRotationPoint(-24.5F, 6F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 67
		bodyModel[67].setRotationPoint(-24.5F, 5.25F, 8.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 2, 2, 19, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 68
		bodyModel[68].setRotationPoint(-24.5F, 6F, -9.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[69].setRotationPoint(-28.5F, 6F, 8.01F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F); // Box 70
		bodyModel[70].setRotationPoint(-28.5F, 3F, 7.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 71
		bodyModel[71].setRotationPoint(-28.5F, 3F, -8.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[72].setRotationPoint(-28.5F, 6F, -8.01F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 12, 12, 0, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6F, -6F, 0F, -6F, -6F, 0F, 0F, -6F, 0F); // Box 73
		bodyModel[73].setRotationPoint(-26.5F, 4F, -5.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[74].setRotationPoint(-26F, 4F, -9.1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, -1F, 0F, 0F, -0.5F, -1F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, -0.5F, -1F, 0F); // Box 75
		bodyModel[75].setRotationPoint(-26.5F, 4F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 76
		bodyModel[76].setRotationPoint(-24.5F, 4F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Box 77
		bodyModel[77].setRotationPoint(-23.5F, 4F, -9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-2F, -2.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -2.25F, 0F, -2F, 2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2F, 2F, 0F); // Box 78
		bodyModel[78].setRotationPoint(-24.5F, 4F, -9F);

		bodyModel[79].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Box 79
		bodyModel[79].setRotationPoint(-24.5F, 6F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 80
		bodyModel[80].setRotationPoint(-24.5F, 5.25F, -9.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 81
		bodyModel[81].setRotationPoint(-26F, 4F, -9.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 82
		bodyModel[82].setRotationPoint(-22F, 4F, -9.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -0.75F, 0F); // Box 83
		bodyModel[83].setRotationPoint(-27F, 2F, -10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 84
		bodyModel[84].setRotationPoint(-28F, 2F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 85
		bodyModel[85].setRotationPoint(-28F, 2F, -9.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 86
		bodyModel[86].setRotationPoint(-29F, 4F, -10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[87].setRotationPoint(-29F, 2F, -10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 88
		bodyModel[88].setRotationPoint(-31.5F, 2F, 7.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 89
		bodyModel[89].setRotationPoint(-31.5F, 3F, 7.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 90
		bodyModel[90].setRotationPoint(-31.5F, 2F, 6.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 91
		bodyModel[91].setRotationPoint(-31.5F, 3F, 6.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F); // Box 92
		bodyModel[92].setRotationPoint(-31.5F, 1.5F, 6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F); // Box 93
		bodyModel[93].setRotationPoint(-31.5F, 2.5F, 6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F); // Box 94
		bodyModel[94].setRotationPoint(-31.5F, 2.5F, 6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F); // Box 95
		bodyModel[95].setRotationPoint(-31.5F, 1.5F, 7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F); // Box 96
		bodyModel[96].setRotationPoint(-31.5F, 2.5F, 7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F); // Box 97
		bodyModel[97].setRotationPoint(-31.5F, 2.5F, 8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F); // Box 98
		bodyModel[98].setRotationPoint(-31.5F, 1.5F, 7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.9F, -0.8F, -0.2F, -0.4F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F); // Box 99
		bodyModel[99].setRotationPoint(-29.9F, 1.5F, -0.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, 0F, -0.2F); // Box 100
		bodyModel[100].setRotationPoint(-31F, 2.5F, -0.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.8F, -0.2F, -0.9F, -0.8F, -0.2F, -0.9F, -0.8F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F); // Box 101
		bodyModel[101].setRotationPoint(-31F, 1.5F, -0.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 102
		bodyModel[102].setRotationPoint(-31.5F, 2F, -8.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 103
		bodyModel[103].setRotationPoint(-31.5F, 3F, -8.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 104
		bodyModel[104].setRotationPoint(-31.5F, 2F, -7.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 105
		bodyModel[105].setRotationPoint(-31.5F, 3F, -7.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F, -0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F); // Box 106
		bodyModel[106].setRotationPoint(-31.5F, 1.5F, -8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F, -0.35F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0F, -0.35F, -0.2F, 0F); // Box 107
		bodyModel[107].setRotationPoint(-31.5F, 2.5F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.8F, -0.8F, -0.5F, -0.8F, -0.8F, -0.5F, -0.8F, 0F, -0.35F, -0.8F, 0F, -0.35F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.5F, -0.5F, -0.35F, -0.5F, -0.5F); // Box 108
		bodyModel[108].setRotationPoint(-31.5F, 2.5F, -8F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.35F, -0.1F, -0.2F); // Box 109
		bodyModel[109].setRotationPoint(-31.5F, 1.5F, -8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F, -0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F); // Box 110
		bodyModel[110].setRotationPoint(-31.5F, 2.5F, -9F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F, -0.35F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.2F, -0.35F, -0.2F, 0.2F); // Box 111
		bodyModel[111].setRotationPoint(-31.5F, 2.5F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.35F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.1F, -0.8F, -0.35F, -0.1F, -0.8F, -0.35F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, -0.8F, -0.35F, -0.8F, -0.8F); // Box 112
		bodyModel[112].setRotationPoint(-31.5F, 1.5F, -9F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.25F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[113].setRotationPoint(-27F, 2F, -9.6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -0.75F, 0F); // Box 114
		bodyModel[114].setRotationPoint(-27F, 4F, -10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -0.25F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[115].setRotationPoint(-27F, 2F, 8.6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 3.25F, 0F, 0F, 3.25F, 0F, 0F, -0.75F, 0F); // Box 116
		bodyModel[116].setRotationPoint(-27F, 4F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -4.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -4.25F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 117
		bodyModel[117].setRotationPoint(15F, 2F, -9.6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 3.25F, 0F); // Box 118
		bodyModel[118].setRotationPoint(15F, 4F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 30, 2, 19, 0F,0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 119
		bodyModel[119].setRotationPoint(-15F, 6F, -9.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 30, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 120
		bodyModel[120].setRotationPoint(-15F, 8F, -10F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 121
		bodyModel[121].setRotationPoint(-15F, 6F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 122
		bodyModel[122].setRotationPoint(-15F, 6F, -9.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Box 123
		bodyModel[123].setRotationPoint(14F, 6F, -9.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 209
		bodyModel[124].setRotationPoint(25.8F, 4F, -10.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, 2.8F, -0.2F, 0F, 2.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -3.2F, -0.2F, 0F, -3.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 210
		bodyModel[125].setRotationPoint(14.5F, 6.25F, -10.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[126].setRotationPoint(27.5F, 6.1F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[127].setRotationPoint(-28.5F, 6.1F, -8F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 130
		bodyModel[128].setRotationPoint(-27F, 2F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 9, 1, 20, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[129].setRotationPoint(-24F, 2F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 9, 1, 20, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F); // Box 132
		bodyModel[130].setRotationPoint(15F, 2F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[131].setRotationPoint(24F, 2F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 2.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 2.8F, -0.2F, 0F, -3.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -3.2F, -0.2F); // Box 134
		bodyModel[132].setRotationPoint(-26.5F, 6.25F, 9.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 135
		bodyModel[133].setRotationPoint(-26.8F, 4F, 9.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 6, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[134].setRotationPoint(15F, 6F, 9.61F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[135].setRotationPoint(15F, 6F, 10.01F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 6, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[136].setRotationPoint(15F, 6F, -9.61F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0F, -0.75F, 0F); // Box 138
		bodyModel[137].setRotationPoint(15F, 6F, -10.01F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 6, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 139
		bodyModel[138].setRotationPoint(-21F, 6F, 9.61F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -1F, 0F); // Box 140
		bodyModel[139].setRotationPoint(-16F, 6F, 10.01F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 141
		bodyModel[140].setRotationPoint(-21F, 6F, -9.61F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -1F, 0F); // Box 142
		bodyModel[141].setRotationPoint(-16F, 6F, -10.01F);
	}
}