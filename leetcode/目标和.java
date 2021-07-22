class Solution {
    int res = 0;

    public int findTargetSumWays(int[] nums, int target) {
        Target(nums, target, 0);
        return res;
    }

    public void Target(int[] nums, int target, int index) {
        if(index == nums.length) {
            if(target == 0) {
                res++;
            }
            return;
        }
        Target(nums, target - nums[index], index + 1);
        Target(nums, target + nums[index], index + 1);
    }
}

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(target > sum) {
            return 0;
        }
        if((sum + target) % 2 == 1) {
            return 0;
        }
        int bigsize = (sum + target) / 2;
        int[] dp = new int[bigsize + 1];
        dp[0] = 1;
        for(int i = 0; i < nums.length; i++) {
            for(int j = bigsize; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[bigsize];
    }
}