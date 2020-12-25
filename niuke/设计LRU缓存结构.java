import java.util.*;


public class Solution {
    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU (int[][] operators, int k) {
        // write code here
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < operators.length;i++) {
            Integer option = operators[i][0];
            Integer key = operators[i][1];
            if(option == 1) {
                if(map.containsKey(key)) {
                    map.remove(key);
                }else {
                    if(map.size() == k) {
                        map.remove(map.keySet().toArray()[0]);
                    }
                }
                map.put(key,operators[i][2]);
            }else if(option == 2) {
                if(map.containsKey(key)) {
                    int val = map.remove(key);
                    map.put(key,val);
                    list.add(map.get(key));
                }else {
                    list.add(-1);
                }
            }
        }
        int len = list.size();
        int[] ret = new int[len];
        for(int i = 0; i < len;i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}