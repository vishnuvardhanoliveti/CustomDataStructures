package CustomDataStructures.Trees;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeImpl implements Tree {

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
    public void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root + "->");
        preOrderTraversal(root.getLeftChild());
        preOrderTraversal(root.getRightChild());

    }

    @Override
    public void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.getLeftChild());
        System.out.print(root + "->");
        inOrderTraversal(root.getRightChild());

    }

    @Override
    public void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        postOrderTraversal(root.getLeftChild());

        postOrderTraversal(root.getRightChild());
        System.out.print(root + "->");
    }

    @Override
    public List<LinkedList> listOfDepths(Node root) {
        List<LinkedList> list = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Node> ll = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Node poppedNode = q.poll();
                ll.add(poppedNode);
                if (poppedNode.getLeftChild() != null) {
                    q.offer(poppedNode.getLeftChild());
                }
                if (poppedNode.getRightChild() != null) {
                    q.offer(poppedNode.getRightChild());
                }
            }
            list.add(ll);
        }
        return list;

    }

    @Override
    public boolean checkBalanced(Node root) {
        int height = checkHeight(root);
        System.out.println("height is " + height);
        return height != Integer.MIN_VALUE;
    }

    private int checkHeight(Node root) {
        System.out.println("root is" + root);
        if (root == null) {
            return -1;
        }
        int leftHeight = checkHeight(root.getLeftChild());

        if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int rightHeight = checkHeight(root.getRightChild());
        if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int heightDiff = leftHeight - rightHeight;
        System.out.println(heightDiff);
        if (Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }

    }


}
