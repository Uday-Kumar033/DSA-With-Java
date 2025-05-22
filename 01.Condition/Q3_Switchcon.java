import java.util.Scanner;
public class Q3_Switchcon {
    public static void main(String[]args){
     @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
     int button =sc.nextInt();
     switch(button){
        case 1: System.out.println("Hello boys");
        break;
        case 2: System.out.println("Hey Girls");
        break;
        case 3:System.out.println("Do it now");
        break;
        default:System.out.println("Invalid");
     } 
    }
}
