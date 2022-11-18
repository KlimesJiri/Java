package oop.inheritance.garden;

public class Flower extends Plant{

    private double waterLevel;

    Flower(String color) {
        super(color);
    }

    @Override
    boolean needsWater() {
        if (waterLevel < 5){
            return true;
        }
        return false;
    }

    @Override
    void watering(int receivedWater){
        waterLevel += receivedWater * 0.75;
    }

}
