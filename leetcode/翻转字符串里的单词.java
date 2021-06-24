class Solution {
    public String reverseWords(String s) {
        int left = s.length() - 1;
        int right = left;
        StringBuilder ant = new StringBuilder();
        while(left >= 0) {
            while(left >= 0 && s.charAt(left) != ' ') {
                left--;
            }
            ant.append(s.substring(left+1, right+1)).append(" ");
            while(left >= 0 && s.charAt(left) == ' ') {
                left--;
            }
            right = left;
        }
        return ant.toString().trim();
    }
}