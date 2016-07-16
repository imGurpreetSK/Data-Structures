package Stacks;

import java.util.Scanner;

/**
 * Created by Gurpreet on 16/07/16.
 */
public class Operations {

    private static Node head = null;
    private static int size = 0;

    public static void main(String[] args) {

        askChoice();

    }

    private static void askChoice() {
        System.out.println("Enter choice:\n1.Insertion\n2.Deletion");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter number of insertions: ");
                int number = scanner.nextInt();
                while(number>0) {
                    push(number);
                    number--;
                }
                askChoice();
                break;
            case 2:
                pop();
                askChoice();
                break;
            case 3:
                printStack();
                break;
            default:
                System.out.println("Wrong input, try again.");
                getSize();
        }
    }

    private static void printStack() {
        while (head != null) {
            System.out.print(head.getData() + "->");
            head = head.getNext();
        }
    }

    private static void pop() {
        if (size == 0) {
            System.out.println("Empty stack, pop not possible.");
            return;
        }
        head = head.getNext();
        size--;
        printStack();
    }

    private static void push(int i) {
        Node newNode = createNode(i);
        newNode.setNext(head);
        head = newNode;
        size++;
        printStack();
    }

    private static Node createNode(int data) {
        return new Node(data);
    }

    private static void getSize() {
        System.out.print("The size is " + size);
    }
}
