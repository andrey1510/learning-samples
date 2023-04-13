package trees;

// from https://www.programiz.com/dsa/full-binary-tree

// Checking if a binary tree is a full binary tree in Java

class NodeFull {
    int data;
    NodeFull leftChild, rightChild;

    NodeFull(int item) {
        data = item;
        leftChild = rightChild = null;
    }
}

public class FullBinaryTree {
    NodeFull root;

    // Check for Full Binary Tree
    boolean isFullBinaryTree(NodeFull node) {

        // Checking tree emptiness
        if (node == null)
            return true;

        // Checking the children
        if (node.leftChild == null && node.rightChild == null)
            return true;

        if ((node.leftChild != null) && (node.rightChild != null))
            return (isFullBinaryTree(node.leftChild) && isFullBinaryTree(node.rightChild));

        return false;
    }

    public static void main(String[] args) {
        FullBinaryTree tree = new FullBinaryTree();
        tree.root = new NodeFull(1);
        tree.root.leftChild = new NodeFull(2);
        tree.root.rightChild = new NodeFull(3);
        tree.root.leftChild.leftChild = new NodeFull(4);
        tree.root.leftChild.rightChild = new NodeFull(5);
        tree.root.rightChild.leftChild = new NodeFull(6);
        tree.root.rightChild.rightChild = new NodeFull(7);

        if (tree.isFullBinaryTree(tree.root))
            System.out.print("The tree is a full binary tree");
        else
            System.out.print("The tree is not a full binary tree");
    }
}