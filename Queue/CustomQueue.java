package CustomDataStructures.Queue;

public class CustomQueue implements Queue {
    private int maxCapacity ;
    private int size = 0;
    private Node firstNode = null;
    private Node lastNode = null;

    CustomQueue(int capacity){
        this.maxCapacity = capacity;
    }

    @Override
    public void enqueue(int... data) throws QueueOverflowException {
        if (size == maxCapacity) {
            throw new QueueOverflowException("Queue is full. You cannot perform an enqueue operation");
        }

        for (int i : data) {
            size++;
            Node previousLastNode = lastNode;
            lastNode = new Node(i);
            lastNode.setNext(null);
            if (isEmpty()) {
                firstNode = lastNode;
            } else {
                previousLastNode.setNext(lastNode);
            }
        }


    }

    @Override
    public void printQueue(Node n) {
        while (n != null) {
            System.out.print(n + "->");
            n = n.getNext();

        }
        System.out.println();
    }


    @Override
    public int dequeue() throws QueueUnderflowException {
        if (size == 0) {
            throw new QueueUnderflowException("queue is empty. You cannot perform a dequeue operation");
        }
        size--;
        int dequeuedNum = firstNode.getData();
        firstNode = firstNode.getNext();

        if (isEmpty()) {
            lastNode = null;
        }

        return dequeuedNum;
    }

    @Override
    public Node peek() {
        return firstNode;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public boolean isFull(){
        return size == maxCapacity;
    }

    @Override
    public int size(){
        return size;
    }


}


class QueueOverflowException extends Exception {

    QueueOverflowException(String message) {
        super(message);
        System.out.println("inside constructor");
    }
}

class QueueUnderflowException extends Exception {
    QueueUnderflowException(String message) {
        super(message);
    }
}
