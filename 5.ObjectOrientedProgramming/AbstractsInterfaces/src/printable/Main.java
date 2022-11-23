package printable;


public class Main {
    public static void main(String[] args) {
        Domino domino = new Domino(4, 5);

        Todo todo = new Todo("Buy milk", "high", true);

        domino.printAllFields();

        todo.printAllFields();
    }
}
