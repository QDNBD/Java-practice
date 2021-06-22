import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        int ret = 1;
        for(int i = 0;i < len;ret *= A[i++]) {
            B[i] = ret;
        }
        int num = 1;
        for(int j = len-1;j >= 0;num *= A[j--]) {
            B[j] *= num;
        }
        return B;
    }
}