
public class Main {
    public static void main(String[] args) {

        // PIRATE TESTING
        /*
        Pirate pirate1 = new Pirate();
        Pirate pirate2 = new Pirate();
        for (int i = 0; i < 4; i++) {
            pirate1.drinkSomeRum();
        }
        pirate1.howItGoingMate();
        pirate1.drinkSomeRum();
        pirate1.brawl(pirate2);
        System.out.println(pirate1.toString());
        System.out.println(pirate2.toString());
        */



        // SHIP TESTING
        Ship ship1 = new Ship();
        ship1.fillShip();

        Ship ship2 = new Ship();
        ship2.fillShip();

        System.out.println(ship1.getCrew().size());
        System.out.println(ship2.getCrew().size());
        /*
        ship1.isCaptainAlive();
        System.out.println(ship1.getCaptain());
        ship1.getCaptain().drinkSomeRum();
        ship1.getCaptain().drinkSomeRum();
        ship1.getCaptain().drinkSomeRum();
        ship1.getCaptain().drinkSomeRum();
        ship1.getCaptain().drinkSomeRum();
        System.out.println(ship1.getCaptain());
        ship1.getCaptain().howItGoingMate();
        System.out.println(ship1.getCaptain());
        //ship1.getCaptain().die();
        System.out.println(ship1.getCaptain());
        ship1.shipInfo();
        System.out.println(ship1.getPiratesAlive());
        System.out.println(ship2.getPiratesAlive());
        */

        ship1.shipBattle(ship2);

        System.out.println(ship1.getPiratesAlive());
        System.out.println(ship2.getPiratesAlive());
    }
}
