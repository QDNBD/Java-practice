class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }
        // int res = 0;
        // for(int i = 0;i < nums.length;i++) {
        //     int temp = 1;
        //     int j = i;
        //     while(j > 0) {
        //         if(nums[j] > nums[j - 1]) {
        //             temp++;
        //         }else {
        //             break;
        //         }
        //         j--;
        //     }
        //     res = Math.max(res,temp);
        // }
        // return res;
        
        int d = 0;
        int max = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i] > nums[i-1]){
                max = Math.max(i - d + 1,max);
            }else{
                d = i;
            }
        }
        return max;
    }
}