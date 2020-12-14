import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] arr = str.split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i = arr.length-1;i > 0;i--) {
                sb.append(arr[i] + " ");
            }
            sb.append(arr[0]);
            System.out.println(sb.toString());
        }
        scan.close();
    }
}