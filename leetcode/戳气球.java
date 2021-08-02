class Solution {
    public int maxCoins(int[] nums) {
        if(nums.length == 0) {
            return 1;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        int[] val = new int[nums.length + 2];
        val[0] = 1;
        val[nums.length + 1] = 1;
        for(int i = 1;i <= nums.length;i++) {
            val[i] = nums[i - 1];
        }
        int[][] dp = new int[val.length][val.length];
        for(int i = val.length - 1;i >= 0;i--) {
            for(int j = 0;j < val.length;j++) {
                for(int k = i + 1;k < j;k++) {
                    //戳破最后一个气球加上这个气球两边的分数
                    int scope = val[k] * val[i] * val[j];
                    dp[i][j] = Math.max(scope + dp[i][k] + dp[k][j],dp[i][j]);
                }
            }
        }
        return dp[0][val.length - 1];
    }
}
