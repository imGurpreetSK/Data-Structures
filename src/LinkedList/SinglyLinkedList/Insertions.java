package LinkedList.SinglyLinkedList;

/**
 * Created by Gurpreet on 05/07/16.
 */

public class Insertions {

    private static Node head = null;

    public static void main(String[] args) {

        //int data = 0;
        int position = 3;

        //createNode(data);
        for (int i = 0; i < 6; i++)
            insertAtBeginning(i);
        insertInBetween(position, 7);
        insertAtEnd();
        printList();
    }

    private static void insertAtEnd() {

        Node temp = head;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        Node newNode = createNode(11);
        newNode.setNext(null);
        temp.setNext(newNode);
    }

    private static void insertInBetween(int insert_position, int data) {

        Node temp = head;
        //if(insert_position == 0)    System.out.println("Insertion needs atleast position 1.");
        if(insert_position == 0)    insertAtBeginning(data);
        else{
            for(int i=0; i<insert_position-1; i++)
                temp = temp.getNext();
            Node newNode = createNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }

    }

    private static void printList() {
        Node temp = head;
        while (temp != null) {                          //temp!=null, NOT temp.getNext()!=null
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
    }

    private static void insertAtBeginning(int data) {
        Node newNode = createNode(data);
        if (head == null) {
            newNode.setNext(null);
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    private static Node createNode(int data) {
        return new Node(data);
    }

}


