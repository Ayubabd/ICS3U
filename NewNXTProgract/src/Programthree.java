

import lejos.nxt.Button;
import lejos.nxt.Motor;

public class Programthree {

	public static void main(String[] args) {
		System.out.println("Program 3");
		Button.waitForAnyPress();
		Motor.A.rotate(1440);
		System.out.println("Motor A: " + Motor.A.getTachoCount());
		Motor.A.rotateTo(0);
		System.out.println("Motor A: " + Motor.A.getTachoCount());
		Button.waitForAnyPress();

	}

}