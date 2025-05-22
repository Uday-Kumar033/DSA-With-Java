public class Q7_countPattern {
    public static void main(String[] args) {
        int num = 1, n = 4;
        for(int i = 1; i<=n;i++){
            for(int j = 1 ; j <= i;j++){
                System.out.print(num +" ");
                num ++;
            }
            System.out.println();
        }
    }
}
