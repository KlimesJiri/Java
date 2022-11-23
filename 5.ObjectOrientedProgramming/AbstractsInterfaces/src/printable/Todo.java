package printable;

public class Todo implements Printable{

    protected String task;
    protected String priority;
    protected boolean isDone;

    public Todo(String task, String priority, boolean isDone) {
        this.task = task;
        this.priority = priority;
        this.isDone = isDone;
    }

    @Override
    public void printAllFields() {
        System.out.println("Task: " + task + " | Priority: " + priority + " | Done: " + isDone);
    }
}
