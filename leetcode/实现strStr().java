class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }
        if(haystack.length() < needle.length()) {
            return -1;
        }
        char[] haych = haystack.trim().toCharArray();
        char[] nech = needle.trim().toCharArray();
        int star = 0;
        int cur = 0;
        while(star < haystack.trim().length() && cur < needle.trim().length()) {
            if(haych[star] == nech[cur]) {
                star++;
                cur++;
                if(cur == nech.length) {
                    return star - cur;
                }
            }else {
                star = star - cur + 1;
                cur = 0;
            }
        }
        return -1;
    }
}