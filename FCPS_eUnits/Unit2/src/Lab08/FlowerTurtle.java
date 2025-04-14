	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class FlowerTurtle extends Turtle
   {
      private double mySize;
      private Color myColor;
      public FlowerTurtle()
      {
         mySize = 50.0;
         myColor = Color.RED;
      }
      public FlowerTurtle(double x, double n, Color c)
      {
         super(x, 300.0, 90.0);
         mySize = n;
         myColor = c;
      }
      public void setSize(double n)
      {
         mySize = n;
      }
      public void setColor(Color c)
      {
         myColor = c;
      }
      private void drawPetals() //starts and ends at center facing north
      {
      
         /************************/
      	super.setColor(myColor);
         double a=12;
         for(int i=0;i<30;i++){
            forward(mySize);
            turnLeft(180);
            forward(mySize);
            turnLeft(180);
            turnLeft(a);
         }   
         
         
      	/************************/
      
      }
      private void drawStem() //starts at top of stem facing south, ends at bottom
      {
      
         /************************/
      	setColor(Color.green);
         super.setColor(myColor);
         turnLeft(180);
         forward(mySize*3);
         turnLeft(180);
         forward(mySize/3);
         turnLeft(60);
         forward(mySize/2);
         turnLeft(180);
         forward(mySize/2);
         turnLeft(75);
         forward(mySize/1.2);
         turnLeft(180);
         forward(mySize/1.2);
      	/************************/
      
      }
      public void drawShape()
      {
         drawPetals();
         drawStem();
      }
   }