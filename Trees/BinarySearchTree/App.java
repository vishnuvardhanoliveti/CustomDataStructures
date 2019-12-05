package CustomDataStructures.Trees.BinarySearchTree;

public class App {

    public static void main(String[] args) {
        BST obj = new BSTImpl();


        obj.minimalBST(new int[]{1, 2, 3, 4, 5});
        Node root = obj.getRoot();
        obj.bfs(root);

    }
}
