import edu.fcps.Bucket;
import javax.swing.JFrame;
public class Driver04b
{

   public static void main(String[] args){
   
      JFrame frame = new JFrame("Lab04b");
      frame.setSize(600,400);
      frame.setLocation(100,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new BucketPanel());
      frame.setVisible(true);
      Bucket.setSpeed(10);
      Bucket.useTotal(true);
      Bucket f =new Bucket(5);
      Bucket fo =new Bucket(4);
      Bucket t =new Bucket(3);
      //3 4 9 12
      f.fill();//500          5
      f.pourInto(fo);//140
      fo.spill();//100        1
      t.fill();//103          4
      fo.fill();//143         8
      t.pourInto(f);//440
      t.fill();//443          11
      fo.spill();//403        7
      t.pourInto(f);//502     
      f.spill();//002         2
      fo.fill();//042
      fo.pourInto(f);//402 
      fo.fill();//442         10
      f.spill();//042         6
      f.fill();//542
      fo.pourInto(f);//532 
      
      
    }
}