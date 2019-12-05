package CustomDataStructures.Trees;

import java.util.LinkedList;
import java.util.List;

public interface Tree {

    public void bfs(Node root);

    public void preOrderTraversal(Node root);

    public void inOrderTraversal(Node root);

    public void postOrderTraversal(Node root);

    public List<LinkedList> listOfDepths(Node root);

    public boolean checkBalanced(Node root);

}
