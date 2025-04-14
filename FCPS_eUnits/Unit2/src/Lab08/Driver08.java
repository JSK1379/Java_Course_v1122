	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
   public class Driver08
   {
      public static void main(String[] args)
      {
      
      	/************************/
         JFrame frame = new JFrame("Flower Turtles");
         frame.setSize(700, 700);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
         Turtle.clear(Color.white);
         
      	FlowerTurtle a = new FlowerTurtle(100,42,Color.red);
         FlowerTurtle b = new FlowerTurtle(250,42,Color.yellow);
         FlowerTurtle c = new FlowerTurtle(400,42,Color.blue);
         FlowerTurtle d = new FlowerTurtle(550,42,Color.black);
         a.drawShape();
         b.drawShape();
         c.drawShape();
         d.drawShape();
      	/************************/
      
      }
   }