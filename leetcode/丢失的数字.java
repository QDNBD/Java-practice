class Solution {
    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for(int i : nums) {
            arr[i]++;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                return i;
            }
        }
        return nums.length;
    }
}