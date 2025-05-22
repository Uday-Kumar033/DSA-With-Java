import java.util.*;
public class Q3_Deque {
  public static void main(String[] args) {
    Deque<Integer> D = new LinkedList<>();
    D.addFirst(1);
    D.addFirst(2);
    D.addFirst(3);
    D.addFirst(4);
    D.addFirst(5);
    D.addFirst(6);
    D.addFirst(7);
    D.addFirst(8);
    System.out.println(D);
    D.removeFirst();
    D.removeFirst();
    D.removeLast();
    System.out.println(D);
    System.out.println(D.getFirst());
    System.out.println(D.getLast());
  }
}

