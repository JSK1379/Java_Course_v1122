	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class TwistyTurtle extends Turtle
   {
      private double mySize;
      private Color myColor;
      public TwistyTurtle(int m)
      {
         super();
         mySize = 30.0;
         drawmode = m;
      }
      
      public TwistyTurtle(double size, int m)
      {
         super();
         mySize = size;
         drawmode = m;
      }
      
      public TwistyTurtle(double x, double y, double heading, int m)
      {
         super(x,y,heading);
         mySize = 30.0;
         drawmode = m;
      }
      
      public TwistyTurtle(double x, double y, double heading, double size,int m)
      {
         super(x,y,heading);
         mySize = size;
         drawmode = m;
      }
      
      public void setSize(double size){
         
         mySize = size;
      }
      
      public void drawShape()
      {
         switch(m){
            case 1:
               super.setColor(Color.orange);
               rotatetriangle();
               break;
            case 2:
               super.setColor(Color.black);
               rotatet();
               break;
            case 3:
               super.setColor(Color.red);
               rotatesquare();
               break;
            case 4:
               super.setColor(Color.yellow);
               octagon();
               break;
         
         }
      }
   }