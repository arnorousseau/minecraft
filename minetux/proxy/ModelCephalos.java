package minetux.proxy;

import minetux.common.EntityCephalos;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCephalos extends ModelBase
{
	ModelRenderer RightFeetTipC;
    ModelRenderer RightFeetTipB;
    ModelRenderer RightFeetTipA;
    ModelRenderer RightFeetNailB;
    ModelRenderer RightFeetNailC;
    ModelRenderer RightFeetNailA;
    ModelRenderer RightFeetNailTipA;
    ModelRenderer LeftFeetTipA;
    ModelRenderer LeftFeetTipB;
    ModelRenderer LeftFeetTipC;
    ModelRenderer LeftFeetNailB;
    ModelRenderer LeftFeetNailC;
    ModelRenderer LeftFeetNailA;
    ModelRenderer LeftFeetNailTipA;
    ModelRenderer RightLowerLeg;
    ModelRenderer LeftLowerLeg;
    ModelRenderer RightMiddleLeg;
    ModelRenderer LeftMiddleLeg;
    ModelRenderer RightUpperLeg;
    ModelRenderer LeftUpperLeg;
    ModelRenderer LeftShoulder;
    ModelRenderer RightShoulder;
    ModelRenderer Body;
    ModelRenderer LeftElbow;
    ModelRenderer RightElbow;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer LeftNailA;
    ModelRenderer LeftNailB;
    ModelRenderer LeftNailC;
    ModelRenderer RightNailA;
    ModelRenderer RightNailB;
    ModelRenderer RightNailC;
    ModelRenderer Chest;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Nose;
    ModelRenderer Mouth;
    ModelRenderer Mohawk;
    ModelRenderer TailA;
    ModelRenderer TailB;
    ModelRenderer TailC;
    ModelRenderer TailD;
    ModelRenderer TailE;
    ModelRenderer Spine;
    ModelRenderer TailF;
    ModelRenderer RightSoleFeet;
    ModelRenderer LeftSoleFeet;
    ModelRenderer LeftUpperSoleFeet;
    ModelRenderer RightUpperSoleFeet;
  
    public ModelCephalos()
    {
      textureWidth = 256;
      textureHeight = 256;
    
      RightFeetTipC = new ModelRenderer(this, 0, 180);
      RightFeetTipC.addBox(-1F, -1F, -3F, 2, 3, 4);
      RightFeetTipC.setRotationPoint(2F, 1F, -5F);
      RightFeetTipC.setTextureSize(256, 256);
      RightFeetTipC.mirror = true;
      setRotation(RightFeetTipC, 0F, 0.3490659F, 0F);
      RightFeetTipB = new ModelRenderer(this, 0, 180);
      RightFeetTipB.addBox(-1F, -1F, -3F, 2, 3, 3);
      RightFeetTipB.setRotationPoint(-10F, 22F, 1F);
      RightFeetTipB.setTextureSize(256, 256);
      RightFeetTipB.mirror = true;
      setRotation(RightFeetTipB, 0F, 0F, 0F);
      RightFeetTipA = new ModelRenderer(this, 25, 180);
      RightFeetTipA.addBox(-1F, -1F, -5F, 2, 3, 5);
      RightFeetTipA.setRotationPoint(-2F, 2F, -4F);
      RightFeetTipA.setTextureSize(256, 256);
      RightFeetTipA.mirror = true;
      setRotation(RightFeetTipA, -0.8726646F, 0F, 0F);
      RightFeetNailB = new ModelRenderer(this, 0, 160);
      RightFeetNailB.addBox(-0.5F, -1F, -2F, 1, 2, 2);
      RightFeetNailB.setRotationPoint(0F, 1F, -5F);
      RightFeetNailB.setTextureSize(256, 256);
      RightFeetNailB.mirror = true;
      setRotation(RightFeetNailB, 0F, 0F, 0F);
      RightFeetNailC = new ModelRenderer(this, 0, 160);
      RightFeetNailC.addBox(-0.5F, -1F, -2F, 1, 2, 2);
      RightFeetNailC.setRotationPoint(-13F, 23F, -1.5F);
      RightFeetNailC.setTextureSize(256, 256);
      RightFeetNailC.mirror = true;
      setRotation(RightFeetNailC, 0F, 0.3490659F, 0F);
      RightFeetNailA = new ModelRenderer(this, 25, 170);
      RightFeetNailA.addBox(-0.5F, -1F, -3F, 1, 2, 3);
      RightFeetNailA.setRotationPoint(-8F, 18.5F, -1F);
      RightFeetNailA.setTextureSize(256, 256);
      RightFeetNailA.mirror = true;
      setRotation(RightFeetNailA, -0.8726646F, 0F, 0F);
      RightFeetNailTipA = new ModelRenderer(this, 25, 160);
      RightFeetNailTipA.addBox(-0.5F, -1F, -2F, 1, 2, 2);
      RightFeetNailTipA.setRotationPoint(-8F, 16.5F, -2F);
      RightFeetNailTipA.setTextureSize(256, 256);
      RightFeetNailTipA.mirror = true;
      setRotation(RightFeetNailTipA, 0.3490659F, 0F, 0F);
      LeftFeetTipA = new ModelRenderer(this, 25, 180);
      LeftFeetTipA.addBox(-1F, -1F, -5F, 2, 3, 5);
      LeftFeetTipA.setRotationPoint(-2F, 2F, -4F);
      LeftFeetTipA.setTextureSize(256, 256);
      LeftFeetTipA.mirror = true;
      setRotation(LeftFeetTipA, -0.8726646F, 0F, 0F);
      LeftFeetTipB = new ModelRenderer(this, 0, 180);
      LeftFeetTipB.addBox(-1F, -1F, -3F, 2, 3, 3);
      LeftFeetTipB.setRotationPoint(0F, 1F, -5F);
      LeftFeetTipB.setTextureSize(256, 256);
      LeftFeetTipB.mirror = true;
      setRotation(LeftFeetTipB, 0F, 0F, 0F);
      LeftFeetTipC = new ModelRenderer(this, 0, 180);
      LeftFeetTipC.addBox(-1F, -1F, -3F, 2, 3, 4);
      LeftFeetTipC.setRotationPoint(2F, 1F, -5F);
      LeftFeetTipC.setTextureSize(256, 256);
      LeftFeetTipC.mirror = true;
      setRotation(LeftFeetTipC, 0F, -0.3490659F, 0F);
      LeftFeetNailB = new ModelRenderer(this, 0, 160);
      LeftFeetNailB.addBox(-0.5F, -1F, -2F, 1, 2, 2);
      LeftFeetNailB.setRotationPoint(10F, 20F, -2F);
      LeftFeetNailB.setTextureSize(256, 256);
      LeftFeetNailB.mirror = true;
      setRotation(LeftFeetNailB, 0F, 0F, 0F);
      LeftFeetNailC = new ModelRenderer(this, 0, 160);
      LeftFeetNailC.addBox(-0.5F, -1F, -2F, 1, 2, 2);
      LeftFeetNailC.setRotationPoint(13F, 23F, -1.5F);
      LeftFeetNailC.setTextureSize(256, 256);
      LeftFeetNailC.mirror = true;
      setRotation(LeftFeetNailC, 0F, -0.3490659F, 0F);
      LeftFeetNailA = new ModelRenderer(this, 25, 170);
      LeftFeetNailA.addBox(-0.5F, -1F, -3F, 1, 2, 3);
      LeftFeetNailA.setRotationPoint(8F, 18.5F, -1F);
      LeftFeetNailA.setTextureSize(256, 256);
      LeftFeetNailA.mirror = true;
      setRotation(LeftFeetNailA, -0.8726646F, 0F, 0F);
      LeftFeetNailTipA = new ModelRenderer(this, 25, 160);
      LeftFeetNailTipA.addBox(-0.5F, -1F, -2F, 1, 2, 2);
      LeftFeetNailTipA.setRotationPoint(8F, 16.5F, -2F);
      LeftFeetNailTipA.setTextureSize(256, 256);
      LeftFeetNailTipA.mirror = true;
      setRotation(LeftFeetNailTipA, 0.3490659F, 0F, 0F);
      RightLowerLeg = new ModelRenderer(this, 50, 0);
      RightLowerLeg.addBox(-2.5F, 0F, -2.5F, 5, 7, 5);
      RightLowerLeg.setRotationPoint(0F, 13F, 0.3F);
      RightLowerLeg.setTextureSize(256, 256);
      RightLowerLeg.mirror = true;
      setRotation(RightLowerLeg, -0.3490659F, 0F, 0F);
      LeftLowerLeg = new ModelRenderer(this, 50, 0);
      LeftLowerLeg.addBox(-2.5F, 0F, -2.5F, 5, 7, 5);
      LeftLowerLeg.setRotationPoint(0F, 13F, 0.3F);
      LeftLowerLeg.setTextureSize(256, 256);
      LeftLowerLeg.mirror = true;
      setRotation(LeftLowerLeg, -0.3490659F, 0F, 0F);
      RightMiddleLeg = new ModelRenderer(this, 100, 50);
      RightMiddleLeg.addBox(-2.5F, 0F, -2.5F, 5, 15, 5);
      RightMiddleLeg.setRotationPoint(-3F, 10F, -1F);
      RightMiddleLeg.setTextureSize(256, 256);
      RightMiddleLeg.mirror = true;
      setRotation(RightMiddleLeg, 0.5235988F, 0F, 0F);
      LeftMiddleLeg = new ModelRenderer(this, 130, 50);
      LeftMiddleLeg.addBox(-2.5F, 0F, -2.5F, 5, 15, 5);
      LeftMiddleLeg.setRotationPoint(-3F, 10F, -1F);
      LeftMiddleLeg.setTextureSize(256, 256);
      LeftMiddleLeg.mirror = true;
      setRotation(LeftMiddleLeg, 0.5235988F, 0F, 0F);
      RightUpperLeg = new ModelRenderer(this, 0, 50);
      RightUpperLeg.addBox(-6F, -3F, -4F, 6, 16, 8);
      RightUpperLeg.setRotationPoint(-7F, -3F, 10F);
      RightUpperLeg.setTextureSize(256, 256);
      RightUpperLeg.mirror = true;
      setRotation(RightUpperLeg, -0.3490659F, 0F, 0F);
      LeftUpperLeg = new ModelRenderer(this, 155, 50);
      LeftUpperLeg.addBox(-6F, -3F, -4F, 6, 16, 8);
      LeftUpperLeg.setRotationPoint(13F, -3F, 10F);
      LeftUpperLeg.setTextureSize(256, 256);
      LeftUpperLeg.mirror = true;
      setRotation(LeftUpperLeg, -0.3490659F, 0F, 0F);
      LeftShoulder = new ModelRenderer(this, 150, 15);
      LeftShoulder.addBox(0F, -3F, -3F, 3, 6, 6);
      LeftShoulder.setRotationPoint(7F, -6F, -12F);
      LeftShoulder.setTextureSize(256, 256);
      LeftShoulder.mirror = true;
      setRotation(LeftShoulder, 0F, 0F, 0F);
      RightShoulder = new ModelRenderer(this, 150, 0);
      RightShoulder.addBox(-3F, -3F, -3F, 3, 6, 6);
      RightShoulder.setRotationPoint(-7F, -6F, -12F);
      RightShoulder.setTextureSize(256, 256);
      RightShoulder.mirror = true;
      setRotation(RightShoulder, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 139, 116);
      Body.addBox(-7F, -9F, -16F, 14, 18, 32);
      Body.setRotationPoint(0F, -5F, -3F);
      Body.setTextureSize(256, 256);
      Body.mirror = true;
      setRotation(Body, -0.1047198F, 0F, 0F);
      LeftElbow = new ModelRenderer(this, 120, 15);
      LeftElbow.addBox(-1.5F, 0F, -1.5F, 3, 8, 4);
      LeftElbow.setRotationPoint(9F, -5F, -12F);
      LeftElbow.setTextureSize(256, 256);
      LeftElbow.mirror = true;
      setRotation(LeftElbow, 0F, 0F, 0F);
      RightElbow = new ModelRenderer(this, 120, 0);
      RightElbow.addBox(-1.5F, 0F, -1.5F, 3, 8, 4);
      RightElbow.setRotationPoint(-9F, -5F, -12F);
      RightElbow.setTextureSize(256, 256);
      RightElbow.mirror = true;
      setRotation(RightElbow, 0F, 0F, 0F);
      LeftArm = new ModelRenderer(this, 100, 15);
      LeftArm.addBox(-1.5F, 0F, -1.5F, 2, 10, 3);
      LeftArm.setRotationPoint(10F, 2F, -11F);
      LeftArm.setTextureSize(256, 256);
      LeftArm.mirror = true;
      setRotation(LeftArm, -0.5235988F, 0F, 0F);
      RightArm = new ModelRenderer(this, 100, 0);
      RightArm.addBox(-1.5F, 0F, -1.5F, 2, 10, 3);
      RightArm.setRotationPoint(-9F, 2F, -11F);
      RightArm.setTextureSize(256, 256);
      RightArm.mirror = true;
      setRotation(RightArm, -0.5585054F, 0F, 0F);
      LeftNailA = new ModelRenderer(this, 0, 120);
      LeftNailA.addBox(-0.5F, -1F, -0.5F, 1, 7, 1);
      LeftNailA.setRotationPoint(9.5F, 10F, -16.5F);
      LeftNailA.setTextureSize(256, 256);
      LeftNailA.mirror = true;
      setRotation(LeftNailA, -0.5235988F, 0F, 0.5410521F);
      LeftNailB = new ModelRenderer(this, 0, 120);
      LeftNailB.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
      LeftNailB.setRotationPoint(10F, 10F, -15.5F);
      LeftNailB.setTextureSize(256, 256);
      LeftNailB.mirror = true;
      setRotation(LeftNailB, -0.5235988F, 0F, 0.8726646F);
      LeftNailC = new ModelRenderer(this, 0, 120);
      LeftNailC.addBox(0F, 0F, 0F, 1, 6, 1);
      LeftNailC.setRotationPoint(10F, 10F, -15F);
      LeftNailC.setTextureSize(256, 256);
      LeftNailC.mirror = true;
      setRotation(LeftNailC, -0.5235988F, 0.1047198F, 1.047198F);
      RightNailA = new ModelRenderer(this, 0, 120);
      RightNailA.addBox(-0.5F, -1F, -0.5F, 1, 7, 1);
      RightNailA.setRotationPoint(-9F, 10F, -16.5F);
      RightNailA.setTextureSize(256, 256);
      RightNailA.mirror = true;
      setRotation(RightNailA, -0.5235988F, 0F, -0.5410521F);
      RightNailB = new ModelRenderer(this, 0, 120);
      RightNailB.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
      RightNailB.setRotationPoint(-9F, 10F, -15.5F);
      RightNailB.setTextureSize(256, 256);
      RightNailB.mirror = true;
      setRotation(RightNailB, -0.5235988F, 0F, -0.8726646F);
      RightNailC = new ModelRenderer(this, 0, 120);
      RightNailC.addBox(0F, 0F, 0F, 1, 6, 1);
      RightNailC.setRotationPoint(-10F, 10F, -15F);
      RightNailC.setTextureSize(256, 256);
      RightNailC.mirror = true;
      setRotation(RightNailC, -0.5235988F, -0.1047198F, -1.047198F);
      Chest = new ModelRenderer(this, 170, 85);
      Chest.addBox(-6F, -7F, -4F, 12, 14, 4);
      Chest.setRotationPoint(0F, -1F, -15F);
      Chest.setTextureSize(256, 256);
      Chest.mirror = true;
      setRotation(Chest, -0.0349066F, 0F, 0F);
      Neck = new ModelRenderer(this, 111, 85);
      Neck.addBox(-4F, -5F, -18F, 8, 10, 18);
      Neck.setRotationPoint(0F, 1F, -1F);
      Neck.setTextureSize(256, 256);
      Neck.mirror = true;
      setRotation(Neck, -0.296706F, 0F, 0F);
      Head = new ModelRenderer(this, 88, 168);
      Head.addBox(-4.5F, -6F, -10F, 9, 12, 10);
      Head.setRotationPoint(0F, -1.5F, -15F);
      Head.setTextureSize(256, 256);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 200, 0);
      Nose.addBox(-2.5F, -3F, -13F, 5, 6, 13);
      Nose.setRotationPoint(0F, -2F, -10F);
      Nose.setTextureSize(256, 256);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Mouth = new ModelRenderer(this, 200, 24);
      Mouth.addBox(-2.5F, -3F, -13F, 5, 6, 16);
      Mouth.setRotationPoint(0F, 4F, -10F);
      Mouth.setTextureSize(256, 256);
      Mouth.mirror = true;
      setRotation(Mouth, 0.3141593F, 0F, 0F);
      Mohawk = new ModelRenderer(this, 200, 50);
      Mohawk.addBox(-1.5F, -2F, 0F, 3, 4, 15);
      Mohawk.setRotationPoint(0F, -3.0F, -10F);
      Mohawk.setTextureSize(256, 256);
      Mohawk.mirror = true;
      setRotation(Mohawk, 0.3490659F, 0F, 0F);
      TailA = new ModelRenderer(this, 36, 69);
      TailA.addBox(-6F, -8F, 0F, 12, 16, 7);
      TailA.setRotationPoint(0F, -1F, 15F);
      TailA.setTextureSize(256, 256);
      TailA.mirror = true;
      setRotation(TailA, -0.1047198F, 0F, 0F);
      TailB = new ModelRenderer(this, 39, 102);
      TailB.addBox(-5F, -7F, 0F, 10, 14, 10);
      TailB.setRotationPoint(0F, -1F, 5F);
      TailB.setTextureSize(256, 256);
      TailB.mirror = true;
      setRotation(TailB, -0.1047198F, 0F, 0F);
      TailC = new ModelRenderer(this, 42, 128);
      TailC.addBox(-4F, -6F, 0F, 8, 12, 10);
      TailC.setRotationPoint(0F, -1F, 6F);
      TailC.setTextureSize(256, 256);
      TailC.mirror = true;
      setRotation(TailC, -0.1047198F, 0F, 0F);
      TailD = new ModelRenderer(this, 44, 21);
      TailD.addBox(-3F, -5F, 0F, 6, 10, 10);
      TailD.setRotationPoint(0F, -1F, 8F);
      TailD.setTextureSize(256, 256);
      TailD.mirror = true;
      setRotation(TailD, -0.1047198F, 0F, 0F);
      TailE = new ModelRenderer(this, 0, 22);
      TailE.addBox(-2F, -4F, 0F, 4, 8, 10);
      TailE.setRotationPoint(0F, -1F, 6F);
      TailE.setTextureSize(256, 256);
      TailE.mirror = true;
      setRotation(TailE, -0.1047198F, 0F, 0F);
      Spine = new ModelRenderer(this, 139, 186);
      Spine.addBox(-2F, -3F, -9F, 4, 3, 35);
      Spine.setRotationPoint(0F, -8F, -6F);
      Spine.setTextureSize(256, 256);
      Spine.mirror = true;
      setRotation(Spine, -0.1047198F, 0F, 0F);
      TailF = new ModelRenderer(this, 0, 0);
      TailF.addBox(-1F, -2F, 0F, 2, 6, 10);
      TailF.setRotationPoint(0F, -1F, 9F);
      TailF.setTextureSize(256, 256);
      TailF.mirror = true;
      setRotation(TailF, -0.1047198F, 0F, 0F);
      RightSoleFeet = new ModelRenderer(this, 0, 200);
      RightSoleFeet.addBox(-3F, 0F, -6F, 6, 3, 8);
      RightSoleFeet.setRotationPoint(0F, 1F, 1.5F);
      RightSoleFeet.setTextureSize(256, 256);
      RightSoleFeet.mirror = true;
      setRotation(RightSoleFeet, 0F, 0F, 0F);
      LeftSoleFeet = new ModelRenderer(this, 0, 200);
      LeftSoleFeet.addBox(-3F, 0F, -6F, 6, 3, 8);
      LeftSoleFeet.setRotationPoint(0F, 1F, 1.5F);
      LeftSoleFeet.setTextureSize(256, 256);
      LeftSoleFeet.mirror = true;
      setRotation(LeftSoleFeet, 0F, 0F, 0F);
      LeftUpperSoleFeet = new ModelRenderer(this, 50, 50);
      LeftUpperSoleFeet.addBox(-2.5F, 0F, -3F, 5, 2, 6);
      LeftUpperSoleFeet.setRotationPoint(0F, 6F, -2F);
      LeftUpperSoleFeet.setTextureSize(256, 256);
      LeftUpperSoleFeet.mirror = true;
      setRotation(LeftUpperSoleFeet, 0F, 0F, 0F);
      RightUpperSoleFeet = new ModelRenderer(this, 50, 50);
      RightUpperSoleFeet.addBox(-2.5F, 0F, -3F, 5, 2, 6);
      RightUpperSoleFeet.setRotationPoint(0F, 6F, -2F);
      RightUpperSoleFeet.setTextureSize(256, 256);
      RightUpperSoleFeet.mirror = true;
      setRotation(RightUpperSoleFeet, 0F, 0F, 0F);
      
      
      Body.addChild(Chest);
      Body.addChild(Spine);
      
      //Face
      Chest.addChild(Neck);
      Neck.addChild(Head);
      Head.addChild(Nose);
      Head.addChild(Mouth);
      Head.addChild(Mohawk);
      
      //Tail
      Body.addChild(TailA);
      TailA.addChild(TailB);
      TailB.addChild(TailC);
      TailC.addChild(TailD);
      TailD.addChild(TailE);
      TailE.addChild(TailF);
      
      Body.addChild(LeftUpperLeg);
      Body.addChild(RightUpperLeg);
      LeftUpperLeg.addChild(LeftMiddleLeg);
      RightUpperLeg.addChild(RightMiddleLeg);
      LeftMiddleLeg.addChild(LeftLowerLeg);
      LeftLowerLeg.addChild(LeftUpperSoleFeet);
      LeftUpperSoleFeet.addChild(LeftSoleFeet);
      
      RightMiddleLeg.addChild(RightLowerLeg);
      RightLowerLeg.addChild(RightUpperSoleFeet);
      RightUpperSoleFeet.addChild(RightSoleFeet);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
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
   
    LeftUpperLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    RightUpperLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    LeftLowerLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    RightLowerLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
  }
  

 

}