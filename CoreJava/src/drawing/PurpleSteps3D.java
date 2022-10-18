package drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void drawImage(Graphics graphics){
        int x = 5;
        int y = 5;
        int size = 10;

        for (int i = 0; i < 5; i++) {
            graphics.setColor(new Color(150, 20, 250));
            graphics.fillRect(x, y, size, size);
            graphics.setColor(new Color(0, 0, 0));
            graphics.drawRect(x, y, size, size);
            x+=size;
            y+=size;
            size*=2;
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}