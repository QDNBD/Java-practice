class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) {
            return "";
        }
        int[] hash = new int[128];
        for(int i = 0; i < t.length(); i++) {
            hash[t.charAt(i)]++;
        }
        int tcount = 0;
        for(int c : hash) {
            if(c > 0) {
                tcount++;
            }
        }
        int left = 0;
        int r = s.length();
        int l = 0;
        for(int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]--;
            if(hash[s.charAt(i)] == 0) {
                tcount--;
            }
            if(tcount == 0) {
                while(hash[s.charAt(left)] < 0) {
                    hash[s.charAt(left)]++;
                    left++;
                }
                if(r - l > i - left) {
                    l = left;
                    r = i;
                }
            }
        }
        if(r == s.length()) {
            return "";
        }
        return s.substring(l,r + 1);
    }
}