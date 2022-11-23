package flyable;

public class Helicopter extends Vehicle {


    @Override
    public void land() {
        System.out.println("Helicopter lands.");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter flies");
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter takes off.");
    }
}
