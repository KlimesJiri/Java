package oop.inheritance.minecraft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ice extends Block{

    private boolean madeTransformation = false;
    private Map<String, Block> transformations;

    public Ice() {
        super("ice", "transparent", 97, false, Arrays.asList("mud", "brick", "glass", "lava", "air", "glowstone"));
        Block glass = new Glass();
        transformations = new HashMap<>(Map.of("lava", glass));
    }

    @Override
    void printStatus() {
        super.printStatus();
        if (madeTransformation){
            System.out.println("Has transformed a block of type lava to glass");
            return;
        }
        System.out.println("Made no transformation.");
    }

    public Map<String, Block> getTransformations() {
        return transformations;
    }

    @Override
    public void setMadeTransformation() {
        madeTransformation = true;
    }
}
