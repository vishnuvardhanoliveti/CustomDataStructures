package CustomDataStructures.LinkedList;

public class AppForPartitionList {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.insert(3);
        ll.insert(5);
        ll.insert(8);
        ll.insert(5);
        ll.insert(10);
        ll.insert(2);
        ll.insert(1);

        Node n = ll.partitionList(ll.getHead(), 5);
        System.out.println(n.getData());
        ll.traverse(n);
    }
}
