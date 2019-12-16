package CustomDataStructures.LinkedList;

public class AppForFindingMiddleNode {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(1,2,3,4,5);
        Node n = ll.returnMiddleNode(ll.getHead());
        System.out.println(n.getData());
    }
}
