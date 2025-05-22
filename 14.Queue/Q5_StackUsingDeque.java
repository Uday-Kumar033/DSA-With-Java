import java.util.*;
public class Q5_StackUsingDeque {
    Deque<Integer> d = new LinkedList<>();
    public void push(int data){
      d.addLast(data);
    }
    public int pop(){
      return d.removeLast();
    }
    public int peek(){
      return d.getLast();
    }
  public static void main(String arg[]){
    Q5_StackUsingDeque S = new Q5_StackUsingDeque();
    S.push(1);
    S.push(2);
    S.push(3);
    S.push(4);
    System.out.println("Peek = "+S.peek());
    System.out.println(S.pop());
    System.out.println(S.pop());
    System.out.println(S.pop());
    System.out.println(S.pop());
  }
}