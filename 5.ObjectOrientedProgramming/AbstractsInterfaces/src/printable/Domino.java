package printable;

public class Domino implements Printable{

    protected int left;
    protected int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + left + ", B side: " + right);
    }
}
