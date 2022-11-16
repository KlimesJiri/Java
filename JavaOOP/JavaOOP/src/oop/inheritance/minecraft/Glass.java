package oop.inheritance.minecraft;

import java.util.Arrays;

public class Glass extends Block{

    public Glass(String color, int lightTransmission) {
        super("glass", color, lightTransmission, false, Arrays.asList("mud", "brick", "ice", "air", "glowstone", "door"));
    }

    public Glass(String color) {
        super("glass", color, 99, false, Arrays.asList("mud", "brick", "ice", "air", "glowstone", "door"));
    }

    public Glass(int lightTransmission) {
        super("glass", "transparent", lightTransmission, false, Arrays.asList("mud", "brick", "ice", "air", "glowstone", "door"));
    }

    public Glass(){
        this("transparent", 99);
    }
}
