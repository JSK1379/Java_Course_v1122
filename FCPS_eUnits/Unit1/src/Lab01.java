import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


public class Lab01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/school.map");
      Display.setSize(10,10);
      Display.setSpeed(5);

		Robot Lisa = new Robot();
      Robot Pete = new Robot(4,5,Display.EAST,0);
      Lisa.move();
      Lisa.move();
      Lisa.turnLeft();
      Lisa.move();
      Lisa.turnLeft();
      Lisa.move();
      Lisa.turnLeft();
      Lisa.turnLeft();
      Lisa.move();
      Lisa.turnLeft();
      Lisa.turnLeft();
      Lisa.turnLeft();
      Lisa.move();
      Lisa.turnLeft();
      Lisa.move();
      Lisa.move();
      Lisa.move();
      
      Lisa.pickBeeper();
      Lisa.move();
      Lisa.turnLeft();
      Lisa.putBeeper();
	}
}
