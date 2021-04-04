class Solution {
    int res = 0;
    public int findTargetSumWays(int[] nums, int S) {
        getTarget(nums,S,0);
        return res;
    }
    private void getTarget(int[] nums,int S,int index) {
        if(index == nums.length) {
            if(S == 0) {
                res++;
            }
            return ;
        }
        getTarget(nums,S - nums[index],index + 1);
        getTarget(nums,S + nums[index],index + 1);
    }
}