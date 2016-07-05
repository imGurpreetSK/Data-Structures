package LinkedList.DoublyLinkedList;

/**
 * Created by Gurpreet on 05/07/16.
 */
public class NodeDLL {

    private int data;
    private NodeDLL next;
    private  NodeDLL prev;

    public NodeDLL(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeDLL getNext() {
        return next;
    }

    public void setNext(NodeDLL next) {
        this.next = next;
    }

    public NodeDLL getPrev() {
        return prev;
    }

    public void setPrev(NodeDLL prev) {
        this.prev = prev;
    }
}
