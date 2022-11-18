package drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void drawImage(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern
        int x = 0;
        int y = 0;
        int size = WIDTH/10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                graphics.fillRect(x, y, size, size);
                x += 2*WIDTH/10;
            }
            if (i % 2 != 0){
                x = 0;
            } else {
                x = WIDTH/10;
            }
            y += WIDTH/10;
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