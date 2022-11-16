package oop.inheritance.aircraftcarrier;

public class Main {
    public static void main(String[] args) {

        Carrier carrier = new Carrier(30, 1200);
        for (int i = 0; i < 2; i++) {
            carrier.add(new F35());
        }
        for (int i = 0; i < 3; i++) {
            carrier.add(new F16());
        }

        carrier.fill();
        carrier.getStatus();
        System.out.println();

        Carrier carrier2 = new Carrier(30, 1500);
        for (int i = 0; i < 2; i++) {
            carrier2.add(new F35());
        }
        for (int i = 0; i < 3; i++) {
            carrier2.add(new F16());
        }

        carrier2.fill();
        carrier2.getStatus();
        System.out.println();

        carrier.fight(carrier2);
        carrier2.getStatus();
        System.out.println();

        carrier2.fight(carrier);
        carrier.getStatus();
    }

}
