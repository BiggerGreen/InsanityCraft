//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class RexModel extends ModelBase {
	private final ModelRenderer Lower Jaw;
	private final ModelRenderer Head;
	private final ModelRenderer Upper_Jaw;
	private final ModelRenderer Body;
	private final ModelRenderer Left Leg;
	private final ModelRenderer Right Leg;

	public RexModel() {
		textureWidth = 64;
		textureHeight = 64;

		Lower Jaw = new ModelRenderer(this);
		Lower Jaw.setRotationPoint(0.0F, 24.0F, 0.0F);
		Lower Jaw.cubeList.add(new ModelBox(Lower Jaw, 0, 56, -2.0F, -9.0F, -19.0F, 4, 1, 6, 0.0F, false));
		Lower Jaw.cubeList.add(new ModelBox(Lower Jaw, 18, 40, -2.0F, -10.0F, -18.0F, 1, 1, 1, 0.0F, false));
		Lower Jaw.cubeList.add(new ModelBox(Lower Jaw, 1, 43, 1.0F, -10.0F, -15.0F, 1, 1, 2, 0.0F, false));
		Lower Jaw.cubeList.add(new ModelBox(Lower Jaw, 1, 43, -2.0F, -10.0F, -15.0F, 1, 1, 2, 0.0F, false));
		Lower Jaw.cubeList.add(new ModelBox(Lower Jaw, 18, 40, 1.0F, -10.0F, -18.0F, 1, 1, 1, 0.0F, false));
		Lower Jaw.cubeList.add(new ModelBox(Lower Jaw, 18, 40, 1.0F, -10.0F, -16.0F, 1, 1, 1, 0.0F, false));
		Lower Jaw.cubeList.add(new ModelBox(Lower Jaw, 18, 40, -2.0F, -10.0F, -16.0F, 1, 1, 1, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 31, 54, -2.0F, -14.0F, -13.0F, 4, 6, 4, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 54, -2.0F, -12.0F, -9.0F, 4, 5, 5, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 31, 50, -2.0F, -7.0F, -7.0F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 33, 50, 1.0F, -7.0F, -7.0F, 1, 2, 1, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 62, -2.0F, -8.0F, -10.0F, 4, 1, 1, 0.0F, false));

		Upper_Jaw = new ModelRenderer(this);
		Upper_Jaw.setRotationPoint(0.0F, 24.0F, 0.0F);
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 0, 56, -2.0F, -14.0F, -19.0F, 4, 2, 6, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 18, 40, -2.0F, -12.0F, -19.0F, 1, 1, 1, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 0, 42, 1.0F, -12.0F, -15.0F, 1, 2, 2, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 0, 42, -2.0F, -12.0F, -15.0F, 1, 2, 2, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 18, 40, 1.0F, -12.0F, -19.0F, 1, 1, 1, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 17, 40, -2.0F, -12.0F, -17.0F, 1, 1, 1, 0.0F, false));
		Upper_Jaw.cubeList.add(new ModelBox(Upper_Jaw, 18, 40, 1.0F, -12.0F, -17.0F, 1, 1, 1, 0.0F, false));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 53, -1.0F, -12.0F, 19.0F, 2, 1, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 53, -1.0F, -12.0F, 14.0F, 2, 2, 5, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 53, -2.0F, -12.0F, 7.0F, 4, 4, 7, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 47, -2.0F, -12.0F, -4.0F, 4, 6, 11, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 52, -2.0F, -13.0F, -4.0F, 4, 1, 11, 0.0F, false));

		Left Leg = new ModelRenderer(this);
		Left Leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		Left Leg.cubeList.add(new ModelBox(Left Leg, 10, 54, 2.0F, -9.0F, 1.0F, 2, 7, 3, 0.0F, false));
		Left Leg.cubeList.add(new ModelBox(Left Leg, 10, 55, 1.0F, -2.0F, -1.0F, 4, 1, 6, 0.0F, false));
		Left Leg.cubeList.add(new ModelBox(Left Leg, 18, 40, 1.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		Left Leg.cubeList.add(new ModelBox(Left Leg, 18, 40, 2.0F, -2.0F, -3.0F, 1, 1, 2, 0.0F, false));
		Left Leg.cubeList.add(new ModelBox(Left Leg, 18, 40, 4.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		Left Leg.cubeList.add(new ModelBox(Left Leg, 10, 55, 2.0F, -10.0F, 4.0F, 2, 4, 2, 0.0F, false));
		Left Leg.cubeList.add(new ModelBox(Left Leg, 10, 55, 2.0F, -10.0F, 2.0F, 2, 1, 2, 0.0F, false));

		Right Leg = new ModelRenderer(this);
		Right Leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		Right Leg.cubeList.add(new ModelBox(Right Leg, 10, 54, -4.0F, -9.0F, 1.0F, 2, 7, 3, 0.0F, false));
		Right Leg.cubeList.add(new ModelBox(Right Leg, 3, 56, -5.0F, -2.0F, -1.0F, 4, 1, 6, 0.0F, false));
		Right Leg.cubeList.add(new ModelBox(Right Leg, 18, 40, -5.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		Right Leg.cubeList.add(new ModelBox(Right Leg, 18, 40, -3.0F, -2.0F, -3.0F, 1, 1, 2, 0.0F, false));
		Right Leg.cubeList.add(new ModelBox(Right Leg, 18, 40, -2.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		Right Leg.cubeList.add(new ModelBox(Right Leg, 10, 54, -4.0F, -10.0F, 4.0F, 2, 4, 2, 0.0F, false));
		Right Leg.cubeList.add(new ModelBox(Right Leg, 9, 55, -4.0F, -10.0F, 2.0F, 2, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Lower Jaw.render(f5);
		Head.render(f5);
		Upper_Jaw.render(f5);
		Body.render(f5);
		Left Leg.render(f5);
		Right Leg.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}