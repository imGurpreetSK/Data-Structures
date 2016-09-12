package Trees.BinaryTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 09/09/16.
 */
public class LCAoptimized {

    public static void main(String[] args) {

        Node root = createTree();
        System.out.print(LCA(root, 11, 12).getData());

    }

    private static Node LCA(Node root, int n1, int n2) {

        if (root == null) return null;
        if (root.getData() == n1 || root.getData() == n2)
            return root;

        Node leftLCA = LCA(root.getLeft(), 11, 12);
        Node rightLCA = LCA(root.getRight(), 11, 12);

        if (leftLCA!=null &&rightLCA!=null) return root;

        return (leftLCA!=null)?leftLCA:rightLCA;

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
