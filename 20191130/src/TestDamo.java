import java.util.Scanner;

    public class TestDamo {

        //将字符串逆置
        public static String reverse1(String str) {
            char[] arr = str.toCharArray();
            int frist = 0;
            int last = arr.length;
            while (frist <  last) {
                char tem = arr[frist];
                arr[frist] = arr[last];
                arr[last] =tem;
                frist++;
                last--;
            }
            return String.copyValueOf(arr);
        }

        public static void main(String[] args) {
            String str = "abcdef";
            System.out.println(reverse1(str));
        }




        public static String func(String str,String str1) {
            return str + str1;
        }
        public static void main1(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String str1 = sc.next();
            System.out.println(func(str,str1));
        }


}