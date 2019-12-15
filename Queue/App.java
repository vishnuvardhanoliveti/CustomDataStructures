package CustomDataStructures.Queue;

import CustomDataStructures.EntryInLogFile;

public class App {
    public static void main(String[] args) {

        EntryInLogFile log = new EntryInLogFile();
        final String fileName = "customQueueLog.txt";
        try {
            Queue q = new CustomQueue(5);
            q.enqueue(1, 2, 3, 4, 5);//using varargs method to pass multiple arguments

            System.out.println("Printing the Queue");
            q.printQueue(q.peek());

            System.out.println("Performing peek operation, Queue's first node is " + q.peek());
            //q.enqueue(6);

            while (!q.isEmpty()) {
                System.out.println("Performing dequeue operation: " + q.dequeue());
            }
            System.out.println("Performing peek operation when Queue is empty: " + q.peek());
            q.dequeue(); // uncomment to check for additional dequeue when queue will be empty
        } catch (QueueOverflowException o) {
            System.out.println(o.getMessage());
            log.entryInLogFile(o, fileName);
        } catch (QueueUnderflowException u) {
            System.out.println(u.getMessage());
            log.entryInLogFile(u, fileName);

        }
    }
}
