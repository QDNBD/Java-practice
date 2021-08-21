class Solution {
    int num = 0;
    public int countSubstrings(String s) {
      for(int i = 0;i < s.length();i++) {
          count(s,i,i);
          count(s,i,i + 1);
      }
      return num;
    }
    private void count(String s,int i,int j) {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            num++;
            i--;
            j++;
        }
    }
}