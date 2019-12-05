package CustomDataStructures.LinkedList;

public class AppForPalindrome {
    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.insert(0);
        ll.insert(1);
        ll.insert(2);
        ll.insert(1);
        ll.insert(0);

        System.out.println(ll.isPalindrome(ll.getHead()));

    }
}
