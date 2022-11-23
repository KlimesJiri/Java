package instruments.music;

public abstract class StringedInstrument extends Instrument{

    public int numberOfStrings;
    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    abstract void sound();

    @Override
    public void play() {
        System.out.print(name + ", a " + numberOfStrings + "-stringed instrument that goes ");
        sound();
    }
}
