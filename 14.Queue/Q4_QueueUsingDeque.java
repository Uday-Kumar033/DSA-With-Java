import java.util.*;
public class Q4_QueueUsingDeque {
    Deque <Integer> d = new ArrayDeque<>();
    public void add(int data){
        d.addLast(data);
    }
    public int remove(){
        return d.removeFirst();
    }
    public int peek(){
        return d.getFirst();
    }
    public static void main(String[] args) {
        Q4_QueueUsingDeque q = new Q4_QueueUsingDeque();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("Peek = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
