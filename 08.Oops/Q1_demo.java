class  A{
    public void sum(){
        int b = 7;
        int a = 5;
        int sum = a + b;
        System.out.println(sum);
    }
}
class B extends A{
    public void sub(){
        int a = 3;
        int b = 2;
        int sub = a-b;
        System.out.println(sub);
        }
}
            
public class Q1_demo {
    public static void main(String[] args) {
        B l = new B();
        l.sum();
        l.sub();
        
    }
}
