package Trees.BinarySearchTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 17/09/16.
 */
public class LCA {

    public static void main(String[] args) {

        Node root = createTree();
        int n1 = 0, n2 = 3;
        if (LCA(root, n1, n2) != null)
            System.out.print(LCA(root, n1, n2).getData());

    }

    private static Node LCA(Node root, int n1, int n2) {

        if (root == null) return null;
        if (root.getData() >= n1 && root.getData() <= n2)
            return root;
        if (root.getData() < n1 && root.getData() < n2)
            root = root.getRight();
        if (root.getData() > n1 && root.getData() > n2)
            root = root.getLeft();

        return root;

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
