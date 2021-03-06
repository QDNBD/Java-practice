class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length < 2) {
            return nums;
        }
        // 双向队列 保存当前窗口最大值的数组位置 保证队列中数组位置的数按从大到小排序
        LinkedList<Integer> list = new LinkedList<>();
        // 结果数组
        int[] res = new int[nums.length - k + 1];
        for(int i = 0;i < nums.length;i++) {
            // 保证从大到小 如果前面数小弹出
            while(!list.isEmpty() && nums[list.peekLast()] <= nums[i]) {
                list.pollLast();
            }
            // 添加当前值对应的数组下标
            list.addLast(i);
            // 初始化窗口 等到窗口长度为k时 下次移动在删除过期数值
            if(list.peek() <= i - k) {
                list.poll();
            }
             // 窗口长度为k时 再保存当前窗口中最大值
             if(i - k + 1 >= 0) {
                 res[i - k + 1] = nums[list.peek()];
             }
        }
        return res;
    }
}