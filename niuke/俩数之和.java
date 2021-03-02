import java.util.*;


public class Solution {
    /**
     * 
     * @param numbers int整型一维数组 
     * @param target int整型 
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
//         int[] res = new int[2];
//         for(int i = 0; i < numbers.length - 1; i++) {
//             for(int j = i + 1; j < numbers.length; j++) {
//                 if(target == numbers[i] + numbers[j]) {
//                     res[0] = i + 1;
//                     res[1] = j + 1;
//                     return res;
//                 }
//             }
//         }
//         return res;
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++) {
            if(map.get(target - numbers[i]) != null) {
                return new int[]{map.get(target - numbers[i]) + 1,i+1};
            }
            map.put(numbers[i],i);
        }
        return null;
    }
}