package CustomDataStructures.Trees;

public class AppToCheckBalanced {

    public static void main(String[] args) {
        Tree tree = new TreeImpl();
        Node root = new Node(1);
        root.setLeftChild(new Node(2));
        root.setRightChild(new Node(3));
        root.getLeftChild().setLeftChild(new Node(4));
        root.getLeftChild().setRightChild(new Node(5));
        root.getRightChild().setLeftChild(new Node(6));
        root.getRightChild().setRightChild(new Node(7));
        root.getRightChild().getRightChild().setRightChild(new Node(8));
        //root.getRightChild().getRightChild().getRightChild().setRightChild(new Node(9));

        System.out.println(tree.checkBalanced(root));
    }
}
