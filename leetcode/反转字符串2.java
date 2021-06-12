class Solution {
    public String reverseStr(String s, int k) {
        if(k == 1) {
            return s;
        }
        char[] a = s.toCharArray();
        for(int start = 0; start < a.length; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, a.length - 1);
            while(i < j) {
                char tem = a[i];
                a[i++] = a[j];
                a[j--] = tem;
            }
        }
        return new String(a);
    }
}