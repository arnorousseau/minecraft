package minetux.proxy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;

public class ModelWarHammer extends ModelBase
{
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3A;
    ModelRenderer Shape3B;
    ModelRenderer Shape3C;
    ModelRenderer Shape3D;
    ModelRenderer Shape4;
    ModelRenderer Shape5A;
    ModelRenderer Shape5B;
    ModelRenderer Shape5C;
    ModelRenderer Shape5D;
    ModelRenderer Shape6;
  
    public ModelWarHammer ()
    {
	  textureWidth = 64;
	  textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 11, 9, 12);
      Shape1.setRotationPoint(0F, -19F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 46, 0);
      Shape2.addBox(0F, 0F, 0F, 1, 17, 1);
      Shape2.setRotationPoint(5F, -10F, 5.5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3A = new ModelRenderer(this, 0, 21);
      Shape3A.addBox(0F, 0F, 0F, 5, 4, 5);
      Shape3A.setRotationPoint(-2F, -16F, 3.5F);
      Shape3A.setTextureSize(64, 32);
      Shape3A.mirror = true;
      setRotation(Shape3A, 0F, 0F, 0F);
      Shape3B = new ModelRenderer(this, 0, 21);
      Shape3B.addBox(0F, 0F, 0F, 5, 4, 5);
      Shape3B.setRotationPoint(3.5F, -16F, -2F);
      Shape3B.setTextureSize(64, 32);
      Shape3B.mirror = true;
      setRotation(Shape3B, 0F, 0F, 0F);
      Shape3C = new ModelRenderer(this, 0, 21);
      Shape3C.addBox(0F, 0F, 0F, 5, 4, 5);
      Shape3C.setRotationPoint(3.5F, -16F, 9F);
      Shape3C.setTextureSize(64, 32);
      Shape3C.mirror = true;
      setRotation(Shape3C, 0F, 0F, 0F);
      Shape3D = new ModelRenderer(this, 0, 21);
      Shape3D.addBox(0F, 0F, 0F, 5, 4, 5);
      Shape3D.setRotationPoint(8F, -16F, 3.5F);
      Shape3D.setTextureSize(64, 32);
      Shape3D.mirror = true;
      setRotation(Shape3D, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 20, 21);
      Shape4.addBox(0F, 0F, 0F, 2, 8, 2);
      Shape4.setRotationPoint(4.5F, -1F, 5F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5A = new ModelRenderer(this, 15, 0);
      Shape5A.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape5A.setRotationPoint(-4F, -15F, 5F);
      Shape5A.setTextureSize(64, 32);
      Shape5A.mirror = true;
      setRotation(Shape5A, 0F, 0F, 0F);
      Shape5B = new ModelRenderer(this, 45, 0);
      Shape5B.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape5B.setRotationPoint(5F, -15F, -4F);
      Shape5B.setTextureSize(64, 32);
      Shape5B.mirror = true;
      setRotation(Shape5B, 0F, 0F, 0F);
      Shape5C = new ModelRenderer(this, 15, 0);
      Shape5C.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape5C.setRotationPoint(5F, -15F, 14F);
      Shape5C.setTextureSize(64, 32);
      Shape5C.mirror = true;
      setRotation(Shape5C, 0F, 0F, 0F);
      Shape5D = new ModelRenderer(this, 15, 0);
      Shape5D.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape5D.setRotationPoint(13F, -15F, 5F);
      Shape5D.setTextureSize(64, 32);
      Shape5D.mirror = true;
      setRotation(Shape5D, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 21, 0);
      Shape6.addBox(0F, 0F, 0F, 3, 8, 3);
      Shape6.setRotationPoint(3.9F, 1F, 4.5F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3A.render(f5);
    Shape3B.render(f5);
    Shape3C.render(f5);
    Shape3D.render(f5);
    Shape4.render(f5);
    Shape5A.render(f5);
    Shape5B.render(f5);
    Shape5C.render(f5);
    Shape5D.render(f5);
    Shape6.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
}