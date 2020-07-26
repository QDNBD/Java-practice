import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int[] num = new int[n];
            for(int i = 0; i < n;i++) {
                num[i] = scan.nextInt();
            }
            int maxNum = num[0];
            int sum = num[0];
            for(int i = 1; i < n;i++) {
                if(sum >= 0) {
                   sum += num[i];
                }else {
                    sum = num[i];
                }
                if(sum > maxNum) {
                    maxNum = sum;
                }
            }
            
            System.out.println(maxNum);
        }
        scan.close();
    }
}