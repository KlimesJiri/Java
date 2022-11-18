package drawing_project;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics){

        int line = 10;
        int xStart = 10;
        int yStart = HEIGHT-line;
        int trianInLine = WIDTH/line - 1;


        for (int i = 0; i < HEIGHT/line; i++) {
            for (int j = 0; j < trianInLine; j++) {
                graphics.drawLine(xStart,yStart,xStart + line,yStart);
                graphics.drawLine(xStart + line, yStart, xStart + line/2, yStart - line);
                graphics.drawLine(xStart, yStart,xStart + line/2, yStart - line);
                xStart += line;
            }
            trianInLine--;
            yStart -= line;
            xStart = 10 + (i+1) * line/2;
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