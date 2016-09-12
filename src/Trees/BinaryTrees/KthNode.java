package Trees.BinaryTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 12/09/16.
 */
public class KthNode {

    public static void main(String[] args) {

        Node root = createTree();
        int k = 2;
        getNodesAtKDistance(root, k);

    }

    private static void getNodesAtKDistance(Node root, int k) {

        if(root!=null){
            if(k==0){
                System.out.print(root.getData()+" ");
            } else{
                k--;
                getNodesAtKDistance(root.getLeft(), k);
                getNodesAtKDistance(root.getRight(), k);
            }
        }

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
