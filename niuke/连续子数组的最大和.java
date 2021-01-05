

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
//         int len = array.length;
//         int[] dp = new int[len];
//         int max = array[0];
//         dp[0] = array[0];
//         for(int i = 1; i < len;i++) {
//             dp[i] = array[i] + dp[i-1];
//             if(dp[i] < array[i]){
//                 dp[i] = array[i];
//             }
//             if(dp[i] > max) {
//                 max = dp[i];
//             }
//         }
//         return max;
        
        
        
//         int[] dp = new int[array.length];
//         int max = array[0];
//         dp[0] = array[0];
//         for(int i = 1;i < array.length;i++) {
//             dp[i] = Math.max(dp[i-1] + array[i],array[i]);
//             if(max < dp[i]) {
//                 max = dp[i];
//             }
//         }
//         return max;
        
        
        int max = array[0];
        int total = array[0];
        for(int i = 1;i < array.length;i++) {
            if(total >= 0) {
                total += array[i];
            }else {
                total = array[i];
            }
            if(max < total) {
                max = total;
            }
        }
        return max;
    }
}