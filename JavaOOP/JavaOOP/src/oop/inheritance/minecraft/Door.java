package oop.inheritance.minecraft;

import java.util.Arrays;

public class Door extends Block{

    private int quality;
    private String producerName;

    public Door(int quality, String producerName, String color, int lightTransmission) {
        super("door", color, lightTransmission, true, Arrays.asList("mud", "brick", "glass", "ice", "air", "glowstone"));
        this.quality = quality;
        this.producerName = producerName;
    }

    @Override
    void printStatus() {
        super.printStatus();
        System.out.println("Manufactured by " + producerName + " on a quality level " + quality);
    }

}
