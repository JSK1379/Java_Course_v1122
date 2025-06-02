   //Torbert, e-mail: smtorbert@fcps.edu
	//version 6.17.2003

   import javax.swing.JFrame;
    public class Driver16
   {
       public static void main(String[] args)
      { 
         JFrame frame = new JFrame("Unit2, Lab16: Mouse");
         frame.setSize(408, 438);
         frame.setLocation(0, 0);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	frame.setContentPane(new PrizePanel());
         frame.setVisible(true);
      }
   }