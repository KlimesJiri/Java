package drawing;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color red = Color.RED;
        Color orange = Color.ORANGE;
        Color yellow = Color.YELLOW;
        Color green = Color.GREEN;
        Color blue = Color.BLUE;
        Color indigo = new Color(37, 0, 130);
        Color violet = new Color(143, 28, 246);

        Color[] colorPallete = {red, orange, yellow, green, blue, indigo, violet};

        for (int i = 0; i < colorPallete.length; i++) {
            square(50,colorPallete[i],graphics);
        }
    }

    private static void square(int size, Color colors, Graphics graphics){
        Random random = new Random();
        graphics.setColor(colors);
        graphics.drawRect(random.nextInt(WIDTH-size), random.nextInt(HEIGHT-size), size, size);
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