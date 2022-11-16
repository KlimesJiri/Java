package oop.inheritance.minecraft;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall();
        Air air = new Air();
        Brick brick = new Brick("dark-gray");
        Door door = new Door(2, "Mordor", "black", 60);
        Glass glass = new Glass();
        Glowstone glowstone = new Glowstone();
        Window window = new Window(1, "Liliput", "white", 70, true);
        Window window1 = new Window(2, "Asgard", "light-gray", 90, true);
        Mud mud = new Mud();
        Gold gold = new Gold(50);
        Lava lava = new Lava();
        Glowstone glowstone1 = new Glowstone();
        Ice ice = new Ice();
        Lava lava1 = new Lava();
        Gold gold1 = new Gold(30);
        Ice ice1 = new Ice();

        wall.placeBlock(air);
        wall.placeBlock(brick);
        wall.placeBlock(door);
        wall.placeBlock(glass);
        wall.placeBlock(glowstone);
        wall.placeBlock(window);
        wall.placeBlock(window1);
        wall.placeBlock(mud);
        wall.placeBlock(gold);
        wall.placeBlock(lava);
        wall.placeBlock(glowstone1);
        wall.placeBlock(ice);
        wall.placeBlock(lava1);
        wall.placeBlock(gold1);
        wall.placeBlock(ice1);

        wall.printStatus();

        wall.calculateLight();







//        wall.placeBlock(new Air());
//        wall.placeBlock(new Brick("dark-gray"));
//        wall.placeBlock(new Door(2, "Mordor", "black", 60));
//        wall.placeBlock(new Glass());
//        wall.placeBlock(new Glowstone());
//        wall.placeBlock(new Window(1, "Liliput", "white", 70, true));
//        wall.placeBlock(new Window(2, "Asgard", "light-gray", 90, true));
//        wall.placeBlock(new Mud());
//        wall.placeBlock(new Gold(50));
//        wall.placeBlock(new Lava());
//        wall.placeBlock(new Glowstone());
//        wall.placeBlock(new Ice());
//        wall.placeBlock(new Lava());
//        wall.placeBlock(new Gold(30));
//        wall.placeBlock(new Ice());
    }
}
