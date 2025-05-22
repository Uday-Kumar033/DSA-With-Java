public class Q3_factorial {
    public static void printFactorial(int num){
        if (num <0){
            System.out.println("Invalid Number");
        return;
        }
        int fact = 1;
        for(int i = num ; i>=1; i--){
            fact = fact*i;
        }
        System.out.println(fact);
        return;        
    }
    public static void main(String[] args) {
        printFactorial(5);
    }
}
