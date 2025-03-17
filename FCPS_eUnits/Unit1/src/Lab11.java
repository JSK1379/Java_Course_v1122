import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      
      Display.openDefaultWorld();
		Display.setSize(36,32);
      Display.setSpeed(10);
      
      Zero z = new Zero(1,18);
      z.display();
      new One(7,18).display();
      new Two(13,18).display();
      new Three(19,18).display();
      new Four(25,18).display();
      new Five(31,18).display();
      new Six(1,9).display();
      new Seven(7,9).display();
      new Eight(13,9).display();
      new Nine(19,9).display();
   }

}
