package CustomDataStructures.Stack;


public class CustomStack implements Stack {

    private int size = 0;
    private int maxCapacity;
    private Node top = null;

    CustomStack(int capacity) {
        this.maxCapacity = capacity;
    }

    @Override
    public void push(int... data) throws StackOverFlowException {
        if (size == maxCapacity) {
            throw new StackOverFlowException("Stack is full. You cannot perform a push operation");
        }

        for (int i : data) {
            size++;
            if (top == null) {
                top = new Node(i);
            } else {
                Node newNode = new Node(i);
                newNode.setNext(top);
                top = newNode;
            }
        }
    }

    @Override
    public Node peek() {
        return top;
    }

    @Override
    public void printStack(Node n) {
        while (n != null) {
            System.out.println(n);
            n = n.getNext();
        }


    }

    @Override
    public Node pop() throws StackUnderFlowException {
        if (size == 0) {
            throw new StackUnderFlowException("Stack is empty.You cannot perform a pop operation");
        }
        size--;
        Node poppedNode = top;
        top = top.getNext();

        return poppedNode;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return size == maxCapacity;
    }

    @Override
    public int size() {
        return size;
    }
}

class StackOverFlowException extends Exception {
    StackOverFlowException(String message){
        super(message);
    }
}

class StackUnderFlowException extends Exception {
    StackUnderFlowException(String message){
        super(message);
    }
}