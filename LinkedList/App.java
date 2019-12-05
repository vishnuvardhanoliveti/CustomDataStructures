package CustomDataStructures.LinkedList;

public class App {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);

        ll.traverse();
        System.out.println("removing 1");
        ll.remove(1);
        ll.traverse();
    }
}
