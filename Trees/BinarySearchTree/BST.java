package CustomDataStructures.Trees.BinarySearchTree;

public interface BST {

    public void insert(int data);

    public Node getRoot();

    public void bfs(Node root);

    public void minimalBST(int[] arr);
}
