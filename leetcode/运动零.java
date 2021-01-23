class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length <= 1) {
            return;
        }
        int count = 0;//0µÄ¸öÊý
        int index = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] == 0) {
                count++;
            }else {
                nums[index++] = nums[i];
            }
        }
        for(int i = nums.length - count;i < nums.length;i++) {
            nums[i] = 0;
        }
    }
}