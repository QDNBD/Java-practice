import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
      if(pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) {
          return false;
      }
        Stack<Integer> ant = new Stack<>();
        int j = 0;
        for(int i = 0; i < pushA.length;i++) {
            ant.push(pushA[i]);
            while(!ant.empty() && popA[j] == ant.peek()) {
                ant.pop();
                j++;
            }
        }
        return ant.empty();
    }
}