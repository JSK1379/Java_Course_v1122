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
      
      t.fill();//03        3
      t.pourInto(f);//30
      t.fill();//33        6
      t.pourInto(f);//51
      f.spill();//01       1
      t.spill();//00
      f.fill();//50        5
      f.pourInto(t);//23
      t.spill();//20       2
      f.pourInto(t);//02
      f.fill();//52        7
      f.pourInto(t);//43
      t.spill();//40       4
      t.fill();//43
      f.fill();//53       8
    }
}