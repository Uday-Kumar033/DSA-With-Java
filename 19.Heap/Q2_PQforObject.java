import java.util.PriorityQueue;

public class Q2_PQforObject {

//PriorityQueue for Object
static class Student  implements Comparable<Student>{
    String name;
    int rank;
    public Student(String name , int rank) {
        this.name = name;
        this.rank = rank;
    }
    @Override
    public int compareTo(Student s2){
        return Integer.compare(this.rank, s2.rank);
    }

    @Override
    public String toString(){
        return name + rank;
    }
}
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Uday ", 100));
        pq.add(new Student("Aashish ",99));
        pq.add(new Student("Sachin ", 98));
        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
