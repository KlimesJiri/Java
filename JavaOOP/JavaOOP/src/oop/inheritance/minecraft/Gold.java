package oop.inheritance.minecraft;

import java.util.Arrays;

public class Gold extends Block{

    public Gold(int lightTransmission) {
        super("gold", "gold", lightTransmission, false, Arrays.asList("glowstone", "glass"));
    }
}
