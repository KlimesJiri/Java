import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Forest {
    ArrayList<Tree> trees;

    public Forest(ArrayList<Tree> trees) {
        this.trees = trees;
    }

    public void rain() {
        for (Tree tree : trees) {
            tree.irrigate();
        }
    }

    public void cutTrees(Lumberjack lumberjack) {
        for (Iterator<Tree> i = trees.iterator(); i.hasNext();) {
            Tree tree = i.next();
            if (lumberjack.canCut(tree)) {
                i.remove();
            }
        }
    }

    public boolean isEmpty() {
        return (trees.size() == 0);
    }

    public String[] getStatus() {
        String[] status = new String[trees.size()];
        for (int i = 0; i < trees.size(); i++) {
            status[i] = "There is a " + trees.get(i).getHeight() + " tall " + trees.get(i).getClass().getSimpleName() + " in the forest.";
            System.out.println(status[i]);
        }
        return status;
    }
}