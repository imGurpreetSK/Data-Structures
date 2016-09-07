package Trees.BinaryTrees;

import Queues.QueueNode;
import Trees.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Gurpreet on 08/09/16.
 */
public class LevelOrderTraversalWithNullValues {

    public static void main(String[] args) {

        Node root = createTree();
        printLOT(root);

    }

    private static void printLOT(Node root) {

        if(root==null)  return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){

            if(q.peek()==null){
                q.poll();
                System.out.println();
                q.add(null);
            }

            Node temp = q.poll();
            System.out.print(temp.getData()+" ");
            q.add(temp.getLeft());
            q.add(temp.getRight());

        }

    }


    private static Node createTree() {
        Node root = createNode(1);
        root.setLeft(createNode(2));
        root.setRight(createNode(3));
        root.getLeft().setLeft(createNode(5));
        root.getLeft().setRight(createNode(7));
        root.getRight().setRight(createNode(9));
        root.getLeft().getLeft().setLeft(createNode(6));
        return root;
    }

    private static Node createNode(int data) {
        return new Node(data);
    }

}
