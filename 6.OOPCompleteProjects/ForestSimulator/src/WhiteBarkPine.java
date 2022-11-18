
public class WhiteBarkPine extends Tree {

    public WhiteBarkPine() {
    }

    public WhiteBarkPine(int height) {
        super(height);
    }

    @Override
    public void irrigate() {
        setHeight(getHeight() + 2);
    }
}