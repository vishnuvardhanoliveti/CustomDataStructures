package CustomDataStructures.LinkedList;

public class AppForPartitionList {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(3,5,8,5,10,2,1);
        Node n = ll.partitionList(ll.getHead(), 5);
        System.out.println(n.getData());
        ll.traverse(n);
    }
}
