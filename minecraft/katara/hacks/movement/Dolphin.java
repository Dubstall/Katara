package katara.hacks.movement;

import net.minecraft.src.Minecraft;

public class Dolphin {
	
	private Minecraft mc;
	
	public void preMotionUpdates()
	{
		if(mc.thePlayer.isInWater())
		{
			mc.thePlayer.motionY = 0.0000001;
		}
	}

}
