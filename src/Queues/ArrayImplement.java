package Queues;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Gurpreet on 09/08/16.
 */

public class ArrayImplement {

    private static int front = -1, rear = -1;

    public static void main(String[] args) {

        ArrayList<Integer> queue = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        if (front > rear) System.out.println("Empty Queue");
        else if (front <= rear) {
            System.out.println("Enter choice:\n1. Insert\n2. Delete\n3. Size");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data: ");
                    int data = s.nextInt();
                    enqueue(queue, data);
                    printQueue(queue);
                    break;
                case 2:
                    dequeue(queue);
                    printQueue(queue);
                    break;
                case 3:
//                    int size = size(queue);
                    System.out.println(size(queue));
                    break;
                default:
                    System.out.println("Wrong choice.");
            }
        }
    }

    private static ArrayList<Integer> enqueue(ArrayList<Integer> q, int data) {

        if (front == -1 || rear == -1) {
            q.add(data);
            front++;
            rear++;
        } else {
            q.add(++rear, data);
        }

        return q;

    }

    private static ArrayList<Integer> dequeue(ArrayList<Integer> q) {
        if (front == -1 || rear == -1) {
            System.out.println("Empty queue.");
        } else {
            front++;
        }

        return q;

    }

    private static int size(ArrayList<Integer> q) {
        return q.size();
    }

    private static void printQueue(ArrayList<Integer> q) {
        for (int i = 0; i < q.size(); i++)
            System.out.print(q.get(i) + " ");
    }

}
