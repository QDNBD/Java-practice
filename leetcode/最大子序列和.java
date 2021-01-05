class Solution {
    public int maxSubArray(int[] nums) {
        int total = nums[0];
        int sum = 0;
        for(int num : nums) {
            if(sum > 0) {
                sum += num;
            }else {
                sum = num;
            }  
            total = Math.max(total,sum);    
        }
        return total;
    }
}