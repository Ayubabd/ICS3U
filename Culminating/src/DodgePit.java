

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;

public class DodgePit implements Behavior{

	private boolean suppressed = false;
	private LightSensor light = new LightSensor(SensorPort.S3);

	public void suppress(){
		suppressed = true;
	}

	public boolean takeControl(){
		if(light.getLightValue() <= 25){
			return true;
		}
		return false;
	}

	public void action(){
		suppressed = false;
		while(light.getLightValue() <= 25)//while ground is black
			
			//turn right
			Motor.A.rotate(-90, true);
			Motor.B.rotate(90);
			
			//move slightly away from original position
			Motor.A.rotate(360, true);
			Motor.B.rotate(360);
			
			//turn back
			Motor.A.rotate(90, true);
			Motor.B.rotate(-90);
			while(!suppressed){
				Thread.yield();
			}
	}

}
