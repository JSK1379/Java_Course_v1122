import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public class t2r2 extends Athlete implements Runnable
   {
       public t2r2()
      {
         super(8, 8, Display.SOUTH, 0);
      }
       public void run(){
         for(int i=0;i<4;i++){
            move();
            move();
            turnRight();
         }
         
      } 
   }