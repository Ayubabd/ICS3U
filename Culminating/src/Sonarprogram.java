

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;

public class Sonarprogram {

	public static void main(String[] args) {

		UltrasonicSensor us = new UltrasonicSensor(SensorPort.S3);
		TouchSensor breaker = new TouchSensor(SensorPort.S4);
		
		System.out.println("Ultrasonic Sensor");
		
		Button.waitForAnyPress();
		
		Motor.A.setSpeed(420);
		Motor.B.setSpeed(420);
		
		Motor.A.forward();
		Motor.B.forward();
		
		while(!breaker.isPressed()){
			us.ping();
			Delay.msDelay(20);
			int bro = us.getDistance();
			
			if(bro < 25){
				Motor.A.stop();
				Motor.B.stop();

				break;
			}
		}
		
		Motor.A.rotate(420, true);
		Motor.B.rotate(-420);

	}

}