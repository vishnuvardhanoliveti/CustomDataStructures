package CustomDataStructures.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Node> list = new ArrayList<>();
            System.out.println("queue size is " + q.size());
            int size = q.size();
            for (int i = 0; i < size; i++) {

                Node polled = q.poll();
                list.add(polled);

                if (polled.getLeftChild() != null) {
                    q.offer(polled.getLeftChild());
                }
                if (polled.getRightChild() != null) {
                    q.offer(polled.getRightChild());
                }
                System.out.print(polled.getData());
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.setLeftChild(new Node(2));
        root.setRightChild(new Node(3));
        root.getLeftChild().setLeftChild(new Node(4));
        root.getLeftChild().setRightChild(new Node(5));
        root.getRightChild().setLeftChild(new Node(6));
        root.getRightChild().setRightChild(new Node(7));
        BFS obj = new BFS();
        obj.bfs(root);

    }
}
