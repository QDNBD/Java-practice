import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            boolean flat = true;
            for(int i = m; i <= n; i++) {
                int sum = 0;
                int num = i;
                while(num != 0) {
                    sum += Math.pow((num % 10),3);
                    num /= 10;
                }
                if(sum == i) {
                    flat = false;
                    System.out.print(i + " ");
                }
            }
            if(flat) {
                System.out.print("no");
            }
            System.out.println();
        }
        sc.close();
    }
}