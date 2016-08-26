package Trees.BinaryTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 26/08/16.
 */
public class LeftView {

    public static void main(String[] args) {

        Node root = createTree();

        System.out.println(root.getData());
        giveLeftMostNode(root);

    }

    private static void giveLeftMostNode(Node root) {

        while(root!=null){
            if(root.getLeft()!=null) {
                System.out.println(root.getLeft().getData());
                giveLeftMostNode(root.getLeft());
            }
            else {
//                System.out.println(root.getRight().getData());
                giveLeftMostNode(root.getRight());
            }

        }

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

    private static Node newNode(int i) {
        return new Node(i);
    }

}
