	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver09
   {
      public static void main(String[] args)
      {
      
      	/************************/
         JFrame frame = new JFrame("Polygun Turtles");
         frame.setSize(400, 400);
         frame.setLocation(300, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.white);
         
      	TwistyTurtle a = new TwistyTurtle(1);
         TwistyTurtle b = new TwistyTurtle(250,42,Color.yellow);
         TwistyTurtle c = new TwistyTurtle(400,42,Color.blue);
         a.drawShape();
         b.drawShape();
         c.drawShape();
      	/************************/
      
      }
   }