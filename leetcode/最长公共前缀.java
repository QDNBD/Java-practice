class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }
        String res = strs[0];
        for(int i = 1; i < strs.length; i++) {
            if(!strs[i].startsWith(res)) {
                res = res.substring(0,res.length() - 1);
                i--;
            }
        }
        return res;
    }
}