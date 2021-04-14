class Solution {
    public int maxProduct(int[] nums) {
        // if(nums.length == 1) {
        //     return nums[0];
        // }
        // int max = 0;
        // for(int i = 0;i < nums.length;i++) {
        //     int temp = 1;
        //     for(int j = i;j < nums.length;j++) {
        //         temp = temp * nums[j];
        //         max = Math.max(temp,max);
        //     }
        // }
        // return max;


        int max = Integer.MIN_VALUE;
        int imax = 1;
        int imin = 1;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(nums[i] * imax,nums[i]);
            imin = Math.min(nums[i] * imin,nums[i]);
            max = Math.max(max,imax);
        }
        return max;

    }
}