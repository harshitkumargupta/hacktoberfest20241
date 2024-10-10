// Binary Tree Node Class
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// Binary Tree Class
class BinaryTree {
    Node root;

    // In-order Traversal (Left, Root, Right)
    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.key + " ");
            inorderTraversal(node.right);
        }
    }

    // Pre-order Traversal (Root, Left, Right)
    void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Post-order Traversal (Left, Right, Root)
    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.key + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Constructing the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-order Traversal:");
        tree.inorderTraversal(tree.root);
        System.out.println("\nPre-order Traversal:");
        tree.preorderTraversal(tree.root);
        System.out.println("\nPost-order Traversal:");
        tree.postorderTraversal(tree.root);
    }
}
