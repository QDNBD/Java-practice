class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length <= 1) {
        //     return nums.length;
        // }
        // Arrays.sort(nums);
        // int res = 0;
        // int count = 1;
        // for(int i = 1; i < nums.length; i++) {
        //     if(nums[i] == nums[i - 1] + 1) {
        //         count++;
        //     }else if(nums[i] == nums[i - 1]) {
        //         continue;
        //     }else {
        //         res = Math.max(res,count);
        //         count = 1;
        //     }
        // }
        // res = Math.max(res,count);
        // return res;

        Set<Integer> numsSet = new HashSet<>();
        for(Integer num : nums) {
            numsSet.add(num);
        }
        int longest = 0;
        for(Integer num : nums) {
            if(numsSet.remove(num)) {
                // 向当前元素的左边搜索,eg: 当前为100, 搜索：99，98，97,...
                int curLongest = 1;
                int cur = num;
                while(numsSet.remove(cur - 1)) {
                    cur--;
                }
                curLongest += (num - cur);
                // 向当前元素的右边搜索,eg: 当前为100, 搜索：101，102，103,...
                cur = num;
                while(numsSet.remove(cur + 1)) {
                    cur++;
                }
                curLongest += (cur - num);
                // 搜索完后更新longest.
                longest = Math.max(longest,curLongest);

            }
        }
        return longest;
    }
}