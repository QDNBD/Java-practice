
给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。

 

进阶：你可以设计并实现时间复杂度为 O(n) 的解决方案吗？

 

示例 1：

输入：nums = [100,4,200,1,3,2]
输出：4
解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
示例 2：

输入：nums = [0,3,7,2,5,8,4,6,0,1]
输出：9

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-consecutive-sequence
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

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