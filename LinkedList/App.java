package CustomDataStructures.LinkedList;

public class App {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(1,2,3,4,5);
        ll.traverse();
        System.out.println("removing 1");
        ll.remove(1);
        ll.traverse();
        System.out.println("Size of the linked list is "+ll.size());
    }
}
