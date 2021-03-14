class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for(int i = 0;i < nums.length;i++) {
            if(i < k) {
                queue.offer(nums[i]);
            }else {
                if(nums[i] > queue.peek()) {
                    queue.poll();
                    queue.offer(nums[i]);
                }
            }
        }
        return queue.poll();
    }
}