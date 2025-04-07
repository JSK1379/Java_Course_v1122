import edu.fcps.karel2.Robot;
   import edu.fcps.karel2.Display;
    public class t2r1 extends Athlete implements Runnable
   {
       public t2r1()
      {
         super(1, 2, Display.EAST, 0);
      }
       public void run(){
         int[] cA = new int[10];
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
        for(int b=0;b<10;b++){
         cA[b]=0;
        }
        turnRight();
        move();
        turnRight();
        for(int a=0;a<10;a++){
         move();
        }
        turnAround();
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
        }
      } 
   }


