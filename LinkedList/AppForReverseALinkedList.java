package CustomDataStructures.LinkedList;

public class AppForReverseALinkedList {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(1,2,3,4,5);
        Node n = ll.reverseALinkedList(ll.getHead());
        System.out.println("Printing the elements in Linked List");
        List.printList(n);//Accessing the method from interface as it is a static method
    }
}
