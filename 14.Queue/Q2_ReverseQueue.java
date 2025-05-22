import java.util.*;
public class Q2_ReverseQueue{
    public static void reverseQ(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String arg[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseQ(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}