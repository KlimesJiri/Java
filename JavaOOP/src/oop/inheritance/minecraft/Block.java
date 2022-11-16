package oop.inheritance.minecraft;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Block {

    private String type;
    private String color;
    private int lightTransmission;
    private boolean canBeCrossed;
    private List<String> adjacentTo;
    private Map<String, Block> transformations;
    private Block previousBlock;

    public Block(String type, String color, int lightTransmission, boolean canBeCrossed, List<String> adjacentTo) {
        this.type = type;
        this.color = color;
        this.lightTransmission = lightTransmission;
        this.canBeCrossed = canBeCrossed;
        this.adjacentTo = adjacentTo;
        transformations = new HashMap<>();
    }

    boolean canPlaceAfter(Block block){
        if (adjacentTo.contains(block.type)){
            return true;
        }
        return false;
    }

    int getTransmission(){
        return lightTransmission;
    }

    void printStatus(){
        System.out.println("Block of type: " + type);
        System.out.println("Has light transmission: " + getTransmission());
        if (canBeCrossed){
            System.out.println("Can be crossed.");
            return;
        }
        System.out.println("Can not be crossed.");
    }

    public String getType() {
        return type;
    }

    public List<String> getAdjacentTo() {
        return adjacentTo;
    }

    public Map<String, Block> getTransformations() {
        return transformations;
    }

    public void setMadeTransformation() {
    }

    void getPrevious(Block block){
        previousBlock = block;
    }
}
