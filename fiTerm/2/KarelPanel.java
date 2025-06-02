import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class KarelPanel extends JPanel implements KeyListener {
    private static final int WIDTH = 395, HEIGHT = 391;     // 畫布大小
    private static final Color BACKGROUND = new Color(204, 204, 204);

    private int xPos, yPos, dir;                            // 位置與方向
    private final ImageIcon[] sprites;                      // 0=E,1=N,2=W,3=S
    private final BufferedImage offImg;
    private final Graphics offG;

    public KarelPanel() {
        offImg = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        offG   = offImg.getGraphics();

        sprites = new ImageIcon[] {
            new ImageIcon("karele.gif"),   // 東
            new ImageIcon("kareln.gif"),   // 北
            new ImageIcon("karelw.gif"),   // 西
            new ImageIcon("karels.gif")    // 南
        };

        dir  = 0;                                      // 面向東
        xPos = 5;
         yPos = 359;


        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);            // 接收鍵盤事件
        addKeyListener(this);          // 註冊監聽器
    }

    /* ---------- Swing 畫圖區 ---------- */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawScene(offG);                            // 更新 off-screen
        g.drawImage(offImg, 0, 0, getWidth(), getHeight(), null); // 雙緩衝
    }

    private void drawScene(Graphics g) {
        // 背景
        g.setColor(BACKGROUND);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // 紅色格線
        g.setColor(Color.RED);
        for (int x = 17; x < WIDTH; x += 30)  g.drawLine(x, 0, x, HEIGHT);
        for (int y =  9; y < HEIGHT; y += 28) g.drawLine(0, y, WIDTH, y);

        // 角色
        g.drawImage(sprites[dir].getImage(), xPos, yPos, null);
    }

    /* ---------- KeyListener 區 ---------- */
    @Override public void keyTyped(KeyEvent e) {}        // 不用
    @Override public void keyReleased(KeyEvent e) {}     // 不用

    @Override
    public void keyPressed(KeyEvent e) {
        int oldX = xPos, oldY = yPos;   // 記錄原本位置
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT: dir = 0; xPos += 30; break;
            case KeyEvent.VK_UP:    dir = 1; yPos -= 28; break;
            case KeyEvent.VK_LEFT:  dir = 2; xPos -= 30; break;
            case KeyEvent.VK_DOWN:  dir = 3; yPos += 28; break;
            case KeyEvent.VK_SPACE:
             dir = 0; // 重設朝向（東）
             xPos = 5;
            yPos = 359;
             System.out.println("🔄 位置已重設！");
             break;
            default: return; // 其他鍵忽略
        }

        // --- 邊界檢查 ---
        boolean hitEdge = false;
        if (xPos < 0)               { xPos = 0;                                         hitEdge = true; System.out.println("⚠ 已到達左邊界！");  }
        if (xPos + sprites[dir].getIconWidth()  > WIDTH)  { xPos = WIDTH - sprites[dir].getIconWidth();  hitEdge = true; System.out.println("⚠ 已到達右邊界！"); }
        if (yPos < 0)               { yPos = 0;                                         hitEdge = true; System.out.println("⚠ 已到達上邊界！");  }
        if (yPos + sprites[dir].getIconHeight() > HEIGHT){ yPos = HEIGHT - sprites[dir].getIconHeight(); hitEdge = true; System.out.println("⚠ 已到達下邊界！"); }

        // 如無超出但仍需重繪，或 hitEdge 也須重繪
        if (hitEdge || xPos != oldX || yPos != oldY) {
            repaint();
        }
    }

    /* ---------- 測試主程式 ---------- */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Karel Keyboard Demo");
            f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            f.add(new KarelPanel());
            f.pack();
            f.setResizable(false);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });
    }
}
