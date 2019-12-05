package CustomDataStructures.LinkedList;

public interface List {

    public void insert(int data);

    public void remove(int data);

    public void traverse();

    public void traverse(Node head);

    public void removeDuplicatesUsingSet(Node head);

    public void removeDuplicatesUsingTwoPointers(Node head);

    public Node getHead();

    public Node returnKthToLastNode(Node head, int num);

    public Node returnMiddleNode(Node head);

    public Node partitionList(Node head, int x);

    public boolean isPalindrome(Node head);

    public Node reverseALinkedList(Node head);

    public Node findIntersectionOfTwoLinkedLists(Node head1, Node head2);
}
