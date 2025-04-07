   import edu.fcps.karel2.Display;
    public class t2
   {
       public static void main(String[] args) 
      {
      
         Display.openWorld("../maps/t2.map");
         Display.setSize(20, 20);
         Display.setSpeed(10);
         
         
         t2r1 a = new t2r1();
         t2r2 b = new t2r2();
         new Thread(a).start();
         new Thread(b).start();
      }
   }