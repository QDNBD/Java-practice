import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str1 = scan.next();
            String str2 = scan.next();
            BigInteger num1 = new BigInteger(str1);
            BigInteger num2 = new BigInteger(str2);
            System.out.println(num1.add(num2));
        }
        scan.close();
    }
}