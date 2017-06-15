
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Main {

	public static void main(String[] args) {
		Behavior b1 = new Stop();
		Behavior b2 = new KnockOver();
		Behavior b3 = new DodgePit();
		Behavior b4 = new DriveForward();

		Behavior[] behaviours = {b1, b2, b3, b4};
		Arbitrator arr = new Arbitrator(behaviours);
		arr.start();
	}

}
