


import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.util.Delay;

public class LightProgram {

	static LightSensor ls = new LightSensor(SensorPort.S1); 

	public static void main(String[] args)  {

		System.out.println("Hello");
		Button.waitForAnyPress();
		System.out.println("Follow it");

		
		Motor.A.setSpeed(360);
		Motor.B.setSpeed(360);

		boolean breaker = false;
		while(true){
			if(ls.getLightValue() < 50){
				continue;
			} else {
				Motor.A.rotate(45, true);
				for(int x = 0; x < 8; x++){
					if(ls.getLightValue() < 50){
						breaker = true;
						break;
					}
				}
				Motor.B.rotate(90, true);
				Delay.msDelay(125);
				for(int x = 0; x < 8; x++){
					if(ls.getLightValue() < 50){
						breaker = true;
						break;
					}
				}
				if(breaker){
					continue;
				} else {
					break; 
				}
			}
		}
		
		System.out.println("Line is over!");
		Button.waitForAnyPress();
		
	}

	public static boolean isFollowingLine(char motor){
		if(ls.getLightValue() < 50){
			return true;
		}
		return false;
	}

}