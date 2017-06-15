

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

public class KnockOver implements Behavior{
	private boolean suppressed = false;
	private UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S3);
	public void suppress(){
		suppressed = true;
	}

	public boolean takeControl(){
		if(sonic.getDistance() <= 50){
			return true;
		}
		return false;
	}

	public void action(){
		suppressed = false;
		Motor.A.stop();
		Motor.B.stop();
		
		Motor.C.rotate(90);
		while(!suppressed){
			Thread.yield();
		}
	}
}
