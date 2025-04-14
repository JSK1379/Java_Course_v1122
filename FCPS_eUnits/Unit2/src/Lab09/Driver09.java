	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver09
   {
      public static void main(String[] args)
      {
      
         JFrame frame = new JFrame("Turtles");
         frame.setSize(400, 400);
         frame.setLocation(300, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.white);
         
      	TwistyTurtle a = new TwistyTurtle(1);
         TwistyTurtle b = new TwistyTurtle(100,250,90,2);
         TwistyTurtle c = new TwistyTurtle(500,350,90,3);
         Thread t1 = new Thread(a);
         Thread t2 = new Thread(b);
         Thread t3 = new Thread(c);
         t1.start();
         t2.start();
         t3.start();
      }
   }