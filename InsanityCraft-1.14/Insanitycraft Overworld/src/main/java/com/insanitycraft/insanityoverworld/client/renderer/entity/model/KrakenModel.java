package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.EntityKraken;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.math.MathHelper;

public class KrakenModel<T extends EntityKraken> extends EntityModel<T> {
	private final RendererModel headBody;
	private final RendererModel leftFins;
	private final RendererModel rightFins;
	private final RendererModel mouth;
	private final RendererModel leafBeak;
	private final RendererModel rightBeak;
	private final RendererModel tentacle1;
	private final RendererModel tentacle1_1;
	private final RendererModel tentacle1_2;
	private final RendererModel tentacle1_3;
	private final RendererModel tentacle1_4;
	private final RendererModel tentacle2;
	private final RendererModel tentacle2_1;
	private final RendererModel tentacle2_2;
	private final RendererModel tentacle2_3;
	private final RendererModel tentacle2_4;
	private final RendererModel tentacle3;
	private final RendererModel tentacle3_1;
	private final RendererModel tentacle3_2;
	private final RendererModel tentacle3_3;
	private final RendererModel tentacle4;
	private final RendererModel tentacle4_1;
	private final RendererModel tentacle4_2;
	private final RendererModel tentacle4_3;
	private final RendererModel innerTentacle1;
	private final RendererModel innerTentacle1_1;
	private final RendererModel innerTentacle1_2;
	private final RendererModel innerTentacle2;
	private final RendererModel innerTentacle2_1;
	private final RendererModel innerTentacle2_2;
	private final RendererModel innerTentacle3;
	private final RendererModel innerTentacle3_1;
	private final RendererModel innerTentacle3_2;
	private final RendererModel innerTentacle4;
	private final RendererModel innerTentacle4_1;
	private final RendererModel innerTentacle4_2;
	private final RendererModel innerTentacle5;
	private final RendererModel innerTentacle5_1;
	private final RendererModel innerTentacle5_2;
	private final RendererModel innerTentacle6;
	private final RendererModel innerTentacle6_1;
	private final RendererModel innerTentacle6_2;


