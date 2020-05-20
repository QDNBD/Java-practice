import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(i);
                if (!builder.toString().contains(temp + "")) {
                    builder.append(temp);
                }
            }System.out.println(builder.toString());
        }
    }
}
