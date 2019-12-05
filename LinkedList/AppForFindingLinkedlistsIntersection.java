package CustomDataStructures.LinkedList;

public class AppForFindingLinkedlistsIntersection {
    public static void main(String[] args) {
        List list1 = new LinkedList();
        List list2 = new LinkedList();

        list1.insert(3);
        list1.insert(1);
        list1.insert(5);
        list1.insert(9);
        list1.insert(7);
        list1.insert(2);
        list1.insert(1);


        list2.insert(4);
        list2.insert(6);

        list2.getHead().next.next = list1.getHead().next.next.next;


        Node res = list1.findIntersectionOfTwoLinkedLists(list1.getHead(), list2.getHead());

        System.out.println(res);
    }
}
