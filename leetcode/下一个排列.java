class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <= 1) {
            return ; 
        }
        int index = nums.length - 1;
        while(index > 0) {
            if(nums[index - 1] < nums[index]) {
                int r = nums.length - 1;
                while(r >= index) {
                    if(nums[r] > nums[index - 1]) {
                        int temp = nums[index - 1];
                        nums[index - 1] = nums[r];
                        nums[r] = temp;
                        break;
                    }
                    r--;
                }
                int left = index;
                int right = nums.length - 1;
                while(left < right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right--;
                }
                return ;
            }
            index--;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return ;
    }
}