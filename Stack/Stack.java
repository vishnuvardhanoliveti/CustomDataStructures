package CustomDataStructures.Stack;

public interface Stack {

    public void push(int data) throws StackOverFlowException;

    public Node pop() throws StackUnderFlowException;

    public void printStack(Node head);

    public Node getTop() throws StackUnderFlowException;


}
