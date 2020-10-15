import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            String[] ch = new String[n];
            int[] chNum = new int[n];
            for (int i = 0; i < n; i++) {
                ch[i] = scan.next();
            }
            int invalid = 0;
            int sum = scan.nextInt();
            String[] chPeople = new String[sum];
            for (int i = 0; i < sum; i++) {
                chPeople[i] = scan.next();
            }

            int flat = 0;
            for (int i = 0; i < sum; i++) {
                flat = 0;
                for (int j = 0; j < n; j++) {
                    if (ch[j].equals(chPeople[i])) {
                        chNum[j]++;
                        flat = 1;
                        break;
                    }
                }
                if (flat == 0) {
                    invalid++;
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.println(ch[j] + " : " + chNum[j]);
            }
            System.out.println("Invalid : " + invalid);
        }
        scan.close();
    }
}