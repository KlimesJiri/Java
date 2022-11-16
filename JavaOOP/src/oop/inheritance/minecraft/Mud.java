package oop.inheritance.minecraft;

import java.util.Arrays;

public class Mud extends Block{

    public Mud() {
        super("mud","dark grey", 0, false, Arrays.asList("brick", "air", "lava", "door", "window", "gold"));
    }

}
