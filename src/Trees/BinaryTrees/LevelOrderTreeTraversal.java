package Trees.BinaryTrees;

import Trees.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Gurpreet on 26/08/16.
 */
public class LevelOrderTreeTraversal {


    public static void main(String[] args) {

        Node root = createTree();

        traverse(root);

    }

    private static void traverse(Node root) {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.getData());
            if(temp.getLeft()!=null)
                queue.add(temp.getLeft());
            if(temp.getRight()!=null)
                queue.add(temp.getRight());
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