	public KrakenModel() {
		textureWidth = 256;
		textureHeight = 256;

		headBody = new RendererModel(this);
		headBody.setRotationPoint(-0.1F, 36.0F, 31.4F);
		setRotationAngle(headBody, 1.5708F, 0.0F, 0.0F);
		headBody.cubeList.add(new ModelBox(headBody, 0, 139, -9.9F, -39.35F, 25.05F, 20, 20, 30, 0.0F, false));
		headBody.cubeList.add(new ModelBox(headBody, 0, 211, -10.9F, -38.35F, 93.05F, 22, 18, 27, 0.0F, false));
		headBody.cubeList.add(new ModelBox(headBody, 0, 220, -9.9F, -36.35F, 120.05F, 20, 14, 22, 0.0F, false));
		headBody.cubeList.add(new ModelBox(headBody, 0, 194, -11.9F, -41.35F, 55.05F, 24, 24, 38, 0.0F, false));

		leftFins = new RendererModel(this);
		leftFins.setRotationPoint(10.85F, -28.5F, 127.65F);
		headBody.addChild(leftFins);
		leftFins.cubeList.add(new ModelBox(leftFins, 0, 231, -0.75F, -1.85F, -7.6F, 16, 3, 22, 0.0F, false));
		leftFins.cubeList.add(new ModelBox(leftFins, 0, 226, 0.25F, -1.85F, -34.6F, 17, 3, 27, 0.0F, false));

		rightFins = new RendererModel(this);
		rightFins.setRotationPoint(-10.65F, -28.5F, 127.65F);
		headBody.addChild(rightFins);
		rightFins.cubeList.add(new ModelBox(rightFins, 0, 231, -15.25F, -1.85F, -7.6F, 16, 3, 22, 0.0F, false));
		rightFins.cubeList.add(new ModelBox(rightFins, 0, 226, -17.25F, -1.85F, -34.6F, 17, 3, 27, 0.0F, false));

		mouth = new RendererModel(this);
		mouth.setRotationPoint(-0.0083F, 8.9958F, -2.95F);
		setRotationAngle(mouth, 1.5708F, 0.0F, 0.0F);
		mouth.cubeList.add(new ModelBox(mouth, 65, 225, 10.0083F, 15.0042F, -7.95F, 3, 3, 18, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 65, 225, -12.9917F, 15.0042F, -7.95F, 3, 3, 18, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 65, 225, 10.0083F, -7.9958F, -7.95F, 3, 3, 18, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 65, 225, -12.9917F, -7.9958F, -7.95F, 3, 3, 18, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 0, 236, -9.9917F, -6.9958F, -8.95F, 20, 2, 18, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 0, 218, -9.9917F, 15.0042F, -8.95F, 20, 2, 18, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 0, 218, -11.9917F, -4.9958F, -8.95F, 2, 20, 18, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 8.0083F, -3.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 6.0083F, -1.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -6.9917F, -1.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -6.9917F, 11.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 6.0083F, 11.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 8.0083F, 13.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 2.0083F, -3.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 2.0083F, 13.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 6.0083F, -3.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 6.0083F, 13.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 234, 246, -0.9917F, -3.9958F, -10.95F, 2, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 234, 246, -0.9917F, 13.0042F, -10.95F, 2, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -4.9917F, -3.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -4.9917F, 13.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 4.0083F, -3.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 4.0083F, 13.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -2.9917F, -3.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -2.9917F, 13.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -6.9917F, -3.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -6.9917F, 13.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -8.9917F, -3.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -8.9917F, -1.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 8.0083F, -1.9958F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -8.9917F, 0.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 8.0083F, 0.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -8.9917F, 1.9042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 8.0083F, 1.9042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -8.9917F, 13.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -8.9917F, 11.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 8.0083F, 11.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -8.9917F, 9.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 8.0083F, 9.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, -8.9917F, 7.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 246, 8.0083F, 7.0042F, -10.95F, 1, 1, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 234, 246, -8.9917F, 4.0042F, -10.95F, 1, 2, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 236, 245, 8.0083F, 4.0042F, -10.95F, 1, 2, 9, 0.0F, false));
		mouth.cubeList.add(new ModelBox(mouth, 0, 218, 10.0083F, -4.9958F, -8.95F, 2, 20, 18, 0.0F, false));

		leafBeak = new RendererModel(this);
		leafBeak.setRotationPoint(-0.1917F, 5.2542F, -2.1F);
		setRotationAngle(leafBeak, 0.0F, 0.0F, 1.5708F);
		mouth.addChild(leafBeak);
		leafBeak.cubeList.add(new ModelBox(leafBeak, 124, 245, -2.5F, -3.2F, -8.85F, 5, 2, 9, 0.0F, false));
		leafBeak.cubeList.add(new ModelBox(leafBeak, 124, 245, 2.5F, -2.2F, -8.85F, 2, 2, 9, 0.0F, false));
		leafBeak.cubeList.add(new ModelBox(leafBeak, 124, 245, -4.5F, -2.2F, -8.85F, 2, 2, 9, 0.0F, false));
		leafBeak.cubeList.add(new ModelBox(leafBeak, 124, 246, -2.5F, -2.2F, -16.85F, 5, 2, 8, 0.0F, false));

		rightBeak = new RendererModel(this);
		rightBeak.setRotationPoint(-0.1917F, 5.2542F, -2.1F);
		setRotationAngle(rightBeak, 0.0F, 0.0F, -1.5708F);
		mouth.addChild(rightBeak);
		rightBeak.cubeList.add(new ModelBox(rightBeak, 124, 245, -2.5F, -2.8F, -8.85F, 5, 2, 9, 0.0F, false));
		rightBeak.cubeList.add(new ModelBox(rightBeak, 124, 245, 2.5F, -1.8F, -8.85F, 2, 2, 9, 0.0F, false));
		rightBeak.cubeList.add(new ModelBox(rightBeak, 124, 245, -4.5F, -1.8F, -8.85F, 2, 2, 9, 0.0F, false));
		rightBeak.cubeList.add(new ModelBox(rightBeak, 124, 246, -2.5F, -1.8F, -16.85F, 5, 2, 8, 0.0F, false));

		tentacle1 = new RendererModel(this);
		tentacle1.setRotationPoint(12.5F, 5.1F, -3.4F);
		setRotationAngle(tentacle1, 1.5708F, 0.0F, 0.0F);
		tentacle1.cubeList.add(new ModelBox(tentacle1, 54, 229, -0.5F, -3.6F, -3.8F, 8, 8, 8, 0.0F, false));

		tentacle1_1 = new RendererModel(this);
		tentacle1_1.setRotationPoint(8.0F, 0.0F, 0.0F);
		tentacle1.addChild(tentacle1_1);
		tentacle1_1.cubeList.add(new ModelBox(tentacle1_1, 12, 215, -0.5F, -2.6F, -23.8F, 6, 6, 27, 0.0F, false));

		tentacle1_2 = new RendererModel(this);
		tentacle1_2.setRotationPoint(2.0F, 0.0F, -24.0F);
		tentacle1_1.addChild(tentacle1_2);
		tentacle1_2.cubeList.add(new ModelBox(tentacle1_2, 0, 199, -2.5F, -1.6F, -52.8F, 5, 4, 53, 0.0F, false));

		tentacle1_3 = new RendererModel(this);
		tentacle1_3.setRotationPoint(0.0F, 0.0F, -52.8F);
		tentacle1_2.addChild(tentacle1_3);
		tentacle1_3.cubeList.add(new ModelBox(tentacle1_3, 16, 208, -1.5F, -0.6F, -46.0F, 3, 2, 46, 0.0F, false));

		tentacle1_4 = new RendererModel(this);
		tentacle1_4.setRotationPoint(0.0F, 0.0F, -46.0F);
		tentacle1_3.addChild(tentacle1_4);
		tentacle1_4.cubeList.add(new ModelBox(tentacle1_4, 151, 219, -1.5F, -2.6F, -25.0F, 5, 6, 25, 0.0F, false));

		tentacle2 = new RendererModel(this);
		tentacle2.setRotationPoint(-12.5F, 5.1F, -1.95F);
		setRotationAngle(tentacle2, 1.5708F, 3.1416F, 0.0F);
		tentacle2.cubeList.add(new ModelBox(tentacle2, 54, 229, -0.5F, -3.0F, -3.8F, 8, 8, 8, 0.0F, false));

		tentacle2_1 = new RendererModel(this);
		tentacle2_1.setRotationPoint(8.0F, 0.0F, 0.0F);
		tentacle2.addChild(tentacle2_1);
		tentacle2_1.cubeList.add(new ModelBox(tentacle2_1, 12, 215, -0.5F, -2.0F, -23.8F, 6, 6, 27, 0.0F, false));

		tentacle2_2 = new RendererModel(this);
		tentacle2_2.setRotationPoint(2.0F, 0.0F, -24.0F);
		tentacle2_1.addChild(tentacle2_2);
		tentacle2_2.cubeList.add(new ModelBox(tentacle2_2, 0, 199, -2.5F, -1.0F, -52.8F, 5, 4, 53, 0.0F, false));

		tentacle2_3 = new RendererModel(this);
		tentacle2_3.setRotationPoint(0.0F, 0.0F, -52.8F);
		tentacle2_2.addChild(tentacle2_3);
		tentacle2_3.cubeList.add(new ModelBox(tentacle2_3, 16, 208, -1.5F, 0.0F, -46.0F, 3, 2, 46, 0.0F, false));

		tentacle2_4 = new RendererModel(this);
		tentacle2_4.setRotationPoint(0.0F, 0.0F, -46.0F);
		tentacle2_3.addChild(tentacle2_4);
		tentacle2_4.cubeList.add(new ModelBox(tentacle2_4, 151, 219, -1.5F, -2.0F, -25.0F, 5, 6, 25, 0.0F, false));

		tentacle3 = new RendererModel(this);
		tentacle3.setRotationPoint(12.0F, 5.9F, 8.875F);
		setRotationAngle(tentacle3, 1.5708F, 0.0F, 0.0F);
		tentacle3.cubeList.add(new ModelBox(tentacle3, 54, 229, 0.0F, -5.8F, -2.975F, 8, 8, 8, 0.0F, false));

		tentacle3_1 = new RendererModel(this);
		tentacle3_1.setRotationPoint(8.0F, -1.75F, 1.0F);
		tentacle3.addChild(tentacle3_1);
		tentacle3_1.cubeList.add(new ModelBox(tentacle3_1, 12, 215, 0.0F, -3.05F, -27.975F, 6, 6, 31, 0.0F, false));

		tentacle3_2 = new RendererModel(this);
		tentacle3_2.setRotationPoint(2.25F, 0.0F, -28.0F);
		tentacle3_1.addChild(tentacle3_2);
		tentacle3_2.cubeList.add(new ModelBox(tentacle3_2, 47, 223, -2.25F, -2.05F, -28.975F, 5, 4, 29, 0.0F, false));

		tentacle3_3 = new RendererModel(this);
		tentacle3_3.setRotationPoint(0.0F, 0.0F, -29.0F);
		tentacle3_2.addChild(tentacle3_3);
		tentacle3_3.cubeList.add(new ModelBox(tentacle3_3, 40, 219, -1.25F, -1.05F, -28.975F, 3, 2, 29, 0.0F, false));

		tentacle4 = new RendererModel(this);
		tentacle4.setRotationPoint(-12.0F, 5.9F, 5.675F);
		setRotationAngle(tentacle4, 1.5708F, 3.1416F, 0.0F);
		tentacle4.cubeList.add(new ModelBox(tentacle4, 54, 229, 0.0F, -5.4F, -2.975F, 8, 8, 8, 0.0F, false));

		tentacle4_1 = new RendererModel(this);
		tentacle4_1.setRotationPoint(8.0F, -1.75F, 1.0F);
		tentacle4.addChild(tentacle4_1);
		tentacle4_1.cubeList.add(new ModelBox(tentacle4_1, 12, 215, 0.0F, -2.65F, -27.975F, 6, 6, 31, 0.0F, false));

		tentacle4_2 = new RendererModel(this);
		tentacle4_2.setRotationPoint(2.25F, 0.0F, -28.0F);
		tentacle4_1.addChild(tentacle4_2);
		tentacle4_2.cubeList.add(new ModelBox(tentacle4_2, 47, 223, -2.25F, -1.65F, -28.975F, 5, 4, 29, 0.0F, false));

		tentacle4_3 = new RendererModel(this);
		tentacle4_3.setRotationPoint(0.0F, 0.0F, -29.0F);
		tentacle4_2.addChild(tentacle4_3);
		tentacle4_3.cubeList.add(new ModelBox(tentacle4_3, 40, 219, -1.25F, -0.65F, -28.975F, 3, 2, 29, 0.0F, false));

		innerTentacle1 = new RendererModel(this);
		innerTentacle1.setRotationPoint(12.0F, 13.0F, 2.1333F);
		setRotationAngle(innerTentacle1, 1.5708F, 0.0F, 0.0F);
		innerTentacle1.cubeList.add(new ModelBox(innerTentacle1, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		innerTentacle1_1 = new RendererModel(this);
		innerTentacle1_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		innerTentacle1.addChild(innerTentacle1_1);
		innerTentacle1_1.cubeList.add(new ModelBox(innerTentacle1_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		innerTentacle1_2 = new RendererModel(this);
		innerTentacle1_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		innerTentacle1_1.addChild(innerTentacle1_2);
		innerTentacle1_2.cubeList.add(new ModelBox(innerTentacle1_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));

		innerTentacle2 = new RendererModel(this);
		innerTentacle2.setRotationPoint(-11.0F, 13.0F, 0.1333F);
		setRotationAngle(innerTentacle2, 1.5708F, 3.1416F, 0.0F);
		innerTentacle2.cubeList.add(new ModelBox(innerTentacle2, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		innerTentacle2_1 = new RendererModel(this);
		innerTentacle2_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		innerTentacle2.addChild(innerTentacle2_1);
		innerTentacle2_1.cubeList.add(new ModelBox(innerTentacle2_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		innerTentacle2_2 = new RendererModel(this);
		innerTentacle2_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		innerTentacle2_1.addChild(innerTentacle2_2);
		innerTentacle2_2.cubeList.add(new ModelBox(innerTentacle2_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));

		innerTentacle3 = new RendererModel(this);
		innerTentacle3.setRotationPoint(-5.2F, 13.1F, -8.8667F);
		setRotationAngle(innerTentacle3, 1.5708F, 1.5708F, 0.0F);
		innerTentacle3.cubeList.add(new ModelBox(innerTentacle3, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		innerTentacle3_1 = new RendererModel(this);
		innerTentacle3_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		innerTentacle3.addChild(innerTentacle3_1);
		innerTentacle3_1.cubeList.add(new ModelBox(innerTentacle3_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		innerTentacle3_2 = new RendererModel(this);
		innerTentacle3_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		innerTentacle3_1.addChild(innerTentacle3_2);
		innerTentacle3_2.cubeList.add(new ModelBox(innerTentacle3_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));

		innerTentacle4 = new RendererModel(this);
		innerTentacle4.setRotationPoint(6.8F, 13.1F, -8.8667F);
		setRotationAngle(innerTentacle4, 1.5708F, 1.5708F, 0.0F);
		innerTentacle4.cubeList.add(new ModelBox(innerTentacle4, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		innerTentacle4_1 = new RendererModel(this);
		innerTentacle4_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		innerTentacle4.addChild(innerTentacle4_1);
		innerTentacle4_1.cubeList.add(new ModelBox(innerTentacle4_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		innerTentacle4_2 = new RendererModel(this);
		innerTentacle4_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		innerTentacle4_1.addChild(innerTentacle4_2);
		innerTentacle4_2.cubeList.add(new ModelBox(innerTentacle4_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));

		innerTentacle5 = new RendererModel(this);
		innerTentacle5.setRotationPoint(-6.9F, 13.1F, 13.1333F);
		setRotationAngle(innerTentacle5, 1.5708F, -1.5708F, 0.0F);
		innerTentacle5.cubeList.add(new ModelBox(innerTentacle5, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		innerTentacle5_1 = new RendererModel(this);
		innerTentacle5_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		innerTentacle5.addChild(innerTentacle5_1);
		innerTentacle5_1.cubeList.add(new ModelBox(innerTentacle5_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		innerTentacle5_2 = new RendererModel(this);
		innerTentacle5_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		innerTentacle5_1.addChild(innerTentacle5_2);
		innerTentacle5_2.cubeList.add(new ModelBox(innerTentacle5_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));

		innerTentacle6 = new RendererModel(this);
		innerTentacle6.setRotationPoint(5.1F, 13.1F, 13.1333F);
		setRotationAngle(innerTentacle6, 1.5708F, -1.5708F, 0.0F);
		innerTentacle6.cubeList.add(new ModelBox(innerTentacle6, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		innerTentacle6_1 = new RendererModel(this);
		innerTentacle6_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		innerTentacle6.addChild(innerTentacle6_1);
		innerTentacle6_1.cubeList.add(new ModelBox(innerTentacle6_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		innerTentacle6_2 = new RendererModel(this);
		innerTentacle6_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		innerTentacle6_1.addChild(innerTentacle6_2);
		innerTentacle6_2.cubeList.add(new ModelBox(innerTentacle6_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));
	}

	@Override
	public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		GlStateManager.translatef(0, -8.5f, 0);

		headBody.render(scale);
		mouth.render(scale);
		tentacle1.render(scale);
		tentacle2.render(scale);
		tentacle3.render(scale);
		tentacle4.render(scale);
		innerTentacle1.render(scale);
		innerTentacle2.render(scale);
		innerTentacle3.render(scale);
		innerTentacle4.render(scale);
		innerTentacle5.render(scale);
		innerTentacle6.render(scale);

	}

	private boolean hasRandom = false;

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {


		//region long tentacles

		this.tentacle1_1.rotateAngleY = -swingTentacle(ageInTicks, 0.3F, 0.3F, 1, 0.3F);
		this.tentacle1_2.rotateAngleY = swingTentacle(ageInTicks, 0.3F, 0.3F, 2 , 0.2F);
		this.tentacle1_3.rotateAngleY = swingTentacle(ageInTicks, 0.2F, 0.3F, 3, 0.2F);
		this.tentacle1_4.rotateAngleY = swingTentacle(ageInTicks, 0.3F, 0.3F, 3, 0.2F);

		this.tentacle2_1.rotateAngleY = -swingTentacle(ageInTicks, 0.3F, 0.3F, 5, 0.3F);
		this.tentacle2_2.rotateAngleY = swingTentacle(ageInTicks, 0.3F, 0.3F, 6, 0.2F);
		this.tentacle2_3.rotateAngleY = swingTentacle(ageInTicks, 0.2F, 0.3F, 7, 0.2F);
		this.tentacle2_4.rotateAngleY = swingTentacle(ageInTicks, 0.3F, 0.3F, 7, 0.2F);
		//endregion


		//region short tentacles
		this.tentacle3_1.rotateAngleY = -swingTentacle(ageInTicks, 0.3F, 0.4F, 2, 0.2F);
		this.tentacle3_2.rotateAngleY = swingTentacle(ageInTicks, 0.05F, 0.4F, 4, 0.2F);
		this.tentacle3_3.rotateAngleY = swingTentacle(ageInTicks, 0.1F, 0.4F, 4, 0.2F);

		this.tentacle4_1.rotateAngleY = -swingTentacle(ageInTicks, 0.3F, 0.4F, 6, 0.2F);
		this.tentacle4_2.rotateAngleY = swingTentacle(ageInTicks, 0.05F, 0.4F, 8, 0.2F);
		this.tentacle4_3.rotateAngleY = swingTentacle(ageInTicks, 0.2F, 0.4F, 8, 0.2F);

		this.innerTentacle1.rotateAngleZ = -swingTentacle(ageInTicks, 0.3F, 0.2F, 1, 0.4F);
		this.innerTentacle1_1.rotateAngleY = swingTentacle(ageInTicks, 0.3F, 0.2F, 3, 0.4F);
		this.innerTentacle1_2.rotateAngleY = swingTentacle(ageInTicks, 0.3F, 0.2F, 8, 0.4F);

		this.innerTentacle2.rotateAngleZ = swingTentacle(ageInTicks, 0.3F, 0.2F, 3, 0.4F);
		this.innerTentacle2_1.rotateAngleY = swingTentacle(ageInTicks, 0.3F, 0.2F, 7, 0.4F);
		this.innerTentacle2_2.rotateAngleY = swingTentacle(ageInTicks, 0.3F, 0.2F, 5, 0.4F);


		//wait for updated model
		//this.innerTentacle3.rotateAngleX = -swingTentacle(ageInTicks, 0.3F, 0.2F, 1, 0.4F);
		//this.innerTentacle4.rotateAngleZ = -swingTentacle(ageInTicks, 0.3F, 0.2F, 1, 0.4F);
		//this.innerTentacle5.rotateAngleY = -swingTentacle(ageInTicks, 0.3F, 0.2F, 1, 0.4F);


		//endregion

	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	//keep the speed the same for each part of a tentacle
	private float swingTentacle(float ageInTicks, float swingAmount, float speed, int offset, float sidedSwingAmount) {
		float swingAmount1 = (swingAmount * MathHelper.sin(ageInTicks * speed + offset) + sidedSwingAmount);

		return swingAmount1;
	}
}