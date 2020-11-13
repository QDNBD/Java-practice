import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int num = n*n;
            System.out.print(add(n));
            System.out.print(" " + add(num));
        }
        sc.close();
    }
    public static int add(int count) {
        int sum = 0;
        while(count != 0) {
            sum += count % 10;
            count /= 10;
        }
        return sum;
    }
}