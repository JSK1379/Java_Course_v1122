import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;


public class Lab10extra {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // Maps: maze1r, maze2r, maze3r, maze9, maze10, maze11         //maze for chosen
      
      String filename = JOptionPane.showInputDialog("What robot world?");        //choose the map
      
      Display.openWorld("../../../asset/extra_hw/Lab10_extra/maps/"+filename+".map");        //return to Java_Course_v1122 and enter the file to get maps
		Display.setSize(10,10);       //set mapSize
      Display.setSpeed(10);         //set robotSpeed

		Athlete k = new Athlete(1,1,Display.NORTH,Display.INFINITY);         //create robot
      
      while(!k.nextToABeeper()){       // make conditionals if robot get to the end point or not
         if(k.rightIsClear()){         // make conditionals if right side can pass or not
            k.turnRight();       //robot trunRight
         }
         if(k.frontIsClear()){         //make conditionals if front can pass or not 
            k.move();         //robot move
         }
         if(!k.frontIsClear()&&!k.rightIsClear()){       //if there's no way to turnright or move
            k.turnLeft();        //robot trunLeft
         }
      }
   }

}