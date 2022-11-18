
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    /*
    The place for the Pirates
        Create a Ship class.
        The Ship stores Pirate instances in a list as the crew and has one captain who is also a Pirate.
        When a ship is created it doesn't have a crew or a captain.
        The ship can be filled with pirates and a captain via fillShip() method:
            fills the ship with a captain and a random (maximum 113) number of pirates
        Ships should be represented in a nice way on command line including information about
            rum consumed by the captain and its state (dead or alive)
            number of alive pirates in the crew
        Ships should have a method to battle other ships: ship.battle(otherShip)
            should return true if the actual ship (this) wins
            the ship having higher calculated score wins
            calculated score: Number of alive pirates in the crew - Number of consumed rum by the captain
            The loser crew has a random number of losses (deaths).
            The winning captain and crew has a party: everyone drinks a random number of rum :)
    */

    private static Random random = new Random();

    private List<Pirate> crew = new ArrayList<>();

    private Pirate captain;

    public void fillShip(){
        captain = new Pirate();
        crew.add(captain);
        int capacity = random.nextInt(32, 112);
        for (int i = 0; i < capacity; i++) {
            crew.add(new Pirate());
        }
    }

    public boolean isCaptainAlive() {
        return captain.isAlive();
    }

    public void shipInfo(){
        int piratesAlive = 0;
        for (Pirate pirate : crew){
            if (pirate.isAlive()){
                piratesAlive++;
            }
        }
        System.out.println("The crew of this ship has: " + piratesAlive + " pirates alive.");
        if (isCaptainAlive()){
            System.out.println("Captain is alive and drank " + captain.getRumConsumed() + " bottles of rum.");
        } else {
            System.out.println("Captain is dead but drank " + captain.getRumConsumed() + " bottles of rum.");
        }
    }

    public void shipBattle(Ship ship){
        int shipScore1 = getPiratesAlive() - captain.getRumConsumed();
        int shipScore2 = ship.getPiratesAlive() - ship.getCaptain().getRumConsumed();
        if (shipScore1 < shipScore2){
            System.out.println("The second ship won!");
            for (int i = 0; i < random.nextInt(getPiratesAlive()); i++) {
                crew.get(i).die();
            }
        } else if (shipScore1 > shipScore2){
            System.out.println("The first ship won!");
            for (int i = 0; i < random.nextInt(ship.getPiratesAlive()); i++) {
                ship.crew.get(i).die();
            }
        } else {
            System.out.println("It's a tie, and because i am good person, no one dies.");
        }
    }

    public List<Pirate> getCrew() {
        return crew;
    }

    public int getPiratesAlive() {
        int count = 0;
        for (Pirate pirate : crew){
            if (pirate.isAlive()){
                count++;
            }
        }
        return count;
    }

    public Pirate getCaptain() {
        return captain;
    }
}
