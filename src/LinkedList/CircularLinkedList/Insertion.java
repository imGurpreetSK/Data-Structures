package LinkedList.CircularLinkedList;

/**
 * Created by Gurpreet on 16/07/16.
 */
public class Insertion {

    private static NodeCLL head = null;
    private static int length = 0;

    public static void main(String[] args) {

        insertAtStart();
        insertAtEnd();
        insertAtEnd();
        insertAtEnd();
        insertInMiddle(4);
        printList();

    }

    private static void printList() {
        NodeCLL temp = head;
        do {
            System.out.print(temp.getData() + "-");
            temp = temp.getNext();
        } while (temp != head);
    }

    private static void insertInMiddle(int position) {
        NodeCLL newNode = createNode(3);
        NodeCLL temp = head;
        for(int i=1; i< position-1; i++){
            temp = temp.getNext();
        }
        newNode.setNext(temp.getNext());        //set value of newnode first
        temp.setNext(newNode);                  //then update temp
    }

    private static void insertAtEnd() {
        NodeCLL newNode = createNode(2);
        NodeCLL temp = head;
        if(temp.getNext() == head){
            newNode.setNext(temp);
            temp.setNext(newNode);           //equivalent to temp = newNode;
        }
        else {
            do {
                temp = temp.getNext();
            } while (temp.getNext() != head);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);          //equivalent to temp = newNode;
        }
    }

    private static void insertAtStart() {
        NodeCLL newNode = createNode(1);
        head = newNode;
        newNode.setNext(head);
        length++;
    }

    private static NodeCLL createNode(int data) {
        return new NodeCLL(data);
    }

}
