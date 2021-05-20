class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length <= 1) {
            return false;
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum % 2 != 0) {
            return false;
        }
        int wight = sum / 2;
        int[] dp = new int[wight + 1];
        for(int i = 0; i < nums.length; i++) {
            for(int j = wight; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        if(dp[wight] == wight) {
            return true;
        }
        return false;
    }
}