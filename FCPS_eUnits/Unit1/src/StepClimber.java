import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class StepClimber extends Climber{
    public StepClimber()
    {
    }
    
    public StepClimber(int x)
    {
	    super(x);
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