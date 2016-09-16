package Trees.BinarySearchTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 16/09/16.
 */
public class Search {

    public static void main(String[] args) {

        Node root = createTree();
        int i = 2;
        System.out.print(search(i, root));

    }

    private static boolean search(int i, Node root) {

        if(root == null)    return false;

        if (i == root.getData()) return true;
        else if (i < root.getData()) return search(i, root.getLeft());
        return search(i, root.getRight());

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
