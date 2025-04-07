   import edu.fcps.karel2.Display;
    public class t2
   {
       public static void main(String[] args) 
      {
      
         Display.openWorld("../maps/t2.map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
      
         Athlete Lisa = new Athlete(1,1,Display.EAST,0);
         int[] cA = new int[10];
         for(int i=0;i<cA.length;i++){
            while(Lisa.nextToABeeper()){
               Lisa.pickBeeper();
               cA[i]++;
            }
            if(i>0){
               for(int j=0;j<cA[i-1];j++){
                  Lisa.putBeeper();
               }
            }
            Lisa.move();
         }
      }
   }