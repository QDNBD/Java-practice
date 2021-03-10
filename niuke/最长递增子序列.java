import java.util.*;


public class Solution {
    /**
     * retrun the longest increasing subsequence
     * @param arr int����һά���� the array
     * @return int����һά����
     */
     public int[] LIS (int[] arr) {
         if(arr.length <= 1) {
             return arr;
         }
         int n = arr.length;
         int[] end = new int[n + 1];//�б����������� �±��1��ʼ
         int[] dp = new int[n];//�洢ÿ��Ԫ�ص���������и���
         int len = 1;
         end[1] = arr[0];//�����еĵ�һ��Ԫ��Ĭ��Ϊ�����һ��Ԫ��
         dp[0] = 1;//��һ��Ԫ�ص���������и����϶���1
         for(int i = 0; i < n; i++) {
             if(end[len] < arr[i]) {//��arr[i] > end[len] ʱ arr[i]��ӵ� end����
                 end[++len] = arr[i];
                 dp[i] = len;
             }else {
                 // ��ǰԪ��С��end�е����һ��Ԫ�� ���ö��ַ�Ѱ�ҵ�һ������arr[i]��Ԫ��
                 // end[l] �滻Ϊ��ǰԪ�� dp[]
                 int left = 0;
                 int right = len;
                 while(left <= right) {
                     int mid = (left + right) >> 1;
                     if(end[mid] >= arr[i]) {
                         right = mid - 1;
                     }else {
                         left = mid + 1;
                     }
                 }
                 end[left] = arr[i];
                 dp[i] = left;
             }
         }
        int[] res = new int[len];
        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == len) {
                res[--len] = arr[i];
            }
        }
        return res;
    }
}