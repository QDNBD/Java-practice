class Solution {
    public int subarraySum(int[] nums, int k) {
        // if(nums.length == 0) {
        //     return 0;
        // }
        // Map<Integer,Integer> map = new HashMap<>();
        // map.put(0,1);
        // int sum = 0;
        // int ret = 0;
        // for(int i = 0;i < nums.length;i++) {
        //     sum += nums[i];
        //     if(map.containsKey(sum - k)) {
        //         ret += map.get(sum - k);
        //     }
        //     map.put(sum,map.getOrDefault(sum,0) + 1);
        // }
        // return ret;

        int count = 0;
        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;

    }
}