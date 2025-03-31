import javax.swing.*;
import java.awt.*;

public class Panel02 extends JPanel{
   
   public void paintComponent(Graphics g){
      g.setColor(Color.RED);
      g.fillRect(0,0,400,400);
      ImageIcon thomas = new ImageIcon("tj.jpg");
      g.drawImage(thomas.getImage(),50,50,null);
//      g.drawImage(thomas.getImage(),50,50,25,75,null);
      
      
   }
}