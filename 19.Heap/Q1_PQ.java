import java.util.PriorityQueue;
import java.util.Comparator;
public class Q1_PQ {
    public static void main(String[] args) {
        //   PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(2);
        pq.add(4);
        pq.add(7);
        pq.add(12);
        pq.add(14);
        while(!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}
