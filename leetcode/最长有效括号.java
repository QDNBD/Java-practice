class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0 || s == null) {
            return 0;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        for(int i = 0,j = -1; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.addLast(i);
            }else {
                if(!stack.isEmpty()) {
                    stack.pollLast();
                    int top = j;
                    if(!stack.isEmpty()) {
                        top = stack.peekLast();
                    }
                    res = Math.max(res,i - top);
                }else {
                    j = i;
                }
            }
        }
        return res;
    }
}