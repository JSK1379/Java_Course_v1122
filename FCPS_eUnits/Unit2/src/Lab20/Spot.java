// Billington.  email: mlbillington@fcps.edu
// version: 7.25.2007
// updated by Phil Ero 16NOV07

   import java.awt.*;
   
   public class Spot
   {
      private int myX;   // x and y coordinates of center
      private int myY;
      private int myDiameter;
      private Color myColor; 
      private int myRadius;
     // constructors
      public Spot()     //default constructor
      {
         myX = 200;
         myY = 200;
         myDiameter = 25;
         myColor = Color.RED;
         myRadius = myDiameter/2;
      }
      public Spot(int x, int y, int d, Color c)
      {
         myX = x;
         myY = y;
         myDiameter = d;
         myColor = c;
         myRadius = d/2;
      }
    // accessor methods
      public int getX() 
      { 
         return myX;
      }
      public int getY()      
      { 
         return myY;
      }
      public int getDiameter() 
      { 
         return myDiameter;
      }
      public Color getColor() 
      { 
         return myColor;
      }
      public int getRadius() 
      { 
         return myRadius;
      }
   // modifier methods
      public void setX(int x)
      {
         myX = x;
      } 
      public void setY(int y)
      {
         myY = y;
      } 
      public void setColor(Color c)
      {
         myColor = c;
      }
      public void setDiameter(int d)
      {
         myDiameter = d;
         myRadius = d/2;
      }
      public void setRadius(int r)
      {
         myRadius = r;
         myDiameter = 2*r;
      }
    //	 instance methods
      public boolean intersect(Spot s)
      {
         if(distance(myX, myY, s.getX(), s.getY()) <= (myRadius + s.getRadius()))
         {
            return true;
         }
         else
         {
            return false;
         }
      }
      
      public void drawme(Graphics myBuffer) 
      {
         myBuffer.setColor(myColor);
         myBuffer.fillOval((int)(getX() - getRadius()), (int)(getY()-getRadius()), (int)getDiameter(), (int)getDiameter());
      }
      
      private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
      }
   }