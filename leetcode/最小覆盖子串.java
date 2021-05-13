
给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。

注意：如果 s 中存在这样的子串，我们保证它是唯一的答案。

 

示例 1：

输入：s = "ADOBECODEBANC", t = "ABC"
输出："BANC"
示例 2：

输入：s = "a", t = "a"
输出："a"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/minimum-window-substring
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) {
            return "";
        }
        int[] values = new int[128];
        int type = 0;
        for(int i = 0; i < t.length(); i++) {
            if(values[t.charAt(i)] == 0) {
                type++;
                values[t.charAt(i)]++;
            }else {
                values[t.charAt(i)]++;
            }
        }
        int resMin = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        int len = s.length();
        for(int i = 0; i < s.length(); i++){
            values[s.charAt(i)]--;
            if(values[s.charAt(i)] == 0) {
                type--;
            }
            if(type == 0) {
                while(values[s.charAt(left)] < 0) {
                    values[s.charAt(left)]++;
                    left++;
                }
                if(len - right > i - left) {
                    len = i;
                    right = left;
                }
            }
        }
        if(len == s.length()) {
            return "";
        }
        return s.substring(right, len + 1);
    }
}