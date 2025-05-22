public class Q8_LowestCommonAncestor {

    public static class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.right= null;
            this.left = null;
        }
    }

    public static Node lca2(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);
        if(leftLca == null) {
            return leftLca;
        }
        if(rightLca == null) {
            return rightLca;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 3, n2 = 2;
        Node lca = lca2(root, n1, n2);
        if(lca != null) {
            System.out.println("Lca of "+n1+ " and " + n2+" is: " +lca.data);
        }else {
            System.out.println("Lca doesn't exist.");
        }
    }
}
