import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Q6_topView {
    public static void topView(Node root) {
        if (root == null) {
            return;
        }
        TreeMap<Integer, Integer> topViewMap = new TreeMap<>();
        Queue<info> queue = new LinkedList<>();
        queue.add(new info(root, 0));

        while (!queue.isEmpty()) {
            info current = queue.poll();
            Node currentNode = current.node;
            int hd = current.hd;
            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, currentNode.data);
            }
            if (currentNode.left != null) {
                queue.add(new info(currentNode.left, hd - 1));
            }
            if (currentNode.right != null) {
                queue.add(new info(currentNode.right, hd + 1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : topViewMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }
    
    static class info {
        Node node;
        int hd;

        info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Top view of the binary tree is: ");
        topView(root);
    }
}
