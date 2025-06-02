import javax.swing.*;
import java.awt.*;

public class TaiwanFlag12StarPolygon extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int flagWidth = getWidth();
        int flagHeight = getHeight();
        double unit = flagWidth / 90.0;

        // 畫紅底
        g.setColor(Color.RED);
        g.fillRect(0, 0, flagWidth, flagHeight);

        // 畫藍底 (左上 30×30)
        int blueW = (int)(44 * unit);
        int blueH = (int)(28 * unit);
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, blueW, blueH);

        // 旗中心點（藍地）
        int cx = (int)(22 * unit);
        int cy = (int)(14 * unit);
        int radius = (int)(11.25 * unit); // 外圓半徑

        // 建立正十二邊星型（{12/5}）
        Polygon star = new Polygon();
        for (int i = 0; i < 12; i++) {
            // 每隔 5 點連一次線 → {12/5}
            int targetIndex = (i * 5) % 12;
            double angle = 2 * Math.PI * targetIndex / 12;
            int x = cx + (int)(Math.cos(angle) * radius);
            int y = cy + (int)(Math.sin(angle) * radius);
            star.addPoint(x, y);
        }

        // 畫出星形
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawPolygon(star);
        g2.fillPolygon(star);
        
        g2.setColor(Color.BLUE);
        int centerR = (int)(6.5 * unit);
        g2.fillOval(cx - centerR, cy - centerR, centerR * 2, centerR * 2);
        g2.setColor(Color.WHITE);
        int centerRw = (int)(5.5 * unit);
        g2.fillOval(cx - centerRw, cy - centerRw, centerRw * 2, centerRw * 2);
        
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("台灣國旗（正十二邊星型國徽）");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600); // 90x60 比例
        frame.setContentPane(new TaiwanFlag12StarPolygon());
        frame.setVisible(true);
    }
}