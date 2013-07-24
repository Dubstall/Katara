package katara.hacks.pvp;

import net.minecraft.src.Minecraft;
import katara.hacks.*;

public class Criticals {
	
	private Minecraft mc;

	public void preAttackEntity()
	{
		mc.thePlayer.motionY = 0.1;
		mc.thePlayer.onGround = false;
	}
	
}

