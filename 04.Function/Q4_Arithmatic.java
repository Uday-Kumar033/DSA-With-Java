public class Q4_Arithmatic {
    public static void Unary(){
        int a = 10;
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println(--a);
    }
    public static void shift(){
        System.out.println(10<<2);//10*2^2 = 10 * 4 =40 (left shift)
        // System.out.println(10<<3);
        System.out.println(10>>2);//10/2^2=10/4 = 2 ( Right shift )
        int a = -10;
        System.out.println(a>>2);
    }
    public static void Logical_bitwise() {
        int a=10, b = 5, c = 20;
        System.out.println(a<b&&a<c);
        System.out.println(a>b&&c>b);
    }
    // public static void ternary(){
    //     int  a = 21;
    //     // String out = if(a > 20) ? "Vote" : "Unvote";
    //     // System.out.println(out);
    // }
    public static void main(String[] args) {
        // Unary();
        // shift();
        Logical_bitwise();
        // ternary();

    }
}
