package Queues;

import java.util.Queue;

/**
 * Created by Gurpreet on 09/08/16.
 */
public class QueueNode {

    int data;
    QueueNode next;

    QueueNode(int data){
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
