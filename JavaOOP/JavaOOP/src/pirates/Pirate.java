package pirates;

import java.util.Random;

public class Pirate {
    /*
    Create a Pirate class. You can add other fields and methods, yet, you must have these methods:

    drinkSomeRum() - intoxicates the Pirate by one
    howsItGoingMate() - when called, the Pirate replies:
        if drinkSomeRun() was called less than 4 times:
            "Pour me anudder!"
        else:
            "Arghh, I'ma Pirate. How d'ya d'ink its goin?". Then the pirate passes out and sleeps it off (gets rid of the intoxication).

    If you manage to get this far, then you can try to do the following.

    brawl(Pirate) - where pirate fights another pirate (if both of them are alive):
        there is 1/3 chance that this dies, the other dies or they both pass out.
    die() - this kills off the pirate. When a pirate is dead, every method simply results in: he's dead.
     */

    private int intoxication;
    private int rumConsumed;
    private boolean isAlive;

    private static Random random = new Random();

    public Pirate(){
        intoxication = 0;
        rumConsumed = 0;
        isAlive = true;
    }

    public void drinkSomeRum(){
        if (!isAlive){
            System.out.println("He's dead.");
        } else {
            intoxication++;
            rumConsumed++;
        }
    }

    public void howItGoingMate(){
        if (!isAlive){
            System.out.println("He's dead.");
            return;
        } else if (intoxication < 4){
            System.out.println("Pour me anudder!");
            drinkSomeRum();
            return;
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            intoxication = 0;
            return;
        }
    }

    public void brawl(Pirate pirate){
        if (!isAlive || !pirate.isAlive){
            System.out.println("He's dead.");
            return;
        } else {
            int chance = random.nextInt(0,100);
            if (chance < 34){
                die();
                return;
            } else if (chance > 34 && chance < 67) {
                pirate.die();
                return;
            }
        }
    }

    public void die(){
        isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getRumConsumed() {
        return rumConsumed;
    }

    @Override
    public String toString() {
        return "Pirate{" +
                "intoxication=" + intoxication +
                ", rumConsumed=" + rumConsumed +
                ", isAlive=" + isAlive +
                '}';
    }
}
