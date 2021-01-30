class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length()) {
            return res;
        }
        Map<Character,Integer> smap = new HashMap<>(); //记录s的每个字符和出现的次数
        Map<Character,Integer> pmap = new HashMap<>(); //记录p的每个字符和出现的次数
        for(char ch : p.toCharArray()){
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);
        }
        int count = 0;
        int left = 0;
        int right = 0;
        int len = p.length();
        while(right < s.length()) {
            char ch = s.charAt(right);
            smap.put(ch,smap.getOrDefault(ch,0) + 1);
            //如果 p 中包含当前字符，且s的窗口中该字符出现次数不足，
            //则该字符可以作为候选字符，count加一
            if(pmap.containsKey(ch) && smap.get(ch) <= pmap.get(ch)) {
                count++;
            }
            if(count == len) {
                res.add(left);
            }
            if(right - left + 1 >= len) {
                char leftChar = s.charAt(left);
                //判断收缩的这个字符是否是候选字符，是则count减一
                if(pmap.containsKey(leftChar) && smap.get(leftChar) <= pmap.get(leftChar)) {
                    count--;
                }
                //窗口收缩一个字符
                smap.put(leftChar,smap.getOrDefault(leftChar,1) - 1);
                left++;
            }
            right++;
        }
        return res;
    }
}