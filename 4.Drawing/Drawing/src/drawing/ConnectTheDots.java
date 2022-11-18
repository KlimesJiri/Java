package drawing;

import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // an array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] box = {{10,10},
                        {290,10},
                        {290,290},
                        {10,290}};

        int[][] points = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

//        connect(box, graphics);
//        connect(points, graphics);

        connect2(box, graphics);
        connect2(points, graphics);
    }

    private static void connect(int[][] arr, Graphics graphics){
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                graphics.drawLine(arr[i][0],arr[i][1],arr[0][0], arr[0][1]);
            } else {
                graphics.drawLine(arr[i][0],arr[i][1],arr[i+1][0], arr[i+1][1]);
            }
        }
    }

    public static void connect2(int[][] points, Graphics graphics) {
        int[] xPoints = new int[points.length];
        int[] yPoints = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            xPoints[i] = points[i][0];
            yPoints[i] = points[i][1];
        }
        graphics.drawPolygon(xPoints, yPoints, points.length);

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