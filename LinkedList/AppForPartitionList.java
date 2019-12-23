package CustomDataStructures.LinkedList;

public class AppForPartitionList {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(3,5,8,5,10,2,1);
        Node n = ll.partitionList(ll.getHead(), 5);
        System.out.println(n.getData());
       System.out.println("Printing the elements in Linked List");
        List.printList(n);//Accessing the method from interface as it is a static method
    }
}
