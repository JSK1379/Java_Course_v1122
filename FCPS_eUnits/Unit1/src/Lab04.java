import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab04 {

	/**
	 * @param args
	 */
   public static void takeTheField(Athlete arg)
  {
	arg.move();
	arg.move();
	arg.move();
	arg.move();
	arg.turnRight();
	arg.move();
	arg.move();
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display.openWorld("../maps/arena.map");
		Display.setSize(10,10);
      Display.setSpeed(10);

		Athlete karel1 = new Athlete();
      Athlete karel2 = new Athlete();
      Athlete karel3 = new Athlete();
      Athlete karel4 = new Athlete();
      Athlete karel5 = new Athlete();
      Athlete karel6 = new Athlete();
      Robot coach = new Robot(2,7,Display.EAST,0);
      
      takeTheField(karel1);
      karel1.turnLeft();
      karel1.move();
      karel1.turnRight();
      karel1.move();
      karel1.turnRight();
      
      takeTheField(karel2);
      karel2.move();
      karel2.move();
      karel2.turnRight();
      
      takeTheField(karel3);
      karel3.move();
      karel3.move();
      karel3.move();
      karel3.turnRight();
      
      takeTheField(karel4);
      karel4.move();
      karel4.move();
      karel4.move();
      karel4.move();
      karel4.turnRight();
      
      takeTheField(karel5);
      karel5.move();
      karel5.move();
      karel5.move();
      karel5.move();
      karel5.move();
      karel5.turnLeft();
      karel5.move();
      karel5.turnAround();
      
      takeTheField(karel6);
      karel6.move();
      karel6.move();
      karel6.move();
      karel6.turnLeft();
      karel6.move();
      karel6.move();
      karel6.turnAround();
 //     karel.turnLeft();
 //     karel.move();
 //     karel.turnRight();
      }

}
