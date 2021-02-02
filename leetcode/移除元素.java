class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int count = 0;
        int i = 0;
        int j = 0;
        while(j < n) {
            if(nums[j] == val && j < n) {
                count++;
                j++;
            }else {
                nums[i] = nums[j];
                j++;
                i++;
            }
        }
        return n - count;
    }
}