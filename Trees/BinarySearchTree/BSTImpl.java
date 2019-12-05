package CustomDataStructures.Trees.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BSTImpl implements BST {
    Node root = null;

    @Override
    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            insertNode(root, data);
        }
    }

    public void insertNode(Node root, int data) {
        if (root.getData() >= data) {
            if (root.getLeftChild() != null) {
                insertNode(root.getLeftChild(), data);
            } else {
                Node newNode = new Node(data);
                root.setLeftChild(newNode);
            }
        } else {
            if (root.getRightChild() != null) {
                insertNode(root.getRightChild(), data);
            } else {
                Node newNode = new Node(data);
                root.setRightChild(newNode);
            }
        }
    }


    @Override
    public void bfs(Node n) {
        Queue<Node> q = new LinkedList<>();
        q.offer(n);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node poppedNode = q.poll();

                if (poppedNode.getLeftChild() != null) {
                    q.offer(poppedNode.getLeftChild());
                }
                if (poppedNode.getRightChild() != null) {
                    q.offer(poppedNode.getRightChild());
                }
                System.out.print(poppedNode + ",");
            }
            System.out.println();

        }

    }

    @Override
    public Node getRoot() {
        return root;
    }

    @Override
    public void minimalBST(int[] arr) {
        int mid = arr.length / 2;
        insert(arr[mid]);

        for (int i = 0; i < arr.length; i++) {
            if (i == mid) {
                continue;
            }
            insert(arr[i]);

        }
    }
}
