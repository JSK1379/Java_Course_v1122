import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class HillClimber extends Climber{
    public HillClimber()
    {
        super();
    }
    
    public HillClimber(int x)
    {
	    super(x, 1, Display.NORTH, 1);
	 }
	 public void climbUpRight() 
	 {
       turnLeft();
	    move();
       move();
       turnRight();
	    move();
    }
    public void climbUpLeft() 
	 {
       turnRight();
	    move();
       move();
       turnLeft();
	    move();
    }
    public void climbDownRight() 
	 {
       move();
       turnRight();
	    move();
       move();
       turnLeft();
    }
    public void climbDownLeft() 
	 {
       move();
       turnLeft();
	    move();
       move();
       turnRight();
     }
}