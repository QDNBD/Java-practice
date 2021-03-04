import java.util.*;


public class Solution {
    /**
     * 
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        // write code here
        if(arr.length < 2) {
            return arr.length;
        }
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while(j < arr.length) {
            if(!map.containsKey(arr[j])) {
                map.put(arr[j],j);
            }else {
                i = Math.max(i,map.get(arr[j]) + 1);
                map.put(arr[j],j);
            }
            res = Math.max(res,j - i + 1);
            j++;
        }
        return res;
    }
}