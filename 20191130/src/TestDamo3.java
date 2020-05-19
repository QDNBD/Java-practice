import java.util.*;

public class TestDamo3 {

        public static int minString(String str1,String str2) {
            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();
            int i = 0;
            int j = 0;
            if(str1 == null || str2 == null || str1.length() < str2.length()) {
                return 0;
            }
            while(i < str1.length()) {
                if(array1[i] == array2[j]) {
                    i++;
                    j++;
                }else {
                    i++;
                }
                if(j >= str2.length()-1) {
                    break;
                }
            }
            return i+1;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str1 = scan.next();
            String str2 = scan.next();
            scan.close();
            int ret = minString(str1,str2);
            System.out.println(ret);
        }
}

