package projectvibrantjourneys.client.models;

import com.google.common.collect.ImmutableList;

import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SnailModel<T extends Entity> extends SegmentedModel<T> {
	public final ModelRenderer body;
	public final ModelRenderer head;

	public SnailModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.func_217178_a("body", -2.0F, -4.0F, -8.0F, 4, 4, 16, 0.0F, 0, 0);
		body.func_217178_a("shell", -2.0F, -12.0F, -4.0F, 4, 8, 8, 0.0F, 40, 4);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(head, -0.2618F, 0.0F, 0.0F);
		head.func_217178_a("head", -2.0F, -2.0F, -11.5F, 4, 4, 4, 0.0F, 0, 0);
		head.func_217178_a("antenna1", -2.0F, -4.0F, -11.0F, 1, 2, 1, 0.0F, 0, 0);
		head.func_217178_a("antenna2", 1.0F, -4.0F, -11.0F, 1, 2, 1, 0.0F, 0, 0);
	}
	
	@Override
	public Iterable<ModelRenderer> func_225601_a_() {
		return ImmutableList.of(this.body, this.head);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void func_225597_a_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}
}