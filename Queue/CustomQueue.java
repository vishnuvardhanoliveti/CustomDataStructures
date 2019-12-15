package CustomDataStructures.Queue;

import java.io.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomQueue implements Queue {
    int maxCapacity = 5;
    int size = 0;
    Node firstNode = null;
    Node lastNode = null;

    @Override
    public void enqueue(int data) throws QueueOverflowException {
        if (size == maxCapacity) {
            throw new QueueOverflowException("Queue is full");
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
            throw new QueueUnderflowException("queue is empty");
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

    @Override
    public void entryInLog(Exception e) {
        File file = new File("customQueueLog.txt");
        BufferedWriter bw = null;
        try {

            Date date = new Date();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd  HH.mm.ss");
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timing = sdf.format(timestamp);

            if (!file.exists()) {
                file.createNewFile();

            }
            FileWriter fw = new FileWriter(file, true);

            bw = new BufferedWriter(fw);
            bw.write("Timestamp:  " + timing);
            bw.write("\n");
            e.printStackTrace(new PrintWriter(bw));
            bw.write("\n");


        } catch (IOException io) {
            System.out.println(io.getMessage());
            io.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (Exception nio) {
                System.out.println(nio.getMessage());
            }
        }
    }
}


class QueueOverflowException extends Exception {
    QueueOverflowException(String message) {
        super(message);
    }
}

class QueueUnderflowException extends Exception {
    QueueUnderflowException(String message) {
        super(message);
    }
}
