package chapter5;

// TiJ Ch.2, Tasks 3,4

public class Tree {

    public Tree() {
        System.out.println("Tree");
    }

    public Tree(String s) {
        System.out.println("Tree" + s);
    }

    public static void main(String[] args) {
        new Tree();
        new Tree(" with green leaves");

    }

}
