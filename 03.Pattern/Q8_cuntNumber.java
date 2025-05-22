// public class Q8_cuntNumber {
//     public static void main(String []args){
//         int num=1,n=5;
//         for(int i=1; i<=n;i++){
//             int curr = num;
//             for(int j=0;j<i;j++){
//                 System.out.print(curr+" ");
//                 curr+= n-j-1;
//             }
//             num++;
//             System.out.println();
//         }
//     }
// }


public class Q8_cuntNumber {
    public static void main(String []args){
        int num=1,n=5;
        for(int i=1; i<=n;i++){
            int curr = num;
            for(int j=0;j<i;j++){
                System.out.print(curr+" ");
                curr+= n-j-1;
            }
            num++;
            
            System.out.println();
        }
    }
}
