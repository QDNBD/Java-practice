class Solution {
    public int sumOfDigits(int[] nums) {
        int minNum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < minNum) {
                minNum = nums[i];
            }
        }
        int res = 0;
        while(minNum > 0) {
            res += minNum % 10;
            minNum /= 10;
        }
        return res % 2 == 0 ? 1 : 0;
    }
}