package Motor;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;

public class Soundprogram {
	


	public static void main(String[] args) {

		SoundSensor ss = new SoundSensor(SensorPort.S2, true);
		TouchSensor ts = new TouchSensor(SensorPort.S4);

		
		System.out.println("Sound Sensor Activated");
		
		Button.waitForAnyPress();
		
		System.out.println("Clapping will turn and spin the  robot 420 degrees");
		System.out.println("to end press touch sensor");
 
		boolean Ayub = true;
		
		while(!ts.isPressed()){
			if(ss.readValue() > 50){
				System.out.println("Go!!");

				if(Ayub){
				Motor.A.rotate(420,true);
				Motor.B.rotate(-420);
				
				Ayub = false;
				} else {
					Motor.A.rotate(-420,true);
					Motor.B.rotate(420);
					
					Ayub = true;
				}
				
			}
		}}}