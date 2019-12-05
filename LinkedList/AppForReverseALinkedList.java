package CustomDataStructures.LinkedList;

public class AppForReverseALinkedList {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);

        Node n = ll.reverseALinkedList(ll.getHead());
        ll.traverse(n);
    }
}
