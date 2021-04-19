class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] sum = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            sum[nums[i]]++;
            if(sum[nums[i]] >= 2) {
                return nums[i];
            }
        }
        return -1;
    }
}