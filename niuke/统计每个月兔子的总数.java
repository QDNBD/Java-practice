import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(rabbit(n));
        }
        sc.close();
    }
    public static int rabbit(int n) {
        if(n <= 2) {
            return 1;
        }else {
            return rabbit(n-1) + rabbit(n-2);
        }
    }
}