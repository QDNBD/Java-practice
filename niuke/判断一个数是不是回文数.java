import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                int sum = sc.nextInt();
                if(sum < 0) {
                    sum = -sum;
                }
                int add = 0;
                int temp = sum;
                while(temp > 0) {
                    add = add * 10 + temp % 10;
                    temp /= 10;
                }
                if(sum == add) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
            sc.close();
        }
}