public class Solution {
    public int JumpFloor(int target) {
//         int[] dp = new int[target+1];
//         dp[0] = 1;
//         dp[1] = 1;
//         for(int i = 2;i <= target;i++) {
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[target];
        int first = 1;
        int second = 2;
        int third = target;
        while(target > 2) {
            third = second + first;
            first = second;
            second = third;
            target--;
        }
        return third;
    }
}