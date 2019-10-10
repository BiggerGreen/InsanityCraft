//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class KrakenModel extends ModelBase {
	private final ModelRenderer Head/Body;
	private final ModelRenderer Left Fins;
	private final ModelRenderer Right Fins;
	private final ModelRenderer Mouth;
	private final ModelRenderer Beak Left;
	private final ModelRenderer Beak Right;
	private final ModelRenderer Tentacle1;
	private final ModelRenderer Tentacle2;
	private final ModelRenderer Tentacle3;
	private final ModelRenderer Tentacle4;
	private final ModelRenderer Inner Tentacle 1;
	private final ModelRenderer Inner Tentacle 2;
	private final ModelRenderer Inner Tentacle 3;
	private final ModelRenderer Inner Tentacle 4;
	private final ModelRenderer Inner Tentacle 5;
	private final ModelRenderer Inner Tentacle 6;

	public KrakenModel() {
		textureWidth = 256;
		textureHeight = 256;

		Head/Body = new ModelRenderer(this);
		Head/Body.setRotationPoint(0.0F, 14.0F, 33.0F);
		setRotationAngle(Head/Body, 1.5708F, 0.0F, 0.0F);
		Head/Body.cubeList.add(new ModelBox(Head/Body, 0, 139, -10.0F, -41.0F, 3.3F, 20, 20, 30, 0.0F, false));
		Head/Body.cubeList.add(new ModelBox(Head/Body, 0, 211, -11.0F, -40.0F, 71.3F, 22, 18, 27, 0.0F, false));
		Head/Body.cubeList.add(new ModelBox(Head/Body, 0, 220, -10.0F, -38.0F, 98.3F, 20, 14, 22, 0.0F, false));
		Head/Body.cubeList.add(new ModelBox(Head/Body, 0, 194, -12.0F, -43.0F, 33.3F, 24, 24, 38, 0.0F, false));

		Left Fins = new ModelRenderer(this);
		Left Fins.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head/Body.addChild(Left Fins);
		Left Fins.cubeList.add(new ModelBox(Left Fins, 0, 231, 10.0F, -32.0F, 98.3F, 16, 3, 22, 0.0F, false));
		Left Fins.cubeList.add(new ModelBox(Left Fins, 0, 226, 11.0F, -32.0F, 71.3F, 17, 3, 27, 0.0F, false));

		Right Fins = new ModelRenderer(this);
		Right Fins.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head/Body.addChild(Right Fins);
		Right Fins.cubeList.add(new ModelBox(Right Fins, 0, 231, -26.0F, -32.0F, 98.3F, 16, 3, 22, 0.0F, false));
		Right Fins.cubeList.add(new ModelBox(Right Fins, 0, 226, -28.0F, -32.0F, 71.3F, 17, 3, 27, 0.0F, false));

		Mouth = new ModelRenderer(this);
		Mouth.setRotationPoint(-0.0083F, 13.9958F, -2.75F);
		setRotationAngle(Mouth, 1.5708F, 0.0F, 0.0F);
		Mouth.cubeList.add(new ModelBox(Mouth, 65, 225, 10.0083F, 15.0042F, -2.95F, 3, 3, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 65, 225, -12.9917F, 15.0042F, -2.95F, 3, 3, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 65, 225, 10.0083F, -7.9958F, -2.95F, 3, 3, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 65, 225, -12.9917F, -7.9958F, -2.95F, 3, 3, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 0, 236, -9.9917F, -6.9958F, -3.95F, 20, 2, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 0, 218, -9.9917F, 15.0042F, -3.95F, 20, 2, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 0, 218, -11.9917F, -4.9958F, -3.95F, 2, 20, 18, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 6.0083F, -1.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -6.9917F, -1.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -6.9917F, 11.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 6.0083F, 11.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 2.0083F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 2.0083F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 6.0083F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 6.0083F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 234, 246, -0.9917F, -3.9958F, -5.95F, 2, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 234, 246, -0.9917F, 13.0042F, -5.95F, 2, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -4.9917F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -4.9917F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 4.0083F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 4.0083F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -2.9917F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -2.9917F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -6.9917F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -6.9917F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, -3.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, -1.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, -1.9958F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 0.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 0.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 1.9042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 1.9042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 13.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 11.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 11.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 9.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 9.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, -8.9917F, 7.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 246, 8.0083F, 7.0042F, -5.95F, 1, 1, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 234, 246, -8.9917F, 4.0042F, -5.95F, 1, 2, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 236, 245, 8.0083F, 4.0042F, -5.95F, 1, 2, 9, 0.0F, false));
		Mouth.cubeList.add(new ModelBox(Mouth, 0, 218, 10.0083F, -4.9958F, -3.95F, 2, 20, 18, 0.0F, false));

		Beak Left = new ModelRenderer(this);
		Beak Left.setRotationPoint(-0.4917F, 35.2542F, -42.0F);
		setRotationAngle(Beak Left, 0.0F, 0.0F, 1.5708F);
		Mouth.addChild(Beak Left);
		Beak Left.cubeList.add(new ModelBox(Beak Left, 124, 245, -32.5F, -3.5F, 36.05F, 5, 2, 9, 0.0F, false));
		Beak Left.cubeList.add(new ModelBox(Beak Left, 124, 245, -27.5F, -2.5F, 36.05F, 2, 2, 9, 0.0F, false));
		Beak Left.cubeList.add(new ModelBox(Beak Left, 124, 245, -34.5F, -2.5F, 36.05F, 2, 2, 9, 0.0F, false));
		Beak Left.cubeList.add(new ModelBox(Beak Left, 124, 246, -32.5F, -2.5F, 28.05F, 5, 2, 8, 0.0F, false));

		Beak Right = new ModelRenderer(this);
		Beak Right.setRotationPoint(-0.4917F, 36.7542F, -42.0F);
		setRotationAngle(Beak Right, 0.0F, 0.0F, 1.5708F);
		Mouth.addChild(Beak Right);
		Beak Right.cubeList.add(new ModelBox(Beak Right, 124, 245, -34.0F, 0.5F, 36.05F, 5, 2, 9, 0.0F, false));
		Beak Right.cubeList.add(new ModelBox(Beak Right, 124, 245, -29.0F, -0.5F, 36.05F, 2, 2, 9, 0.0F, false));
		Beak Right.cubeList.add(new ModelBox(Beak Right, 124, 245, -36.0F, -0.5F, 36.05F, 2, 2, 9, 0.0F, false));
		Beak Right.cubeList.add(new ModelBox(Beak Right, 124, 246, -34.0F, -0.5F, 28.05F, 5, 2, 8, 0.0F, false));

		Tentacle1 = new ModelRenderer(this);
		Tentacle1.setRotationPoint(19.3F, 10.0F, -20.5F);
		setRotationAngle(Tentacle1, 1.5708F, 0.0F, 0.0F);
		Tentacle1.cubeList.add(new ModelBox(Tentacle1, 54, 229, -7.3F, 13.0F, 0.8F, 8, 8, 8, 0.0F, false));
		Tentacle1.cubeList.add(new ModelBox(Tentacle1, 12, 215, 0.7F, 14.0F, -19.2F, 6, 6, 27, 0.0F, false));
		Tentacle1.cubeList.add(new ModelBox(Tentacle1, 0, 199, 0.7F, 15.0F, -72.2F, 5, 4, 53, 0.0F, false));
		Tentacle1.cubeList.add(new ModelBox(Tentacle1, 16, 208, 1.7F, 16.0F, -118.2F, 3, 2, 46, 0.0F, false));
		Tentacle1.cubeList.add(new ModelBox(Tentacle1, 151, 219, 1.7F, 14.0F, -143.2F, 5, 6, 25, 0.0F, false));

		Tentacle2 = new ModelRenderer(this);
		Tentacle2.setRotationPoint(19.0F, 20.0F, -14.625F);
		setRotationAngle(Tentacle2, 1.5708F, 0.0F, 0.0F);
		Tentacle2.cubeList.add(new ModelBox(Tentacle2, 54, 229, -7.0F, 18.0F, 10.925F, 8, 8, 8, 0.0F, false));
		Tentacle2.cubeList.add(new ModelBox(Tentacle2, 12, 215, 1.0F, 19.0F, -13.075F, 6, 6, 31, 0.0F, false));
		Tentacle2.cubeList.add(new ModelBox(Tentacle2, 47, 223, 1.0F, 20.0F, -42.075F, 5, 4, 29, 0.0F, false));
		Tentacle2.cubeList.add(new ModelBox(Tentacle2, 40, 219, 2.0F, 21.0F, -71.075F, 3, 2, 29, 0.0F, false));

		Tentacle3 = new ModelRenderer(this);
		Tentacle3.setRotationPoint(19.0F, 20.0F, -14.625F);
		setRotationAngle(Tentacle3, 1.5708F, 0.0F, 0.0F);
		Tentacle3.cubeList.add(new ModelBox(Tentacle3, 54, 229, -39.0F, 18.0F, 10.925F, 8, 8, 8, 0.0F, false));
		Tentacle3.cubeList.add(new ModelBox(Tentacle3, 12, 215, -45.0F, 19.0F, -13.075F, 6, 6, 31, 0.0F, false));
		Tentacle3.cubeList.add(new ModelBox(Tentacle3, 47, 223, -44.0F, 20.0F, -42.075F, 5, 4, 29, 0.0F, false));
		Tentacle3.cubeList.add(new ModelBox(Tentacle3, 40, 219, -43.0F, 21.0F, -71.075F, 3, 2, 29, 0.0F, false));

		Tentacle4 = new ModelRenderer(this);
		Tentacle4.setRotationPoint(-34.5F, 58.0F, -110.3F);
		setRotationAngle(Tentacle4, 1.5708F, 3.1416F, 0.0F);
		Tentacle4.cubeList.add(new ModelBox(Tentacle4, 54, 229, -22.5F, -111.0F, 48.6F, 8, 8, 8, 0.0F, false));
		Tentacle4.cubeList.add(new ModelBox(Tentacle4, 12, 215, -14.5F, -110.0F, 28.6F, 6, 6, 27, 0.0F, false));
		Tentacle4.cubeList.add(new ModelBox(Tentacle4, 0, 199, -14.5F, -109.0F, -24.4F, 5, 4, 53, 0.0F, false));
		Tentacle4.cubeList.add(new ModelBox(Tentacle4, 16, 208, -13.5F, -108.0F, -70.4F, 3, 2, 46, 0.0F, false));
		Tentacle4.cubeList.add(new ModelBox(Tentacle4, 151, 225, -13.5F, -110.0F, -95.4F, 5, 6, 25, 0.0F, false));

		Inner Tentacle 1 = new ModelRenderer(this);
		Inner Tentacle 1.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(Inner Tentacle 1, 1.5708F, 0.0F, 0.0F);
		Inner Tentacle 1.cubeList.add(new ModelBox(Inner Tentacle 1, 18, 219, 8.0F, 10.5F, -46.45F, 6, 6, 31, 0.0F, false));
		Inner Tentacle 1.cubeList.add(new ModelBox(Inner Tentacle 1, 26, 221, 9.0F, 11.5F, -77.45F, 4, 4, 31, 0.0F, false));
		Inner Tentacle 1.cubeList.add(new ModelBox(Inner Tentacle 1, 26, 212, 10.0F, 12.5F, -112.45F, 2, 2, 35, 0.0F, false));

		Inner Tentacle 2 = new ModelRenderer(this);
		Inner Tentacle 2.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(Inner Tentacle 2, 1.5708F, 0.0F, 0.0F);
		Inner Tentacle 2.cubeList.add(new ModelBox(Inner Tentacle 2, 18, 219, -23.0F, 10.5F, -46.45F, 6, 6, 31, 0.0F, false));
		Inner Tentacle 2.cubeList.add(new ModelBox(Inner Tentacle 2, 26, 221, -22.0F, 11.5F, -77.45F, 4, 4, 31, 0.0F, false));
		Inner Tentacle 2.cubeList.add(new ModelBox(Inner Tentacle 2, 26, 212, -21.0F, 12.5F, -112.45F, 2, 2, 35, 0.0F, false));

		Inner Tentacle 3 = new ModelRenderer(this);
		Inner Tentacle 3.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(Inner Tentacle 3, 1.5708F, 0.0F, 0.0F);
		Inner Tentacle 3.cubeList.add(new ModelBox(Inner Tentacle 3, 33, 208, -14.0F, -3.5F, -46.45F, 6, 6, 31, 0.0F, false));
		Inner Tentacle 3.cubeList.add(new ModelBox(Inner Tentacle 3, 11, 218, -13.0F, -2.5F, -77.45F, 4, 4, 31, 0.0F, false));
		Inner Tentacle 3.cubeList.add(new ModelBox(Inner Tentacle 3, 26, 212, -12.0F, -1.5F, -112.45F, 2, 2, 35, 0.0F, false));

		Inner Tentacle 4 = new ModelRenderer(this);
		Inner Tentacle 4.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(Inner Tentacle 4, 1.5708F, 0.0F, 0.0F);
		Inner Tentacle 4.cubeList.add(new ModelBox(Inner Tentacle 4, 33, 208, -2.0F, -3.5F, -46.45F, 6, 6, 31, 0.0F, false));
		Inner Tentacle 4.cubeList.add(new ModelBox(Inner Tentacle 4, 11, 218, -1.0F, -2.5F, -77.45F, 4, 4, 31, 0.0F, false));
		Inner Tentacle 4.cubeList.add(new ModelBox(Inner Tentacle 4, 26, 212, 0.0F, -1.5F, -112.45F, 2, 2, 35, 0.0F, false));

		Inner Tentacle 5 = new ModelRenderer(this);
		Inner Tentacle 5.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(Inner Tentacle 5, 1.5708F, 0.0F, 0.0F);
		Inner Tentacle 5.cubeList.add(new ModelBox(Inner Tentacle 5, 33, 208, -14.0F, 26.5F, -46.45F, 6, 6, 31, 0.0F, false));
		Inner Tentacle 5.cubeList.add(new ModelBox(Inner Tentacle 5, 11, 218, -13.0F, 27.5F, -77.45F, 4, 4, 31, 0.0F, false));
		Inner Tentacle 5.cubeList.add(new ModelBox(Inner Tentacle 5, 26, 212, -12.0F, 28.5F, -112.45F, 2, 2, 35, 0.0F, false));

		Inner Tentacle 6 = new ModelRenderer(this);
		Inner Tentacle 6.setRotationPoint(5.0F, -3.5F, -12.25F);
		setRotationAngle(Inner Tentacle 6, 1.5708F, 0.0F, 0.0F);
		Inner Tentacle 6.cubeList.add(new ModelBox(Inner Tentacle 6, 33, 208, -2.0F, 26.5F, -46.45F, 6, 6, 31, 0.0F, false));
		Inner Tentacle 6.cubeList.add(new ModelBox(Inner Tentacle 6, 11, 218, -1.0F, 27.5F, -77.45F, 4, 4, 31, 0.0F, false));
		Inner Tentacle 6.cubeList.add(new ModelBox(Inner Tentacle 6, 26, 212, 0.0F, 28.5F, -112.45F, 2, 2, 35, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head/Body.render(f5);
		Mouth.render(f5);
		Tentacle1.render(f5);
		Tentacle2.render(f5);
		Tentacle3.render(f5);
		Tentacle4.render(f5);
		Inner Tentacle 1.render(f5);
		Inner Tentacle 2.render(f5);
		Inner Tentacle 3.render(f5);
		Inner Tentacle 4.render(f5);
		Inner Tentacle 5.render(f5);
		Inner Tentacle 6.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}