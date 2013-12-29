package minetux.proxy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelErupe extends ModelBase
{
    ModelRenderer topleg4;
    ModelRenderer topleg3;
    ModelRenderer topleg1;
    ModelRenderer body;
    ModelRenderer head;
    ModelRenderer beard;
    ModelRenderer basetail;
    ModelRenderer tail;
    ModelRenderer ear1;
    ModelRenderer ear2;
    ModelRenderer lowercore;
    ModelRenderer uppercore;
    ModelRenderer Lhorn1;
    ModelRenderer Rhorn1;
    ModelRenderer Lhorn2;
    ModelRenderer Lhorn3;
    ModelRenderer Lhorn4;
    ModelRenderer Rhorn2;
    ModelRenderer Rhorn3;
    ModelRenderer Rhorn4;
    ModelRenderer frontleftleg;
    ModelRenderer leg2;
    ModelRenderer leg4;
    ModelRenderer frontrightleg;
    ModelRenderer topleg2;
    ModelRenderer neck;
    ModelRenderer nose;
    int field_78163_i = 1;
  
	  public ModelErupe()
	  {
	    textureWidth = 128;
	    textureHeight = 128;
	    
	      topleg4 = new ModelRenderer(this, 102, 0);
	      topleg4.addBox(0F, 0F, 0F, 6, 6, 7);
	      topleg4.setRotationPoint(-6F, 6F, -14F);
	      topleg4.setTextureSize(128, 128);
	      topleg4.mirror = true;
	      setRotation(topleg4, -0.1128704F, 0F, 0F);
	      topleg3 = new ModelRenderer(this, 102, 0);
	      topleg3.addBox(0F, 0F, 0F, 6, 6, 7);
	      topleg3.setRotationPoint(0F, 6F, -14F);
	      topleg3.setTextureSize(128, 128);
	      topleg3.mirror = true;
	      setRotation(topleg3, -0.1128704F, 0F, 0F);
	      topleg1 = new ModelRenderer(this, 102, 0);
	      topleg1.addBox(0F, 0F, 0F, 6, 7, 7);
	      topleg1.setRotationPoint(-6F, 7F, 4F);
	      topleg1.setTextureSize(128, 128);
	      topleg1.mirror = true;
	      setRotation(topleg1, -0.1128704F, 0F, 0F);
	      body = new ModelRenderer(this, 58, 95);
	      body.addBox(0F, 0F, 0F, 10, 8, 25);
	      body.setRotationPoint(-5F, 1F, -14F);
	      body.setTextureSize(128, 128);
	      body.mirror = true;
	      setRotation(body, -0.0756949F, 0F, 0F);
	      head = new ModelRenderer(this, 88, 74);
	      head.addBox(0F, 0F, 0F, 10, 9, 10);
	      head.setRotationPoint(-5F, -13F, -21F);
	      head.setTextureSize(128, 128);
	      head.mirror = true;
	      setRotation(head, 0.2707704F, 0F, 0F);
	      beard = new ModelRenderer(this, 1, 124);
	      beard.addBox(0F, 0F, 0F, 4, 4, 0);
	      beard.setRotationPoint(-2F, -3F, -27F);
	      beard.setTextureSize(128, 128);
	      beard.mirror = true;
	      setRotation(beard, 0.2712416F, 0F, 0F);
	      basetail = new ModelRenderer(this, 13, 120);
	      basetail.addBox(0F, 0F, 0F, 3, 3, 5);
	      basetail.setRotationPoint(-1F, 4F, 10F);
	      basetail.setTextureSize(128, 128);
	      basetail.mirror = true;
	      setRotation(basetail, 0F, 0F, 0F);
	      tail = new ModelRenderer(this, 102, 37);
	      tail.addBox(0F, 0F, 0F, 3, 3, 10);
	      tail.setRotationPoint(-1F, 5F, 13F);
	      tail.setTextureSize(128, 128);
	      tail.mirror = true;
	      setRotation(tail, 0.8306988F, 0F, 0F);
	      ear1 = new ModelRenderer(this, 80, 0);
	      ear1.addBox(0F, 0F, 0F, 7, 1, 3);
	      ear1.setRotationPoint(4F, -9F, -16F);
	      ear1.setTextureSize(128, 128);
	      ear1.mirror = true;
	      setRotation(ear1, 1.800255F, -0.832714F, -0.4163557F);
	      ear2 = new ModelRenderer(this, 80, 0);
	      ear2.addBox(0F, 0F, 0F, 7, 1, 3);
	      ear2.setRotationPoint(-3F, -12F, -16F);
	      ear2.setTextureSize(128, 128);
	      ear2.mirror = true;
	      setRotation(ear2, -1.778981F, -2.725244F, -0.3784978F);
	      lowercore = new ModelRenderer(this, 6, 109);
	      lowercore.addBox(0F, 0F, 0F, 4, 3, 5);
	      lowercore.setRotationPoint(-2F, -8F, -25F);
	      lowercore.setTextureSize(128, 128);
	      lowercore.mirror = true;
	      setRotation(lowercore, 0.6813067F, 0F, 0F);
	      uppercore = new ModelRenderer(this, 30, 99);
	      uppercore.addBox(0F, 0F, 0F, 6, 2, 6);
	      uppercore.setRotationPoint(-3F, -11.5F, -22F);
	      uppercore.setTextureSize(128, 128);
	      uppercore.mirror = true;
	      setRotation(uppercore, 1.090272F, 0F, 0F);
	      Lhorn1 = new ModelRenderer(this, 54, 37);
	      Lhorn1.addBox(0F, 0F, 0F, 3, 7, 3);
	      Lhorn1.setRotationPoint(2F, -22F, -16F);
	      Lhorn1.setTextureSize(128, 128);
	      Lhorn1.mirror = true;
	      setRotation(Lhorn1, -0.5204921F, 0F, 0.260246F);
	      Rhorn1 = new ModelRenderer(this, 54, 37);
	      Rhorn1.addBox(0F, 0F, 0F, 3, 7, 3);
	      Rhorn1.setRotationPoint(-5F, -21F, -16F);
	      Rhorn1.setTextureSize(128, 128);
	      Rhorn1.mirror = true;
	      setRotation(Rhorn1, -0.5204921F, 0F, -0.260246F);
	      Lhorn2 = new ModelRenderer(this, 0, 67);
	      Lhorn2.addBox(0F, 0F, 0F, 5, 11, 4);
	      Lhorn2.setRotationPoint(-7F, -28F, -9F);
	      Lhorn2.setTextureSize(128, 128);
	      Lhorn2.mirror = true;
	      setRotation(Lhorn2, -0.9666506F, -0.2602503F, 0F);
	      Lhorn3 = new ModelRenderer(this, 44, 0);
	      Lhorn3.addBox(0F, 0F, 0F, 5, 11, 4);
	      Lhorn3.setRotationPoint(-11F, -22F, 1F);
	      Lhorn3.setTextureSize(128, 128);
	      Lhorn3.mirror = true;
	      setRotation(Lhorn3, -2.155202F, -0.3717861F, 0F);
	      Lhorn4 = new ModelRenderer(this, 0, 0);
	      Lhorn4.addBox(0F, 0F, 0F, 4, 11, 4);
	      Lhorn4.setRotationPoint(-9F, -21F, -3F);
	      Lhorn4.setTextureSize(128, 128);
	      Lhorn4.mirror = true;
	      setRotation(Lhorn4, -0.5948606F, -0.4833219F, 0F);
	      Rhorn2 = new ModelRenderer(this, 0, 67);
	      Rhorn2.addBox(0F, 0F, 0F, 5, 11, 4);
	      Rhorn2.setRotationPoint(3F, -28F, -8F);
	      Rhorn2.setTextureSize(128, 128);
	      Rhorn2.mirror = true;
	      setRotation(Rhorn2, -1.003826F, 0.2602503F, 0F);
	      Rhorn3 = new ModelRenderer(this, 44, 0);
	      Rhorn3.addBox(0F, 0F, 0F, 5, 11, 4);
	      Rhorn3.setRotationPoint(5F, -22F, 2F);
	      Rhorn3.setTextureSize(128, 128);
	      Rhorn3.mirror = true;
	      setRotation(Rhorn3, -2.156354F, 0.1858931F, 0F);
	      Rhorn4 = new ModelRenderer(this, 0, 0);
	      Rhorn4.addBox(0F, 0F, 0F, 4, 11, 4);
	      Rhorn4.setRotationPoint(5F, -22F, 1F);
	      Rhorn4.setTextureSize(128, 128);
	      Rhorn4.mirror = true;
	      setRotation(Rhorn4, -0.5948606F, 0.4833166F, 0F);
	      frontleftleg = new ModelRenderer(this, 112, 16);
	      frontleftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
	      frontleftleg.setRotationPoint(-3F, 12F, -11F);
	      frontleftleg.setTextureSize(128, 128);
	      frontleftleg.mirror = true;
	      setRotation(frontleftleg, 0F, 0F, 0F);
	      leg2 = new ModelRenderer(this, 112, 16);
	      leg2.addBox(-2F, 0F, -2F, 4, 12, 4);
	      leg2.setRotationPoint(3F, 12F, 7F);
	      leg2.setTextureSize(128, 128);
	      leg2.mirror = true;
	      setRotation(leg2, -0.1128704F, 0F, 0F);
	      leg4 = new ModelRenderer(this, 112, 16);
	      leg4.addBox(-2F, 0F, -2F, 4, 12, 4);
	      leg4.setRotationPoint(-3F, 12F, 7F);
	      leg4.setTextureSize(128, 128);
	      leg4.mirror = true;
	      setRotation(leg4, -0.1128704F, 0F, 0F);
	      frontrightleg = new ModelRenderer(this, 112, 16);
	      frontrightleg.addBox(0F, 0F, 0F, 4, 12, 4);
	      frontrightleg.setRotationPoint(1F, 12F, -12F);
	      frontrightleg.setTextureSize(128, 128);
	      frontrightleg.mirror = true;
	      setRotation(frontrightleg, 0F, 0F, 0F);
	      topleg2 = new ModelRenderer(this, 102, 0);
	      topleg2.addBox(0F, 0F, 0F, 6, 7, 7);
	      topleg2.setRotationPoint(0F, 7F, 4F);
	      topleg2.setTextureSize(128, 128);
	      topleg2.mirror = true;
	      setRotation(topleg2, -0.1128704F, 0F, 0F);
	      neck = new ModelRenderer(this, 33, 110);
	      neck.addBox(0F, 0F, 0F, 6, 12, 6);
	      neck.setRotationPoint(-3F, -8F, -17F);
	      neck.setTextureSize(128, 128);
	      neck.mirror = true;
	      setRotation(neck, 0.2271022F, 0F, 0F);
	      nose = new ModelRenderer(this, 92, 54);
	      nose.addBox(0F, 0F, 0F, 6, 6, 12);
	      nose.setRotationPoint(-3F, -8F, -29F);
	      nose.setTextureSize(128, 128);
	      nose.mirror = true;
	      setRotation(nose, 0.2707704F, 0F, 0F);
	  }
  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    topleg4.renderWithRotation(f5);
	    topleg3.renderWithRotation(f5);
	    topleg1.renderWithRotation(f5);
	    body.renderWithRotation(f5);
	    head.renderWithRotation(f5);
	    beard.renderWithRotation(f5);
	    basetail.renderWithRotation(f5);
	    tail.renderWithRotation(f5);
	    ear1.renderWithRotation(f5);
	    ear2.renderWithRotation(f5);
	    lowercore.renderWithRotation(f5);
	    uppercore.renderWithRotation(f5);
	    Lhorn1.renderWithRotation(f5);
	    Rhorn1.renderWithRotation(f5);
	    Lhorn2.renderWithRotation(f5);
	    Lhorn3.renderWithRotation(f5);
	    Lhorn4.renderWithRotation(f5);
	    Rhorn2.renderWithRotation(f5);
	    Rhorn3.renderWithRotation(f5);
	    Rhorn4.renderWithRotation(f5);
	    frontleftleg.renderWithRotation(f5);
	    leg2.renderWithRotation(f5);
	    leg4.renderWithRotation(f5);
	    frontrightleg.renderWithRotation(f5);
	    topleg2.renderWithRotation(f5);
	    neck.renderWithRotation(f5);
	    nose.renderWithRotation(f5);
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
	   
	
	    this.frontleftleg.rotateAngleX = MathHelper.cos(f *  0.6662F) * 1.0F * f1;
	    this.frontrightleg.rotateAngleX = MathHelper.cos(f *  0.6662F + (float)Math.PI) * 1.0F * f1;
	  
	    this.leg2.rotateAngleX = MathHelper.cos(f *  0.6662F) * 1.0F * f1;
	    this.leg4.rotateAngleX = MathHelper.cos(f *  0.6662F + (float)Math.PI) * 1.0F * f1;
	    
	    this.tail.rotateAngleX = f3;
	  }
}