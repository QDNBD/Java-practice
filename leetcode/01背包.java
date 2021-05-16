import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int begWight = sc.nextInt();
            int[] weight = new int[n];
            int[] value = new int[n];
            for(int i = 0; i < n; i++) {
                weight[i] = sc.nextInt();
                value[i] = sc.nextInt();
            }
            int[][] dp = new int[n + 1][begWight + 1];
            for(int i = begWight; i >= weight[0]; i--) {
                dp[0][i] = dp[0][i - weight[0]] + value[0];
            }
            for(int i = 1; i < weight.length; i++) {
                for(int j = 0; j <= begWight; j++) {
                    if(j < weight[i]) {
                        dp[i][j] = dp[i - 1][j];
                    }else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
                    }
                }
            }
            System.out.println(dp[weight.length - 1][begWight]);
        }
        sc.close();
    }
}




import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int begWight = sc.nextInt();
            int[] weight = new int[n];
            int[] value = new int[n];
            for(int i = 0; i < n; i++) {
                weight[i] = sc.nextInt();
                value[i] = sc.nextInt();
            }
            int[] dp = new int[begWight + 1];
            for(int i = 0; i < weight.length; i++) {
                for(int j = begWight; j >= weight[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
                }
            }
            System.out.println(dp[begWight]);
        }
        sc.close();
    }
}