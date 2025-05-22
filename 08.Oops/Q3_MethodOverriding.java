//In this concept we override the class B over class B
class A{
    int s = 6;
    void sum(){
        System.out.println(6);
        System.out.println("Hello");
    }
}
class B extends A{
    void sum(){
        System.out.println("Hi");
    }
}
public class Q3_MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.sum();
        b.sum();
    }
}

// Output - Hi