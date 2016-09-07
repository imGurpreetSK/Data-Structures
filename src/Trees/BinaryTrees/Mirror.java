package Trees.BinaryTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 07/09/16.
 */
public class Mirror {

    public static void main(String[] args) {

        Node root = createTree();
        Node mirrorRoot = CreateMirrorTree(root);
        printTree(mirrorRoot);

    }

    private static void printTree(Node root) {

        if (root!=null){
            System.out.print(root.getData()+" ");
            if(root.getLeft()!=null)    printTree(root.getLeft());
            if(root.getRight()!=null)   printTree(root.getRight());
        }

    }

    private static Node CreateMirrorTree(Node root) {

        if(root==null)  return null;
        Node newNode = createNode(root.getData());
        newNode.setLeft(root.getRight());
        newNode.setRight(root.getLeft());
        CreateMirrorTree(root.getLeft());
        CreateMirrorTree(root.getRight());
        return newNode;

    }

    private static Node createTree() {
        Node root = createNode(1);
        root.setLeft(createNode(2));
        root.setRight(createNode(3));
        root.getLeft().setLeft(createNode(5));
        root.getLeft().getLeft().setLeft(createNode(6));
        return root;
    }

    private static Node createNode(int data){
        return new Node(data);
    }

}
