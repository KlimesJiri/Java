package oop.fundamentals.petrolstation;

public class Main {
    /*
    Create Station and Car classes
    Station
        it stores how much gas is avaliable: gasAmount
        it can refill a car: refill(car):
            decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
            increases the car's gasAmount
    Car
        it stores how much gas is actually present: gasAmount
        it stores the capacity of the tank: capacity
        create a constructor for the Car class where you:
            initialize gasAmount -> 0
            initialize capacity -> 100
     */

    public static void main(String[] args) {
        Station station = new Station();
        Car car = new Car();

        System.out.println(station.getGasAmount());
        System.out.println(car.getGasAmount());

        station.refill(car);

        System.out.println(station.getGasAmount());
        System.out.println(car.getGasAmount());
    }
}
