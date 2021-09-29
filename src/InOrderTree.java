import java.util.Stack;

public class InOrderTree {
    public void InOrderRecursive(Node root) {
        if (root != null) {
            InOrderRecursive(root.left);
            System.out.print(root.data + " ");
            InOrderRecursive(root.right);
        }
    }


    public void InOrderIteration(Node root) {
        Stack<Node> s = new Stack<>();
        while (true) {

            while (root != null) {
                s.push(root);
                root = root.left;
            }

            // check if Stack is emtpy, if yes, exit from everywhere
            if (s.isEmpty()) {
                return;
            }
            // pop the element from the stack and go right to the tree
            root = s.pop();
            System.out.print(root.data + " ");
            root = root.right;
        }
    }

}
