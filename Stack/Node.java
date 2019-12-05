package CustomDataStructures.Stack;


public class Node {
    int data;

    Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return Integer.toString(data);
    }


}
