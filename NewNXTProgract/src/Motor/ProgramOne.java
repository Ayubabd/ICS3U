package Motor;

import lejos.nxt.Button;
import lejos.nxt.Motor;

public class ProgramOne {

	public static void main(String[] args) {

		System.out.println("Program 1");

		Button.waitForAnyPress();
		System.out.println("Move forward");
		Motor.A.forward();
		Motor.B.forward();

		Button.waitForAnyPress();
		System.out.println("Move backward");
		Motor.A.backward();
		Motor.B.backward();

		Button.waitForAnyPress();
		System.out.println("END");

	}
}