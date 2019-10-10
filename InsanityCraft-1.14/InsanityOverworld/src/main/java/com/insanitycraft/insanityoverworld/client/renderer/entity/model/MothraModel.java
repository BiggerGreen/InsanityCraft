//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class MothraNew extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;

	public MothraNew() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 39, -3.0F, -7.0F, -5.0F, 5, 5, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 51, 46, -2.0F, -6.0F, 4.0F, 3, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 18, 43, -3.0F, -7.0F, 5.0F, 5, 5, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 33, 42, -2.0F, -6.0F, 10.0F, 3, 4, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 41, 39, -1.0F, -5.0F, 12.0F, 1, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 42, 39, -1.0F, -4.0F, 14.0F, 1, 2, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 6, 31, -2.0F, -6.0F, -8.0F, 3, 4, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 58, 58, -3.0F, -11.0F, -7.0F, 2, 5, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 58, 58, 0.0F, -11.0F, -7.0F, 2, 5, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, 1.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, -3.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, 1.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, -3.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, 1.0F, -2.0F, -4.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, -3.0F, -2.0F, -4.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, 1.0F, -2.0F, 2.0F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 36, -3.0F, -2.0F, 2.0F, 1, 1, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(4.5F, 16.5F, 3.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 54, -4.5F, -0.5F, -7.0F, 20, 1, 9, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(4.5F, 16.5F, 3.0F);
		setRotationAngle(bone5, 0.0F, -0.3491F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 54, -4.5F, -1.5F, -4.0F, 19, 1, 9, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(4.5F, 16.5F, 3.0F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 54, -25.5F, -0.5F, -7.0F, 20, 1, 9, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-11.0F, 15.5F, 0.5F);
		setRotationAngle(bone7, 0.0F, 0.3491F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 54, -10.2F, -0.5F, 0.5F, 19, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		bone2.render(f5);
		bone3.render(f5);
		bone4.render(f5);
		bone5.render(f5);
		bone6.render(f5);
		bone7.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}