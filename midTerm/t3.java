   import edu.fcps.karel2.Display;
    public class t3
   {
       public static void main(String[] args) 
      {
      
         Display.openWorld("../maps/t3.map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
         
         t3r a = new t3r(2,10);
         a.run();
      }
   }