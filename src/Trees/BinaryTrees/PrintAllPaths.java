package Trees.BinaryTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 07/09/16.
 */
public class PrintAllPaths {

    public static void main(String[] args) {

        Node root = createTree();
        int[] arr = new int[10];
        int len = 0;
        printAllPaths(root, arr, len);

    }

    private static void printAllPaths(Node root, int[] arr, int len) {

        //base case
        if (root == null) return;

        //if not null or leaf, add this node to array
        arr[len++] = root.getData();

        //leaf node, print path
        if (root.getLeft() == null && root.getRight() == null) {

            for (int i = 0; i < len; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        //recurse for other paths
        if (root.getLeft() != null)
            printAllPaths(root.getLeft(), arr, len);
        if (root.getRight() != null)
            printAllPaths(root.getRight(), arr, len);

    }

    private static Node createTree() {
        Node root = createNode(1);
        root.setLeft(createNode(2));
        root.setRight(createNode(3));
        root.getLeft().setLeft(createNode(5));
        root.getLeft().getLeft().setLeft(createNode(6));
        return root;
    }

    private static Node createNode(int data) {
        return new Node(data);
    }

}
