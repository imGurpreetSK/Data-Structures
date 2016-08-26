package Trees.BinaryTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 27/08/16.
 */
public class MinMaxInTree {

    private static Node createTree() {
        Node root = newNode(0);
        root.setLeft(newNode(1));
        root.setRight(newNode(2));
        root.getLeft().setLeft(newNode(3));
        root.getLeft().setRight(newNode(4));
        root.getLeft().getRight().setLeft(newNode(5));
        root.getLeft().getRight().setRight(newNode(6));
        root.getRight().setRight(newNode(7));
        root.getRight().getRight().setRight(newNode(8));
        root.getRight().getRight().getRight().setRight(newNode(9));
        root.getRight().getRight().getRight().setLeft(newNode(10));
        root.getRight().getRight().getRight().getLeft().setRight(newNode(11));
        root.getRight().getRight().getRight().getLeft().setLeft(newNode(12));
        return root;
    }

    private static Node newNode(int data) {
        return new Node(data);
    }

    public static void main(String[] args) {

        Node root = createTree();
        findMinMax(root);
        System.out.print("Min: "+min+" Max: "+max);

    }

    private static int min = 0, max = 0;

    private static void findMinMax(Node root) {

        if (root != null) {
            if (root.getData() > max) max = root.getData();
            else if (root.getData() < min) min = root.getData();
            findMinMax(root.getLeft());
            findMinMax(root.getRight());
        }

    }

}
