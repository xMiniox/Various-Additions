// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelsteve extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelsteve() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 48).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 48).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 48).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);
		Body.setTextureOffset(0, 20).addBox(-3.5F, 1.0F, -2.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 20).addBox(3.0F, 3.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 20).addBox(-4.0F, 3.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 20).addBox(2.5F, 0.0F, -2.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 20).addBox(-4.5F, 0.0F, -2.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 0).addBox(-4.5F, 0.0F, 2.0F, 9.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(2, 2).addBox(-5.0F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(2, 2).addBox(4.0F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(22, 25).addBox(-0.5F, 3.0F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(18, 25).addBox(-2.5F, 5.25F, 1.75F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 23).addBox(-3.5F, 3.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(25, 23).addBox(2.5F, 3.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(26, 25).addBox(3.0F, 7.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 25).addBox(-4.0F, 7.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 0).addBox(-4.0F, 0.5F, 2.5F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 25).addBox(-5.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(19, 25).addBox(4.0F, 0.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(26, 26).addBox(-6.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 26).addBox(-6.5F, -1.5F, 4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(18, 20).addBox(5.5F, -1.5F, 4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(24, 25).addBox(-5.5F, -0.5F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(19, 24).addBox(4.5F, -0.5F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(1, 2).addBox(-7.0F, -2.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(1, 2).addBox(6.0F, -2.0F, 0.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(2, 2).addBox(-7.0F, -4.0F, 2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(1, 2).addBox(6.0F, -4.0F, 2.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(34, 9).addBox(-7.0F, -3.0F, -6.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		Body.setTextureOffset(34, 8).addBox(6.0F, -3.0F, -6.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		Body.setTextureOffset(18, 20).addBox(5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.0F, 5.5F, -0.5F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(25, 22).addBox(6.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(25, 22).addBox(-1.5F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 5.0F, 2.5F);
		Body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.setTextureOffset(41, 22).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 48).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
		RightLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		RightLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
		LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}