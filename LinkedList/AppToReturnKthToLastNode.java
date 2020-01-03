package CustomDataStructures.LinkedList;

public class AppToReturnKthToLastNode {

    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(1,2,3,4,5);
        Node n = ll.returnKthToLastNode(ll.getHead(), 2);
        System.out.println(n.getData());
    }
}
