package drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void drawImage(Graphics graphics) {
        // Draw a box that has different colored lines on each edge
        graphics.setColor(new Color(200,0,0, 255));
        graphics.drawLine(20, 20, 20, 120);
        graphics.setColor(new Color(0, 200, 67, 255));
        graphics.drawLine(120, 20, 120, 120);
        graphics.setColor(new Color(0, 57, 200, 255));
        graphics.drawLine(20, 20, 120, 20);
        graphics.setColor(new Color(200, 0, 107, 255));
        graphics.drawLine(20, 120, 120, 120);

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