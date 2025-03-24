public class Republican extends MazeEscaper   
   {
      public void walkDownCurrentSegment()
      {
         if(!rightIsClear() && frontIsClear()){
            move();
         }
      }
      
      public void turnToTheNextSegment(){
         if(rightIsClear()){
            turnRight();
         }
         else{
            turnLeft();
         }
      }
   }