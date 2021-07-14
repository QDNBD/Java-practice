class Solution {
    public int[] printNumbers(int n) {
        int sum = 1;
        while(n > 0) {
            sum = sum * 10;
            n--;
        }
        int[] res = new int[sum - 1];
        for(int i = 1; i < sum; i++) {
            res[i - 1] = i;
        }
        return res;
    }
}