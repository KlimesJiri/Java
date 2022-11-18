package oop.fundamentals.sharpieset;

public class Main {
    public static void main(String[] args) {

        Sharpie sharpie = new Sharpie("blue", 5.);
        SharpieSet sharpieSet = new SharpieSet();

        sharpieSet.addSharpie(sharpie);

        System.out.println(sharpie.toString());

        System.out.println(sharpieSet.countUsable() + " sharpies are usable");
        for (int i = 0; i < 10; i++) {
            sharpie.use();
            System.out.println(sharpie.toString());
        }

        System.out.println(sharpieSet.countUsable());
        sharpieSet.removeThrash();
        System.out.println(sharpieSet.getSharpieList().size());
    }
}
