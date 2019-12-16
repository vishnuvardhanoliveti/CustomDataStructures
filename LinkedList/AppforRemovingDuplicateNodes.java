package CustomDataStructures.LinkedList;

public class AppforRemovingDuplicateNodes {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(1,1,1,3,4,5);

        ll.removeDuplicatesUsingTwoPointers(ll.getHead());

        // ll.removeDuplicatesUsingSet(ll.getHead());
        ll.traverse();
    }
}
