
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Main {

	public static void main(String[] args) {
		Behavior b1 = (Behavior) new Stop();
		Behavior b2 = (Behavior) new KnockOver();
		Behavior b3 = (Behavior) new DodgePit();
		Behavior b4 = (Behavior) new DriveForward();

		Behavior[] behaviours = {b1, b2, b3, b4};
		Arbitrator arr = new Arbitrator(behaviours);
		arr.start();
	}

}
