public class Democrat extends MazeEscaper   
   {
      public void walkDownCurrentSegment()
      {
         if(!nextToABeeper()){
            if(!leftIsClear() && frontIsClear()){
               move();
            }
         }
      }
      
      public void turnToTheNextSegment(){
         if(leftIsClear()){
            turnLeft();
            move();
         }
         else{
            turnRight();
         }
      }
   }