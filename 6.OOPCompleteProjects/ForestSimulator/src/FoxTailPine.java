
public class FoxTailPine extends Tree {

    public FoxTailPine() {
    }

    public FoxTailPine(int height) {
        super(height);
    }

    @Override
    public void irrigate() {
        setHeight(getHeight() + 1);
    }
}