package LinkedList.SinglyLinkedList;

/**
 * Created by Gurpreet on 05/07/16.
 */

//Showing all deletion operations on Linked list

public class Deletions {

    private static Node head = null;

    public static void main(String[] args) {

        //create list.
        for (int i = 0; i < 6; i++){
            Node newNode = new Node(i);
            if (head == null) {
                newNode.setNext(null);
                head = newNode;
            } else {
                newNode.setNext(head);
                head = newNode;
            }
        }
        System.out.println("Original List: ");    printList();

        deletionFromBeginning();

        deletionFromEnd();

        deletionFromMiddle(3);

        System.out.println();
        System.out.println("Changed List: ");    printList();

    }

    private static void deletionFromMiddle(int position) {
        Node temp = head;
        for(int i=1; i<position-1; i++)
            temp = temp.getNext();
        temp.setNext(temp.getNext().getNext());
    }

    private static void deletionFromEnd() {
        Node temp = head;
        while(temp.getNext().getNext()!=null)
            temp = temp.getNext();
        temp.setNext(null);
    }

    private static void printList() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.getData()+"->");
            temp = temp.getNext();
    }
    }

    private static void deletionFromBeginning() {
        if(head==null)  System.out.print("Empty list, can't delete.");
        else{
            head = head.getNext();
        }
    }

}
