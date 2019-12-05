package CustomDataStructures.Stack;

public class App {
    public static void main(String[] args) throws StackOverFlowException, StackUnderFlowException {
        try {
            Stack stack = new CustomStack();

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            stack.printStack(stack.getTop());
            // stack.push(6);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (StackOverFlowException o) {
            System.out.println("Stack is full");
        } catch (StackUnderFlowException u) {
            System.out.println("Stack is empty");
        }
    }
}
