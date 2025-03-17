import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      
		Display.setSize(15,15);
      Display.setSpeed(10);

		Dancer a = new BackAndForthDancer(2,5,Display.NORTH,0);
      Dancer a1 = new SquareDancer(5,5,Display.NORTH,0);
      Dancer a2 = new SquareDancer_Larger(7,4,Display.NORTH,0);
      
      new Thread(a).start();
      new Thread(a1).start();
      new Thread(a2).start();
   }

}