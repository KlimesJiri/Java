package oop.inheritance.minecraft;

import java.util.Arrays;

public class Window extends Block{

    private int quality;
    private String producerName;

    public Window(int quality, String producerName, String color, int lightTransmission, boolean canBeCrossed) {
        super("window", color, lightTransmission, canBeCrossed, Arrays.asList("mud", "brick", "air", "door", "glowstone"));
        this.quality = quality;
        this.producerName = producerName;
    }

    @Override
    void printStatus() {
        super.printStatus();
        System.out.println("Manufactured by " + producerName + " on a quality level " + quality);
    }
}
