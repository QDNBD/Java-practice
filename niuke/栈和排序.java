import java.util.*;


public class Solution {
    /**
     * 栈排序
     * @param a int整型一维数组 描述入栈顺序
     * @return int整型一维数组
     */
    public int[] solve (int[] a) {
        // write code here
        if(a.length <= 1) {
            return a;
        }
        int n = a.length;
        int[] res = new int[n];
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        boolean[] falt = new boolean[n+1];
        for(int i = 0; i < a.length; i++) {
            stack.push(a[i]);
            falt[a[i]] = true;
            while(n > 0 && falt[n]) {
                n--;
            }
            while(!stack.isEmpty() && n < stack.peek()) {
                res[count++] = stack.pop();
            }
        }
        while(!stack.isEmpty()) {
            res[count++] = stack.pop();
        }
        return res;
    }
}