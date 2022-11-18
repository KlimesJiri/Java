package oop.fundamentals.farm;

public class Animal {

    private int hunger;
    private int thirst;

    public Animal(){
        hunger = 50;
        thirst = 50;
    }

    public void eat(){
        hunger--;
    }

    public void drink(){
        thirst--;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "hunger=" + hunger +
                ", thirst=" + thirst +
                '}';
    }

    public void play(){
        hunger++;
        thirst++;
    }

    public int getHunger() {
        return hunger;
    }
}
