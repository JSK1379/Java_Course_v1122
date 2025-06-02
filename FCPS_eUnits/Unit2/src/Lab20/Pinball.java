//Name:              Date:
import java.awt.*;
public class Pinball extends Spot
{
   private int dx, dy;
   private int rightEdge, leftEdge;
   // constructors
   public Pinball()         //default constructor
   {
      super();
      dx = (int)(Math.random() * 12 + 2);          // to move vertically
      dy = (int)(Math.random() * 12 + 2);          // to move sideways
   }
   public Pinball(int x, int y, int dia, Color c)
   {
      super(x, y, dia, c);
      dx = (int)(Math.random() * 12 + 2);          // to move vertically
      dy = (int)(Math.random() * 12 + 2);
   }
   
  //modifier methods 
   public void setdx(int x)        
   {
      dx = x;
   }
   public void setdy(int y)
   {
      dy = y;
   }
   
   //accessor methods
   public double getdx()             
   {
      return dx;
   }
   public double getdy()
   {
      return dy;
   }
   
  //instance methods
   public void setBound(int right, int bottomEdge)
   {
      rightEdge = right;
      leftEdge = bottomEdge;
   }
   
   public int littlerandom()
   {
      return (int)(Math.random()* 2 + 1);
   }
   
   public void tick()
   {
      if(getX() >= rightEdge - getRadius())
      {
         setX(rightEdge - getRadius());
         dx = (dx + littlerandom()) * -1;
      }
      if(getX() <= getRadius())
      {
         setX(getRadius());
         dx = (dx + littlerandom()) * -1;
      }
      if(getY() >= leftEdge - getRadius())
      {
         setY(leftEdge - getRadius());
         dy = (dy + littlerandom()) * -1;
      }
      if(getY() <= getRadius())
      {
         setY(getRadius());
         dy = (dy + littlerandom()) * -1;
      }
      setX(getX() + dx);
      setY(getY() + dy);
   }
}