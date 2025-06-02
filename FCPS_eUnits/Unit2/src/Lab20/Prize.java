import java.awt.*;

public class Prize extends Spot
{
   public Prize()
   {
      super();
   }
   public Prize(int x, int y, int d)
   {
      setX(x);
      setY(y);
      setDiameter(d);
      setColor(Color.RED);
   }
   
   public void lightUp()
   {
      setColor(Color.YELLOW);
   }
}