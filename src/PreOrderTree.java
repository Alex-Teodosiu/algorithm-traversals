import java.util.Stack;

public class PreOrderTree {
    public void preOrderRecursive(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    public void preorderIteration(Node root) {
        Stack<Node> s = new Stack<Node>();
        while (true) {
            // First print the root node and then add left node
            while (root != null) {
                System.out.print(root.data + " ");
                s.push(root);
                root = root.left;
            }
            // check if Stack is emtpy, if yes, exit from everywhere
            if (s.isEmpty()) {
                return;
            }
            // pop the element from the stack and go right to the tree
            root = s.pop();
            root = root.right;
        }
    }

}


