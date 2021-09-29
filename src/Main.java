public class Main {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(25);
        root.left.left = new Node(1);
        root.left.right = new Node(9);
        root.left.right.left = new Node(8);
        root.left.left.right = new Node(2);
        root.left.left.right.right = new Node(3);
        root.right.left = new Node(15);
        root.right.right = new Node(27);
        root.right.left.left = new Node(13);
        root.right.left.right = new Node(21);

        PreOrderTree i = new PreOrderTree();
        i.preOrderRecursive(root);
        System.out.println();
        i.preorderIteration(root);

        System.out.println("\n");

        InOrderTree j = new InOrderTree();
        j.InOrderRecursive(root);
        System.out.println();
        j.InOrderIteration(root);

        /*System.out.println("\n");

        PostOrder k = new PostOrder();
        j.InOrderRecursive(root);
        System.out.println();
        j.InOrderIteration(root);*/
    }
}
