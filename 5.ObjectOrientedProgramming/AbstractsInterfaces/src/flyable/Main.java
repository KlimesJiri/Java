package flyable;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Jeff");

        bird.takeOff();
        bird.fly();
        bird.land();

        Vehicle vehicle = new Helicopter();

        vehicle.takeOff();
        vehicle.fly();
        vehicle.land();
    }
}
