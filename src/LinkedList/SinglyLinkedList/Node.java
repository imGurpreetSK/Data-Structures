package LinkedList.SinglyLinkedList;

/**
 * Created by Gurpreet on 05/07/16.
 */

//Represents the node structure for the Linked List

class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
