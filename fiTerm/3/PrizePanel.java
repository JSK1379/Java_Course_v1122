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
      private boolean dragging = false;
      private Timer t; 
      private boolean showYellowBox = false;
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
         ball = new Ball(xPos, yPos, 20, Color.BLACK);
         pd = new Polkadot(xDot, yDot, 50, Color.RED);
         
         addMouseListener(new Mouse());
         addMouseMotionListener(new Mouse()); 
         t = new Timer(5, new Listener());
         t.start();
      }
      
      private class Mouse extends MouseAdapter
      {
         public void mousePressed(MouseEvent e)
         {
               ball.setX( e.getX() );
               ball.setY( e.getY() );
               dragging = true;
               showYellowBox = true; 
               
               int mx = e.getX();
                int my = e.getY();
                double dex = mx - ball.getX();
                double dey = my - ball.getY();
                double distance = Math.sqrt(dex * dex + dey * dey);
            
                if (distance <= ball.getRadius()) {
                    dragging = true;
                    showYellowBox = true;
                    int dragStartX = mx;
                    int dragStartY = my;
                    ball.setX(mx);
                    ball.setY(my);
                    ball.setdx(0);
                    ball.setdy(0);
                }

         }
         public void mouseReleased(MouseEvent e){
            dragging = false;
            showYellowBox = false;
            
        // 計算從畫面中心 → 球的向量
              int centerX = FRAME / 2;
              int centerY = FRAME / 2;
      
              double dx = ball.getX() - centerX;
              double dy = ball.getY() - centerY;
      
              double distance = Math.sqrt(dx * dx + dy * dy);
              double maxPower = 10.0;     // 最大速度限制
              double powerFactor = 0.1;  // 調整這個比例來改變彈性強度
      
              // 正規化向量 + 加權
              double vx = dx / distance * distance * powerFactor;
              double vy = dy / distance * distance * powerFactor;
      
              // 限制最大速度
              vx = Math.max(Math.min(vx, maxPower), -maxPower);
              vy = Math.max(Math.min(vy, maxPower), -maxPower);
      
              // 反方向彈射
              ball.setVelocity(-vx, -vy);
         }
         public void mouseDragged(MouseEvent e){
            if (dragging){
               ball.setX( e.getX() );
               ball.setY( e.getY() );
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
            
            if (!dragging) {
               ball.move(FRAME, FRAME);  // 只有沒在拖曳時才自動移動
            }
            ball.draw(myBuffer);
            
            pd.draw(myBuffer);
            
            collide(ball, pd);
            myBuffer.setColor(Color.BLUE);
            myBuffer.drawString("Hits:" + score, 300, 50);
            if (showYellowBox) {
                myBuffer.setColor(Color.YELLOW);
                int diameter = 30;
                int centerX = FRAME / 2 - diameter / 2;
                int centerY = FRAME / 2 - diameter / 2;
                myBuffer.drawOval(centerX, centerY, diameter, diameter);  // ⭕ 畫圓形
                myBuffer.setColor(Color.RED);  // 線的顏色
               myBuffer.drawLine((int)ball.getX(), (int)ball.getY(), centerX+ diameter / 2, centerY+ diameter / 2);
            }
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