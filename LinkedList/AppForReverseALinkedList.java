package CustomDataStructures.LinkedList;

public class AppForReverseALinkedList {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(1,2,3,4,5);
        Node n = ll.reverseALinkedList(ll.getHead());
        ll.traverse(n);
    }
}
