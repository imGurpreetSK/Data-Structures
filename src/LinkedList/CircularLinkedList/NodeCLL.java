package LinkedList.CircularLinkedList;

/**
 * Created by Gurpreet on 16/07/16.
 */
public class NodeCLL {

    private int data;
    private NodeCLL next;

    public NodeCLL(int data) {
        this.data = data;
    }

    public NodeCLL getNext() {
        return next;
    }

    public void setNext(NodeCLL next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
