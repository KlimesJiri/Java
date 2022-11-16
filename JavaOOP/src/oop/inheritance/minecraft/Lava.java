package oop.inheritance.minecraft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lava extends Block{

    private boolean madeTransformation;
    private Map<String, Block> transformations;
    private Block previousBlock;

    public Lava() {
        super("lava", "yellow", 170, false, Arrays.asList("mud", "brick", "glass", "ice", "air", "glowstone"));
        madeTransformation = false;
        Block brick = new Brick();
        Block air = new Air();
        transformations = new HashMap<>(Map.of("mud", brick, "ice", air));
    }

    @Override
    void printStatus() {
        super.printStatus();
        if (!madeTransformation){
            System.out.println("Made no transformation.");
            return;
        }
        // THIS IS REALLY STUPID SOLUTION, I KNOW, BUT I WAS ALMOST DONE WITH THE ENTIRE THING WHEN I FOUND OUT THAT LAVA IS PROBLEMATIC FOR MY IMPLEMENTATION
        // I AM NOT REWRITING HALF MY PROGRAM TO FIX THAT XD, SO THIS SOLUTION IS GOING TO BE HARDCODED, IT WAS THE BEST I COULD FIGURE OUT, WITHOUT CHANGING TOO MUCH STUFF
        // THIS SOLUTION WOULD SCALE HORRIBLY WITH MORE BLOCKS, BUT AT THIS POINT IT DOESN'T MATTER
        if (previousBlock.getType().equals("mud")){
            System.out.println("Has transformed a block of type mud to brick");
            return;
        }
        if (previousBlock.getType().equals("ice")){
            System.out.println("Has transformed a block of type ice to air");
        }
    }

    void getPrevious(Block block){
        previousBlock = block;
    }


    public Map<String, Block> getTransformations() {
        return transformations;
    }

    public boolean isMadeTransformation() {
        return madeTransformation;
    }

    public void setMadeTransformation(boolean madeTransformation) {
        this.madeTransformation = madeTransformation;
    }
}
