import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = scan.nextInt();
            int[] array = new int[n+1];
            for(int i = 1;i <= n;i++) {
                array[i] = scan.nextInt();
            }
            int K = scan.nextInt();
            int d = scan.nextInt();
            
            long[][] fmax = new long[K+1][n+1];
            long[][] fmin = new long[K+1][n+1];
            
            long res = Integer.MIN_VALUE;
            for(int i = 1;i <= n;i++) {
                fmax[1][i] = array[i];
                fmin[1][i] = array[i];
                for (int k = 2; k <=K; k++) {
                    for (int j = i-1 ; j > 0 &&  i-j<=d ; j--) {
                        fmax[k][i] = Math.max(fmax[k][i], Math.max(fmax[k-1][j] * array[i], fmin[k-1][j] * array[i]));
                        fmin[k][i] = Math.min(fmin[k][i], Math.min(fmax[k-1][j] * array[i], fmin[k-1][j] * arr[i]));
                    }
                }
                res = Math.max(res,fmax[K][i]);
            }
            System.out.println(res);
        }
        scan.close();
    }
}