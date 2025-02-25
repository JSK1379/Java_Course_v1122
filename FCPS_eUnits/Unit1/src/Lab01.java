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
      Robot Pete = new Robot(4,5,Display.SOUTH,0);
      Lisa.move();
      Lisa.move();
      Lisa.turnLeft();
      Lisa.move();
      Lisa.turnLeft();
      Lisa.move();
      Lisa.pickBeeper();
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
      Lisa.turnLeft();
      Lisa.move();
      Lisa.move();
      Lisa.move();
      Lisa.turnLeft();
      Lisa.move();
      Lisa.move();
      Lisa.turnLeft();
      Lisa.turnLeft();
      Lisa.turnLeft();
      Lisa.move();
      Lisa.putBeeper();
      Pete.pickBeeper();
      Pete.move();
      Pete.turnLeft();
      Pete.move();
      Pete.move();
      Pete.turnLeft();
      Pete.move();
      Pete.move();
      Pete.turnLeft();
      Pete.turnLeft();
      Pete.turnLeft();
      Pete.move();
      Pete.move();
      Pete.turnLeft();
      Pete.move();
      Pete.turnLeft();
      Pete.move();
      Pete.move();
      Pete.turnLeft();
      Pete.turnLeft();
      Pete.turnLeft();
      Pete.move();
      Pete.move();
      Pete.turnLeft();
      Pete.move();
      Pete.move();
      Pete.putBeeper();
      Pete.turnLeft();
      Pete.turnLeft();
      Pete.move();

 //     Lisa.pickBeeper();
 //     Lisa.move();
 //     Lisa.turnLeft();
 //     Lisa.putBeeper();
	}
}
