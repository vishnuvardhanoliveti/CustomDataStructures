package CustomDataStructures.LinkedList;

public interface List {

    public void add(int ...data);

    public boolean remove(int data);

    public void printList();

    public int size();

    public void removeDuplicatesUsingSet();

    public void removeDuplicatesUsingTwoPointers();

    public Node getHead();

    public Node returnKthToLastNode(Node head, int num);

    public Node returnMiddleNode(Node head);

    public Node partitionList(Node head, int x);

    public boolean isPalindrome(Node head);

    public Node reverseALinkedList(Node head);

    public Node findIntersectionOfTwoLinkedLists(Node head1, Node head2);


    /*If a method is not required to be used in all classes which implement this List interface
      then a static method can be created in this interface which has body
     */
    public static void printList(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr + "->");
            curr = curr.getNext();
        }
        System.out.println();
    }
}
