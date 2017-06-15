package Motor;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
public class TouchProgram {

	public static void main(String[] args) {
	
		TouchSensor touch = new TouchSensor(SensorPort.S1);
		Button.waitForAnyPress();
	    
		while(!touch.isPressed()){
		Motor.A.setSpeed(1000);
		Motor.B.setSpeed(1000);
		Motor.A.backward();
		Motor.B.backward();
		}
			Motor.A.stop();
			Motor.B.stop();
			Motor.A.forward();
			Motor.B.forward();
			Button.waitForAnyPress();
			Motor.A.stop();
			Motor.B.stop();
		}
	}
	


