package CustomDataStructures.Queue;

public class CustomQueue implements Queue {
    int maxCapacity = 5;
    int size = 0;
    Node firstNode = null;
    Node lastNode = null;

    @Override
    public void enqueue(int data) throws QueueOverflowException {
        if (size == maxCapacity) {
            throw new QueueOverflowException();
        }
        size++;
        Node previousLastNode = lastNode;
        lastNode = new Node(data);
        lastNode.setNext(null);
        if (isEmpty()) {
            firstNode = lastNode;
        } else {
            previousLastNode.setNext(lastNode);
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
    public Node getFirstNode() {
        return firstNode;
    }

    @Override
    public int dequeue() throws QueueUnderflowException {
        if (size == 0) {
            throw new QueueUnderflowException();
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

    public boolean isEmpty() {
        return firstNode == null;
    }

}

class QueueOverflowException extends Exception {

}

class QueueUnderflowException extends Exception {

}
