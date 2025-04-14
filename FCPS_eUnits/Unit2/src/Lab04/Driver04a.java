import edu.fcps.Bucket;
import javax.swing.JFrame;
public class Driver04a
{

   public static void main(String[] args){
   
      JFrame frame = new JFrame("Lab04a");
      frame.setSize(600,400);
      frame.setLocation(100,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      Bucket.setSpeed(10);
      Bucket.useTotal(true);
      Bucket f =new Bucket(5);
      Bucket t =new Bucket(3);
      
      f.fill();//50
      f.pourInto(t);//23
      t.spill();//20
      f.pourInto(t);//02
      f.fill();//52
      f.pourInto(t);//43
      t.spill();//40
      f.pourInto(t);//13
      t.spill();//10
    }
}