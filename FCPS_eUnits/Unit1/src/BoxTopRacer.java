import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

   public class BoxTopRacer extends Racer
       {
        public BoxTopRacer(int y) 
         {
            super(y);
         }
       @Override
       public void jumpRight()
        {
           turnLeft();
           while(!rightIsClear()){
            move();
           }
           turnRight();
           move();
           while(!rightIsClear()){
            move();
           }
           turnRight();
           move();
           while(frontIsClear()){
            move();
           }
           turnLeft();
         }
   	}