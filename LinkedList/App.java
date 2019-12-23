package CustomDataStructures.LinkedList;

public class App {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(1,2,3,4,5);
        System.out.println("Printing the elements in Linked List");
        ll.printList();
        System.out.println("removing 1");
        System.out.println(ll.remove(1));
        System.out.println("Printing the elements in Linked List");
        ll.printList();
        System.out.println("Size of the linked list is "+ll.size());
    }
}
