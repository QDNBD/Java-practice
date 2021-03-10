import java.util.*;


public class Solution {
    /**
     * retrun the longest increasing subsequence
     * @param arr int整型一维数组 the array
     * @return int整型一维数组
     */
     public int[] LIS (int[] arr) {
         if(arr.length <= 1) {
             return arr;
         }
         int n = arr.length;
         int[] end = new int[n + 1];//列表的最大子序列 下标从1开始
         int[] dp = new int[n];//存储每个元素的最大子序列个数
         int len = 1;
         end[1] = arr[0];//子序列的第一个元素默认为数组第一个元素
         dp[0] = 1;//第一个元素的最大子序列个数肯定是1
         for(int i = 0; i < n; i++) {
             if(end[len] < arr[i]) {//当arr[i] > end[len] 时 arr[i]添加到 end后面
                 end[++len] = arr[i];
                 dp[i] = len;
             }else {
                 // 当前元素小于end中的最后一个元素 利用二分法寻找第一个大于arr[i]的元素
                 // end[l] 替换为当前元素 dp[]
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