package instruments.music;

public class BassGuitar extends StringedInstrument{


    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
        name = "Bass Guitar";
    }

    public BassGuitar() {
        this(4);
    }

    @Override
    void sound() {
        System.out.println("Duum-duum-duum");
    }
}
