import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public class t2r1 extends Athlete implements Runnable
   {
       public t2r1()
      {
         super(1, 2, Display.EAST, 0);
      }
       public void run(){
         int[] cA = new int[8];
         for(int i=0;i<cA.length;i++){
            while(nextToABeeper()){
               pickBeeper();
               cA[i]++;
            }
            if(i>0){
               for(int j=0;j<cA[i-1];j++){
                  putBeeper();
               }
            }
            move();
        }
        for(int i =0;i<8;i++){
         cA[i]=0;
        }
        turnRight();
        move();
        turnRight();
        
        
      } 
   }


