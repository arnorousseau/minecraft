
package minetux.proxy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelOstrich extends ModelBase
{
  //fields
    ModelRenderer Body1;
    ModelRenderer body2;
    ModelRenderer Body3;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Body4;
    ModelRenderer head;
    ModelRenderer Neck1;
    ModelRenderer Head1;
    ModelRenderer mouth1;
    ModelRenderer neck2;
    ModelRenderer Lwing;
    ModelRenderer Rwing;
    ModelRenderer LLeg;
    ModelRenderer RLeg;
    ModelRenderer Rfoot;
    ModelRenderer Lfoot;
  
  public ModelOstrich()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      Body1 = new ModelRenderer(this, 0, 28);
      Body1.addBox(-4F, 0F, 0F, 8, 9, 8);
      Body1.setRotationPoint(0F, 0F, -6F);
      Body1.setTextureSize(256, 128);
      Body1.mirror = true;
      setRotation(Body1, -0.2230717F, 0F, 0F);
      body2 = new ModelRenderer(this, 25, 111);
      body2.addBox(-4F, 0F, 0F, 8, 8, 8);
      body2.setRotationPoint(0F, 2F, -1F);
      body2.setTextureSize(256, 128);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, 0F);
      Body3 = new ModelRenderer(this, 17, 96);
      Body3.addBox(-3F, 0F, 0F, 6, 7, 3);
      Body3.setRotationPoint(0F, 2F, 6F);
      Body3.setTextureSize(256, 128);
      Body3.mirror = true;
      setRotation(Body3, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 33, 81);
      Tail1.addBox(-2F, 0F, 0F, 4, 0, 14);
      Tail1.setRotationPoint(0F, 3F, 9F);
      Tail1.setTextureSize(256, 128);
      Tail1.mirror = true;
      setRotation(Tail1, -0.5948578F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 36, 97);
      Tail2.addBox(-1F, 0F, 0F, 3, 0, 13);
      Tail2.setRotationPoint(0F, 3F, 8F);
      Tail2.setTextureSize(256, 128);
      Tail2.mirror = true;
      setRotation(Tail2, -0.5948578F, 0.3346075F, 0F);
      Tail3 = new ModelRenderer(this, 36, 97);
      Tail3.addBox(-2F, 0F, 0F, 3, 0, 13);
      Tail3.setRotationPoint(0F, 3F, 8F);
      Tail3.setTextureSize(256, 128);
      Tail3.mirror = true;
      setRotation(Tail3, -0.5948578F, -0.3346145F, 0F);
      Body4 = new ModelRenderer(this, 17, 89);
      Body4.addBox(-2F, 0F, 0F, 4, 3, 3);
      Body4.setRotationPoint(0F, 6F, 7F);
      Body4.setTextureSize(256, 128);
      Body4.mirror = true;
      setRotation(Body4, 1.003822F, 0F, 0F);
      head = new ModelRenderer(this, 74, 48);
      head.addBox(-1F, -24F, -7F, 2, 2, 4);
      head.setRotationPoint(0F, 5F, -7F);
      head.setTextureSize(256, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      Neck1 = new ModelRenderer(this, 79, 84);
      Neck1.addBox(-1.5F, -21F, -2F, 3, 21, 3);
      Neck1.setRotationPoint(0F, 5F, -7F);
      Neck1.setTextureSize(256, 128);
      Neck1.mirror = true;
      setRotation(Neck1, 0F, -0.0349066F, 0F);
      Head1 = new ModelRenderer(this, 0, 70);
      Head1.addBox(-2F, -25F, -3F, 4, 4, 4);
      Head1.setRotationPoint(0F, 5F, -7F);
      Head1.setTextureSize(256, 128);
      Head1.mirror = true;
      setRotation(Head1, 0F, 0F, 0F);
      mouth1 = new ModelRenderer(this, 74, 64);
      mouth1.addBox(-1F, -22F, -6F, 2, 1, 3);
      mouth1.setRotationPoint(0F, 5F, -7F);
      mouth1.setTextureSize(256, 128);
      mouth1.mirror = true;
      setRotation(mouth1, 0F, 0F, 0F);
      neck2 = new ModelRenderer(this, 0, 99);
      neck2.addBox(-1F, -2F, -2F, 2, 4, 3);
      neck2.setRotationPoint(0F, 5F, -6.9F);
      neck2.setTextureSize(256, 128);
      neck2.mirror = true;
      setRotation(neck2, 0F, 0F, 0F);
      Lwing = new ModelRenderer(this, 0, 107);
      Lwing.addBox(0F, 0F, 0F, 1, 7, 11);
      Lwing.setRotationPoint(4F, 1F, -5F);
      Lwing.setTextureSize(256, 128);
      Lwing.mirror = true;
      setRotation(Lwing, 0F, 0F, 0F);
      Rwing = new ModelRenderer(this, 0, 107);
      Rwing.addBox(0F, 0F, 0F, 1, 7, 11);
      Rwing.setRotationPoint(-5F, 1F, -5F);
      Rwing.setTextureSize(256, 128);
      Rwing.mirror = true;
      setRotation(Rwing, 0F, 0F, 0F);
      LLeg = new ModelRenderer(this, 38, 0);
      LLeg.addBox(-1F, 0F, 0F, 1, 14, 2);
      LLeg.setRotationPoint(4F, 10F, 0F);
      LLeg.setTextureSize(256, 128);
      LLeg.mirror = true;
      setRotation(LLeg, 0F, 0F, 0F);
      RLeg = new ModelRenderer(this, 30, 0);
      RLeg.addBox(0F, 0F, 0F, 1, 14, 2);
      RLeg.setRotationPoint(-4F, 10F, 0F);
      RLeg.setTextureSize(256, 128);
      RLeg.mirror = true;
      setRotation(RLeg, 0F, 0F, 0F);
      Rfoot = new ModelRenderer(this, 52, 0);
      Rfoot.addBox(-1F, 13F, -3F, 3, 1, 7);
      Rfoot.setRotationPoint(-4F, 10F, 0F);
      Rfoot.setTextureSize(256, 128);
      Rfoot.mirror = true;
      setRotation(Rfoot, 0F, 0F, 0F);
      Lfoot = new ModelRenderer(this, 52, 0);
      Lfoot.addBox(-2F, 13F, -3F, 3, 1, 7);
      Lfoot.setRotationPoint(4F, 10F, 0F);
      Lfoot.setTextureSize(256, 128);
      Lfoot.mirror = true;
      setRotation(Lfoot, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body1.render(f5);
    body2.render(f5);
    Body3.render(f5);
    Tail1.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Body4.render(f5);
    head.render(f5);
    Neck1.render(f5);
    Head1.render(f5);
    mouth1.render(f5);
    neck2.render(f5);
    Lwing.render(f5);
    Rwing.render(f5);
    LLeg.render(f5);
    RLeg.render(f5);
    Rfoot.render(f5);
    Lfoot.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
    this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.Rfoot.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.Lfoot.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;

  }

}
