package CustomDataStructures.LinkedList;

public class AppforRemovingDuplicateNodes {

    public static void main(String[] args) {
        List ll = new LinkedList();

        ll.insert(1);
        ll.insert(1);
        ll.insert(1);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);

        ll.removeDuplicatesUsingTwoPointers(ll.getHead());

        // ll.removeDuplicatesUsingSet(ll.getHead());
        ll.traverse();
    }
}
