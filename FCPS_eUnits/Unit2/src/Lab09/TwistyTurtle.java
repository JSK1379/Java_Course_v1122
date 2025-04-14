	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   public class TwistyTurtle extends Turtle implements Runnable
   {
      private double mySize;
      private Color myColor;
      private int drawmode;
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
      
      public TwistyTurtle(double x, double y, double h, int m)
      {
         super(x,y,h);
         mySize = 30.0;
         drawmode = m;
      }
      
      public TwistyTurtle(double x, double y, double h, double size,int m)
      {
         super(x,y,h);
         mySize = size;
         drawmode = m;
      }
      
      public void setSize(double size){
         
         mySize = size;
      }
      
      public void rotatetriangle(){
         for(int i=5;i<=400;i+=10){
            forward(i);
            turnLeft(123);
         }
      }
      
      public void rotatet(){
         for(int i=0;i<=150;i+=2){
            forward(i);
            turnLeft(30);
         }
      }
      
      public void rotatesquare(){
         for(int i=25;i<=150;i+=5){
            forward(i);
            turnLeft(45);
            forward(i);
            turnLeft(90);
            forward(i);
            turnLeft(90);
            forward(i);
            turnLeft(90);
         }
      }
      
      
      
      public void octagon(){
         for(int i=25;i<=150;i+=5){
            forward(i);
            turnLeft(123);
         }
      }
      
      public void drawShape()
      {
         switch(drawmode){
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
         }
      }
      
      
      public void run(){
         drawShape();
      
      }
   }