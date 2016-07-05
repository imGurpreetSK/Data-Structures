package LinkedList.DoublyLinkedList;

/**
 * Created by Gurpreet on 05/07/16.
 */
public class DeletionDLL {

    private static NodeDLL head;
    private static NodeDLL tail;

    public static void main(String[] args) {

        //Initial list
        for (int i = 0; i < 6; i++) {
            NodeDLL newNode = createNode(i);
            if (head == null) tail = newNode;
            newNode.setNext(head);
            head = newNode;
        }

        deleteFromBeginning();
        deleteFromEnd();
        deleteFromMiddle();
        printList();

    }

    private static void deleteFromMiddle() {
        int position = 3;
        NodeDLL temp = head;
        for(int i=1; i<position-1; i++)
            temp = temp.getNext();
        temp.getNext().setPrev(temp);
        temp.setNext(temp.getNext().getNext());
    }

    private static void deleteFromEnd() {
        tail = tail.getPrev();
        NodeDLL temp = head;
        while(temp.getNext().getNext()!=null) temp = temp.getNext();
        temp.setNext(null);
        //tail = tail.getPrev();
        //tail.setNext(null);
    }

    private static NodeDLL createNode(int data) {
        return new NodeDLL(data);
    }


    private static void printList() {
        NodeDLL temp = head;
        while(temp != null){
            System.out.print(temp.getData()+"-");
            temp = temp.getNext();                        //not temp.setNext(temp.getNext));
        }
    }

    private static void deleteFromBeginning() {
        head = head.getNext();
        head.setPrev(null);
    }

}
