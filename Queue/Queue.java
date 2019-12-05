package CustomDataStructures.Queue;

public interface Queue {
    public void enqueue(int data) throws QueueOverflowException;

    public int dequeue() throws QueueUnderflowException;

    public void printQueue(Node firstNode);

    public Node getFirstNode();

    public Node peek();

}
