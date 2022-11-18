import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Tree> treeList = new ArrayList<>();

        Tree tree1 = new FoxTailPine();
        Tree tree2 = new WhiteBarkPine();
        Tree tree3 = new WhiteBarkPine(5);
        Tree tree4 = new FoxTailPine(3);

        treeList.add(tree1);
        treeList.add(tree2);
        treeList.add(tree3);
        treeList.add(tree4);

        Forest forest = new Forest(treeList);

        forest.getStatus();

        Lumberjack lumberjack = new Lumberjack();

        forest.cutTrees(lumberjack);

        System.out.println();
        forest.getStatus();

        forest.rain();

        forest.cutTrees(lumberjack);

        System.out.println();
        forest.getStatus();

        forest.rain();

        forest.cutTrees(lumberjack);

        System.out.println();
        forest.getStatus();

    }
}
