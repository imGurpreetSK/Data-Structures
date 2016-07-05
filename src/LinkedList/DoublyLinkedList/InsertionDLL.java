package LinkedList.DoublyLinkedList;

/**
 * Created by Gurpreet on 05/07/16.
 */
public class InsertionDLL {

    private static NodeDLL head = null;
    private static NodeDLL tail = null;

    public static void main(String[] args) {

        insertAtBeginningDLL();
        insertAtEndDLL();
        insertAtMiddleDLL();
        printData();

    }

    private static void insertAtMiddleDLL() {
        int position = 3;
        NodeDLL temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.getNext();
        }
        NodeDLL newNode = createNode(7);
        temp.getNext().setPrev(newNode);
        newNode.setNext(temp.getNext());
        newNode.setPrev(temp);
        temp.setNext(newNode);
    }

    private static void insertAtEndDLL() {
        //we use teh previous pointer here
        NodeDLL temp = tail;
        NodeDLL newNode = createNode(10);
        newNode.setPrev(temp);
        temp.setNext(newNode);
        newNode.setNext(null);
        tail = newNode;
    }

    private static void printData() {
        NodeDLL temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
    }

    private static void insertAtBeginningDLL() {
        for (int i = 0; i < 6; i++) {
            NodeDLL newNode = createNode(i);
            if (head == null) tail = newNode;
            newNode.setNext(head);
            head = newNode;
        }
    }

    private static NodeDLL createNode(int data) {
        return new NodeDLL(data);
    }

}
