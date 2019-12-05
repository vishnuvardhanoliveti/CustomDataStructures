package CustomDataStructures.Stack;


public class CustomStack implements Stack {

    int size = 0;
    int maxCapacity = 5;
    Node top = null;

    @Override
    public void push(int data) throws StackOverFlowException {
        if (size == maxCapacity) {
            throw new StackOverFlowException();
        }
        size++;
        if (top == null) {
            top = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.setNext(top);
            top = newNode;
        }
    }

    @Override
    public Node getTop() throws StackUnderFlowException {
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
            throw new StackUnderFlowException();
        }
        size--;
        Node poppedNode = top;
        top = top.getNext();

        return poppedNode;
    }
}


class StackOverFlowException extends Exception {

}

class StackUnderFlowException extends Exception {

}