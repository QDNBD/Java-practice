class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //将所有正数作为数组下标，置对应数组值为负值。那么，仍为正数的位置即为（未出现过）消失的数字。
        // List<Integer> ret = new ArrayList<>();
        // for(int i = 0;i < nums.length;i++) {
        //     if(nums[Math.abs(nums[i]) - 1] > 0) {
        //         nums[Math.abs(nums[i]) - 1] = - nums[Math.abs(nums[i]) - 1];
        //     }
        // }
        // for(int i = 0;i < nums.length;i++) {
        //     if(nums[i] > 0) {
        //         ret.add(i+1);
        //     }
        // }
        // return ret;


        //将所有的数值变为对应的int数组，数值出现以后int对应下的坐标++；
        List<Integer> ret = new ArrayList<>();
        int[] list = new int[nums.length + 1];
        for(int i = 0;i < nums.length;i++) {
            list[nums[i]]++;
        }
        for(int i = 1;i < list.length;i++) {
            if(list[i] == 0) {
                ret.add(i);
            }
        }
        return ret;
    }
}