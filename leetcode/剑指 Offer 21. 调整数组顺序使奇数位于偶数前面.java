class Solution {
    public int[] exchange(int[] nums) {
        if(nums.length <= 1) {
            return nums;
        }
        int index = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1) {
                index++;
                int temp = nums[i];
                int j = i;
                while(j > index) {
                    nums[j] = nums[j - 1];
                    j--;
                }
                nums[index] = temp;
            } 
        }
        return nums;
    }
}