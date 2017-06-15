

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class DriveForward  implements Behavior{
	private boolean suppressed = false;

	public void suppress(){
		suppressed = true;
	}

	public boolean takeControl(){
			return true;
	}

	public void action(){
		Motor.A.forward();
		Motor.B.forward();
		while(!suppressed){
			Thread.yield();
		}
	}

}
