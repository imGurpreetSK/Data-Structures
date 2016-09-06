package Trees.BinaryTrees;

import Trees.Node;

import javax.security.sasl.SaslServer;
import java.awt.geom.Line2D;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Gurpreet on 31/08/16.
 */
public class AllNodesOnALevel {

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
        if (root != null)
            printAllNodes(root);

    }

    private static void printAllNodes(Node root) {

//        int count = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty() ) {
            int size = q.size();

            if(size==0) break;

            //print nodes in a level
            while (size>0) {
                Node temp = q.poll();
//                if(size==1)       this if only last element of tree is to be calculated
                System.out.print(temp.getData() + " ");
                if (temp.getLeft() != null) q.add(temp.getLeft());
                if (temp.getRight() != null) q.add(temp.getRight());
                size--;
            }
            System.out.println();
        }
    }

}
