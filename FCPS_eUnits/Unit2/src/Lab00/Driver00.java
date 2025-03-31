import javax.swing.JFrame;

public class Driver00
{

   public static void main(String[] args){
   
      JFrame frame = new frame("Lab00");
      frame.setSize(400,225);
      frame.setLocation(100,50);
      frame.setDefault(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new Panel00());
      frame.setVisible(true);
    }
}