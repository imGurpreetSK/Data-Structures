package Trees.BinaryTrees;

import Trees.Node;

/**
 * Created by Gurpreet on 26/08/16.
 */

// Running time O(n^2)

public class DiameterOfTree {

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
        System.out.println(findDiameter(root));
        float end = System.nanoTime();

        System.out.println(end-start);

    }


    /**
     *     Diameter is the number of nodes in the longest route of a tree.
     *
     *     Diameter is MAX(left_sub_tree_diameter, right_sub_tree_diameter, left_subtree_height + right_subtree_height + 1)
     *     Therefore, calculate left subtree height right subtree height and diameters of both the subtrees and compare.
     */


    private static int findDiameter(Node root) {

        if(root==null)  return 0;

//        int diameter = 1;
        int leftHeight = findHeight(root.getLeft());
        int rightHeight = findHeight(root.getRight());

        int leftDiameter = findDiameter(root.getLeft());
        int rightDiameter = findDiameter(root.getRight());

        return Math.max(Math.max(leftDiameter, rightDiameter), leftHeight + rightHeight + 1);

    }

    private static int findHeight(Node root) {      //O(n) for each node, therefore for n nodes, complexity is O(n^2)

        if (root == null) return 0;

        return (1 + Math.max(findHeight(root.getLeft()), findHeight(root.getRight())));

    }

}
