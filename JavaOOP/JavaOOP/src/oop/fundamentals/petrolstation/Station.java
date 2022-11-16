package oop.fundamentals.petrolstation;

public class Station {

    private int gasAmount = 2000;

    public void refill(Car car){
        gasAmount -= car.getCapacity();
        car.setGasAmount(car.getCapacity());
    }

    public int getGasAmount() {
        return gasAmount;
    }
}
