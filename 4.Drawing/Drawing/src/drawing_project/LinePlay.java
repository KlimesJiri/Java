package drawing_project;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics){
        // draw a red horizontal line to the center of the canvas
        // draw a green vertical line to the center of the canvas
        graphics.setColor(Color.RED);
        for (int i = 50; i < WIDTH; i += WIDTH/20) {
            graphics.drawLine(i, 5, WIDTH - 5, i - 45);
        }
        graphics.setColor(Color.GREEN);
        for (int i = 50; i < HEIGHT; i += HEIGHT/20) {
            graphics.drawLine(5, i, i - 45, HEIGHT - 5);
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