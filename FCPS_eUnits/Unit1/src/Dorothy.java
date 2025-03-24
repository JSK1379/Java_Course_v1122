   import edu.fcps.karel2.Display;
    public class Dorothy extends Athlete{
    
      public Dorothy(){
      
         super(2,2,Display.EAST,0);
      }
      
      public boolean findPath(){
         if(!nextToABeeper()){
            turnAround();
            move();
            turnRight();
            move();
         }
         if(!nextToABeeper()){
            turnAround();
         }
         if(!nextToABeeper()){
            return false;
         }
         return true;
      }
      public void followPath(){
         
         while(nextToABeeper() && frontIsClear()){
            move();
         }
      }
   }