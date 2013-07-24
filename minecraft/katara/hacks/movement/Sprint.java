package katara.hacks.movement;


import net.minecraft.src.Minecraft;

public class Sprint {
	
	private Minecraft mc;
	
	public void preMotionUpdate()
	{
		
		mc.thePlayer.setSprinting(true);
	}
	

}

