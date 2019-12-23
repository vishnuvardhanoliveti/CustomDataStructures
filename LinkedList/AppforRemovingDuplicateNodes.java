package CustomDataStructures.LinkedList;

public class AppforRemovingDuplicateNodes {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(1,1,1,3,4,5);

        ll.removeDuplicatesUsingTwoPointers();

        // ll.removeDuplicatesUsingSet();
        System.out.println("Printing the elements in Linked List");
        ll.printList();
    }
}
