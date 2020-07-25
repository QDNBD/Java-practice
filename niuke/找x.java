import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String n = sc.nextLine();
            String[] num = sc.nextLine().split(" ");
            String x = sc.nextLine();
            System.out.println(Arrays.asList(num).indexOf(x));
        }
        sc.close();
    }
}