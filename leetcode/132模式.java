class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length < 3) {
            return false;
        }
        int last = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] < last) {
                return true;
            }
            while(!stack.isEmpty() && stack.peek() < nums[i]) {
                last = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}