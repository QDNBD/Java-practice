class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        int temp = nums[0];
        int count = 1;
        for(int i = 1;i < nums.length;i++) {
            if(nums[i] == temp) {
                count++;
            }else {
                count--;
                if(count == 0) {
                    temp = nums[i];
                    count++;
                }
            }
        }
        count = 0;
        for(int i = 0;i < nums.length;i++) {
             if(nums[i] == temp) {
                 count++;
             }
        }
        if(count >= nums.length / 2) {
            return temp;
        }
       
        return -1;
    }
}