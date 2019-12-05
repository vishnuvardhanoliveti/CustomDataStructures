package CustomDataStructures.LinkedList;

public class AppToRetunKthToLastNode {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        Node n = ll.returnKthToLastNode(ll.getHead(), 2);
        System.out.println(n.getData());
    }
}
