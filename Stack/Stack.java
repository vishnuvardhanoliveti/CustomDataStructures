package CustomDataStructures.Stack;

public interface Stack {

    public void push(int... data) throws StackOverFlowException;

    public Node pop() throws StackUnderFlowException;

    public void printStack(Node head);

    public Node peek();

    public boolean isEmpty();

    public boolean isFull();

    public int size();


}
