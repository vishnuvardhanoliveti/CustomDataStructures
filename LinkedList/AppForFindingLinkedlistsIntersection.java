package CustomDataStructures.LinkedList;

public class AppForFindingLinkedlistsIntersection {
    public static void main(String[] args) {
        List list1 = new LinkedList();
        List list2 = new LinkedList();
        list1.add(3,1,5,9,7,2,1);

        list2.add(4,6);
        list2.getHead().next.next = list1.getHead().next.next.next;
        Node res = list1.findIntersectionOfTwoLinkedLists(list1.getHead(), list2.getHead());

        System.out.println("Intersecting node is "+res);
    }
}
