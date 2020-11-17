import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(isScres(sc.nextLine()));
        }
        sc.close();
    }
    
    public static String isScres(String str) {
        if(str.length() <= 8 || str == null) {
            return "NG";
        }
        
        int Digit = 0;
        int lowercase = 0;
        int uppercase = 0;
        int other = 0;
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length;i++) {
            if(ch[i] >= '0' && ch[i] <= '9') {
                Digit = 1;
                continue;
            }else if(ch[i] >= 'A' && ch[i] <= 'Z') {
                uppercase = 1;
                continue;
            }else if(ch[i] >= 'a' && ch[i] <= 'z') {
                lowercase = 1;
                continue;
            }else {
                other = 1;
                continue;
            }
        }
        if(Digit+lowercase+uppercase+other < 3) {
            return "NG";
        }
        for(int i = 0; i < str.length()-2;i++) {
            String substr1 = str.substring(i, i+3);
            if (str.substring(i+1).contains(substr1))
            return "NG";
        }
        return "OK";
    }
}