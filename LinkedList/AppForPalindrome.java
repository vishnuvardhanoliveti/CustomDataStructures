package CustomDataStructures.LinkedList;

public class AppForPalindrome {
    public static void main(String[] args) {
        List ll = new LinkedList();
        ll.add(0,1,2,1,0);
        System.out.println("Given linked list is a Palindrome :"+ll.isPalindrome(ll.getHead()));

    }
}
