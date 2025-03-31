import javax.swing.*;
import java.awt.*;

public class Panel01 extends JPanel{
   
   public void paintComponent(Graphics g){
      
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect(75,50,300,125);
      
//      g.setColor(Color.GREEN.darker());
//      g.drawline();
      
      g.setColor(Color.RED);
      g.drawRect(100,200,150,150);
      
      g.setColor(Color.BLACK);
      g.fillRect(150,275,50,75);
      
      int x[] = {75,175,275};
      int y[] = {200,150,200};
      g.drawPolygon(x,y,3);
      
      g.setColor(Color.YELLOW);
      g.fillOval(300,75,50,50);
      
      g.setColor(Color.WHITE);
      g.drawString("Welcome Home",40,40);
   }
}