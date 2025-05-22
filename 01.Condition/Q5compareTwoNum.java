import java.util.Scanner;
public class Q5compareTwoNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of a:");
            int a = sc.nextInt();
            System.out.print("Enter the value of b:");
            int b = sc.nextInt();
            if(a==b){
                System.out.println("Both are equal");
            }else{    
                if(a>b){
                    System.out.println("A is greater than B");
                }else{
                    System.out.println("B is greater than A");
                }
            }
        }
    }
}
