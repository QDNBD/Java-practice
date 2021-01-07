class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int i = 0;
        int temp = 0;
        while(i < nums.length) {
            temp = temp ^ nums[i];
            i++;
        }
        return temp;
    }
}