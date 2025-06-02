   //Name:    Date:
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private int score;
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Ball ball;
      private Polkadot pd;
      private Timer t; 
		//constructor   
      public PrizePanel()
      {
         myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
         myBuffer = myImage.getGraphics();
         myBuffer.setColor(BACKGROUND);
         myBuffer.setFont(new Font ("serif", Font.PLAIN, 20));
         myBuffer.fillRect(0, 0, FRAME,FRAME);
         int xPos = (int)(Math.random()*(FRAME-100) + 50);
         int yPos = (int)(Math.random()*(FRAME-100)+ 50);
         int xDot = (int)(Math.random()*(FRAME-40) + 20);
         int yDot = (int)(Math.random()*(FRAME-40) + 20);
         ball = new Ball(xPos, yPos, 50, Color.BLACK);
         pd = new Polkadot(xDot, yDot, 20, Color.RED);
         
         addMouseListener(new Mouse());
         t = new Timer(5, new Listener());
         t.start();
      }
      
      private class Mouse extends MouseAdapter
      {
         public void mousePressed(MouseEvent e)
         {
            if(e.isMetaDown())
            {
               ball.setX( e.getX() );
               ball.setY( e.getY() );
            }
            else if(e.isShiftDown())
            {
               ball.setdx(Math.random() * 12 - 6);
               ball.setdy(Math.random() * 12 - 6);
            }
            else
            {
              pd.setX( e.getX() );
              pd.setY( e.getY() );
            }
         }
      }

       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
       private class Listener implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0, 0, FRAME, FRAME);
            
            ball.move(FRAME, FRAME);
            ball.draw(myBuffer);
            
            pd.draw(myBuffer);
            
            collide(ball, pd);
            myBuffer.setColor(Color.BLUE);
            myBuffer.drawString("Hits:" + score, 300, 50);
            repaint();
         }
      }   
       private void collide(Ball b, Polkadot pd)
      {
        double d = distance(b.getX(), b.getY(), pd.getX(), pd.getY());  
		  if (d <= (b.getRadius() + pd.getRadius()))
        {
            score++;
            pd.jump(FRAME, FRAME);
            pd.draw(myBuffer);
        }
		}
       private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
      }
   }