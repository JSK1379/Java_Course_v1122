   import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public abstract class BackAndForthDancer extends Dancer  {
       public BackAndForthDancer (int x, int y, int dir, int beep)
      {
         super(x, y, dir, beep);
      }
       public BackAndForthDancer()
      {

      }
       public void danceStep(){
         move();
         turnAround();
         move();
         turnAround();
       }
   }