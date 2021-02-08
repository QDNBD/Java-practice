class Solution {
    public int largestRectangleArea(int[] heights) {
        // if(heights.length == 0) {
        //     return 0;
        // }
        // if(heights.length == 1) {
        //     return heights[0];
        // }
        // // 这里为了代码简便，在柱体数组的头和尾加了两个高度为 0 的柱体
        // int[] tmp = new int[heights.length + 2];
        // for(int i = 0; i < heights.length; i++) {
        //     tmp[i + 1] = heights[i];
        // }
        // tmp[0] = 0;
        // tmp[heights.length + 1] = 0;
        // Stack<Integer> stack = new Stack<>();
        // int res = 0;
        // for(int i = 0; i < tmp.length; i++) {
        //     // 对栈中柱体来说，栈中的下一个柱体就是其「左边第一个小于自身的柱体」；
        //     // 若当前柱体 i 的高度小于栈顶柱体的高度，说明 i 是栈顶柱体的「右边第一个小于栈顶柱体的柱体」。
        //     // 因此以栈顶柱体为高的矩形的左右宽度边界就确定了，可以计算面积🌶️ ～
        //     while(!stack.isEmpty() && tmp[i] < tmp[stack.peek()]) {
        //         int h = tmp[stack.pop()];
        //         res = Math.max(res,(i - stack.peek() - 1) * h);
        //     }
        //     stack.push(i);
        // }
        // return res;


    /**
     * 84. 柱状图中最大的矩形
     */

        int res = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] new_heights = new int[heights.length + 2];
        for (int i = 1; i < heights.length + 1; i++) {
            new_heights[i] = heights[i - 1];
        }
        ;
        for (int i = 0; i < new_heights.length; i++) {
            while (!stack.isEmpty() && new_heights[stack.peek()] > new_heights[i]) {
                int cur = stack.pop();
                res = Math.max(res, (i - stack.peek() - 1) * new_heights[cur]);
            }
            stack.push(i);
        }
        return res;
    }
}