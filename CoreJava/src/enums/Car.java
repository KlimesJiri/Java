package enums;

public class Car {

    public enum Type {
        SEDAN,
        COUPE,
        SPORTS_CAR,
        WAGON,
        HATCHBACK,
        CONVERTIBLE,
        SUV,
        MINIVAN,
        PICKUP_TRUCK,
        CROSSOVER,
        LUXURY_CAR
    }

    public enum CarColor {
        WHITE,
        BLACK,
        SILVER,
        RED,
        GREEN,
        BLUE,
        YELLOW,
        ORANGE
    }

    Type type;
    CarColor color;


    public Car(Type type, CarColor color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", color=" + color +
                '}';
    }
}