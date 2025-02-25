import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/mountain.map");
		Display.setSize(16,16);
      Display.setSpeed(10);

		Climber karel = new Climber(8);
      karel.turnRight();
      karel.move();
      karel.climbUpRight();
      karel.climbUpRight();
      karel.climbUpRight();
      karel.climbDownRight();
      karel.climbDownRight();
      karel.pickBeeper();
      karel.turnAround();
      karel.climbUpLeft();
      karel.climbUpLeft();
      karel.climbDownLeft();
      karel.climbDownLeft();
      karel.climbDownLeft();
      }

}
