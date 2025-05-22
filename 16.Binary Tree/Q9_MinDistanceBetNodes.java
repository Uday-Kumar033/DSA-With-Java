public class Q9_MinDistanceBetNodes {
    public static class Node{
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.right= null;
            this.left = null;
        }
    }

    public static int LcaDist(Node root, int tar, int distance) {
        if(root == null) {
            return  -1;
        }
        if(root.data == tar) {
            return distance;
        }
        int leftDist = LcaDist(root.left, tar, distance + 1);
        if(leftDist == -1 ) {
            return leftDist;
        }
        return LcaDist(root.right, tar, distance + 1);
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

    public static int minDist(Node root , int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        if(lca == null){
            return -1;
        }
        int dist1 = LcaDist(lca, n1, 0);
        int dist2 = LcaDist(lca, n2, 0);
        return dist1 + dist2;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 1, n2 = 6;
        System.out.print("The Minimum distance between "+n1+ " and " +n2 + " is : ");
        minDist(root, n1, n2);
    }
}
