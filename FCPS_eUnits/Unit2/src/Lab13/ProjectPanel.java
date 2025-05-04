   //Name:    Date:
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class ProjectPanel extends JPanel
   {
      private static final ImageIcon Tomas = new ImageIcon("../Lab02/tj.jpg");
      private BufferedImage myImage;
      private Graphics2D myBuffer;
      private int x=250;
      private int y=180;
      private Timer t1,t2; 
		//constructor   
      
       public ProjectPanel()
      {
         x=50;
         myImage =  new BufferedImage(700, 400, BufferedImage.TYPE_INT_RGB);
         myBuffer =(Graphics2D) myImage.getGraphics();
         t1 = new Timer(120, new Listener1());
         t1.start();
         t2 = new Timer(3000, new Listener2());
         
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
         
      }
      private class Listener1 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
           int xp[] = {x,x,x+50,x,x-50,x,x,x-50,x,x+50};
           int yp[] = {y,y+50,y,y+50,y,y+50,y+100,y+150,y+100,y+150}; 
           myBuffer.setColor(Color.gray);    
           myBuffer.fillRect(0,0,700,350);   
           
           myBuffer.setColor(Color.darkGray);    
           myBuffer.fillRect(0,335,700,500); 
           
           myBuffer.drawImage(Tomas.getImage(),x-40,50,75,125,null);
           myBuffer.setStroke(new BasicStroke(10.0f));
           myBuffer.drawPolyline(xp,yp,10);
           repaint();
           
           x=x+5;
           if(x>=200){
            myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
            myBuffer.drawString("颱風天要帶多少錢在出門?",300,150);
            myBuffer.drawOval(250,80,400,100);
            repaint();
            t1.stop();
            t2.start();
           }
           
         }
      }   
      private class Listener2 implements ActionListener
      {
          public void actionPerformed(ActionEvent e)
         {
            t2.stop();
            myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
            myBuffer.drawString("4千萬 因為...",300,250);
            myBuffer.drawString("颱風天沒\"事千萬\"不要出門",330,280);
            myBuffer.drawOval(250,80,400,100);
            repaint();
         }
      }
   }