package instruments.music;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
        name = "Electric Guitar";
    }

    public ElectricGuitar() {
        this(6);
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    void sound() {
        System.out.println("Twang");
    }
}
