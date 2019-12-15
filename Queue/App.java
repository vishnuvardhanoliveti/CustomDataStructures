package CustomDataStructures.Queue;

public class App {
    public static void main(String[] args) {
        Queue q = new CustomQueue(5);
        try {

            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.enqueue(5);

            q.printQueue(q.peek());


            System.out.println("Performing peek operation, Queue's first node is " + q.peek());
            q.enqueue(6);

            q.dequeue();
            q.printQueue(q.peek());
            q.dequeue();
            q.dequeue();
            q.dequeue();
            q.printQueue(q.peek());
            System.out.println(q.dequeue());
            q.printQueue(q.peek());//check after dequeuing all
            //q.dequeue(); // uncomment to check for additional dequeue when queue will be empty
        } catch (QueueOverflowException o) {
            System.out.println(o.getMessage());
            q.entryInLog(o);
        } catch (QueueUnderflowException u) {
            System.out.println(u.getMessage());
            q.entryInLog(u);

        }
    }
}
