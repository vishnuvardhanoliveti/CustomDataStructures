package CustomDataStructures.Stack;

import CustomDataStructures.EntryInLogFile;

public class App {
    public static void main(String[] args) {
        EntryInLogFile log = new EntryInLogFile();
        final String fileName = "customStackLog.txt";

        try {
            Stack stack = new CustomStack(5);
            stack.push(1, 2, 3, 4, 5);
            System.out.println("Printing the stack");
            stack.printStack(stack.peek());
            // stack.push(6);
            System.out.println("Performing peek operation on Stack: " + stack.peek());

            while (!stack.isEmpty()) {
                System.out.println("Performing pop operation on stack:" + stack.pop() + " is popped");
            }

            System.out.println("Performing peek operation on Stack when it is empty: " + stack.peek());
            System.out.println("Performing pop operation on stack:" + stack.pop() + " is popped");

        } catch (StackOverFlowException o) {
            System.out.println(o.getMessage());
            log.entryInLogFile(o,fileName);

        } catch (StackUnderFlowException u) {
            System.out.println(u.getMessage());
            log.entryInLogFile(u,fileName);
        }
    }
}
