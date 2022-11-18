package oop.inheritance.minecraft;

import java.util.Arrays;

public class Brick extends Block{

//    public Brick() {
//        super("brick", "red", 0, false, Arrays.asList("mud", "glass", "air", "door", "window"));
//    }

    public Brick(String color) {
        super("brick", color, 0, false, Arrays.asList("mud", "glass", "air", "door", "window"));
    }

    public Brick(){
        this("brown");
    }
}
