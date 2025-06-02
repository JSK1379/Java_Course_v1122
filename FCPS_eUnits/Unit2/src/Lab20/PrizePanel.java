   //Name:    Date:
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class PrizePanel extends JPanel
   {
      private static final int FRAME = 400;
      private static final Color BACKGROUND = new Color(204, 204, 204);
      private int score, x, y, d;
      private BufferedImage myImage;
      private Graphics myBuffer;
      private Pinball ball;
      private Prize[] myParray;
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
         ball = new Pinball(xPos, yPos, 40, Color.BLACK);
         myParray = new Prize[500];
         for(int k=0; k<myParray.length; k++)
         {
           x = (int)(Math.random()*(FRAME-20));
           y = (int)(Math.random()*(FRAME-20));
           d = (int)(Math.random() * 30);
           myParray[k] = new Prize(x, y, d);
         } 
         ball.setBound(FRAME, FRAME);
        
         t = new Timer(5, new Listener());
         t.start();
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
            
            for(int i = 0;i < myParray.length; i++)
            {
               if(myParray[i].intersect(ball))
               {
                  myParray[i].lightUp();
               }
               myParray[i].drawme(myBuffer);
            }
            ball.tick();
            ball.drawme(myBuffer);
            //myBuffer.setColor(Color.BLUE);
            //myBuffer.drawString("Hits:" + score, 300, 50);
            repaint();
         }
      }   
      private double distance(double x1, double y1, double x2, double y2)
      {
         return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
      }
   }