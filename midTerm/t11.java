import edu.fcps.Digit;

public abstract class t11 extends Digit implements Runnable{

   public t11(int x, int y){
      super(x,y);
   }
   public abstract void display();
   public  void run(){
        display(); 
   }
   
}