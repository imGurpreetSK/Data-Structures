package Trees.BinarySearchTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 16/09/16.
 */
public class Insert {

    public static void main(String[] args) {

        Node root = createTree();
        System.out.print(insert(9, root));
        printTree(root);

    }

    private static void printTree(Node root) {
        if (root != null) {
            if (root.getLeft() != null)
                printTree(root.getLeft());
            System.out.print(" " + root.getData());
            if (root.getRight() != null)
                printTree(root.getRight());
        }
    }

    private static boolean insert(int i, Node root) {

        Node toInsert = newNode(i);
        if (root.getLeft() == null || root.getRight() == null) {
            if (root.getData() < i)
                root.setRight(toInsert);
            else
                root.setLeft(toInsert);
            return true;
        }
        if (i < root.getData()) return insert(i, root.getLeft());
        return insert(i, root.getRight());

    }

    private static Node createTree() {

        Node root = newNode(5);
        root.setLeft(newNode(2));
        root.setRight(newNode(6));
        root.getLeft().setLeft(newNode(0));
        root.getLeft().setRight(newNode(3));
        root.getRight().setRight(newNode(8));

        return root;

    }

    private static Node newNode(int i) {
        return new Node(i);
    }

}
