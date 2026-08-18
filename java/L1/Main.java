package L1;

public class Main {
    public static void main(String[] args)
    {
        Tree smp=new Tree(25,5,TreeType.PINE);
        System.out.println(smp.treeType);
        Tree smp2=new Tree(32,4,TreeType.MAPLE);
        smp.announceTallTree();;
        smp2.announceTallTree();
        System.out.println(Tree.TRUNK_COLOR);
    }
}
