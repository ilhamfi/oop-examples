public class Tree {

    String treeName;
    double treeHeight;
    int cost;

    public Tree(String a, double b) {
        treeName = a;
        treeHeight = b;
    }


    Tree(String c, double k, int j) {

        this(c, k);
        cost = j;
    }

    Tree(double d) {


        this("rastgele string", d);
    }

    public void printInfo() {

        System.out.println("name:" + treeName + " height:" + treeHeight + " cost:" + cost + "$");
    }


}
