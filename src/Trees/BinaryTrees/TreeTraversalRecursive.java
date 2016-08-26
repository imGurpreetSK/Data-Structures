package Trees.BinaryTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 26/08/16.
 */
public class TreeTraversalRecursive {

    private static void preOrder(Node root){
        if (root != null) {
            System.out.print(root.getData()+" ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    private static void inOrder(Node root){
        if (root != null) {
            inOrder(root.getLeft());
            System.out.print(root.getData()+" ");
            inOrder(root.getRight());
        }
    }

    private static void postOrder(Node root){
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData()+" ");
        }
    }

    public static void main(String[] args) {

        Node root =  createTree();

        System.out.println("Inorder: \n");
        inOrder(root);
        System.out.print('\n');

        System.out.println("Preorder: \n");
        preOrder(root);
        System.out.print('\n');

        System.out.println("Postorder: \n");
        postOrder(root);
        System.out.print('\n');

    }

    private static Node createTree() {

        Node root = newNode(0);
        root.setLeft(newNode(1));
        root.setRight(newNode(2));
        root.getLeft().setLeft(newNode(3));
        root.getLeft().setRight(newNode(4));
        root.getRight().setRight(newNode(5));
        return root;

    }

    private static Node newNode(int data) {
        return new Node(data);
    }

}
