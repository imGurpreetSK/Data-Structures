package Queues;

import java.util.ArrayList;
import java.util.Queue;

/**
 * Created by Gurpreet on 09/08/16.
 */
public class QueueOperations {

    private static QueueNode head, temp;
    private static int size;

    public static void main(String[] args) {

        if (head == null) {
            QueueNode newNode = createNode(0);
            newNode.setNext(null);
            head = newNode;
            size += 1;
        }
        for(int i=1; i<11; i++)
            enqueue(i);
        print();
        System.out.println();
        System.out.println(size());
        dequeue();  dequeue();  dequeue();
        System.out.println();
        print();
        System.out.println();
        System.out.println(size());

    }

    private static QueueNode createNode(int data) {
        return new QueueNode(data);
    }

    private static void enqueue(int data) {

        temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        QueueNode newNode = createNode(data);
        temp.setNext(newNode);
        size += 1;

    }

    private static void dequeue() {

        head = head.getNext();      //NOT head.setNext(head.getNext());
        size -= 1;

    }

    private static int size() {
        return size;
    }

    private static void print() {
        temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
    }

}