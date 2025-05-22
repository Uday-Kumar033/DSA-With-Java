import java.util.Scanner;

public class Q2_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arr : ");
        int size = sc.nextInt();
        int num[] = new int [size];
        //input 
        System.out.println("Enter array: ");
        for(int i =0; i<size ; i++){
            num[i] = sc.nextInt();
        }
        for(int i = 0; i<size ; i++){
            System.out.print(num[i] + " ");
        }
    }
}
