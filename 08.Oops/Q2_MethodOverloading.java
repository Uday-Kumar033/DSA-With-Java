class A{
    void sum(){
        System.out.println("Hello");
    }
    public int sum(int a){
        return a;
    }
    public void sum(double a, double b) {
        System.out.println(a + " " +b);
    }
    public void sum(String d) {
        System.out.println(d);
    }

}
public class Q2_MethodOverloading {
    public static void main(String[] args) {
        A a  = new A();
        a.sum();
        a.sum(10);
        a.sum(1000,2000);
        a.sum("Uday");
    }
}