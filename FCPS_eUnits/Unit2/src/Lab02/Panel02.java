import javax.swing.*;
import java.awt.*;

public class Panel02 extends JPanel{
   
   public void paintComponent(Graphics g){
      g.setColor(Color.RED);
      g.fillRect(0,0,400,400);
      
      int x =100;
      int y =75;
      int R =20;
      g.setColor(Color.YELLOW);
      g.fillOval(x,y,R,R);
      for(int i =0;i<9;i++){
         if(y==75||y==255){
            for(int j=0;j<7;j++){
               if(y==75){
                  x+=20;
               }
               if(y==255){
                  x-=20;
               }
               g.fillOval(x,y,R,R);
            }
         }
         if(x==240){
            y+=20;
            if(y==255){
               i=0;
            }
         }
         if(x==100){
            y-=20;
         }
         g.fillOval(x,y,R,R);
      }
      g.fillRect(110,85,140,180);
      
      ImageIcon thomas = new ImageIcon("tj.jpg");
      g.drawImage(thomas.getImage(),115,95,null);
      g.setColor(Color.WHITE);
      g.setFont(new Font("ScanSerif",Font.ITALIC, 30));
      g.drawString("Our Fearless Leader",70,320);
      
   }
}