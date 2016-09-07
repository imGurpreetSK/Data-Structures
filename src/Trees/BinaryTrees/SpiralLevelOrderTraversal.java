package Trees.BinaryTrees;

import Trees.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Gurpreet on 08/09/16.
 */
public class SpiralLevelOrderTraversal {

    public static void main(String[] args) {

        Node root = createTree();
        Spiral(root);

    }

    private static void Spiral(Node node) {

        if (node == null) return;

        Stack<Node> s1 = new Stack<>();     //prints RTL
        Stack<Node> s2 = new Stack<>();     //prints LTR

        s1.push(node);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                Node temp = s1.pop();
                System.out.print(temp.getData() + " ");
                if (temp.getRight() != null)            //BEWARE: right goes first as we have to print LTR
                    s2.push(temp.getRight());
                if (temp.getLeft() != null)
                    s2.push(temp.getLeft());
            }
            System.out.println();
            while (!s2.isEmpty()) {
                Node temp = s2.peek();
                s2.pop();
                System.out.print(temp.getData() + " ");
                if (temp.getLeft() != null)
                    s1.push(temp.getLeft());
                if (temp.getRight() != null)
                    s1.push(temp.getRight());
            }
            System.out.println();

        }

    }

    private static Node createTree() {
        Node root = createNode(1);
        root.setLeft(createNode(2));
        root.setRight(createNode(3));
        root.getLeft().setLeft(createNode(7));
        root.getLeft().setRight(createNode(6));
        root.getRight().setLeft(createNode(5));
        root.getRight().setRight(createNode(4));
        return root;
    }

    private static Node createNode(int data) {
        return new Node(data);
    }

}
