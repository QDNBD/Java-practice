class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if(nums.length == 1 && k == 1) {
            return true;
        }
        int sum = 0;
        for(int n:nums){
            sum+=n;
        }
        if(sum%k!=0){
            return false;
        }
        int target = sum / k;//子集和
        Arrays.sort(nums);
        if(target < nums[nums.length-1]){
            return false;
        }
        int[] bucket = new int[k];//k个子集
        Arrays.fill(bucket,target);
        return backTrack(nums, bucket, nums.length-1);
    }
    public boolean backTrack(int[] nums,int[] bucket,int curindex){
        if(curindex < 0){
            return true;
        } //curindex 从后往前，到头，找到，完毕
        for(int i = 0; i < bucket.length; i++){//对桶进行遍历 
            if(bucket[i] == nums[curindex] || (curindex > 0 && bucket[i] - nums[curindex] >= nums[0])){
                bucket[i] -= nums[curindex];
                if(backTrack(nums,bucket,curindex-1)){
                    return true;
                } 
                bucket[i] += nums[curindex];         
            }
            if(bucket[i] == 0){
                break;
            }//注意，不加，[1,3,4,4,4,10,10,10,10,10,10,10,10,10,10,10]12用例超时
        }
        return false;
    }
}