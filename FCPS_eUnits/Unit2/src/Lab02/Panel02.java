import javax.swing.*;
import java.awt.*;

public class Panel02 extends JPanel{
   
   public void paintComponent(Graphics g){
      g.setColor(Color.RED);
      g.fillRect(0,0,400,400);
      
      int x =100;
      int y =75;
      int r =10;
      
      g.fillOval(x,y,r*2,r*2);
      for(int i =1;i<10;i++){
         if(y==75||y==255){
            for(int j=1;j<8;j++){
               if(y==75){
                  x+=20;
               }
               if(y==255){
                  x-=20;
               }
               g.fillOval(x,y,r*2,r*2);
            }
         }
         if(x==240){
            y+=20;
            if(y==255){
               i=1;
            }
         }
         if(x==100){
            y-=20;
         }
         g.fillOval(x,y,r*2,r*2);
      }
//      g.fillRect(0,0,400,400);
      
      ImageIcon thomas = new ImageIcon("tj.jpg");
      g.drawImage(thomas.getImage(),115,95,null);
//      g.drawImage(thomas.getImage(),50,50,25,75,null);
      g.setColor(Color.WHITE);
      g.setFont(new Font("ScanSerif",Font.ITALIC, 30));
      g.drawString("Our Fearless Leader",70,320);
      
   }
}