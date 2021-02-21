class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s == null) {
            return 0;
        }
        if(s.length() == 1) {
            return 1;
        }
        int ret = 0;
        int num = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            //map中已经存在，重新开始计算,开始位置为重复元素后一个位置开始
            if(map.containsKey(c)) {
                i = map.get(c);
                num = 0;
                map = new HashMap();
                continue;
            }
            map.put(c,i);
            num++;
            if(num > ret) {
                ret = num;
            }
        }
        return ret;
    }
}