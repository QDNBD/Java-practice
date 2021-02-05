class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int threeNum = nums[left] + nums[right] + nums[i];
                if(Math.abs(threeNum - target) < Math.abs(result - target)) {
                    result = threeNum;
                }
                if(threeNum > target) {
                    right--;
                }else if(threeNum < target) {
                    left++;
                }else {
                    return target;
                }
            }
        }
        return result;
    }
}