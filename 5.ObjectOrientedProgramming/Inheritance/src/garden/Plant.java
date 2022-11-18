package oop.inheritance.garden;

public class Plant {

    private String color;
    private double waterLevel;

    Plant(String color){
        waterLevel = 0;
        this.color = color;
    }

    boolean needsWater(){
        return false;
    }

    void watering(int receivedWater){
    }

    public String getColor() {
        return color;
    }
}
