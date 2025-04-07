import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class t1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      
      Display.openDefaultWorld();
		Display.setSize(36,32);
      Display.setSpeed(10);
      
      e e=new e(7,18);
      e e2 = new e(13,18);
      c c=new c(19,18);
      Five s= new Five(25,18);
      g g =new g(7,9);
      Two t=new Two(13,9);
      Nine n=new Nine(19,9);
      
         Thread t1 = new Thread( e );
         Thread t2 = new Thread( e2 );
         Thread t3 = new Thread( c );
         Thread t4 = new Thread( s );
         Thread t5 = new Thread( g );
         Thread t6 = new Thread( t );
         Thread t7 = new Thread( n );
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
         t6.start();
         t7.start();
   }

}