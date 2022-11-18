
abstract public class Tree {
    private int height;

    public Tree() {
        height = 0;
    }

    public Tree(int height) {
        this.height = height;
    }

    abstract public void irrigate();

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}