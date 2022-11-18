package oop.inheritance.garden;

public class Tree extends Plant{

    private double waterLevel;

    Tree(String color) {
        super(color);
    }

    @Override
    boolean needsWater() {
        if (waterLevel < 10){
            return true;
        }
        return false;
    }

    @Override
    void watering(int receivedWater){
        waterLevel += receivedWater * 0.4;
    }

}
