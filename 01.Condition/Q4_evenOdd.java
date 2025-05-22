import java.util.*;
public class Q4_evenOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of x:");
            int x = sc.nextInt();
            if(x %2 ==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}
