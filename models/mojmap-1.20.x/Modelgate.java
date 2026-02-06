public class Modelgate<T extends Entity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gate"), "main");
	private final ModelPart rightup;
	private final ModelPart crystal;
	private final ModelPart panel;
	private final ModelPart right;
	private final ModelPart leftup;
	private final ModelPart left;
	private final ModelPart table;
	private final ModelPart gate;
	private final ModelPart portallayerone;
	private final ModelPart portallayertwo;
	private final ModelPart portallayerthree;

	public Modelgate(ModelPart root) {
		this.rightup = root.getChild("rightup");
		this.crystal = root.getChild("crystal");
		this.panel = root.getChild("panel");
		this.right = root.getChild("right");
		this.leftup = root.getChild("leftup");
		this.left = root.getChild("left");
		this.table = root.getChild("table");
		this.gate = root.getChild("gate");
		this.portallayerone = root.getChild("portallayerone");
		this.portallayertwo = root.getChild("portallayertwo");
		this.portallayerthree = root.getChild("portallayerthree");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightup = partdefinition.addOrReplaceChild("rightup", CubeListBuilder.create(),
				PartPose.offset(-7.0F, -18.25F, 11.75F));

		PartDefinition cube_r1 = rightup.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(192, 97)
						.addBox(-8.0F, -10.75F, -7.75F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(201, 106)
						.addBox(-8.0F, -2.75F, -1.75F, 16.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(199, 102)
						.addBox(-7.0F, -2.75F, 5.25F, 14.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1396F, 0.0F, 0.0F));

		PartDefinition crystal = partdefinition.addOrReplaceChild("crystal", CubeListBuilder.create(),
				PartPose.offset(7.2882F, -1.055F, 21.603F));

		PartDefinition cube_r2 = crystal.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(116, 118).addBox(0.5F, -3.0F, -9.0F, 0.0F, 12.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0133F, -0.8676F, 5.9F, 0.0F, 0.0F, -0.1745F));

		PartDefinition panel = partdefinition.addOrReplaceChild("panel", CubeListBuilder.create(),
				PartPose.offset(5.5F, -1.0F, 22.0F));

		PartDefinition cube_r3 = panel
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(153, 107).addBox(0.5F, -9.0F, -8.0F, 2.0F, 18.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition right = partdefinition.addOrReplaceChild("right",
				CubeListBuilder.create().texOffs(203, 73)
						.addBox(-13.0F, -16.0F, 6.0F, 12.0F, 16.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(197, 37)
						.addBox(-15.0F, -32.0F, 4.0F, 16.0F, 16.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 12.0F));

		PartDefinition cube_r4 = right.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(72, 68).addBox(-0.5F, -9.0F, -8.0F, 1.0F, 18.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-49.5F, -1.0F, 14.0F, -2.138F, 0.0F, -1.5708F));

		PartDefinition cube_r5 = right.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(106, 68).addBox(-0.5F, -9.0F, -8.0F, 1.0F, 18.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-42.5F, -1.0F, 10.0F, -2.7489F, 0.0F, -1.5708F));

		PartDefinition cube_r6 = right.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(213, 104).addBox(-2.5F, -8.0F, -4.0F, 3.0F, 16.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.5F, -7.0F, 10.0F, -3.1121F, 0.0322F, -2.3994F));

		PartDefinition cube_r7 = right.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(215, 106).addBox(-2.0F, -9.0F, 2.0F, 5.0F, 9.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.0F, -20.0F, 15.0F, 3.115F, 0.0346F, 2.4866F));

		PartDefinition cube_r8 = right.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(215, 106).addBox(-2.0F, -9.0F, 2.0F, 5.0F, 9.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -20.0F, 5.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r9 = right.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(210, 101).addBox(-2.5F, -8.0F, -5.0F, 3.0F, 16.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, -25.0F, 10.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r10 = right.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(156, 71).addBox(0.5F, -8.0F, -7.0F, 1.0F, 16.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.7F, -25.0F, 10.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition leftup = partdefinition.addOrReplaceChild("leftup", CubeListBuilder.create(),
				PartPose.offset(-6.875F, -21.9473F, -13.7349F));

		PartDefinition cube_r11 = leftup.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(199, 71)
						.addBox(-8.0F, -2.0F, -1.25F, 16.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(192, 72)
						.addBox(-8.0F, -10.0F, -1.25F, 16.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, 7.9473F, -1.0151F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftup.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(201, 41)
						.addBox(-8.0F, -5.0F, -8.25F, 16.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(200, 5)
						.addBox(-5.0F, -2.0F, -12.25F, 11.0F, 16.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, 6.9473F, -0.4151F, -0.2182F, 0.0F, 0.0F));

		PartDefinition left = partdefinition.addOrReplaceChild("left",
				CubeListBuilder.create().texOffs(200, 104)
						.addBox(-15.0F, -16.0F, 1.0F, 16.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(202, 71)
						.addBox(-12.0F, 0.0F, 2.0F, 11.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(199, 108)
						.addBox(-14.0F, -12.0F, -1.0F, 14.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.0F, -23.0F));

		PartDefinition table = partdefinition.addOrReplaceChild("table", CubeListBuilder.create(),
				PartPose.offset(-6.3695F, -32.811F, -0.4643F));

		PartDefinition cube_r13 = table.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(128, 36).addBox(-19.638F, -1.9595F, -7.3693F, 20.0F, 2.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6305F, -6.439F, 6.2143F, 3.0678F, -0.9497F, -1.5028F));

		PartDefinition gate = partdefinition.addOrReplaceChild("gate", CubeListBuilder.create().texOffs(208, 6)
				.addBox(5.5751F, -5.6389F, -24.2912F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(206, 12)
				.addBox(11.5751F, -2.6389F, -24.2912F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(202, 15)
				.addBox(3.5751F, -1.6389F, -28.2912F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(207, 108)
				.addBox(3.5751F, -1.6389F, 14.7088F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(204, 105)
				.addBox(3.5751F, -4.6389F, 21.7088F, 10.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(202, 15)
				.addBox(3.5751F, -1.6389F, -28.2912F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(200, 8)
				.addBox(11.5751F, -2.6389F, -24.2912F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(208, 6)
				.addBox(5.5751F, -5.6389F, -24.2912F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(196, 103)
				.addBox(3.5751F, -1.6389F, 14.7088F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(194, 101)
				.addBox(3.5751F, -4.6389F, 21.7088F, 10.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(201, 80)
				.addBox(-6.4249F, -0.6389F, -12.2912F, 17.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.5751F, 21.6389F, -1.7088F));

		PartDefinition cube_r14 = gate.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(202, 15).addBox(-7.0F, -1.0F, -29.75F, 13.0F, 4.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4249F, -0.6389F, -8.5412F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r15 = gate.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(208, 6)
						.addBox(-5.0F, -5.0F, -25.75F, 6.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(200, 8)
						.addBox(1.0F, -2.0F, -25.75F, 3.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(202, 15)
						.addBox(-7.0F, -1.0F, -29.75F, 12.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(196, 103)
						.addBox(-7.0F, -1.0F, 13.25F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(204, 103)
						.addBox(-7.0F, -4.0F, 20.25F, 10.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4249F, -0.6389F, 1.4588F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r16 = gate.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(152, 50).addBox(-7.0F, 2.0F, 13.25F, 4.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-34.4249F, -0.6389F, 18.4588F, 0.0F, -3.0543F, 0.0F));

		PartDefinition cube_r17 = gate.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(207, 16).addBox(-7.0F, 2.0F, 13.25F, 4.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-31.4249F, -0.6389F, 21.4588F, 0.0F, 3.0107F, 0.0F));

		PartDefinition cube_r18 = gate.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(207, 74).addBox(-7.0F, 2.0F, 13.25F, 4.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4249F, -0.6389F, 16.4588F, 0.0F, -3.0107F, 0.0F));

		PartDefinition cube_r19 = gate.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(211, 115).addBox(-2.0F, -0.5F, -4.5F, 4.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.4249F, 1.8611F, 5.7088F, 0.0F, 2.8798F, 0.0F));

		PartDefinition cube_r20 = gate.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(201, 41).addBox(-8.0F, -1.5F, -3.5F, 16.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.5751F, -2.084F, -14.321F, -1.0038F, 0.6486F, -0.0017F));

		PartDefinition portallayerone = partdefinition.addOrReplaceChild("portallayerone", CubeListBuilder.create()
				.texOffs(0, 170).addBox(-11.0F, -53.0F, -14.0F, 8.0F, 53.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition portallayertwo = partdefinition.addOrReplaceChild("portallayertwo", CubeListBuilder.create()
				.texOffs(82, 170).addBox(-9.0F, -53.0F, -14.0F, 4.0F, 53.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition portallayerthree = partdefinition.addOrReplaceChild("portallayerthree", CubeListBuilder.create()
				.texOffs(164, 170).addBox(-8.0F, -53.0F, -14.0F, 1.0F, 53.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 1280);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rightup.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		crystal.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		panel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftup.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		table.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		portallayerone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		portallayertwo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		portallayerthree.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}