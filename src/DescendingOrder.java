import java.util.ArrayList;
import java.util.Stack;

public class DescendingOrder {
    public void descendingRecursive(Node root){
        if (root != null){
            descendingRecursive(root.right);
            System.out.print(root.data + " ");
            descendingRecursive(root.left);
        }
    }

    public void descendingIteration(Node root){
        Stack<Node> stack = new Stack<>();
        while (true){
            while (root != null){
                stack.push(root);
                root = root.right;
            }
            if (stack.empty()){
                return;
            }
            root = stack.pop();
            System.out.print(root.data + " ");
            root = root.left;
        }
    }
}
