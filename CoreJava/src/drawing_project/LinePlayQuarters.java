package drawing_project;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void drawImage(Graphics graphics){

        drawLines4(graphics);
    }

    private static void drawLines4(Graphics graphics){
        graphics.setColor(Color.RED);
        for (int i = 0; i <= WIDTH/2; i += WIDTH/20) {
            graphics.drawLine(i, 0, WIDTH/2, i);
        }
        for (int i = 0; i <= WIDTH/2; i += WIDTH/20) {
            graphics.drawLine(WIDTH/2 + i, 0, WIDTH, i);
        }
        for (int i = 0; i <= WIDTH/2; i += WIDTH/20) {
            graphics.drawLine(i, HEIGHT/2, WIDTH/2, HEIGHT/2 + i);
        }
        for (int i = 0; i <= WIDTH/2; i += WIDTH/20) {
            graphics.drawLine(WIDTH/2 + i, HEIGHT/2, WIDTH, HEIGHT/2 + i);
        }

        graphics.setColor(Color.GREEN);
        for (int i = 0; i <= HEIGHT/2; i += HEIGHT/20) {
            graphics.drawLine(0, i, i, HEIGHT/2);
        }
        for (int i = 0; i <= HEIGHT/2; i += HEIGHT/20) {
            graphics.drawLine(WIDTH/2, i, WIDTH/2 + i, HEIGHT/2);
        }
        for (int i = 0; i <= HEIGHT/2; i += HEIGHT/20) {
            graphics.drawLine(0, HEIGHT/2 + i, i, HEIGHT);
        }
        for (int i = 0; i <= HEIGHT/2; i += HEIGHT/20) {
            graphics.drawLine(WIDTH/2, HEIGHT/2 + i,WIDTH/2 + i, HEIGHT);
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