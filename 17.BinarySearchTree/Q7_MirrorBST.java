public class Q7_MirrorBST {
    public static class Node{
        int val;
        Node left , right;
        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void Preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static Node createMirror(Node root) {
        if(root == null) {
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.right = new Node(6);
        root.left.left = new Node(3);
        root.right.right = new Node(11);
        createMirror(root);
        Preorder(root);
    }
}
