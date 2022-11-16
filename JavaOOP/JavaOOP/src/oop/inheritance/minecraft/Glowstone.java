package oop.inheritance.minecraft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Glowstone extends Block{

    private boolean madeTransformation = false;
    private Map<String, Block> transformations;


    public Glowstone() {
        super("glowstone", "white", 300, false, Arrays.asList("glass", "air", "ice", "lava"));
        Block gold = new Gold(160);
        transformations = new HashMap<>(Map.of("glass", gold));
    }

    @Override
    void printStatus() {
        super.printStatus();
        if (!madeTransformation){
            System.out.println("Made no transformation.");
        } else {
            System.out.println("Has transformed a block of type glass to gold");
        }
    }

    public Map<String, Block> getTransformations() {
        return transformations;
    }

    @Override
    public void setMadeTransformation() {
        madeTransformation = true;
    }
}
