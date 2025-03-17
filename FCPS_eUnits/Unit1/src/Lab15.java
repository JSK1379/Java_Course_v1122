import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      
      Display.openWorld("../maps/maze2.map");
		Display.setSize(10,10);
      Display.setSpeed(10);

		Athlete k = new Athlete(1,1,Display.NORTH,Display.INFINITY);
      
      while(!k.nextToABeeper()){
         if(k.rightIsClear()){
            k.turnRight();
         }
         if(k.frontIsClear()){
            k.move();
         }
         if(!k.frontIsClear()&&!k.rightIsClear()){
            k.turnLeft();
         }
      }
   }

}