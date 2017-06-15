

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Stop implements Behavior{
	


	public void suppress(){
	}
	
		
	public boolean takeControl(){
	return Button.ESCAPE.isDown();
	}		
	public void action(){
	System.exit(0);
	}
}
