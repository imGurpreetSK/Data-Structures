package Trees.BinaryTrees;

import Trees.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Gurpreet on 06/09/16.
 */
public class LastNodeTree {

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
        getTreeNode(root);

    }

    private static void getTreeNode(Node root) {

        int count = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>0){
            Node temp = q.poll();
            if(temp!=null){
                if(temp.getLeft()!=null)    q.add(temp.getLeft());
                if(temp.getRight()!=null)    q.add(temp.getRight());
            } else{
                temp = q.poll();
                count++;
                System.out.print(count);
            }
        }

    }

}
