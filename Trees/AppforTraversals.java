package CustomDataStructures.Trees;

public class AppforTraversals {

    public static void main(String[] args) {
        Tree tree = new TreeImpl();
        Node root = new Node(1);
        root.setLeftChild(new Node(2));
        root.setRightChild(new Node(3));
        root.getLeftChild().setLeftChild(new Node(4));
        root.getLeftChild().setRightChild(new Node(5));
        root.getRightChild().setLeftChild(new Node(6));
        root.getRightChild().setRightChild(new Node(7));
        tree.bfs(root);
        System.out.println("Pre order Traversal");
        tree.preOrderTraversal(root);
        System.out.println();
        System.out.println("In order Traversal");
        tree.inOrderTraversal(root);
        System.out.println();
        System.out.println("Post order Traversal");
        tree.postOrderTraversal(root);
        System.out.println();
        System.out.println("list of depths");
        System.out.println(tree.listOfDepths(root));

    }
}
