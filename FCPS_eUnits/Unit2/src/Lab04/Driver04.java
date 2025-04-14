import edu.fcps.Bucket;
import javax.swing.JFrame;
public class Driver04
{

   public static void main(String[] args){
   
      JFrame frame = new JFrame("Lab04");
      frame.setSize(600,400);
      frame.setLocation(100,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      Bucket.setSpeed(10);
      Bucket.useTotal(false);
      Bucket f =new Bucket(5);
      Bucket t =new Bucket(3);
      
      f.fill();
      f.pourInto(t);
      t.spill();
      f.pourInto(t);
      f.fill();
      f.pourInto(t);
      
    }
}