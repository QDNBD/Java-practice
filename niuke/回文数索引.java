import java.util.Scanner;

public class Main{
    public static boolean IsPalindrome(StringBuilder sb,int[] star,int[] end) {
        int i = 0;
        int j = sb.length() - 1;
        boolean result = true;
        while (i <= j) {
            if(sb.charAt(i) == sb.charAt(j)) {
                i++;
                j--;
            }else {
                result = false;
                if(star != null) 
                    star[0] = i;
                if(end != null)
                    end[0] = j;
                break;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            StringBuilder sb = new StringBuilder(sc.next()) ;
            int[] star = new int[1];
            int[] end = new int[1];
            if(IsPalindrome(sb,star,end)) {
                System.out.println(-1);
            }else {
                sb.deleteCharAt(end[0]);
                if(IsPalindrome(sb,null,null)) {
                    System.out.println(end[0]);
                }else {
                    System.out.println(star[0]);
                }
            }
            t--;
        }
    }
}