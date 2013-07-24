package katara.hacks.pvp;

import net.minecraft.src.Minecraft;

public class God {
	
	private Minecraft mc;
	
	public void preMotionUpdates() {
            mc.thePlayer.isDead = true;
    }
    
    public void onDisable(){
		mc.thePlayer.isDead = false;
	}

}
