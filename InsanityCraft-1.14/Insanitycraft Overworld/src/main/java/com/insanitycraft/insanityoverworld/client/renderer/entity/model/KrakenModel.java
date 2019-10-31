package com.insanitycraft.insanityoverworld.client.renderer.entity.model;

import com.insanitycraft.insanityoverworld.entity.EntityKraken;
import com.insanitycraft.insanityoverworld.util.InsanityLog;
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
	private final RendererModel Tentacle3_1;
	private final RendererModel Tentacle3_2;
	private final RendererModel Tentacle3_3;
	private final RendererModel Tentacle4;
	private final RendererModel Tentacle4_1;
	private final RendererModel Tentacle4_2;
	private final RendererModel Tentacle4_3;
	private final RendererModel InnerTentacle1;
	private final RendererModel InnerTentacle1_1;
	private final RendererModel InnerTentacle1_2;
	private final RendererModel InnerTentacle2;
	private final RendererModel InnerTentacle2_1;
	private final RendererModel InnerTentacle2_2;
	private final RendererModel InnerTentacle3;
	private final RendererModel InnerTentacle3_1;
	private final RendererModel InnerTentacle3_2;
	private final RendererModel InnerTentacle4;
	private final RendererModel InnerTentacle4_1;
	private final RendererModel InnerTentacle4_2;
	private final RendererModel InnerTentacle5;
	private final RendererModel InnerTentacle5_1;
	private final RendererModel InnerTentacle5_2;
	private final RendererModel InnerTentacle6;
	private final RendererModel InnerTentacle6_1;
	private final RendererModel InnerTentacle6_2;

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

		Tentacle3_1 = new RendererModel(this);
		Tentacle3_1.setRotationPoint(8.0F, -1.75F, 1.0F);
		tentacle3.addChild(Tentacle3_1);
		Tentacle3_1.cubeList.add(new ModelBox(Tentacle3_1, 12, 215, 0.0F, -3.05F, -27.975F, 6, 6, 31, 0.0F, false));

		Tentacle3_2 = new RendererModel(this);
		Tentacle3_2.setRotationPoint(2.25F, 0.0F, -28.0F);
		Tentacle3_1.addChild(Tentacle3_2);
		Tentacle3_2.cubeList.add(new ModelBox(Tentacle3_2, 47, 223, -2.25F, -2.05F, -28.975F, 5, 4, 29, 0.0F, false));

		Tentacle3_3 = new RendererModel(this);
		Tentacle3_3.setRotationPoint(0.0F, 0.0F, -29.0F);
		Tentacle3_2.addChild(Tentacle3_3);
		Tentacle3_3.cubeList.add(new ModelBox(Tentacle3_3, 40, 219, -1.25F, -1.05F, -28.975F, 3, 2, 29, 0.0F, false));

		Tentacle4 = new RendererModel(this);
		Tentacle4.setRotationPoint(-12.0F, 5.9F, 5.675F);
		setRotationAngle(Tentacle4, 1.5708F, 3.1416F, 0.0F);
		Tentacle4.cubeList.add(new ModelBox(Tentacle4, 54, 229, 0.0F, -5.4F, -2.975F, 8, 8, 8, 0.0F, false));

		Tentacle4_1 = new RendererModel(this);
		Tentacle4_1.setRotationPoint(8.0F, -1.75F, 1.0F);
		Tentacle4.addChild(Tentacle4_1);
		Tentacle4_1.cubeList.add(new ModelBox(Tentacle4_1, 12, 215, 0.0F, -2.65F, -27.975F, 6, 6, 31, 0.0F, false));

		Tentacle4_2 = new RendererModel(this);
		Tentacle4_2.setRotationPoint(2.25F, 0.0F, -28.0F);
		Tentacle4_1.addChild(Tentacle4_2);
		Tentacle4_2.cubeList.add(new ModelBox(Tentacle4_2, 47, 223, -2.25F, -1.65F, -28.975F, 5, 4, 29, 0.0F, false));

		Tentacle4_3 = new RendererModel(this);
		Tentacle4_3.setRotationPoint(0.0F, 0.0F, -29.0F);
		Tentacle4_2.addChild(Tentacle4_3);
		Tentacle4_3.cubeList.add(new ModelBox(Tentacle4_3, 40, 219, -1.25F, -0.65F, -28.975F, 3, 2, 29, 0.0F, false));

		InnerTentacle1 = new RendererModel(this);
		InnerTentacle1.setRotationPoint(12.0F, 13.0F, 2.1333F);
		setRotationAngle(InnerTentacle1, 1.5708F, 0.0F, 0.0F);
		InnerTentacle1.cubeList.add(new ModelBox(InnerTentacle1, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		InnerTentacle1_1 = new RendererModel(this);
		InnerTentacle1_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		InnerTentacle1.addChild(InnerTentacle1_1);
		InnerTentacle1_1.cubeList.add(new ModelBox(InnerTentacle1_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		InnerTentacle1_2 = new RendererModel(this);
		InnerTentacle1_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		InnerTentacle1_1.addChild(InnerTentacle1_2);
		InnerTentacle1_2.cubeList.add(new ModelBox(InnerTentacle1_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));

		InnerTentacle2 = new RendererModel(this);
		InnerTentacle2.setRotationPoint(-11.0F, 13.0F, 0.1333F);
		setRotationAngle(InnerTentacle2, 1.5708F, 3.1416F, 0.0F);
		InnerTentacle2.cubeList.add(new ModelBox(InnerTentacle2, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		InnerTentacle2_1 = new RendererModel(this);
		InnerTentacle2_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		InnerTentacle2.addChild(InnerTentacle2_1);
		InnerTentacle2_1.cubeList.add(new ModelBox(InnerTentacle2_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		InnerTentacle2_2 = new RendererModel(this);
		InnerTentacle2_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		InnerTentacle2_1.addChild(InnerTentacle2_2);
		InnerTentacle2_2.cubeList.add(new ModelBox(InnerTentacle2_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));

		InnerTentacle3 = new RendererModel(this);
		InnerTentacle3.setRotationPoint(-5.2F, 13.1F, -8.8667F);
		setRotationAngle(InnerTentacle3, 1.5708F, 1.5708F, 0.0F);
		InnerTentacle3.cubeList.add(new ModelBox(InnerTentacle3, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		InnerTentacle3_1 = new RendererModel(this);
		InnerTentacle3_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		InnerTentacle3.addChild(InnerTentacle3_1);
		InnerTentacle3_1.cubeList.add(new ModelBox(InnerTentacle3_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		InnerTentacle3_2 = new RendererModel(this);
		InnerTentacle3_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		InnerTentacle3_1.addChild(InnerTentacle3_2);
		InnerTentacle3_2.cubeList.add(new ModelBox(InnerTentacle3_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));

		InnerTentacle4 = new RendererModel(this);
		InnerTentacle4.setRotationPoint(6.8F, 13.1F, -8.8667F);
		setRotationAngle(InnerTentacle4, 1.5708F, 1.5708F, 0.0F);
		InnerTentacle4.cubeList.add(new ModelBox(InnerTentacle4, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		InnerTentacle4_1 = new RendererModel(this);
		InnerTentacle4_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		InnerTentacle4.addChild(InnerTentacle4_1);
		InnerTentacle4_1.cubeList.add(new ModelBox(InnerTentacle4_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		InnerTentacle4_2 = new RendererModel(this);
		InnerTentacle4_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		InnerTentacle4_1.addChild(InnerTentacle4_2);
		InnerTentacle4_2.cubeList.add(new ModelBox(InnerTentacle4_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));

		InnerTentacle5 = new RendererModel(this);
		InnerTentacle5.setRotationPoint(-6.9F, 13.1F, 13.1333F);
		setRotationAngle(InnerTentacle5, 1.5708F, -1.5708F, 0.0F);
		InnerTentacle5.cubeList.add(new ModelBox(InnerTentacle5, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		InnerTentacle5_1 = new RendererModel(this);
		InnerTentacle5_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		InnerTentacle5.addChild(InnerTentacle5_1);
		InnerTentacle5_1.cubeList.add(new ModelBox(InnerTentacle5_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		InnerTentacle5_2 = new RendererModel(this);
		InnerTentacle5_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		InnerTentacle5_1.addChild(InnerTentacle5_2);
		InnerTentacle5_2.cubeList.add(new ModelBox(InnerTentacle5_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));

		InnerTentacle6 = new RendererModel(this);
		InnerTentacle6.setRotationPoint(5.1F, 13.1F, 13.1333F);
		setRotationAngle(InnerTentacle6, 1.5708F, -1.5708F, 0.0F);
		InnerTentacle6.cubeList.add(new ModelBox(InnerTentacle6, 18, 219, 1.0F, -3.85F, -29.8333F, 6, 6, 31, 0.0F, false));

		InnerTentacle6_1 = new RendererModel(this);
		InnerTentacle6_1.setRotationPoint(4.0F, -0.95F, -29.85F);
		InnerTentacle6.addChild(InnerTentacle6_1);
		InnerTentacle6_1.cubeList.add(new ModelBox(InnerTentacle6_1, 26, 221, -2.0F, -1.9F, -30.9833F, 4, 4, 31, 0.0F, false));

		InnerTentacle6_2 = new RendererModel(this);
		InnerTentacle6_2.setRotationPoint(0.0F, 0.0F, -31.0F);
		InnerTentacle6_1.addChild(InnerTentacle6_2);
		InnerTentacle6_2.cubeList.add(new ModelBox(InnerTentacle6_2, 26, 212, -1.0F, -0.9F, -34.9833F, 2, 2, 35, 0.0F, false));
	}

	@Override
	public void render(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		GlStateManager.translatef(0, -8.5f, 0);

		headBody.render(scale);
		mouth.render(scale);
		tentacle1.render(scale);
		tentacle2.render(scale);
		tentacle3.render(scale);
		Tentacle4.render(scale);
		InnerTentacle1.render(scale);
		InnerTentacle2.render(scale);
		InnerTentacle3.render(scale);
		InnerTentacle4.render(scale);
		InnerTentacle5.render(scale);
		InnerTentacle6.render(scale);

	}

	//I Hate this
	//			Link
	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
/*
		this.tentacle1_1.rotateAngleY = -(0.2F * MathHelper.sin(ageInTicks * 0.4F + 1) + 0.5F);
		this.tentacle1_2.rotateAngleY = (0.3F * MathHelper.sin(ageInTicks * 0.4F + 2) + 0.3F);
		this.tentacle1_3.rotateAngleY = (0.5F * MathHelper.sin(ageInTicks * 0.4F + 2) + 0.4F);
		this.tentacle1_4.rotateAngleY = (0.2F * MathHelper.sin(ageInTicks * 0.4F + 2) + 0.3F);

 */
		this.tentacle1_1.rotateAngleY = -swingTentacle(ageInTicks, 0.3F, 0.4F, 1, 0.3F);
		this.tentacle1_2.rotateAngleY = swingTentacle(ageInTicks, 0.3F, 0.4F, 2, F);
		this.tentacle1_2.rotateAngleY = swingTentacle(ageInTicks, 0.4F, 0.4F, 3, 0.3F);

	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	private float swingTentacle(float ageInTicks, float swingAmount, float speed, int offset, float sidedSwingAmount) {
		float swingAmount1 = (swingAmount * MathHelper.sin(ageInTicks * speed + offset) + sidedSwingAmount);

		InsanityLog.info("SwingAmount: " + swingAmount1);
		return swingAmount1;
	}
}