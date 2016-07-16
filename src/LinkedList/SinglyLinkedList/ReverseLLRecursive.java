package LinkedList.SinglyLinkedList;

/**
 * Created by Gurpreet on 13/07/16.
 */
public class ReverseLLRecursive {

    public static Node head = null;

    public static void main(String[] args) {

        //create list.
        for (int i = 0; i < 6; i++) {
            Node newNode = new Node(i);
            if (head == null) {
                newNode.setNext(null);
                head = newNode;
            } else {
                newNode.setNext(head);
                head = newNode;
            }
        }

        System.out.println("Original List: ");  printList();

        reverseRecursive();

        System.out.print("Reversed List: ");    printList();

    }

    private static void reverseRecursive(){

        Node curr = head;
        Node prev = null;

        if(head == null)    System.out.println("Empty list.");

        while(curr != null){
            Node next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    private static void printList() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.getData()+"->");
            temp = temp.getNext();
        }
    }

}
