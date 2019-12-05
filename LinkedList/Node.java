package CustomDataStructures.LinkedList;

public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node n) {
        this.next = n;
    }

    @Override
    public String toString() {
        return Integer.toString(data);
    }
}
