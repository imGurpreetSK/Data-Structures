package Trees.BinaryTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 26/08/16.
 */
public class DiameterOfTreeOptimized {

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

        float start = System.nanoTime();
        System.out.println(findDiameter(root, new Height()));
        float end = System.nanoTime();

        System.out.println(end-start);

    }

    /**
     * The previous implementation can be optimized by calculating the height in the same recursion rather than calling a height() separately.
     */

    private static class Height{
        int h;
    }

    private static int findDiameter(Node root, Height height) {

        if(root==null){
            height.h = 0;
            return 0;
        }

        Height leftHeight = new Height(), rightHeight = new Height();

        leftHeight.h++;
        rightHeight.h++;
        int leftDia = findDiameter(root.getLeft(), leftHeight);
        int rightDia = findDiameter(root.getRight(), rightHeight);

        height.h = Math.max(leftHeight.h, rightHeight.h) + 1;

        return Math.max(Math.max(leftDia, rightDia), leftHeight.h + rightHeight.h + 1);

    }


}
