import java.util.Scanner;

public class Q1_condition {
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your age:");
            int age =sc.nextInt();
            if(age>18){
                System.out.println("You are eligible for voting");
            }
            else{
                System.out.println("You are not eligible for vote,Please wait somedays");
            }
        }
    }
}
