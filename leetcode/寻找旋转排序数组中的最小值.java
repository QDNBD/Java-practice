class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(left < right) {
            mid = (right - left) / 2 + left;
            if(nums[mid] < nums[right]) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}