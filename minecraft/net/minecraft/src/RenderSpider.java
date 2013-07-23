package net.minecraft.src;

import org.lwjgl.opengl.GL11;

public class RenderSpider extends RenderLiving
{
    private static final ResourceLocation field_110891_a = new ResourceLocation("textures/entity/spider_eyes.png");
    private static final ResourceLocation field_110890_f = new ResourceLocation("textures/entity/spider/spider.png");

    public RenderSpider()
    {
        super(new ModelSpider(), 1.0F);
        this.setRenderPassModel(new ModelSpider());
    }

    protected float setSpiderDeathMaxRotation(EntitySpider par1EntitySpider)
    {
        return 180.0F;
    }

    /**
     * Sets the spider's glowing eyes
     */
    protected int setSpiderEyeBrightness(EntitySpider par1EntitySpider, int par2, float par3)
    {
        if (par2 != 0)
        {
            return -1;
        }
        else
        {
            this.func_110776_a(field_110891_a);
            float var4 = 1.0F;
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);

            if (par1EntitySpider.isInvisible())
            {
                GL11.glDepthMask(false);
            }
            else
            {
                GL11.glDepthMask(true);
            }

            char var5 = 61680;
            int var6 = var5 % 65536;
            int var7 = var5 / 65536;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)var6 / 1.0F, (float)var7 / 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, var4);
            return 1;
        }
    }

    protected ResourceLocation func_110889_a(EntitySpider par1EntitySpider)
    {
        return field_110890_f;
    }

    protected float getDeathMaxRotation(EntityLivingBase par1EntityLivingBase)
    {
        return this.setSpiderDeathMaxRotation((EntitySpider)par1EntityLivingBase);
    }

    /**
     * Queries whether should render the specified pass or not.
     */
    protected int shouldRenderPass(EntityLivingBase par1EntityLivingBase, int par2, float par3)
    {
        return this.setSpiderEyeBrightness((EntitySpider)par1EntityLivingBase, par2, par3);
    }

    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
        return this.func_110889_a((EntitySpider)par1Entity);
    }
}
