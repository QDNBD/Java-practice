class Solution {
    public String reverseLeftWords(String s, int n) {
        n = n % s.length();
        if(n == 0 ) {
            return s;
        }
        //return s.substring(n, s.length()) + s.substring(0,n);
        char[] arr = s.toCharArray();
        reverseStr(0, n - 1, arr);
        reverseStr(n, s.length()-1, arr);
        reverseStr(0, s.length() - 1, arr);
        
        return String.valueOf(arr);
    }

    private void reverseStr(int left, int right, char[] chs) {
        while(left < right) {
            char c  = chs[left];
            chs[left] = chs[right];
            chs[right] = c;
            left++;
            right--;
        }
    }
}