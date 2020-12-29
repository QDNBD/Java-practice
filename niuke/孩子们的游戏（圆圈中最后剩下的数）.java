import java.util.ArrayList;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
       if(n == 0 || m == 0) {
           return -1;
       }
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0;i < n;i++){//把所有的人都从0开始排好
            array.add(i);
        }
        
        int index = 0;
        while(array.size() > 1) {
            index = (index + m - 1) % array.size();//不断更新现在的位置
            array.remove(index);
        }
        return array.get(0);
    }
}