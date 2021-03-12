import java.util.*;

public class KthNumbers {
    public int[] findKthNumbers(int[] A, int n, int k) {
        // write code here
        int trueLen = A.length;
        int count = n - k;
        while(count > 0) {
            //找到最大数下标
            int maxIndex = 0;
            for(int i = 1; i < trueLen; i++) {
                if(A[maxIndex] < A[i]) {
                    maxIndex = i;
                }
            }
            //删除最大数
            for(int i = maxIndex; i < trueLen - 1; i++) {
                A[i] = A[i + 1];
            }
            trueLen--;
            count--;
        }
        //整合返回数组
        int[] res = new int[trueLen];
        for(int i = 0; i < trueLen; i++) {
            res[i] = A[i];
        }
        return res;
    }
}