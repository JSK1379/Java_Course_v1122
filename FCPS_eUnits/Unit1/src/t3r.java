   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class t3r extends Athlete
   {
      public t3r(int x, int y)
      {
         super(x, y, Display.EAST, Display.INFINITY);
      }
      
      public void run(){
         for(int i=0;i<5;++i){
            while(frontIsClear()){
               if(!nextToABeeper()){
                  putBeeper();
               }
               move();
            }
            putBeeper();
            turnAround();
            while(!leftIsClear()){
               move();
            }
            turnLeft();
            move();
            if(leftIsClear()){
               turnLeft();
               while(frontIsClear()){
                  move();
               }
               turnAround();
            }
            else{
               turnRight();
            }
            
            while(frontIsClear()){
               if(!nextToABeeper()){
                  putBeeper();
               }
               move();
            }
            putBeeper();
            turnAround();
            if(i<4){
               while(!rightIsClear()){
                  move();
               }
               turnRight();
               move();
               if(rightIsClear()){
                  turnRight();
                  while(frontIsClear()){
                     move();
                  }
                  turnAround();
               }
               else{
                  turnLeft();
               }
            }
         }
         
         
         
         for(int i=0;i<5;++i){
            while(frontIsClear()){
               if(nextToABeeper()){
                  pickBeeper();
               }
               move();
            }
            pickBeeper();
            turnAround();
            while(!rightIsClear()){
               move();
            }
            turnRight();
            move();
            if(rightIsClear()){
               turnRight();
               while(frontIsClear()){
                  move();
               }
               turnAround();
            }
            else{
               turnLeft();
            }
            
            while(frontIsClear()){
               if(nextToABeeper()){
                  pickBeeper();
               }
               move();
            }
            pickBeeper();
            turnAround();
            if(i<4){
               while(!leftIsClear()){
                  move();
               }
               turnLeft();
               move();
               if(leftIsClear()){
                  turnLeft();
                  while(frontIsClear()){
                     move();
                  }
                  turnAround();
               }
               else{
                  turnRight();
               }
            }
         }
      }
   }