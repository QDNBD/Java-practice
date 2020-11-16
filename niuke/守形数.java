import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int num = n*n;
            String s1 = String.valueOf(n);
            String s2 = String.valueOf(num);
            String s = s2.substring(s2.length() - s1.length(),s2.length());
            if(s.equals(s1)) {
                System.out.println("Yes!");
            }else {
                System.out.printlAn("No!");
            }
        }
        sc.close();
    }
}