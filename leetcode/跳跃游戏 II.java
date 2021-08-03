class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int res = 0;
        int step = 0;
        int nextStep = nums[0];
        for(int i = 0; i < nums.length; i++) {
            nextStep = Math.max(nums[i] + i, nextStep);
            if(nextStep >= nums.length - 1) {
                return res + 1;
            }
            if(i == step) {
                res++;
                step = nextStep;
            }
        }
        return res;
    }
}