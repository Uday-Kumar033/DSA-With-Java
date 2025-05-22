public class Q10_ButtomView {
    class Node {
        int data;
        Node right;
        Node left;
        Node(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
    public static void preorder(Node root) {
        if(root == null){
            return;
        }
        System.out.println(root);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
    }
}
