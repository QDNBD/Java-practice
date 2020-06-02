import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            char[] array = str.toCharArray();
            for(int i = 0;i < str.length();i++){
                char c = array[i];
                if('A' <= c) {
                    c = (char)('E' < c ? (c-5) : (c +21));
                }
                array[i] = c;
            }
            System.out.println(new String(array));
        }
        sc.close();
    }
}