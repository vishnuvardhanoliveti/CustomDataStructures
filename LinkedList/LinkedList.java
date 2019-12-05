package CustomDataStructures.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedList implements List {

    Node head = null;
    int size = 0;

    @Override
    public void insert(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node(data));
        }
    }

    @Override
    public void remove(int data) {

        //base case if data is in head
        if (head != null && head.getData() == data) {
            head = head.getNext();

        } else {
            removeNode(head, head.getNext(), data);
        }


    }

    public void removeNode(Node prev, Node curr, int data) {
        while (curr != null) {
            if (curr.getData() == data) {
                prev.setNext(curr.getNext());
                curr = null;
            }
            prev = curr;
            curr = curr.getNext();

        }
    }

    @Override
    public void traverse() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + "->");
            curr = curr.getNext();
        }
    }

    @Override
    public Node getHead() {
        return head;
    }

    @Override
    public void removeDuplicatesUsingSet(Node n) {
        Set<Integer> set = new HashSet<>();
        Node curr = n;
        Node prev = null;
        while (curr != null) {
            if (set.contains(curr.getData())) {
                prev.setNext(curr.getNext());
            } else {
                set.add(curr.getData());
                prev = curr;
            }

            curr = curr.getNext();
        }
    }

    @Override
    public void removeDuplicatesUsingTwoPointers(Node n) {
        Node curr = n;
        while (curr != null) {
            Node pointer = curr;
            while (pointer.next != null) {
                if (pointer.next.getData() == curr.getData()) {
                    pointer.setNext(pointer.getNext().getNext());
                } else {
                    pointer = pointer.getNext();
                }
            }
            curr = curr.getNext();
            //System.out.println("Next node is"+curr.getData());
        }
    }

    @Override
    public Node returnKthToLastNode(Node n, int num) {

        Node p1 = n;
        Node p2 = n;

        for (int i = 0; i < num; i++) {
            if (p1 == null) return null;
            p1 = p1.getNext();
        }

        while (p1 != null) {
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        return p2;
    }

    @Override
    public Node returnMiddleNode(Node n) {
        Node fastPointer = n;
        Node slowPointer = n;

        while (fastPointer.getNext() != null && fastPointer.getNext().getNext() != null) {
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
        }
        return slowPointer;
    }

    @Override
    public Node partitionList(Node curr, int x) {
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;
        while (curr != null) {
            Node next = curr.getNext();
            curr.setNext(null);

            if (curr.getData() < x) {
                if (beforeStart == null) {
                    beforeStart = curr;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.setNext(curr);
                    beforeEnd = curr;
                }
            } else {
                if (afterStart == null) {
                    afterStart = curr;
                    afterEnd = afterStart;
                } else {
                    afterEnd.setNext(curr);
                    afterEnd = curr;
                }
            }
            curr = next;
        }

        /* Merge before list and after list */

        if (beforeStart == null)
            return afterStart;

        beforeEnd.setNext(afterStart);

        return beforeStart;

    }

    public void traverse(Node n) {
        Node curr = n;
        while (curr != null) {
            System.out.print(curr.getData() + "->");
            curr = curr.getNext();
        }
    }

    @Override
    public boolean isPalindrome(Node n) {
        Node reverseHead = reverse(n);
        return isEquals(n, reverseHead);
    }

    private boolean isEquals(Node n1, Node n2) {
        while (n1 != null && n2 != null) {
            if (n1.getData() != n2.getData()) {
                return false;
            }
            n1 = n1.getNext();
            n2 = n2.getNext();
        }

        return n1 == null && n2 == null;
    }

    private Node reverse(Node n) {
        Node head = null;
        while (n != null) {
            Node newNode = new Node(n.getData());
            newNode.setNext(head);
            head = newNode;
            n = n.getNext();
        }
        return head;
    }

    @Override
    public Node reverseALinkedList(Node n) {
        Node prev = null;
        Node next = null;
        Node curr = n;
        while (curr != null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        return prev;
    }

    @Override
    public Node findIntersectionOfTwoLinkedLists(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }

        Result r1 = getLengthAndTail(head1);
        Result r2 = getLengthAndTail(head2);

        Node smallList = r1.length > r2.length ? head2 : head1;
        Node longList = r1.length > r2.length ? head1 : head2;

        longList = getKthNode(longList, Math.abs(r1.length - r2.length));

        while (longList != smallList) {
            longList = longList.getNext();
            smallList = smallList.getNext();
        }
        return longList;

    }

    private Node getKthNode(Node n, int num) {
        Node curr = head;
        while (num > 0 && curr != null) {
            num--;
            curr = curr.getNext();
        }
        return curr;
    }

    private Result getLengthAndTail(Node n) {
        Node curr = n;
        int i = 1;
        while (curr != null) {
            i++;
            curr = curr.getNext();
        }

        return new Result(i, curr);
    }
}

class Result {
    int length;
    Node tail;

    Result(int n, Node node) {
        this.length = n;
        this.tail = node;
    }
}
