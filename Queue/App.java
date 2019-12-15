package CustomDataStructures.Queue;

public class App {
    public static void main(String[] args) {
        Queue q = new CustomQueue();
        try {

            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.enqueue(5);

            q.printQueue(q.getFirstNode());


            System.out.println("performing peek operation " + q.peek());
            q.enqueue(6);

            q.dequeue();
            q.printQueue(q.getFirstNode());
            q.dequeue();
            q.dequeue();
            q.dequeue();
            q.printQueue(q.getFirstNode());
            System.out.println(q.dequeue());
            q.printQueue(q.getFirstNode());//check after dequeuing all
            //q.dequeue();
        } catch (QueueOverflowException o) {
            System.out.println(o.getMessage());
            q.entryInLog(o);
        } catch (QueueUnderflowException u) {
            System.out.println(u.getMessage());
             q.entryInLog(u);

        }
    }
}
