package Trees.BinaryTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 28/08/16.
 */
public class HeightOfTree {

    public static void main(String[] args) {

        Node root = createTree();

        System.out.print("Height is " + height(root));

    }

    private static int height(Node root) {

        if (root == null) return 0;     //If leaf node, return 0

        int leftHeight = height(root.getLeft());        //calculate height of left subtree
        int rightHeight = height(root.getRight());      //calculate height of right subtree

        return Math.max(leftHeight, rightHeight) + 1;   //return max height

        //return (1 + Math.max(findHeight(root.getLeft()), findHeight(root.getRight())));       //single line code

    }

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

}
