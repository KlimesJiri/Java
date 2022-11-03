package oop.fudnamentals.petrolstation;

public class Car {
    private int gasAmount;
    private int capacity;

    public Car(){
        gasAmount = 0;
        capacity = 100;
    }

    public int getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
