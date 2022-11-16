package oop.inheritance.minecraft;

import java.util.Arrays;

public class Air extends Block{

    public Air() {
        super("air", "transparent", 100, true, Arrays.asList("mud", "brick", "glass", "door", "window", "gold"));
    }


}
