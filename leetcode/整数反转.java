class Solution {
    public int reverse(int x) {
        long num = 0L;
        while(x != 0) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return (int)num == num ? (int)num : 0;
    }
}