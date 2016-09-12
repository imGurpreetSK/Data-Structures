package Trees.BinaryTrees;

import Trees.Node;

import java.util.ArrayList;

/**
 * Created by Gurpreet on 08/09/16.
 */
public class PathBetween2Nodes {

    public static void main(String[] args) {

        Node root = createTree();
        ArrayList<Node> arr = new ArrayList<>();
        int find = 15;
        System.out.println(path(root, arr, find));
        for (Node i:arr)
        System.out.println(i.getData());

    }

    private static boolean path(Node root, ArrayList<Node> arr, int find) {

        if(root==null) return false;

        if(root.getData()==find){
            arr.add(root);
            return true;
        }

        boolean presentLeft = path(root.getLeft(), arr, find);
        boolean presentRight = path(root.getRight(), arr, find);

        if(presentLeft||presentRight){
            arr.add(root);
            return true;
        }

        return false;

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
