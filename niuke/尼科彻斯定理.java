import java.util.*;

public class Main{
    public static void nkeadd(int n) {
        int num = n*(n-1)+1;
        System.out.print(num);
        for(int i = 1; i < n;i++) {
            System.out.print("+"+ (num += 2));
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            nkeadd(n);
        }
        scan.close();
    }
}