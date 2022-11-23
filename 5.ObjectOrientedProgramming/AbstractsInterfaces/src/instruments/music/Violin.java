package instruments.music;

public class Violin extends StringedInstrument{

    public Violin() {
        super(4);
        name = "Violin Guitar";
    }

    @Override
    void sound() {
        System.out.println("Screech");
    }
}
